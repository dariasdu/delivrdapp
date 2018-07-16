package com.bancolombia.certificacion.delivrdapp.models;



public class Usuario {
private String usuario, password;
	
	public String getUsuario() {
		return usuario;
	}

	public String getPassword() {
		return password;
	}

	public Usuario(String usuario, String password) {
		this.usuario=usuario;
		this.password=password;
	}
	
	public static Usuario IniciaSesion(String usuario, String password) {
		return new Usuario(usuario, password);
	}

}
