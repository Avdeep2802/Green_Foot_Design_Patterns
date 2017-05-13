import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class CarWashBackground extends GasPump
{
     World world;
	
	public CarWashBackground(World world) 
	{
		this.world = world;
		
	}
	
    public void act() 
    {
        
    }
    
    public void display() {
    	GreenfootImage image = getImage();
        image.scale(900,500);
		world.addObject((Actor) this, 650, 300);
	} 
}
