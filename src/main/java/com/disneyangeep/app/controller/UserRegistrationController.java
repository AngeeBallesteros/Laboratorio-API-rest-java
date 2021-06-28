package com.disneyangeep.app.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.disneyangeep.app.entity.Usuario;
import com.disneyangeep.app.service.UserRegistrationService;

@RestController
@RequestMapping("/auth/register")
public class UserRegistrationController {
	@Autowired
	private UserRegistrationService userService;

	
	//crear un nuevo usuario
	@PostMapping
	public ResponseEntity<?> create (@RequestBody Usuario usuario){
		
		return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(usuario));
		
	}
	
	
		

	
}
