/**
 * Write a description of class ThirdZipNumber here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ThirdZipNumber implements ZipStateSetterInterface  
{
    // instance variables - replace the example below with your own
    ZipCodeInterface code;
    
    public ThirdZipNumber(ZipCodeInterface code)
    {
        this.code=code;
        
    }

    @Override
     public void del(){
        code.setSecondNumber(null);
    }
     
    @Override
   public void cancel(){
       code.setNoNumber();
    }
   
    @Override
   public void ok(){
       code.checkValidity();
    }
   
    @Override
   public void zip(String zipcode){
       code.setFourthNumber(zipcode);
    }
   
    @Override
   public int isValid(){
       return 0;
    }
   
    @Override
   public void notValid(){
       
    }
}
