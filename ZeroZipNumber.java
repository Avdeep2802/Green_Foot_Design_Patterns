/**
 * Write a description of class ZeroZipNumber here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZeroZipNumber implements ZipStateSetterInterface  
{
    // instance variables - replace the example below with your own
   ZipCodeInterface code;
    
    public ZeroZipNumber(ZipCodeInterface code)
    {
        this.code=code;
        
    }

    @Override
     public void del(){
        
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
       code.setFirstNumber(zipcode);
    }
   
    @Override
   public int isValid(){
       return 0;
    }
   
    @Override
   public void notValid(){
       
    }
}
