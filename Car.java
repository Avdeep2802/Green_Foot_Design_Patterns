import greenfoot.*;
import java.util.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends GasPump
{
    GreenfootImage gi = getImage();
		private List<DispInterface> cars = new ArrayList();
		private World world;
		/**
	     * Act - do whatever the Card wants to do. This method is called whenever
	     * the 'Act' or 'Run' button gets pressed in the environment.
	     */
		public Car(World world)
		{
			this.world = world;
		}

		@Override
		public void viewRender() {
			// TODO Auto-generated method stub
			//int x = 100;
			world.addObject((Actor) this, 500, 520);
			for (DispInterface car : cars) {
				
				car.viewRender();
				//x += 100;
			}
		}

	    

    public void act() {
        // Add your action code here.
    	MouseInfo mouse = Greenfoot.getMouseInfo();
    	if(getWorld().getObjects(Car.class).get(0).getX() <= 500) {
    		//Greenfoot.playSound("sounds/car+driveby21.wav");
    		//move(2);
    	}
    }
    
    public void display() {
    	this.world.addObject(this, 500, 520);

    }
    
  

	@Override
	public void addToView(DispInterface c) {
		// TODO Auto-generated method stub
		cars.add( c );
	}
}
