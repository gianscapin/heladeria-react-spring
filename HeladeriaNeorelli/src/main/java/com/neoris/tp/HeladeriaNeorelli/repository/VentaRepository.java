package com.neoris.tp.HeladeriaNeorelli.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.neoris.tp.HeladeriaNeorelli.entity.Venta;
import com.neoris.tp.HeladeriaNeorelli.model.IVentaEmpleado;

@Repository
public interface VentaRepository extends JpaRepository<Venta, Integer> {

	/*
	@Query(value="select * from Heladeria.ventas where empleado= :nombreEmpleado", nativeQuery=true)
	List<Venta> getEmpleadosByEmpleado(String nombreEmpleado);
	*/
	
	@Query(value="SELECT v.empleado as Empleado, count(v.tipo_helado) as Cantidad FROM ventas as v GROUP BY v.empleado, v.fecha_venta HAVING v.fecha_venta= :fechaVenta", nativeQuery=true)
	List<IVentaEmpleado> countTotalVentasByEmpleado(String fechaVenta);
	
	
}
