import React, {useState} from 'react';
import { Form } from 'react-bootstrap';
import axios from 'axios';
import Spinner from '../Spinner/Spinner';
import AlertMessage from '../AlertMessage';


const Cuarto = () => {

    const background = {
        backgroundColor: "royalblue"
    }

    const text = {
        textAlign:"center",
        color:"snow"
    }

    const labelPosition = {
        color:"snow",
        marginLeft:"25%"
    }

    const selectPosition = {
        width:"50%",
        marginLeft:"25%"
    }

    const buttonStyle = {
        backgroundColor: "snow",
        border: "none",
        color: "royalblue",
        padding: "15px 32px",
        textAlign: "center",
        textDecoration: "none",
        display: "inline-block",
        fontSize: "16px",
        cursor: "pointer",
        marginLeft:"47%",
        marginBottom:"10px"
    }


    const sendOrder = (e) =>{
        e.preventDefault();

        const url = "http://localhost:8080/venta/crearVenta";

        axios.post(url,{
            tipoHelado:'kilo'
        })
        .then(res => {
            console.log(res.data);
            if(res.data === "No hay cajeros disponibles"){
                saveError(true);
            }else{
                saveDeliver(res.data);
            }
        })
        .catch(error => console.log(error));

        
        saveOrder(true);

        setTimeout(()=>{

            saveOrder(false);
            saveAlert(true);

        },2000);

        setTimeout(()=>{

            saveAlert(false);
            saveError(false);

        },5000);

    }

    const [orderPlaced, saveOrder] = useState(false);
    const [alertBuy, saveAlert] = useState(false);
    const [errorAlert, saveError] = useState(false);
    const [deliver, saveDeliver] = useState({});


    const imageStyle = {
        width: "200px",
        marginLeft: "40%",
        marginBottom: "10px"
    }



    return ( 
        <div style={background}>
            {alertBuy? errorAlert?<AlertMessage message="No se pudo concretar la compra, no hay cajeros disponibles."/>: <AlertMessage message="Se concretó la compra"/> :null}
            {orderPlaced ? <Spinner /> :
            (
                <React.Fragment>
                    <h3 style={text}>Seleccioná los gustos!</h3>

                    <Form.Group>
                        <Form.Label style={labelPosition}>Elige el primer gusto!</Form.Label>
                        <Form.Control as="select" style={selectPosition}>
                            <option>Chocolate</option>
                            <option>Vainilla</option>
                            <option>Crema americana</option>
                            <option>Dulce de leche</option>
                        </Form.Control>
                        <br/>

                        <Form.Label style={labelPosition}>Elige el segundo gusto!</Form.Label>
                        <Form.Control as="select" style={selectPosition}>
                            <option>Chocolate</option>
                            <option>Vainilla</option>
                            <option>Crema americana</option>
                            <option>Dulce de leche</option>
                        </Form.Control>
                        <br/>

                        <Form.Label style={labelPosition}>Elige el tercer gusto!</Form.Label>
                        <Form.Control as="select" style={selectPosition}>
                            <option>Chocolate</option>
                            <option>Vainilla</option>
                            <option>Crema americana</option>
                            <option>Dulce de leche</option>
                        </Form.Control>

                        <br/>
                        <Form.Label style={labelPosition}>Elige el cuarto gusto!</Form.Label>
                        <Form.Control as="select" style={selectPosition}>
                            <option>Chocolate</option>
                            <option>Vainilla</option>
                            <option>Crema americana</option>
                            <option>Dulce de leche</option>
                        </Form.Control>
                        <br/>

                        <Form.Label style={labelPosition}>Elige el plus! (Opcional)</Form.Label>
                        <Form.Control as="select" style={selectPosition}>
                            <option>Ninguno</option>
                            <option>Chocolate fundido</option>
                            <option>Crema de vainilla</option>
                            <option>Almendras</option>
                        </Form.Control>
                    </Form.Group>
                    <br/>
                    <button 
                        style={buttonStyle}
                        onClick={(e) => sendOrder(e)}
                    >Pedir!</button>
                    <br/>

                    {deliver.nombreEmpleado?(
                        <div>
                            <h4 style={text}>Tu repartidor: {deliver.nombreEmpleado}</h4>
                            <img style={imageStyle} src={deliver.fotoEmpleado}/>
                        </div>
                    ):null}
                </React.Fragment>
            )}
        </div>
     );
}
 
export default Cuarto;