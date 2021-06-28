package com.disneyangeep.app.security;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.disneyangeep.app.entity.Usuario;
import com.disneyangeep.app.repository.UserRepository;

@Service
public class UserdetailsServiceImpl implements UserDetailsService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario user= userRepository.findByUsername(username);
		UserBuilder builder=null;
		if (user !=null) {
			builder= User.withUsername(username);
			builder.disabled(false);
			builder.password(user.getPassword());
			builder.authorities(new SimpleGrantedAuthority("ROLE_USER"));
			
		}else {
			throw new UsernameNotFoundException("Usuario " + username + "no encontrado");
			
		}
		return builder.build();
	}
	


}
