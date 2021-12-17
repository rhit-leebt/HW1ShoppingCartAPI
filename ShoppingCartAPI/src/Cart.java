import java.util.ArrayList;

public class Cart {
	private CartInventory contents;
	private Customer customer;
	private ArrayList<Tax> taxes;
	private ArrayList<Discount> discounts;
	
	public Response addItem(Item item) {
		
	}
	
	public Response updateItemQuantity(Item item, int quantity) {
		
	}
	
	public Response getCartContentAndTotals() {
		
	}
	
	public Response applyDiscount(String code) {
		
	}
	
	public double calculateTotalTaxes() {
		
	}
	
	public double calculateTotalItemDiscounts() {
		
	}
	
	public double calculateTotalFinalCost() {
		
	}
}
