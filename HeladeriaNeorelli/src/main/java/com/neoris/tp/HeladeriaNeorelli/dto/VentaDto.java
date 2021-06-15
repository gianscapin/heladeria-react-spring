package com.neoris.tp.HeladeriaNeorelli.dto;

import javax.validation.constraints.NotBlank;

public class VentaDto {
	
	@NotBlank
	private String tipoHelado;
	
	@NotBlank
	private String nombreEmpleado;
	
	
	public VentaDto(String tipoHelado) {
		this.setTipoHelado(tipoHelado);
	}
	
	public VentaDto(String tipoHelado, String nombreEmpleado) {
		this.setTipoHelado(tipoHelado);
		this.setNombreEmpleado(nombreEmpleado);
	}

	public String getTipoHelado() {
		return tipoHelado;
	}

	public void setTipoHelado(String tipoHelado) {
		this.tipoHelado = tipoHelado;
	}
	
	public void setNombreEmpleado(String nombre) {
		this.nombreEmpleado = nombre;
	}
	
	public String getNombreEmpleado() {
		return this.nombreEmpleado;
	}

	
	

}
