package it.akademija;

public class Product {

	String id;
	String title;
	String image;
	String desc;
	double price;
	int quantity;

	public Product() {

	}

	public Product(String id, String title, String image, String desc, double price, int quantity) {
		super();
		this.id = id;
		this.title = title;
		this.image = image;
		this.desc = desc;
		this.price = price;
		this.quantity = quantity;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public String getImage() {
		return image;
	}

	public String getDesc() {
		return desc;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Products [id=" + id + ", title=" + title + ", image=" + image + ", desc=" + desc + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}
//
//	@PostConstruct
//	public void init() {
//		System.out.println("Bean  is going through init.");
//	}
//
//	@PreDestroy
//	public void destroy() {
//		System.out.println("Bean  will destroy now.");
//	}

}
