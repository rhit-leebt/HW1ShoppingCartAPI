
public class Customer {
	private String name;
	private int id;
	private String address;
	
	public Customer(String name, int id, String address) {
		this.name = name;
		this.id = id;
		this.address = address;
	}
	
	public boolean matchId(int id) {
		return this.id == id;
	}
	
	public String getAddress() {
		return this.address;
	}
}
