package com.neoris.tp.HeladeriaNeorelli.model;

import java.util.ArrayList;

import com.neoris.tp.HeladeriaNeorelli.entity.Venta;

public class ListaCajeros {
	
	ArrayList<Cajero> listaCajeros;
	
	public ListaCajeros() {
		this.listaCajeros = new ArrayList<Cajero>();
		this.agregarDatos();
	}
	
	public void agregarDatos() {
		Cajero caja1 = new Cajero(1,5);
		Cajero caja2 = new Cajero(2,10);
		Cajero caja3 = new Cajero(3,15);
		listaCajeros.add(caja1);
		listaCajeros.add(caja2);
		listaCajeros.add(caja3);
	}
	
	public int getCajeroDisponible() {
		for(Cajero cajeroActual: this.listaCajeros) {
			if(cajeroActual.cajeroDisponible()) {
				return cajeroActual.getNumeroCajero();
			}
		}
		return -1;
	}
	
	public int getCajeroByNumero(int numero) {
		boolean encontrado = false;
		int i = 0;
		int cajeroBuscado = -1;
		while(!encontrado && i<=this.listaCajeros.size()) {
			if(this.listaCajeros.get(i).getNumeroCajero() == numero) {
				cajeroBuscado = i;
				encontrado = true;
			}else {
				i++;
			}
		}
		
		return cajeroBuscado;
	}
	
	private String buscarUltimaVentaFecha() {
		String ultimaVenta = null;
		for(Cajero cajeroActual:this.listaCajeros) {
			if(cajeroActual.ultimaVentaFecha()!=null) {
				return cajeroActual.ultimaVentaFecha();
			}
		}
		
		return ultimaVenta;
		
	}
	
	public void sumarVenta(int numero, Venta venta) {
		String fechaultimaVenta = buscarUltimaVentaFecha();
		System.out.println("ultima venta: "+fechaultimaVenta);
		if(fechaultimaVenta!=null) {
			if(fechaultimaVenta.contentEquals(venta.getFechaVenta())) {
				int cajeroBuscado = getCajeroByNumero(numero);
				this.listaCajeros.get(cajeroBuscado).agregarVenta(venta);
			}else {
				this.listaCajeros.clear();
				this.agregarDatos();
				int cajeroBuscado = getCajeroByNumero(numero);
				this.listaCajeros.get(cajeroBuscado).agregarVenta(venta);
			}
		}else {
			int cajeroBuscado = getCajeroByNumero(numero);
			this.listaCajeros.get(cajeroBuscado).agregarVenta(venta);
		}
	}
}
