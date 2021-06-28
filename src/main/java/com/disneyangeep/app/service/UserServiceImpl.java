package com.disneyangeep.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.transaction.annotation.Transactional;

import com.disneyangeep.app.entity.Usuario;
import com.disneyangeep.app.repository.UserRepository;

public class UserServiceImpl implements UserService{
	

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Autowired
	private UserRepository userRepository;
	
	
	@Override
	@Transactional(readOnly=true)
	public Iterable<Usuario> findAll() {
		
		return userRepository.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Page<Usuario> findAll(Pageable pageable) {
		
		return userRepository.findAll(pageable);
	}

	@Override
	@Transactional(readOnly=true)
	public Optional<Usuario> findById(Long id) {
		
		return userRepository.findById(id);
	}
	

	@Override
	@Transactional
	public void deleteById(Long id) {
		
		userRepository.deleteById(id);
		
	}
	
	@Override
	@Transactional(readOnly=true)
	public Usuario findByUsername(String username) {
		
		return userRepository.findByUsername(username);			
	}


}
