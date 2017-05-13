/**
 * Write a description of class ZipCodeInterface here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface ZipCodeInterface  
{
    // instance variables - replace the example below with your own
   public void del();
   public void cancel();
   public void ok();
   public void zip(String code);
   public int isValid();
   public void notValid();
   
   public void setNoNumber();
   public void setFirstNumber(String zipcode);
   public void setSecondNumber(String zipcode);
   public void setThirdNumber(String zipcode);
   public void setFourthNumber(String zipcode);
   public void setFifthNumber(String zipcode);
   public void checkValidity();
   
}
