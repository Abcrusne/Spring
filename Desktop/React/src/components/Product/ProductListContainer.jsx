import React, { Component } from 'react';
//import React, { useEffect, useState } from 'react';
import axios from 'axios';
import ProductCardComponent from '../Product/ProductCardComponent';
import img from '../../img/samsung-big.jpg';

// const ProductListContainer = () => {
//   const [products, setProducts] = useState([]);

//   useEffect(() => {
//     axios
//       .get('https://itpro2017.herokuapp.com/api/products')
//       .then((res) => setProducts(res.data))
//       .catch((err) => console.log(err));
//   }, []);

//   if (products.length > 0) {
//     return (
//       <div className="container">
//         <div className="row row-cols-1 row-cols-sm-2 row-cols-md-3 row-cols-lg-4">
//           {products.map(({ id, ...otherProps }) => {
//             return <ProductCardComponent key={id} id={id} {...otherProps} />;
//           })}
//         </div>
//       </div>
//     );
//   } else {
//     return (
//       <div className="d-flex justify-content-center">
//         <div className="spinner-border" role="status">
//           <span className="sr-only">Loading...</span>
//         </div>
//       </div>
//     );
//   }
// };

class ProductListContainer extends Component {
  constructor(props) {
    super(props);
    this.state = {
      products: {},
      // cart: [],
      // total: 0,
      // count: 1,
    };
  }

  componentDidMount() {
    axios
      .get('https://itpro2017.herokuapp.com/api/products')
      .then((products) => {
        this.setState({ products });
      })
      .catch((err) => {
        console.log(err);
      });
  }

  render() {
    const { data } = this.state.products;

    if (data) {
      return (
        <div className="container mt-4">
          <div className="row d-flex justify-content-center">
            {data.map(({ id, ...otherProps }) => (
              <ProductCardComponent
                key={id}
                id={id}
                itemImg={img}
                {...otherProps}
              />
            ))}
          </div>
        </div>
      );
    } else {
      return (
        <div className="text-center">
          <div className="spinner-border m-5 text-dark" role="status">
            <span className="sr-only">Loading...</span>
          </div>
        </div>
      );
    }
  }
}
export default ProductListContainer;
