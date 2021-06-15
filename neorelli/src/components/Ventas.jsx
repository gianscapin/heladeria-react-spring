import React, {useEffect, useState} from 'react';
import axios from 'axios';
import Table from 'react-bootstrap/Table';

const Ventas = () => {

    const [employeesList, saveList] = useState([]);
    

    const listSales = () => {
        const url = "http://localhost:8080/venta/ventasPorEmpleado";
        axios.get(url)
        .then(res => saveList(res.data))
        .catch(error => console.log(error));
    }

    const bestEmployee = () => {
        let empleado ={
            nombre:'',
            cantidad:''
        }
        let cantidadEmpleado = 0;
        let nombreEmpleado = "";
        employeesList.forEach(employee=>{
            if(employee.cantidad>cantidadEmpleado){
                nombreEmpleado = employee.empleado;
                cantidadEmpleado = employee.cantidad;
            }
        })

        empleado.nombre = nombreEmpleado;
        empleado.cantidad = cantidadEmpleado

        return empleado;
    }

    const dayEmployee = bestEmployee();

    useEffect(()=>{
        listSales();
    },[])


    return ( 
        <React.Fragment>
            <h2 style={{textAlign:"center"}}>Ventas por empleado</h2>
            <Table striped bordered hover>
                <thead>
                    <tr>
                    <th>Nombre del empleado</th>
                    <th>Cantidad vendida</th>
                    </tr>
                </thead>
                <tbody>
                    {employeesList.length>1? employeesList.map(employee => (
                        <tr key={employee.empleado}>
                            <td>{employee.empleado}</td>
                            <td>{employee.cantidad}</td>
                        </tr>
                    )):<tr><td>No hay datos por ahora.</td></tr>}
                </tbody>
            </Table>

            {employeesList.length>1?(
                <h3>El empleado con más ventas es: {dayEmployee.nombre} con {dayEmployee.cantidad} ventas.</h3>
            )
            :null
            }
        </React.Fragment>
     );
}
 
export default Ventas;