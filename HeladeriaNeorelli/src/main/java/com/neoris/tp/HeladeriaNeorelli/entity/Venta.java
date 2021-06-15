package com.neoris.tp.HeladeriaNeorelli.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="Ventas")
public class Venta {
	
	private static SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idVenta;
	
	private String tipoHelado;
	
	private String fechaVenta;
	
	private int caja;
	
	private String Empleado;
	
	public Venta() {}
	
	public Venta(String helado,Date fecha, int caja, String emp) {
		this.setTipoHelado(helado);
		this.setFechaVenta(fecha);
		this.setCaja(caja);
		this.setEmpleado(emp);
	}

	public String getTipoHelado() {
		return tipoHelado;
	}

	public void setTipoHelado(String tipoHelado) {
		this.tipoHelado = tipoHelado;
	}

	public String getFechaVenta() {
		return fechaVenta;
	}


	public int getCaja() {
		return caja;
	}

	public void setCaja(int cajaVenta) {
		this.caja = cajaVenta;
	}

	public String getEmpleado() {
		return Empleado;
	}

	public void setEmpleado(String empleado) {
		Empleado = empleado;
	}
	
	@Transient
	public void setFechaVenta(Date fecha) {
		this.fechaVenta = formatter.format(fecha);
	}
	
	
}
