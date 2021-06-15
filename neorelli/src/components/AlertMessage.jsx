import React from 'react';
import { Alert } from 'react-bootstrap';

const AlertMessage = ({message}) => {

    const successBuyAlert = {
        width: "50%",
        left: "25%",
        textAlign: "center"
    }

    return ( 
        <React.Fragment>
            <br/>
            <Alert style ={successBuyAlert} variant="warning">{message}</Alert>
        </React.Fragment>
     );
}
 
export default AlertMessage;