import greenfoot.*;
public class ValidateZip implements CardInterface  
{
    // instance variables - replace the example below with your own
    CardReading cardReader;
    DisplayScreen dispScreen;
   
    public ValidateZip(CardReading cardReader,DisplayScreen dispScreen)
    {
        this.dispScreen= dispScreen;
        this.cardReader=cardReader;
        
    }

   
   public  void enterZip(){
       
     dispScreen.clearScreen();
     dispScreen.enterText("Cancel Transaction");
     dispScreen.enterText("Zip already entered");
     cardReader.stateSet(cardReader.getRightZip());
    }
   
   
 public void swipeCard(){
     
     dispScreen.clearScreen();
     dispScreen.enterText("Cancel Transaction");
     dispScreen.enterText("There is already a card Inside");
     Greenfoot.delay(50);
 
     
    }
    
    
 public void cardRelease(){
     dispScreen.clearScreen();
     dispScreen.enterText("Cancel Transaction");
     dispScreen.enterText("Card Ejected");
     cardReader.stateSet(cardReader.getNotInserted());
    }
}
