public enum FuelSelect {
	
	REGULAR_UNLEADED("Regular Unleaded", 2.8), 
	MID_UNLEADED("Mid Unleaded", 3.14), 
	PREMIUM_UNLEADED("Premium Unleaded", 4.29);
	
	private String label;
	private double price;
	
	FuelSelect(String label, double price){
		this.label = label;
		this.price = price;
	}
	
	public String getLabel(){
		return this.label;
	}
	
	public double getPrice(){
		return this.price;
	}
}