import greenfoot.*;
public class CardInserted implements CardInterface 
{
    
    
    CardReading cardReader;
    DisplayScreen dispScreen;
   
    public CardInserted(CardReading cardReader,DisplayScreen dispScreen)
    {
        this.dispScreen= dispScreen;
        this.cardReader=cardReader;
        
    }

   
   public  void enterZip(){
       
     dispScreen.clearScreen();
     //dispScreen.enterText("Cancel Transaction");
     dispScreen.enterText("Kindly Enter your Zip Code");
     cardReader.stateSet(cardReader.getRightZip());
    }
   
   
 public void swipeCard(){
     
     dispScreen.clearScreen();
     //dispScreen.enterText("Cancel Transaction");
     dispScreen.enterText("There is already a card Inside");
     Greenfoot.delay(50);
 
     
    }
    
    
 public void cardRelease(){
     dispScreen.clearScreen();
     //dispScreen.enterText("Cancel Transaction");
     dispScreen.enterText("Card Ejected");
     cardReader.stateSet(cardReader.getNotInserted());
    }

}
