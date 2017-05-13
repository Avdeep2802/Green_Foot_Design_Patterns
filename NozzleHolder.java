import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NozzleHolder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NozzleHolder extends GasPump
{
    World world;
	
	public NozzleHolder(World world) {
		this.world = world;
	}

    public void act() 
    {
        // Add your action code here.
    }   
    
    public void display() {
    	this.world.addObject(this, 940, 140);

    }
}
