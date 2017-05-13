/**
 * Write a description of class YesButtonFlow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class YesButtonFlow implements ButtonFlow 
{
    // instance variables - replace the example below with your own
   ButtonPressed bp;
    
	public YesButtonFlow(ButtonPressed bp) {
		
	    this.bp = bp;
		// TODO Auto-generated constructor stub
	}
	
    public void runFlow() 
    {
        this.bp.yesPressed();
    }  
}
