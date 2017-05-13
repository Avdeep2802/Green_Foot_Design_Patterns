import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class DisplayScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GasPump extends Actor implements DispInterface
{
     int flag = 1;
	 List<DispInterface> DispComp = new ArrayList<>();
	
    public void act() 
    {
        // Add your action code here.
    	if(flag==1) {
    		flag = 0;
    		viewRender();
    	}
    }
    
    public void addToView( DispInterface comp )
    {
        DispComp.add( comp ) ;
    }

	@Override
	public void viewRender() {
		// TODO Auto-generated method stub
		for (DispInterface component : DispComp) {
			component.viewRender();
		}
	}
}
