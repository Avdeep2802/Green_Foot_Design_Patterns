import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import  java.awt.Font;
import java.text.*;
import java.util.*;

/**
 * Write a description of class Receipt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Receipt extends GasPump implements DispInterface
{
    private World world;
	private static double carWashPrice = 20.0;

	public Receipt(World world) {
		this.world = world;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void viewRender() {
		// TODO Auto-generated method stub
		world.addObject((Actor) this, 327, 425);
	}

	/**
	 * Act - do whatever the PrintReceipt wants to do. This method is called whenever
	 * the 'Act' or 'Run' button gets pressed in the environment.
	 */
	public void act() 
	{
		
	}

	public  void print() {

		List<Discounts> discountTypes = new ArrayList<Discounts>();
		double totalPrice = 0.0;
		double carWashPrice = 0.0;
		double fuelPrice1 = 0.0;
		double carWashPrice1 = 0.0;
		//Calculate price based on fuel type
		double fuelPrice = getWorld().getObjects(GasMeter.class).get(0).cost;
		// Give discounts based on card type
		
		
		/* String a = getWorld().getObjects(GasType.class).get(0).getCard().getClass().getCanonicalName();
		if(a == "ChaseCC")
			discountTypes.add(DiscountType.CHASE_CC);
		else if(a == "DiscoverCC")
			discountTypes.add(DiscountType.DISCOVER_CC);
		if(getWorld().getObjects(PumpNozel.class).get(0).isCarwash)
			discountTypes.add(DiscountType.CAR_DISCOUNT); */
			
			
		
		int f = getWorld().getObjects(GasNozzle.class).get(0).fuelType;
		FuelSelect ft = null;
		if(f == 87)
			ft = ft.REGULAR_UNLEADED;
		else if(f == 89)
			ft = ft.MID_UNLEADED;
		else if(f == 93)
			ft = ft.PREMIUM_UNLEADED;
		
		for(Discounts discountType : discountTypes){
			if(discountType.equals(Discounts.CAR_DISCOUNT))
				carWashPrice1 = this.carWashPrice * discountType.getDiscountPercent();
			else
				fuelPrice1 = fuelPrice * discountType.getDiscountPercent();
		}
		totalPrice = this.carWashPrice + fuelPrice - carWashPrice1 - fuelPrice1;
		String fPrice = new DecimalFormat("#.##").format(fuelPrice);
		String cwPrice = new DecimalFormat("#.##").format(carWashPrice);
		String tPrice = new DecimalFormat("#.##").format(totalPrice);
		
		StringBuilder message = new StringBuilder("3 Minutes Wait");
		message.append("\nSJSU");
		message.append("============================================================\n");
		message.append(ft.getLabel() + "           " + new DecimalFormat("##.##").format(fuelPrice));
		message.append("\nCar Wash" + "                        " + new DecimalFormat("##.##").format(this.carWashPrice));
		message.append("\n=====================================================\n");
		message.append("Subtotal" + "                        " + new DecimalFormat("##.##").format((this.carWashPrice + fuelPrice)));
		message.append("\n=====================================================\n");
		if(carWashPrice1 > 0)
			message.append("\nCar Wash Discount" + "           "+ "-" + new DecimalFormat("##.##").format(carWashPrice1) );
		message.append("\n=====================================================\n");
		message.append("Total" + "                       " + new DecimalFormat("##.##").format(totalPrice));
		message.append("\n=====================================================\n");
		DisplayScreen dispScreen = getWorld().getObjects(DisplayScreen.class).get(0);
        DisplayScreen disp = new DisplayScreen(getWorld());
        getWorld().addObject(disp, 100, 400);
        disp.enterText(200, 275, message.toString());
        //System.out.println(message.toString());
        playReceiptSoundInBackground();
        dispScreen.clearScreen();
        dispScreen.enterText("Thank You!");
        Greenfoot.delay(100);
	}
	
	public void playReceiptSoundInBackground() {
		GreenfootSound reciptSound = new GreenfootSound("printer.wav");
		reciptSound.play();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		reciptSound.stop();
	}
}
