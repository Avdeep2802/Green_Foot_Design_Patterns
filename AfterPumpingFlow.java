/**
 * Write a description of class AfterPumping here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AfterPumpingFlow implements ButtonPressed 
{
    // instance variables - replace the example below with your own
   DisplayScreen dispScreen = null;
	
	public AfterPumpingFlow(DisplayScreen dispScreen)
	{
		this.dispScreen = dispScreen;
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
		dispScreen.clearScreen();
		dispScreen.enterText("Yes");
		dispScreen.enterText("No");
    	dispScreen.enterText("Do you want to \n print Receipt?");
    		
	
	}

	@Override
	public void noPressed() {
		// TODO Auto-generated method stub
		dispScreen.clearScreen();
		dispScreen.enterText("Yes");
		dispScreen.enterText("No");
    	dispScreen.enterText("Do you want to \n print Receipt?");
		
	}
}
