package com.disneyangeep.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.disneyangeep.app.entity.Usuario;
import com.disneyangeep.app.repository.UserRepository;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService{

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Autowired
	private UserRepository userRepository;
	
	
	
	@Override
	@Transactional
	public Usuario save(Usuario user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		return userRepository.save(user);
	}

	
	@Override
	@Transactional
	public Usuario saveOrUpdate(Usuario usuario) {		
		return userRepository.saveAndFlush(usuario);
		
	}
	
	


}
