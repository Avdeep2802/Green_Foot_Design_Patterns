/**
 * Write a description of class CancelButtonFlow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CancelButtonFlow implements ButtonFlow  
{
    // instance variables - replace the example below with your ownprivate Receiver rec;
	
    ButtonPressed bp;
    
	public CancelButtonFlow(ButtonPressed bp) {
		
	    this.bp = bp;
		// TODO Auto-generated constructor stub
	}
	
    public void runFlow() 
    {
        this.bp.cancelPressed();
    }   
}
