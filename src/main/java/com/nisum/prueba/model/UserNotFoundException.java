package com.nisum.prueba.model;

public class UserNotFoundException extends RuntimeException {

	public UserNotFoundException(Long id) {
	    super("{\"mensaje\":El usuario "+id+" no existe}");
	  }
	}