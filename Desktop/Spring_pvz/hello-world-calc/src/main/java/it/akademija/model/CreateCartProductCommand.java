package it.akademija.model;

public class CreateCartProductCommand {
	private Long id;
	private int quantity;

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
