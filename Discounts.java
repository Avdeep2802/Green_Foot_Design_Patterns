public enum Discounts {
	
	CHASE_CC(0.02),
	DISCOVER_CC(0.00),
	CAR_DISCOUNT(0.03);
	
	private double discountPercent;
	
	Discounts(double discountPercent){
		this.discountPercent = discountPercent;
	}
	
	public double getDiscountPercent(){
		return discountPercent;
	}

}