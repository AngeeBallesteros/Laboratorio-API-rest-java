package com.disneyangeep.app.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.disneyangeep.app.entity.Usuario;

public interface UserService {
	
	public Iterable<Usuario> findAll();
	public Page<Usuario> findAll(Pageable pageable);	
	public Optional<Usuario> findById(Long id);
	public void deleteById(Long id);
	public Usuario findByUsername(String username);


}
