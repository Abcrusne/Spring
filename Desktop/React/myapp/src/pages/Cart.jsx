import React, { Component } from 'react';
import { Link } from 'react-router-dom';
import { DataContext } from '../pages/Home';
import itemImg from '../img/samsung-big.jpg';
//import ProductCardCart from '../components/ProductCardCart';

// const Cart = (id, itemImg, ...otherProps) => {
//   console.log('My cart: ', id);

//   const [cart, setCart] = useState([]);
//   return (
//     <div>
//       <h2>Cart</h2>
//       <div className="container mt-4">
//           <div className="row d-flex justify-content-center">
//             {cart.map(({ id, ...otherProps }) => (
//               <ProductCardCart key={id} id={id} itemImg={itemImg} {...otherProps} />
//             ))}
//           </div>
//         </div>
//     </div>
//   );
// };
// function Cart({ cart, setCart }) {
//   const getTotalSum = () => {
//     return cart.reduce((sum, { price, quantity }) => sum + price * quantity, 0);
//   };

//   const clearCart = () => {
//     setCart([]);
//   };

//   const setQuantity = (product, amount) => {
//     const newCart = [...cart];
//     newCart.find((item) => item.name === product.name).quantity = amount;
//     setCart(newCart);
//   };

//   const removeFromCart = (productToRemove) => {
//     setCart(cart.filter((product) => product !== productToRemove));
//   };

//   return (
//     <>
//       <h1>Cart</h1>
//       {cart.length > 0 && <button onClick={clearCart}>Clear Cart</button>}
//       <div className="products">
//         {cart.map((product, id) => (
//           <div className="product" key={id}>
//             <h3>{product.title}</h3>
//             <h4>${product.price}</h4>
//             <input
//               value={product.quantity}
//               onChange={(e) => setQuantity(product, parseInt(e.target.value))}
//             />
//             <img src={product.image} alt={product.title} />
//             <button onClick={() => removeFromCart(product)}>Remove</button>
//           </div>
//         ))}
//       </div>

//       <div>Total Cost: ${getTotalSum()}</div>
//     </>
//   );
// }
export class Cart extends Component {
  
  static contextType = DataContext;

  componentDidMount() {
    this.context.getTotal();
  }

  render() {
    const {
      cart,
      increase,
      reduction,
      removeProduct,
      total,
      count,
    } = this.context;
    if (cart.length === 0) {
      return <h2 style={{ textAlign: 'center' }}>Nothings Product</h2>;
    } else {
      return (
        <>
          {cart.map((item) => (
            <div className="" key={item.id}>
              <img src={itemImg} alt={item.title} />
              <div className="container">
                <div className="row">
                  <h2>{item.title}</h2>
                  <span>${item.price * count}</span>
                </div>

                <p>{item.description}</p>

                <div className="">
                  <button
                    className="btn btn-dark"
                    onClick={() => reduction(item.id)}
                  >
                    -
                  </button>
                  <span>{count}</span>
                  <button
                    className="btn btn-dark"
                    onClick={() => increase(item.id)}
                  >
                    +
                  </button>
                </div>
              </div>
              <div
                className="btn btn-warning"
                onClick={() => removeProduct(item.id)}
              >
                X
              </div>
            </div>
          ))}
          <div className="">
            <Link to="/payment">Payment</Link>
            <h3>Total: ${total}</h3>
          </div>
        </>
      );
    }
  }
}

export default Cart;
