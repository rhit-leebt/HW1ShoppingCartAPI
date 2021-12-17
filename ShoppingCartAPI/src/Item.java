public class Item {
	private String name;
	private String description;
	private double price;
	private String picture;
	private double discountRate;
	
	public Item (String name, String desc, double price, String pic, double discRate) {
		this.name = name;
		this.description = desc;
		this.price = price;
		this.picture = pic;
		this.discountRate = discRate;
	}
}
