package it.akademija.model;

public class CartProduct {

	private Long id;
	private int quantity;

	public CartProduct(Long id, int quantity) {
		super();
		this.id = id;
		this.quantity = quantity;
	}

	public Long getId() {
		return id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
