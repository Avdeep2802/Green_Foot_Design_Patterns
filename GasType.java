import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GasType here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GasType extends GasPump
{
    private World world;
	private Card c;
	private boolean validZip = false;
	
	
	
	public GasType(World world) {
		this.world = world;
	}

	
    public void act() 
    {
        // Add your action code here.
    	MouseInfo mouse = Greenfoot.getMouseInfo();
    	if(Greenfoot.mouseClicked(null) && mouse != null) {
    		Greenfoot.playSound("sounds/a.wav");
    		if(mouse.getX() >= 650 && mouse.getX() <= 800 && mouse.getY() >= 350 && mouse.getY() <= 450) {
    			act1();
    		}
    	}
    }
    
    public void act1(boolean val)
    {
    	this.validZip = val;
    }
    
    public void act1() {
    	if (validZip)
    	{DisplayScreen dispScreen= getWorld().getObjects(DisplayScreen.class).get(0);
    	MouseInfo mouse = Greenfoot.getMouseInfo();
    		if(mouse.getX() >= 652 && mouse.getX() <= 696 && mouse.getY() >= 390 && mouse.getY() <= 445) {
    			dispScreen.clearScreen();
    			dispScreen.enterText("ThankYou! \n Please Fill the Gas!");
    			getWorld().getObjects(GasNozzle.class).get(0).draw = true;
    			getWorld().getObjects(GasNozzle.class).get(0).fuelType = 87;
    		}
    		if(mouse.getX() >= 701 && mouse.getX() <= 747 && mouse.getY() >= 390 && mouse.getY() <= 445) {
    			dispScreen.clearScreen();
    			dispScreen.enterText("ThankYou! \n Please Fill the Gas!");
    			getWorld().getObjects(GasNozzle.class).get(0).draw = true;
    			getWorld().getObjects(GasNozzle.class).get(0).fuelType = 89;
    		}
    		if(mouse.getX() >= 752 && mouse.getX() <= 798 && mouse.getY() >= 390 && mouse.getY() <= 445) {
    			dispScreen.clearScreen();
    			dispScreen.enterText("ThankYou! \n Please Fill the Gas!");
    			getWorld().getObjects(GasNozzle.class).get(0).draw = true;
    			getWorld().getObjects(GasNozzle.class).get(0).fuelType = 93;
    		}
    	}
    	}
    
    public void display() {
    	world.addObject(this, 725, 400);
    }

    public Card  getCard()
    {
    	return this.c;
    }
    
	public void setCard(Card c) {
		// TODO Auto-generated method stub
		this.c =c;
	}
}
