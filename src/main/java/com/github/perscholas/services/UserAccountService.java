package com.github.perscholas.services;


import com.github.perscholas.models.UserAccount;
import com.github.perscholas.models.UserRole;
import com.github.perscholas.repositories.UserRepository;
import com.github.perscholas.repositories.UserRoleRepository;
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

import java.util.HashSet;
import java.util.Set;

@Service
public class UserAccountService implements UserDetailsService {
    private UserRepository userRepository;
    private UserRoleRepository userRoleRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public UserAccountService(UserRepository userRepository, UserRoleRepository userRoleRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userRepository = userRepository;
        this.userRoleRepository = userRoleRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserAccount user = userRepository.findByUsername(username);
        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        user.getUserRoles().forEach(role -> grantedAuthorities.add(new SimpleGrantedAuthority(role.getName())));
        return new User(user.getUsername(), user.getPassword(), grantedAuthorities);
    }

    public void save(UserAccount user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setUserRoles((Set<UserRole>) userRoleRepository.findAll());
        userRepository.save(user);
    }

    public UserAccount findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
