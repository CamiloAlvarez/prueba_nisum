package com.nisum.prueba.model;

public class EmailExistsException extends RuntimeException {

	public EmailExistsException() {
	    super("{\"mensaje\":El correo ya existe }");
	  }
	}