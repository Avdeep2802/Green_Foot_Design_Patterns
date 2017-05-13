/**
 * Write a description of class CardReading here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CardReading  
{
    CardInterface stateOfCard;
    CardInterface rightZip;
    CardInterface cardInserted;
    CardInterface notInserted;
    
    DisplayScreen dispScreen;
    int ifCorrectZip=0;
    public CardReading(DisplayScreen dispScreen)
    {
        this.dispScreen= dispScreen;
        cardInserted= new CardInserted(this,this.dispScreen);
        notInserted= new CardNotInserted(this, this.dispScreen);
        rightZip= new ValidateZip(this, this.dispScreen);
        
        stateOfCard= notInserted;
    }

    void stateSet(CardInterface state){
        
        stateOfCard= state;
    }
    
    public void cardSwipe(){
        
        stateOfCard.swipeCard();
    }
    
    public void cardRemove(){
        
        stateOfCard.cardRelease();
    }
    
    public void typeZip(){
        
        stateOfCard.enterZip();
    }

    
    public CardInterface getCardInstert(){
    
        return cardInserted;
    }
    
    public CardInterface getNotInserted(){
    
        return notInserted;
    }
    
    public CardInterface getRightZip(){
    
        return rightZip;
    }
}
