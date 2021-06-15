import React from 'react';
import styled from 'styled-components';

const CardProduct = ({name, image, description, link}) => {

    const nombreHelado = {name};
    const Card = styled.div`
        position: relative;
        display: flex;
        flex-direction: column;
        min-width: 0;
        word-wrap: break-word;
        background-clip: border-box;
        border: 1px solid rgba(0,0,0,.125);
        border-radius: .25rem;
        background-image: url(${image});
        background-size:cover;
        width: 100%;
        height: 300px;
        justify-content: center;
        text-align: center;

        ::before{
            content: "";
            width:100%;
            height:100%;
            background-color:snow;
            position: absolute;
            opacity: 0.5;
        }

        h3,a, p{
            position:relative;
        }
        h3,p{
            color:royalblue;
        }
    `;


    return ( 
        <Card>
            <h3>Pedi un {name}!</h3>
            <p style={{fontWeight:"bold"}}>{description}</p>
            <a className="linkStyle" href={link}>Pedir ya!</a>
        </Card>
     );
}
 
export default CardProduct;