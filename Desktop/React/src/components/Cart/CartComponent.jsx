import React from 'react';
import img from '../../img/samsung-big.jpg';

const CartComponent = ({ userProducts, currentUser, deleteFromCart }) => {
  if (userProducts.length > 0) {
    return (
      <div className="container mt-5">
        <table className="table">
          <thead>
            <tr>
              <th scope="col">Image</th>
              <th scope="col">Title</th>
              <th scope="col"></th>
            </tr>
          </thead>
          {userProducts.map(({ id, image, title }) => (
            <tbody key={id}>
              <tr>
                <td>
                  <img
                    src={
                      image === '/samsung.jpg'
                        ? img
                        : image.substring(0, 5) === 'https'
                        ? image
                        : img
                    }
                    className="card-img-top"
                    style={{ width: 50, height: 50 }}
                    alt={title}
                  />
                </td>
                <td>{title}</td>
                <td>
                  <button
                    className="btn btn-danger"
                    onClick={deleteFromCart}
                    value={id}
                  >
                    Remove from cart
                  </button>
                </td>
              </tr>
            </tbody>
          ))}
        </table>
      </div>
    );
  } else {
    return (
      <div className="d-flex justify-content-center">
        {currentUser !== undefined ? (
          <h1>You have no products in cart</h1>
        ) : (
          <h1>Please login</h1>
        )}
      </div>
    );
  }
};
export default CartComponent;
