
public class EventButtonPressed  
{
    private ButtonFlow bf;
	
	public EventButtonPressed(ButtonFlow bf) {
		this.bf = bf;
	}
	
	public void runFlow() {
		this.bf.runFlow();
	}
}
