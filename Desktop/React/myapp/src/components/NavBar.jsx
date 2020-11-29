//import { render } from '@testing-library/react';
import React, { Component } from 'react';
import { Link, NavLink } from 'react-router-dom';
import { DataContext } from '../pages/Home';

export class NavBar extends Component {
  static contextType = DataContext;

  render() {
    // const { cart } = this.context;
    return (
      <nav className="navbar navbar-expand-lg navbar-light bg-light">
        <NavLink className="navbar-brand" to="/">
          Home
        </NavLink>
        <button
          className="navbar-toggler"
          type="button"
          data-toggle="collapse"
          data-target="#navbarSupportedContent"
          aria-controls="navbarSupportedContent"
          aria-expanded="false"
          aria-label="Toggle navigation"
        >
          <span className="navbar-toggler-icon"></span>
        </button>

        <div className="collapse navbar-collapse" id="navbarSupportedContent">
          <ul className="navbar-nav mr-auto">
            <li className="nav-item active">
              <NavLink className="nav-link" to="/admin">
                Admin
              </NavLink>
            </li>

            <li className="  nav-item">
              <NavLink className="nav-link" to="/cart">
                Items
                {/* ({cart.length}) */}
              </NavLink>
            </li>
          </ul>
          <form className="form-inline my-2 my-lg-0">
            <input
              className="form-control mr-sm-2"
              type="text"
              placeholder="User"
            />
            <button
              className="btn btn-outline-success my-2 my-sm-0"
              type="submit"
            >
              User
            </button>
          </form>
        </div>
      </nav>
    );
  }
}

export default NavBar;
