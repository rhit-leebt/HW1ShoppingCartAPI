import java.util.ArrayList;

public class API {
	private Inventory inventory;
	private ArrayList<Cart> carts = new ArrayList<Cart>();
	
	public API() {
		// test hello world
	}
	
	public Response handleRequestCartContents(int customerId) {
		
	}
	
	public Response handleAddItem(int customerId, Item item) {
		
	}
	
	public Response handleApplyDiscountCode(int customerId, String code) {
		
	}
	
	public Response handleUpdateItemQuantity(int customerId, Item item, int quantity) {
		
	}
}
