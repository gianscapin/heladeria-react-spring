package com.neoris.tp.HeladeriaNeorelli.model;

public class Empleado {
	private String nombreEmpleado;
	
	private String fotoEmpleado;
	
	public Empleado(String nombre, String foto) {
		this.setNombreempleado(nombre);
		this.setFotoEmpleado(foto);
	}
	
	public void setNombreempleado(String nombre) {
		this.nombreEmpleado = nombre;
	}
	
	public String getNombreEmpleado() {
		return this.nombreEmpleado;
	}
	
	public void setFotoEmpleado(String nombre) {
		this.fotoEmpleado = nombre;
	}
	
	public String getFotoEmpleado() {
		return this.fotoEmpleado;
	}

}
