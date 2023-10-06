package com.nisum.prueba.model;

public class InvalidEmailException extends RuntimeException {

	public InvalidEmailException() {
	    super("{\"mensaje\":Email invalido }");
	  }
	}