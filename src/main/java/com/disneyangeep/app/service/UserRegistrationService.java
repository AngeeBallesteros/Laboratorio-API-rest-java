package com.disneyangeep.app.service;

import com.disneyangeep.app.entity.Usuario;

public interface UserRegistrationService {

	
	public Usuario save(Usuario user);

	public Usuario saveOrUpdate(Usuario user);
	
}
