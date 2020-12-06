package it.akademija;

public final class Product {

	private Integer id;
	private String title;
	private String image;
	private String desc;
	private double price;
	private int quantity;

	public Product() {

	}

	public Product(Integer id, String title, String image, String desc, double price, int quantity) {
		super();
		this.id = id;
		this.title = title;
		this.image = image;
		this.desc = desc;
		this.price = price;
		this.quantity = quantity;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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
