import greenfoot.*;

public class PrintFlow implements ButtonPressed 
{
   DisplayScreen dispScreen = null;
	Receipt res = null;
	int isCarwash;
	
	public PrintFlow(DisplayScreen dispScreen,Receipt res, int isCarwash)
	{
		this.dispScreen = dispScreen;
		this.res = res;
		this.isCarwash = isCarwash;
	}
	@Override
	public void okPressed() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelPressed() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void yesPressed() {
		Greenfoot.delay(5);
		// TODO Auto-generated method stub
		dispScreen.clearScreen();
    	dispScreen.enterText(" Advertisement: Have a Refreshing glass of Sprite while you wait for your Receipt...");
    	Greenfoot.delay(100);
    	res.print();
    	if(isCarwash==1) {
    		Greenfoot.delay(100);
    		Greenfoot.setWorld(new CarWashing());
    	} else {
    		Greenfoot.delay(100);
    		Greenfoot.setWorld(new MyWorld());
    	}
    		
	
	}

	@Override
	public void noPressed() {
		// TODO Auto-generated method stub
		dispScreen.clearScreen();
    	dispScreen.enterText("ThankYou! Have a nice Day.");
    	Greenfoot.delay(100);
    	if(isCarwash==1)
    		Greenfoot.setWorld(new CarWashing());
    	else Greenfoot.setWorld(new MyWorld());
		
	}
}
