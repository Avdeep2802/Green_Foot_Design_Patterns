import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CardReader here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CardReader extends GasPump implements DispInterface
{
    CardReader cm = null;
    World world;
    Card c = null;
    CardReading cardmachine;
    boolean f = true;
    ZipStateChecker zipcodemachine;
    boolean flag = true;
    ButtonPressed r = null;
    CancelButtonFlow cc = null;
    EventButtonPressed in = null;
    boolean disp_screen= true;
    
    public CardReader(World world) {
        this.world = world;
        this.r  = new CardInsertedFlow();
        
    }

    /**
     * Act - do whatever the CardScanner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

    	
    	if (disp_screen)
    	{
    		display_screen();
    	}
        
    	if (getOneIntersectingObject(Card.class) != null)
        {
        	
 
        	
            c = (Card)getOneIntersectingObject(Card.class);
            
            
        if ( c.getClass() == CreditCard.class)
        {
        	getWorld().removeObject(getWorld().getObjects(CreditCard.class).get(0));
        	cardmachine.cardSwipe();
        	if (flag)
        	{
        		
        		cardmachine.typeZip();
        		flag = false;
        	}
            
        }
        
        /* if ( c.getClass() == FakeCC.class && f)
        {
        	f = false;
        	getWorld().removeObject(getWorld().getObjects(FakeCC.class).get(0));
        	cardmachine.insertCard();
            cardmachine.ejectCard();
            getWorld().addObject(new FakeCC(getWorld()), 100, 350);
            
        }
        if ( c.getClass() == DiscoverCC.class)
        {
        	getWorld().removeObject(getWorld().getObjects(DiscoverCC.class).get(0));
        	
        	cardmachine.insertCard();
        	if (flag)
        	{
        		
        		cardmachine.insertPin();
        		flag = false;
        	}
        } */
      }
                
        MouseInfo mouse = Greenfoot.getMouseInfo();
   	 if (Greenfoot.mouseClicked(null) )
   			 {
   		 
   			 if ((mouse != null) && (!flag) && cardmachine.stateOfCard.getClass().getCanonicalName() == cardmachine.rightZip.getClass().getCanonicalName())
        {
   		 	if (mouse.getX() >= 370 && mouse.getX()<=525 && mouse.getY() >= 280 && mouse.getY() <= 450)
   		 	{
   		 		if (mouse.getX() >= 379 && mouse.getX()<=403 && mouse.getY() >= 291 && mouse.getY() <= 315)
   		 		{
   		 			zipcodemachine.zip("1");
   		 		}
   		 		if (mouse.getX() >= 411 && mouse.getX()<=437 && mouse.getY() >= 291 && mouse.getY() <= 315)
   		 		{
   		 			zipcodemachine.zip("2");
   		 		}
   		 		if (mouse.getX() >= 444 && mouse.getX()<=471 && mouse.getY() >= 291 && mouse.getY() <= 315)
   		 		{
   		 			zipcodemachine.zip("3");
   		 		}
   		 		if (mouse.getX() >= 379 && mouse.getX()<=403 && mouse.getY() >= 327 && mouse.getY() <= 352 )
   		 		{
   		 			zipcodemachine.zip("4");
   		 		}
   		 		if (mouse.getX() >= 411 && mouse.getX()<=437 && mouse.getY() >= 327 && mouse.getY() <= 352)
   		 		{
   		 			zipcodemachine.zip("5");
   		 		}
   		 		if (mouse.getX() >= 444 && mouse.getX()<=471 && mouse.getY() >= 327 && mouse.getY() <= 352)
   		 		{
   		 			zipcodemachine.zip("6");
   		 		}
   		 		if (mouse.getX() >= 379 && mouse.getX()<=403 && mouse.getY() >= 363 && mouse.getY() <= 388)
   		 		{
   		 			zipcodemachine.zip("7");
   		 		}
   		 		if (mouse.getX() >= 411 && mouse.getX()<=437 && mouse.getY() >= 363 && mouse.getY() <= 388)
   		 		{
   		 			zipcodemachine.zip("8");
   		 		}
   		 		if (mouse.getX() >= 444 && mouse.getX()<=471 && mouse.getY() >= 363 && mouse.getY() <= 388)
   		 		{
   		 			zipcodemachine.zip("9");
   		 		}
   		 		if (mouse.getX() >= 411 && mouse.getX()<=437 && mouse.getY() >= 399 && mouse.getY() <= 424)
   		 		{
   		 			zipcodemachine.zip("0");
   		 		}
   		 		if (mouse.getX() >= 485 && mouse.getX()<=514 && mouse.getY() >= 327 && mouse.getY() <= 352)
   		 		{
   		 			zipcodemachine.del();
   		 		}
   		 		if (mouse.getX() >= 485 && mouse.getX()<=514 && mouse.getY() >= 291 && mouse.getY() <= 315)
   		 		{
   		 			zipcodemachine.cancel();
   		 		}
   		 		if (mouse.getX() >= 485 && mouse.getX()<=514 && mouse.getY() >= 363 && mouse.getY() <= 388)
   		 		{
   		 			zipcodemachine.ok();
   		 			if(zipcodemachine.isValid()==1 ) {
   		 				boolean vaildZip = true;
   		 				getWorld().getObjects(GasType.class).get(0).setCard(c);
   		 				getWorld().getObjects(GasType.class).get(0).act1(vaildZip);
   		 				
   		 			}
   		 		}
   		 	}
        }
   			 
   			 if (mouse != null && mouse.getX() >= 569 && mouse.getX()<=584 && mouse.getY() >= 208 && mouse.getY() <= 225)
   			 {
   				 System.out.println("Cancel");
   				 this.cc = new CancelButtonFlow(r);
   				 in = new EventButtonPressed(cc);
   				 in.runFlow();
   				 
   			 }
   			if (mouse != null && mouse.getX() >= 319 && mouse.getX()<=333 && mouse.getY() >= 121 && mouse.getY() <= 136)
  			 {
  				 System.out.println("Help");
  			 }
   			 }
   		 
    }

    private void display_screen() {
    	DisplayScreen d  =getWorld().getObjects(DisplayScreen.class).get(0);
        this.cardmachine = new CardReading(d);
        this.zipcodemachine = new ZipStateChecker(d);

    	
    	d.clearScreen();
    	d.enterText("Help");
    	d.enterText("Cancel");
		d.enterText("Scan Your Card!");
    	disp_screen = false;
	}

	@Override
    public void viewRender() {
        world.addObject(this, 587, 407);
    }
}
