package com.neoris.tp.HeladeriaNeorelli.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.neoris.tp.HeladeriaNeorelli.dto.Mensaje;
import com.neoris.tp.HeladeriaNeorelli.dto.VentaDto;
import com.neoris.tp.HeladeriaNeorelli.entity.Venta;
import com.neoris.tp.HeladeriaNeorelli.model.Cajero;
import com.neoris.tp.HeladeriaNeorelli.model.Empleado;
import com.neoris.tp.HeladeriaNeorelli.model.IVentaEmpleado;
import com.neoris.tp.HeladeriaNeorelli.model.ListaCajeros;
import com.neoris.tp.HeladeriaNeorelli.model.ListaEmpleados;
import com.neoris.tp.HeladeriaNeorelli.service.VentaService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/venta")
public class VentaController {

	@Autowired
	VentaService ventaService;
	
	ListaCajeros listaDeCajeros = new ListaCajeros();
	
	ListaEmpleados listaDeEmpleados = new ListaEmpleados();
	
	@GetMapping("/listaVenta")
	public ResponseEntity<List<Venta>> listaVentas(){
		
		List<Venta> ventas = ventaService.listaVenta();
		
		return new ResponseEntity<List<Venta>>(ventas, HttpStatus.OK);
	}
	
	@GetMapping("/ventas/{idVenta}")
	public ResponseEntity<?> ventaById(@PathVariable("idVenta") int idVenta){
		
		if(!ventaService.existsByIdVenta(idVenta))
			return new ResponseEntity(new Mensaje("No existe la venta"), HttpStatus.NOT_FOUND);
		
		Venta venta = ventaService.getVenta(idVenta).get();
		return new ResponseEntity(venta, HttpStatus.OK);
	}
	
	
	@GetMapping("/ventasPorEmpleado")
	public ResponseEntity<List<IVentaEmpleado>> ventasByEmpleado(){
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
		
		Date fecha = new Date();
		
		
		List<IVentaEmpleado> ventasPorEmpleado = ventaService.getVentaByEmpleado(formatter.format(fecha));
		
		return new ResponseEntity<List<IVentaEmpleado>>(ventasPorEmpleado, HttpStatus.OK);
	}
	
	@PostMapping("/crearVenta")
	public ResponseEntity<?> creaVenta(@RequestBody VentaDto ventaDto){
		
		
		System.out.println(ventaDto.getTipoHelado());
		Date fecha = new Date();
		
		int cajero = listaDeCajeros.getCajeroDisponible();
		
		Empleado empleado = this.listaDeEmpleados.getEmpleado();
		String nombreEmpleado = empleado.getNombreEmpleado();
		
		if(cajero>=0) {
			Venta venta = new Venta(ventaDto.getTipoHelado(),fecha,cajero,nombreEmpleado);
			listaDeCajeros.sumarVenta(cajero, venta);
			ventaService.saveVenta(venta);
			return ResponseEntity.ok(empleado);
		}else {
			return ResponseEntity.ok("No hay cajeros disponibles");
		}
		
		

		
	}
	
	@PutMapping("/ventas/actualizar/{id}")
	public ResponseEntity<?> actualizarVenta(@PathVariable("idVenta") int idVenta, @RequestBody VentaDto ventaDto ){
		
		if(!ventaService.existsByIdVenta(idVenta))
			return new ResponseEntity(new Mensaje("No existe la venta."), HttpStatus.NOT_FOUND);
		
		if(StringUtils.isBlank(ventaDto.getTipoHelado()))
			return new ResponseEntity(new Mensaje("El tipo de helado es obligatorio."),HttpStatus.BAD_REQUEST);
		
		Venta venta = ventaService.getVenta(idVenta).get();
		venta.setTipoHelado(ventaDto.getTipoHelado());
		ventaService.saveVenta(venta);
		return new ResponseEntity(new Mensaje("Venta actualizada."),HttpStatus.OK);
		
	}
	
	@DeleteMapping("/borrarVenta/{id}")
	public ResponseEntity<?> borrarVenta(@PathVariable("idVenta") int idVenta){
		
		if(!ventaService.existsByIdVenta(idVenta))
			return new ResponseEntity(new Mensaje("No existe la venta."), HttpStatus.NOT_FOUND);
		
		ventaService.deleteVenta(idVenta);
		return new ResponseEntity(new Mensaje("Venta eliminada"), HttpStatus.OK);
	}
}
