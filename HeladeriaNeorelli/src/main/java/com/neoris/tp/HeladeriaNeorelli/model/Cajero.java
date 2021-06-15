package com.neoris.tp.HeladeriaNeorelli.model;

import java.util.ArrayList;

import com.neoris.tp.HeladeriaNeorelli.entity.Venta;

public class Cajero {

	private int numeroCajero;
	
	private ArrayList<Venta> listaVentas;
	
	private int ventasPermitidas;
	
	public Cajero(int numero, int ventasPermitidas) {
		this.setNumeroCajero(numero);
		this.setVentasPermitidas(ventasPermitidas);
		this.iniciarlizarLista();
	}
	
	public void setNumeroCajero(int numeroCaja) {
		this.numeroCajero = numeroCaja;
	}
	
	public int getNumeroCajero() {
		return this.numeroCajero;
	}
	
	public void setVentasPermitidas(int ventas) {
		this.ventasPermitidas = ventas;
	}
	
	public int getVentasPermitidas() {
		return this.ventasPermitidas;
	}
	
	public void iniciarlizarLista() {
		this.listaVentas = new ArrayList<Venta>(this.ventasPermitidas);
	}
	
	public void agregarVenta(Venta venta) {
		this.listaVentas.add(venta);
	}
	
	public boolean cajeroDisponible() {
		return this.listaVentas.size() < this.ventasPermitidas;
	}
	
	public String ultimaVentaFecha() {
		String ultimaVenta = null;
		if(listaVentas.size()>0) {
			for(Venta ventaActual: listaVentas) {
				if(ventaActual!=null) {
					return ventaActual.getFechaVenta();
				}
			}
		}
		
		return ultimaVenta;
	}
}
