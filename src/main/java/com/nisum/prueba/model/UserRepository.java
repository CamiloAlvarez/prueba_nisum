package com.nisum.prueba.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Usuario,Long> {

	List<Usuario> findByEmail(String email);
}