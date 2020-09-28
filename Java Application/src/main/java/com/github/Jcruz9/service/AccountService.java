package com.github.Jcruz9.service;

import com.github.Jcruz9.model.Account;
import com.github.Jcruz9.repository.AccountRepository;
import com.github.Jcruz9.repository.UserProfileRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class AccountService implements UserDetailsService {
    private AccountRepository accountRepository;
    private UserProfileRoleRepository roleRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public AccountService(AccountRepository accountRepository, UserProfileRoleRepository roleRepository ,BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.accountRepository = accountRepository;
        this.roleRepository=roleRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }


    public Account create(Account createAccount) {
        Account createAnAccount = accountRepository.save(createAccount);
        return createAccount;
    }

    public List<Account> readAll() {
        Iterable<Account> accountIterable = accountRepository.findAll();
        List<Account> accountList = new ArrayList<>();
        accountIterable.forEach(accountList::add);
        return accountList;
    }

    public Account readById(Long id) {
        return accountRepository.findById(id).get();
    }


    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account user = accountRepository.findByEmail(username);
        Set<GrantedAuthority> grantedAuthoritySet = new HashSet<>();
        user.getUserRoles().forEach(role -> grantedAuthoritySet.add(new SimpleGrantedAuthority(role.getName())));
        return new User(user.getEmail(), user.getPassword(), grantedAuthoritySet);
    }

    public void save(Account account) {
        account.setPassword(bCryptPasswordEncoder.encode(account.getPassword()));
        account.setUserRoles(roleRepository.findAll());
        accountRepository.save(account);
    }

    public Account findByEmail(String email) {
        return accountRepository.findByEmail(email);
    }

//    public Account updateAccount(Long id, Account accountUpdate) {
//        Account accountInDb = readById(id);
//        accountInDb.setEmail(accountUpdate.getPassword());
//        accountInDb.setPassword(accountUpdate.getPassword());
//        accountInDb = accountRepository.save(accountInDb);
//        return accountInDb;
//    }

//    public Account deleteById(Long id) {
//        Account accountToDelete = readById(id);
//        accountRepository.delete(accountToDelete);
//        return accountToDelete;
//    }

}
