package com.disneyangeep.app.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.disneyangeep.app.entity.Usuario;

@Repository
public interface UserRepository extends JpaRepository<Usuario,Long>{
	
	
	public Usuario findByUsername(String username);

}
