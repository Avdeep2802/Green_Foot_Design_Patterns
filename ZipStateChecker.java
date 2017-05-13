/**
 * Write a description of class ZipStateChecker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZipStateChecker implements ZipCodeInterface 
{
    // instance variables - replace the example below with your own
    
  ZipStateSetterInterface ZipState ;
	ZeroZipNumber zeroCode;
	FirstZipNumber oneCode;
	SecondZipNumber twoCode;
	ThirdZipNumber threeCode;
	FourthZipNumber fourCode;
	FifthZipNumber fiveCode;
	
	String firstNum, secondNum, thirdNum, fourthNum, fifthNum ;
	int count;
	
	String zipcode = "12345";
	boolean authenticated = false;
	DisplayScreen dispScreen = null;


   public ZipStateChecker(DisplayScreen dispScreen) {
    zeroCode = new ZeroZipNumber(this);
    oneCode = new FirstZipNumber(this);
    twoCode = new SecondZipNumber(this);
    threeCode = new ThirdZipNumber(this);
    fourCode = new FourthZipNumber(this);
    fiveCode = new FifthZipNumber(this);
    this.ZipState = zeroCode;
    this.dispScreen =dispScreen;
  }
  
  public String getCurrentState()
    {
        return ZipState.getClass().getName() ;
    }

  @Override
  public void del() {
    // TODO Auto-generated method stub
    this.ZipState.del();
  }

  @Override
  public void zip(String digit) {
    // TODO Auto-generated method stub
    this.ZipState.zip(digit);
  }

  @Override
  public int isValid() {
    // TODO Auto-generated method stub
    return this.ZipState.isValid();
  }

  @Override
  public void notValid() {
    // TODO Auto-generated method stub
    this.ZipState.notValid();
  }

  @Override
  public void setNoNumber() {
    // TODO Auto-generated method stub
    this.count = 0;
    this.ZipState = zeroCode;
    this.firstNum = "*" ;
        this.secondNum = "*" ;
        this.thirdNum = "*" ;
        this.fourthNum = "*" ;
        this.fifthNum = "*" ;
        display() ;
  }

  @Override
  public void setFirstNumber(String digit) {
    // TODO Auto-generated method stub
    this.count = 1;
    this.ZipState = oneCode;
    if(digit == null)
      this.secondNum = "*";
    else{ this.firstNum = digit;
        this.secondNum = "*";
    }
        this.thirdNum = "*" ;
        this.fourthNum = "*" ;
        this.fifthNum = "*" ;
        display() ;
  }

  @Override
  public void setSecondNumber(String digit) {
    // TODO Auto-generated method stub
    this.count = 2;
    this.ZipState = twoCode;
    if(digit == null)
      this.thirdNum = "*";
    else this.secondNum = digit;
        this.fourthNum = "*" ;
        this.fifthNum = "*" ;
        display() ;
  }

  @Override
  public void setThirdNumber(String digit) {
    // TODO Auto-generated method stub
    this.count = 3;
    this.ZipState = threeCode;
    if(digit == null)
      this.fourthNum = "*";
    else this.thirdNum = digit;
        this.fifthNum = "*" ;
        display() ;
  }

  @Override
  public void setFourthNumber(String digit) {
    // TODO Auto-generated method stub
    this.count = 4;
    this.ZipState = fourCode;
    if(digit == null)
      this.fifthNum = "*";
    else this.fourthNum = digit;
        display() ;
  }

  @Override
  public void setFifthNumber(String digit) {
    // TODO Auto-generated method stub
    this.count = 5;
    this.ZipState = fiveCode;
    this.fifthNum = digit;
        display() ;
  }
  
  @Override
  public void checkValidity() {
    // TODO Auto-generated method stub
      dispScreen.clearScreen();
      dispScreen.enterText("Help");
      dispScreen.enterText("Cancel");

    dispScreen.enterText( "Authenticating..." ) ;
        if ( zipcode.equals( firstNum+secondNum+thirdNum+fourthNum+fifthNum ) )
        {
          dispScreen.clearScreen();
          dispScreen.enterText("Help");
          dispScreen.enterText("Cancel");

          dispScreen.enterText( "Choose Your Gas!" ) ;
            this.authenticated = true ;
            this.ZipState.isValid();
        }
        else
        {
          dispScreen.clearScreen();
          dispScreen.enterText("Help");
          dispScreen.enterText("Cancel");

          
          dispScreen.enterText( "Authentication Failed!" ) ;
            setNoNumber() ;
        }
  }
  
  public void display() {
      dispScreen.clearScreen();
      dispScreen.enterText("Help");
      dispScreen.enterText("Cancel");

    dispScreen.enterText(firstNum + " " + secondNum + " " + thirdNum + " " + fourthNum + " " + fifthNum);
  }

  @Override
  public void cancel() {
    // TODO Auto-generated method stub
    this.ZipState.cancel();
  }

  @Override
  public void ok() {
    // TODO Auto-generated method stub
    this.ZipState.ok();
  }

   
}
