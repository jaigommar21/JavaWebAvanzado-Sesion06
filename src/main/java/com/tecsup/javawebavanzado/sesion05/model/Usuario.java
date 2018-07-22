package com.tecsup.javawebavanzado.sesion05.model;

public class Usuario {

	String cuenta;
	String clave;
	String direccion;
	public String getCuenta() {
		return cuenta;
	}
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	@Override
	public String toString() {
		return "Usuario [cuenta=" + cuenta + ", clave=" + clave + ", direccion=" + direccion + "]";
	}
	
	
}
