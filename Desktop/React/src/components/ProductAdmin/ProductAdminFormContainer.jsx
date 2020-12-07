import React, { Component } from 'react';
import axios from 'axios';
import { withRouter } from 'react-router';
import baseUrl from '../../AppConfig';
import ProductAdminFormComponent from './ProductAdminFormComponent';

class ProductAdminFormContainer extends Component {
  constructor(props) {
    super(props);
    this.state = {
      products: {},
      // title: '',
      // image: '',
      // description: '',
      // price: '',
      // quantity: '',
      // id: 0,
    };
  }

  componentDidMount() {
    // if (this.props.match.params.id > 0) {
    // axios
    //   .get(`${baseUrl}/api/products/${this.props.match.params.id}`)
    //   .then((res) =>
    //     this.setState({
    //       id: res.data.id || '',
    //       title: res.data.title || '',
    //       description: res.data.description || '',
    //       image: res.data.image || '',
    //       price: res.data.price || '',
    //       quantity: res.data.quantity || '',
    //     })
    //   )
    axios
      .get('https://itpro2017.herokuapp.com/api/products')
      .then((products) => {
        this.setState({ products });
      })
      .catch((err) => {
        console.log(err);
      });
  }

  handleSubmit = (e) => {
    e.preventDefault();

    if (this.state.products.id > 0) {
      axios
        .put(`${baseUrl}/api/products/${this.state.products.id}`, {
          description: this.state.products.description,
          id: this.state.products.id,
          image: this.state.products.image,
          price: this.state.products.price,
          quantity: this.state.products.quantity,
          title: this.state.products.title,
        })
        .then(() => this.props.history.push('/admin/products'));
    } else {
      axios
        .post(`${baseUrl}/api/products`, {
          description: e.target.description.value,
          id: this.state.products.id,
          image: e.target.image.value,
          price: e.target.price.value,
          quantity: e.target.quantity.value,
          title: e.target.title.value,
        })
        .then(() => this.props.history.push('/admin/products'));

      this.setState({
        title: '',
        image: '',
        description: '',
        price: '',
        quantity: '',
      });
    }
  };

  handleChange = (e) => {
    const { name, value } = e.target;
    this.setState({ [name]: value });
  };

  render() {
    return (
      <ProductAdminFormComponent
        handleSubmit={this.handleSubmit}
        handleChange={this.handleChange}
        {...this.state}
      />
    );
  }
}

export default withRouter(ProductAdminFormContainer);
