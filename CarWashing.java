import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CarWashWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarWashing extends World
{

    /**
     * Constructor for objects of class CarWashWorld.
     * 
     */
    public CarWashing()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        
        super(1000 , 600, 1);

       // bg.scale(getWidth(), getHeight());
        //setBackground(bg);
        prepare();
       
      //  super(1500 , 1000, 1);
     //   prepare();
    }
    
    
    public void prepare()
    {
    	CarWashBackground carWashbg = new CarWashBackground(this);
    	carWashbg.display();
    //	CarWash carWash = new CarWash();

    //	Car cleanCar = new CleanCar(this);
    	GasPump screen = new GasPump();
    	
    //	System.out.println("Helllloooooooo");
    	// composite pattern for cars
    	Car car = new Car(this);

    	

    	// composite pattern for screen
    	screen.addToView(carWashbg); 
    	screen.addToView(car);
    	
    	addObject(screen, 30, 50);
    }
}
