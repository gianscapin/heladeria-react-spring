import React from 'react';
import Navegation from './components/Navegation';
import Body from './components/Body/Body';
import Cono from './components/Helados/Cono';
import Cuarto from './components/Helados/Cuarto';
import Kilo from './components/Helados/Kilo';
import Ventas from './components/Ventas';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';
import {Container} from 'react-bootstrap';

function App() {

  const header ={
    textAlign:"center"
  }
  return (
    <React.Fragment>
      <Router>
          <Container>
          <h3 style={header}>Helados <span style={{color:"royalblue"}}>Neo</span><span>re</span><span style={{color:"red"}}>lli</span></h3>
          <Navegation/>
          <Switch>
            <Route exact path="/">
              <Body/>
            </Route>
            <Route exact path="/helados/cono">
              <Cono/>
            </Route>
            <Route exact path="/helados/cuarto">
              <Cuarto/>
            </Route>
            <Route exact path="/helados/kilo">
              <Kilo/>
            </Route>
            <Route exact path="/ventas">
              <Ventas/>
            </Route>
          </Switch>
          </Container>
      </Router>
    </React.Fragment>
  );
}

export default App;
