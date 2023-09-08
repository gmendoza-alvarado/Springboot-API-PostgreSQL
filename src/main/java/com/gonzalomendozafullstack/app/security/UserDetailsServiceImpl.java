package com.gonzalomendozafullstack.app.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.gonzalomendozafullstack.app.model.User;
import com.gonzalomendozafullstack.app.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	UserRepository userRepository;
	
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		User user = userRepository
				.findOneByEmail(email)
				.orElseThrow( () -> new UsernameNotFoundException("User with eamil " + email + " no exist"));
		
		return new UserDetailsImpl(user);
				 
	}

}
