import java.lang.String; 
/**
 * Write a description of class ClockDisplay here.
 *
 * @author NishnaAerabati 
 * @version 9/28/2021
 */
public class ClockDisplay
{
    
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString; 

    /**
     * Constructor for objects of class ClockDisplay
     */
    public ClockDisplay()
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        updateDisplay(); 
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public ClockDisplay(int hour, int minute)
    {
       hours = new NumberDisplay(24);
       minutes = new NumberDisplay(60);
       setTime(hour, minute); 
    }
    
    
    public void timeTick()
    {
        minutes.increment(); 
        if(minutes.getValue() == 0){
            hours.increment();
        }
        updateDisplay();
    }
    
    public void setTime(int hour, int minute)
    {
        hours.setValue(hour);
        minutes.setValue(minute);
        updateDisplay(); 
    }
    
    public String getTime()
    {
        return displayString; 
    }
    
    private void updateDisplay(){
        displayString = hours.getDisplayValue() + ":" +
        minutes.getDisplayValue();
    }
    
}
