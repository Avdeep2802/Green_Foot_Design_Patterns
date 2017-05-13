/**
 * Write a description of class FourthZipNumber here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FourthZipNumber implements ZipStateSetterInterface 
{
    // instance variables - replace the example below with your own
    ZipCodeInterface code;
    
    public FourthZipNumber(ZipCodeInterface code)
    {
        this.code=code;
        
    }

    @Override
     public void del(){
        code.setThirdNumber(null);
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
       code.setFifthNumber(zipcode);
    }
   
    @Override
   public int isValid(){
       return 0;
    }
   
    @Override
   public void notValid(){
       
    }
}
