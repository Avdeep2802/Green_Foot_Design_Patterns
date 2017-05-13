/**
 * Write a description of class OkButtonFlow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OkButtonFlow  
{
   ButtonPressed bp;
    
	public OkButtonFlow(ButtonPressed bp) {
		
	    this.bp = bp;
		// TODO Auto-generated constructor stub
	}
	
    public void runFlow() 
    {
        this.bp.okPressed();
    }  
}
