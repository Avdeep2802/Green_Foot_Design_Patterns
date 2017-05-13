/**
 * An example of a method - replace this comment with your own
 *
 * @param  y   a sample parameter for a method
 * @return     the sum of x and y
 */

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;


public class Station extends GasPump implements DispInterface
{
    private World world;
    private List<DispInterface> components = new ArrayList<>();
    
    public Station(World world) {
        this.world = world;
    }
    /**
     * Act - do whatever the GasStation wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

     MouseInfo mouse = Greenfoot.getMouseInfo();
     if (Greenfoot.mouseClicked(null))
        {
            System.out.println("x "+mouse.getX()+" y: "+mouse.getY());
        }
    }
    public void display() {
    	this.world.addObject(this, 450, 250);

    }

    @Override
    public void viewRender() {
        // TODO Auto-generated method stub
        world.addObject((Actor) this, 320, 165);
        for (DispInterface component : components) {
            component.viewRender();
        }
    }

    @Override
    public void addToView(DispInterface c) {
        // TODO Auto-generated method stub
        components.add( c );
    }    
}
