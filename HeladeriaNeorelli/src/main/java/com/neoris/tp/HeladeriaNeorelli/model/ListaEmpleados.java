package com.neoris.tp.HeladeriaNeorelli.model;

import java.util.ArrayList;

public class ListaEmpleados {

	ArrayList<Empleado> listaEmpleados;
	
	public ListaEmpleados() {
		this.listaEmpleados = new ArrayList<Empleado>();
		this.agregarDatos();
		
	}
	
	public void agregarDatos() {
		this.listaEmpleados.add(new Empleado("Sebastian","https://www.ecestaticos.com/imagestatic/clipping/614/a1d/614a1db54f26b652ab905f7c9472ab7a/necesitaba-un-trabajo-el-repartidor-de-amazon-que-suena-con-tokio-2021.jpg?mtime=1603017169"));
		this.listaEmpleados.add(new Empleado("Juana","https://image.freepik.com/foto-gratis/joven-repartidora-aplaudiendo_1368-86035.jpg"));
		this.listaEmpleados.add(new Empleado("Esteban","https://www.redaccion.com.ar/wp-content/uploads/2018/08/Rappi1.jpg"));
		this.listaEmpleados.add(new Empleado("Micaela","https://img.gruporeforma.com/imagenes/960x640/6/7/5006042.jpg"));
	}
	
	public Empleado getEmpleado() {
		int numeroEmpleado = (int)(Math.random()*this.listaEmpleados.size());
		System.out.println(this.listaEmpleados.get(numeroEmpleado).getNombreEmpleado());
		return this.listaEmpleados.get(numeroEmpleado);
	}
}
