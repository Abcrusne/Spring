import React from 'react';
import { BrowserRouter, Switch, Route } from 'react-router-dom';
import NavBar from '../components/NavBar';
import AboutProduct from '../pages/AboutProduct';
import Admin from '../pages/Admin';
import AdminForm from '../pages/AdminForm';
import Cart from '../pages/Cart';
import Home from '../pages/Home';
import { DataContext } from '../pages/Home';

const App = () => {
  document.title = 'e-Shop ';
  return (
    <BrowserRouter>
      <NavBar />
      <Switch>
        <Route exact path="/" component={Home} />
        <Route path="/admin" component={Admin} />
        <Route path="/cart" component={Cart}  />
        <Route path="/product/:id" component={AboutProduct} />
        <Route path="/admin/:id" component={AdminForm} />
       {/* <Route path="/payment" component={Payment} exact /> */}
      </Switch>
    </BrowserRouter>
  );
};

export default App;
