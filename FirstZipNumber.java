/**
 * Write a description of class FirstZipNumber here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FirstZipNumber implements ZipStateSetterInterface 
{
    // instance variables - replace the example below with your own
    ZipCodeInterface code;
    
    public FirstZipNumber(ZipCodeInterface code)
    {
        this.code=code;
        
    }

    @Override
     public void del(){
        code.setNoNumber();
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
       code.setSecondNumber(zipcode);
    }
   
    @Override
   public int isValid(){
       return 0;
    }
   
    @Override
   public void notValid(){
       
    }
   
}
