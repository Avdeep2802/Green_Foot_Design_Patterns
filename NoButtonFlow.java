/**
 * Write a description of class NoButtonFlow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NoButtonFlow implements ButtonFlow  
{
    // instance variables - replace the example below with your own
    ButtonPressed bp;
    
	public NoButtonFlow(ButtonPressed bp) {
		
	    this.bp = bp;
		// TODO Auto-generated constructor stub
	}
	
    public void runFlow() 
    {
        this.bp.noPressed();
    }  
}
