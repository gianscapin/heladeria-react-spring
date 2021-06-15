import React from 'react';
import {Row,Col} from 'react-bootstrap';
import image1 from './images.jpeg';
import cuartoKilo from './4.jpg';
import kilo from './1kilo.jpg';
import CardProduct from './CardProduct';

const Body = () => {
    return ( 
        <React.Fragment>
            <h2 style={{textAlign:"center"}}>Elige el tipo de helado que prefieras!</h2>
            <br/>
            <Row style={{margin:"auto"}}>
                <Col>
                   <CardProduct 
                        name="cono"
                        image={image1}
                        description="Probá nuestro cono disfrutando de nuestros riquísimos sabores."
                        link = "/helados/cono"
                   /> 
                </Col>
                <Col>
                    <CardProduct 
                            name="cuarto"
                            image={cuartoKilo}
                            description="Probá nuestro 1/4 kg disfrutando de nuestros riquísimos sabores."
                            link = "/helados/cuarto"
                    /> 
                </Col>
                <Col>
                    <CardProduct 
                            name="kilo"
                            image={kilo}
                            description="Probá nuestro pote de un kilo disfrutando de nuestros riquísimos sabores."
                            link = "/helados/kilo"
                    /> 
                </Col>
            </Row>
            
        </React.Fragment>
     );
}
 
export default Body;