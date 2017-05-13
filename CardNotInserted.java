import greenfoot.*;
public class CardNotInserted implements CardInterface  
{
    
    CardReading cardReader;
    DisplayScreen dispScreen;
   
    public CardNotInserted(CardReading cardReader,DisplayScreen dispScreen)
    {
        this.dispScreen= dispScreen;
        this.cardReader=cardReader;
        
    }

   
   public  void enterZip(){
       
     dispScreen.clearScreen();
     //dispScreen.enterText("Cancel Transaction");
     dispScreen.enterText("Kindly Enter your Card");
    }
   
   
 public void swipeCard(){
     
     dispScreen.clearScreen();
     //dispScreen.enterText("Cancel Transaction");
     dispScreen.enterText("Please wait while your card is being Processed");
     Greenfoot.delay(50);
     cardReader.stateSet(cardReader.getCardInstert());
     
    }
    
    
 public void cardRelease(){
     dispScreen.clearScreen();
     //dispScreen.enterText("Cancel Transaction");
     dispScreen.enterText("Kindly enter your card");
    }
    
}
