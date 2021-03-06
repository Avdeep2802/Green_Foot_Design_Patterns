import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class CarWashFlow extends CarWashBackground
{
    
	String text = " PLEASE WAIT! \n YOUR CAR IS GETTING WASHED ";
	
    GreenfootImage inner;
    GreenfootSound carWashSound = new GreenfootSound("CarWashSound.wav");
    public CarWashFlow(World world) 
    {
	super(world);
// TODO Auto-generated constructor stub
	 inner = new GreenfootImage(text, 77, Color.BLACK, new Color(0, 0, 0, 96));
    	//inner = new GreenfootImage(275,50);
        // setImage(inner);
    	
	}
    
    public void addToWorld(World world) 
    {
        int wide = world.getWidth();
        int high = world.getHeight();
        GreenfootImage outer = new GreenfootImage(wide, high);
        int leftX = (wide - inner.getWidth())/2;
        int topY = (high - inner.getHeight())/2;
        outer.drawImage(inner, leftX, topY);
        setImage(outer);
//        try 
//        {
//			Thread.sleep(500);
//		} 
//        catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
        carWashSound.play();
        
    }
 
    // the following is optional
    // remove pop-up when clicked on
    public void act()
    {
    	World world;
    	world=getWorld();
        if (Greenfoot.mouseClicked(this) || !carWashSound.isPlaying())
        {
        	world.removeObject(this);
            carWashSound.stop();
           
        }
        
        if(world.getObjects(CarWashFlow.class).isEmpty())
        {
        	Car cleanCar = new Car(world);
        	world.addObject(cleanCar, 1250, 500);
    
        }
    }
}
