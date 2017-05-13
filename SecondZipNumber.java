
public class SecondZipNumber implements ZipStateSetterInterface 
{
    // instance variables - replace the example below with your own
    ZipCodeInterface code;
    
    public SecondZipNumber(ZipCodeInterface code)
    {
        this.code=code;
        
    }

    @Override
     public void del(){
        code.setFirstNumber(null);
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
       code.setThirdNumber(zipcode);
    }
   
    @Override
   public int isValid(){
       return 0;
    }
   
    @Override
   public void notValid(){
       
    }
}
