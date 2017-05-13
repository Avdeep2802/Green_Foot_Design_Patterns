/**
 * Write a description of class FifthZipNumber here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FifthZipNumber implements ZipStateSetterInterface
{
   ZipCodeInterface code;
    
    public FifthZipNumber(ZipCodeInterface code)
    {
        this.code=code;
        
    }

    @Override
     public void del(){
        code.setFourthNumber(null);
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
      
    }
   
    @Override
   public int isValid(){
       return 1;
    }
   
    @Override
   public void notValid(){
       code.setNoNumber();
    }
}
