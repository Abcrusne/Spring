import React, { useState } from 'react';
import { Link } from 'react-router-dom';
import Cart from '../pages/Cart';
// const PAGE_PRODUCTS = 'products';
// const PAGE_CART = 'cart';


// const ProductCardCart = ({ id, itemImg, ...otherProps }) => {
//   console.log('Product Card: ', id);
//   const [cart, setCart] = useState([]);
// const [page, setPage] = useState('products');

// const removeFromCart = (productToRemove) =>{
//     setCart(cart.filter(prod => prod!== productToRemove));
// };
//   const renderProducts = () =>(
//     <div
//     className="card col-12 col-md-6 col-lg-4 my-3"
//     //   style={{ width: '18 rem' }}
//   >
//     {/* jeigu butu image duotas  reiketu rasyti prie <img src = {otherProps.image}/>*/}
//     <img src={itemImg} className="card-img-top" alt={otherProps.title} />
//     <div className="card-body ">
//       <h5 className="card-title">Title: {otherProps.title}</h5>
//       <p className="card-text">Description: {otherProps.description}</p>
//       <p className="card-price">Price: {otherProps.price} EUR</p>
//       <Link href={`/products/${id}`} className="btn btn-dark">
//         Daugiau
//       </Link>
//       <p>
//         <button
//           className="btn btn-dark"
//           onClick={() => removeFromCart(otherProps)}
//         >
//          Remove
//         </button>
//       </p>
//     </div>
//   </div>
//   );

  

//   return (

//     renderProducts()
//     // {page === PAGE_CART && renderCart()}

//   );
 
// }

export default ProductCardCart;
