package com.neoris.tp.HeladeriaNeorelli.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neoris.tp.HeladeriaNeorelli.entity.Venta;
import com.neoris.tp.HeladeriaNeorelli.model.IVentaEmpleado;
import com.neoris.tp.HeladeriaNeorelli.repository.VentaRepository;

@Service
public class VentaService {

	@Autowired
	VentaRepository ventaRepository;
	
	public List<Venta> listaVenta(){
		return ventaRepository.findAll();
	}
	
	public Optional<Venta> getVenta(int idVenta){
		return ventaRepository.findById(idVenta);
	}
	
	public void saveVenta(Venta venta) {
		ventaRepository.save(venta);
	}
	
	public void deleteVenta(int idVenta) {
		ventaRepository.deleteById(idVenta);
	}
	
	public boolean existsByIdVenta(int idVenta) {
		return ventaRepository.existsById(idVenta);
	}
	
	
	
	public List<IVentaEmpleado> getVentaByEmpleado(String fecha){
		List<IVentaEmpleado> listaEmpleados = ventaRepository.countTotalVentasByEmpleado(fecha);
		return listaEmpleados;
	}
}
