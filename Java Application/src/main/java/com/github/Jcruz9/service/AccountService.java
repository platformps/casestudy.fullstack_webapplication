package com.github.Jcruz9.service;

import com.github.Jcruz9.model.Account;
import com.github.Jcruz9.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountService {
    private AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository)
    {
        this.accountRepository=accountRepository;
    }
    public Account create(Account createAccount)
    {
        Account createAnAccount =accountRepository.save(createAccount);
        return  createAccount;
    }

public List<Account> readAll()
{
    Iterable<Account> accountIterable =accountRepository.findAll();
    List<Account>accountList= new ArrayList<>();
    accountIterable.forEach(accountList::add);
    return accountList;
}
public Account readById(Long id)
{
return accountRepository.findById(id).get();
}

public Account updateAccount(Long id, Account accountUpdate)
{
    Account accountInDb= readById(id);
    accountInDb.setEmail(accountUpdate.getPassword());
    accountInDb.setPassword(accountUpdate.getPassword());
    accountInDb =accountRepository.save(accountInDb);
    return accountInDb;
}
public Account deleteById(Long id)
{
    Account accountToDelete =readById(id);
    accountRepository.delete(accountToDelete);
    return accountToDelete;
}

}
