package com.cruelengine.dairyfarm.services;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.cruelengine.dairyfarm.models.Account;
import com.cruelengine.dairyfarm.repository.AccountRepository;

public class UserDetailsServiceImpl implements UserDetailsService{

	private AccountRepository accountRepo;
	
    public UserDetailsServiceImpl(AccountRepository accountRepo) {
        this.accountRepo = accountRepo;
    }
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Account account = accountRepo.findByName();
	
        if (account == null) {
            throw new UsernameNotFoundException(username);
        }
        
        return new User(account.getUsername(), account.getPassword(), new ArrayList<>());
		
	}

}
