import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

   public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1400 , 600, 1);
        prepare();
    }

    public void prepare() 
    {


        Card card = new Card(this);
        

        Station gasStation = new Station(this);
        gasStation.display();
        
        NozzleHolder nozzleHolder = new NozzleHolder(this);
        nozzleHolder.display();

        
        Car car = new Car(this);
        car.display();
        //    CarWashArea carWashArea = new CarWashArea(this);
        GasPump screen = new GasPump();
        NumPad numpad = new NumPad(this);
        numpad.Display(this);
        
        CreditCard cc = new CreditCard(this);
        //cc.display();
        ScreenSideButtons sidebuttons = new ScreenSideButtons(this);
        sidebuttons.display(this);
        //sidebuttons.display2(this);
        
        DisplayScreen display = new DisplayScreen(this);
        // composite pattern for all card objects
        
        card.addToView(cc);

        
        screen.addToView(gasStation);
        //      screen.addSubComponent(carWashArea);
        screen.addToView(card);
        screen.addToView(display);
        screen.addToView(car);
        GasNozzle pumpNozel = new GasNozzle(this);
        pumpNozel.displayScreen();
        screen.addToView(pumpNozel);
        screen.addToView(nozzleHolder);

        


        Receipt printer = new Receipt(this);
        CardReader scanner = new CardReader(this);
        ScreenSideButtons buttons = new ScreenSideButtons(this);
        //Display messages = new Display(this);
        GasType fuelType =new GasType(this);
        fuelType.display();

        //composite pattern for all gas station components
        //gasStation.addSubComponent(messages);
        gasStation.addToView(scanner);
        gasStation.addToView(printer);
        gasStation.addToView( buttons);
        gasStation.addToView(fuelType);

        //composite pattern for the whole screen        

        
        addObject(screen, 50, 50);
    /*  display.clear();
        display.setText("Scan Your Card!");
*/
        
        //     This should be called when customer asks for a car wash from the respective class
        //      Greenfoot.setWorld(new CarWashWorld());
    }
}
