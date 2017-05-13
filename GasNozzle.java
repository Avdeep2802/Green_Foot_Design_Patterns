import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GasNozzle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GasNozzle extends GasPump
{
    World world;
	GasMeter c = new GasMeter();
	public boolean draw = false;
	public boolean dispenseStart = false;
	public boolean receiptCalled = false;
	public int fuelType = 0;
	public boolean carWash = false;
	DisplayScreen dispScreen  =null;
	ButtonPressed pr =null;
	ButtonPressed prr = null;
	YesButtonFlow yc = null;
    EventButtonPressed in = null;
    NoButtonFlow nc =null;
    boolean isCarwash = false;
    boolean isCar = true;
    boolean isPrint = false;

	public GasNozzle(World world) {
		this.world = world;
		// TODO Auto-generated constructor stub
		
	}


	public void act() 
	{



		int mouseX, mouseY;


		if(draw){
		if(Greenfoot.mouseDragged(this))  
		{
			MouseInfo mouse = Greenfoot.getMouseInfo();
			mouseX=mouse.getX();
			mouseY=mouse.getY();
			setLocation(mouseX, mouseY);
		}}
		Actor pumpNozel = getOneIntersectingObject(Car.class);
		Actor nozzleHolder  = getOneIntersectingObject(NozzleHolder.class);


		if(fuelType > 0 && draw==true && pumpNozel!=null){
			c.drawGas();
			c.fuellingStart = true;

		}
		if(c.fuellingStart && nozzleHolder!=null){
			c.fuellingDone = 1;
			
		}

		if(c.fuellingStart && c.fuellingDone == 1 && !receiptCalled && !c.tankFull ){
			draw = false;
			carWash();
			callReceipt();
		}
		

		if(nozzleHolder==null && c.tankFull){
			
			//PumpNozel p = getWorld().getObjects(PumpNozel.class).get(0);
			setLocation(800, 150);
			carWash();
			callReceipt();
		}
		
		if (receiptCalled)
		{
	        MouseInfo mouse = Greenfoot.getMouseInfo();
	        dispScreen=getWorld().getObjects(DisplayScreen.class).get(0);
			Receipt p = getWorld().getObjects(Receipt.class).get(0);
	        
			
	   	 	if (Greenfoot.mousePressed(null)  )
	   			 {
	   	 			if (mouse != null && mouse.getX() >= 319 && mouse.getX()<=333 && mouse.getY() >= 180 && mouse.getY() <= 196)
	   	 			{
	   	 				if(!isPrint) {
	   	 				this.yc = new YesButtonFlow(pr);
	   	 				in = new EventButtonPressed(yc);
	   	 				in.runFlow();
	   	 				this.prr = new PrintFlow(dispScreen,p,1);
	   	 				isCarwash = true;
	   	 				isCar = false;
	   	 				isPrint = true;
	   	 				} else {
	   	 				this.yc = new YesButtonFlow(prr);
	   	 				in = new EventButtonPressed(yc);
	   	 				in.runFlow();
	   	 				isCarwash = true;
	   	 				}
					 
	   	 			}
	   	 			if (mouse != null && mouse.getX() >= 319 && mouse.getX()<=333 && mouse.getY() >= 208 && mouse.getY() <= 225)
	   	 			{
	   	 				if(!isPrint) {
	   	 				System.out.println("No");
	   	 				this.nc = new NoButtonFlow(pr);
	   	 				in = new EventButtonPressed(nc);
	   	 				in.runFlow();
	   	 				this.prr = new PrintFlow(dispScreen,p,0);
	   	 				isCarwash = false;
	   	 				isCar = false;
	   	 				isPrint = true;
	   	 				} else {
	   	 				this.nc = new NoButtonFlow(prr);
	   	 				in = new EventButtonPressed(nc);
	   	 				in.runFlow();
	   	 				isCarwash = false;
	   	 				}
	   	 				
					 
	   	 			}
				if (mouse != null && mouse.getX() >= 319 && mouse.getX()<=333 && mouse.getY() >= 121 && mouse.getY() <= 136)
				 {
					 System.out.println("Help");
				 }
			}
		}	
		
		this.getWorld().addObject(c, 587, 317);
	}

	private void carWash() {
		
		

		
	}



	public void displayScreen() {
		world.addObject((Actor) this, 800, 150);
	}


	public void callReceipt(){
		
		dispScreen=getWorld().getObjects(DisplayScreen.class).get(0);
		this.pr = new AfterPumpingFlow (dispScreen);
    	dispScreen.clearScreen();
    	dispScreen.enterText("Yes");
    	dispScreen.enterText("No");
    	dispScreen.enterText("Do you want to wash car?");
    	

	
    	
		c.fuellingDone = c.fuellingDone = 0;
		receiptCalled = true;
		
		
}
   
}
