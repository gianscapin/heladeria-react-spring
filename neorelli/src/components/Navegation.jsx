import React from 'react';
import {Navbar,Nav} from 'react-bootstrap';

const Navegation = () => {

    const navbarStyle = {
        backgroundColor:"red",
        width: "50%",
        justifyContent: "center",
        display: "inline-grid",
        position: "relative",
        left: "25%",
        border:"1px red solid"
    }
    return ( 
        <Navbar expand="lg" style={navbarStyle}>
            <Navbar.Toggle aria-controls="responsive-navbar-nav" />
            <Navbar.Collapse id="responsive-navbar-nav">
                <Nav
                className="mr-auto my-2 my-lg-0"
                style={{ maxHeight: '100px' }}
                navbarScroll
                >
                <Nav.Link href="/" style={{color:"snow"}}>Home</Nav.Link>
                <Nav.Link href="/ventas" style={{color:"snow"}}>Ventas por empleado</Nav.Link>
                </Nav>
            </Navbar.Collapse>
        </Navbar>
     );
}
 
export default Navegation;