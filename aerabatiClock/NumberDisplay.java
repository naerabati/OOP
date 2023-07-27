
/**
 * Write a description of class NumberDisplay here.
 *
 * @author Nishna Aerabati 
 * @version 9/28
 */
public class NumberDisplay
{
    
    private int limit;
    private int value; 
    /**
     * Constructor for objects of class NumberDisplay
     */
    public NumberDisplay(int rollOverLimit)
    {
        limit = rollOverLimit; 
        value = 0; 
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getValue()
    {
        
        return value; 
    }
     public String getDisplayValue()
    {
        if(value < 10){
            return "0" + value; 
        }
        else{
            return "" + value; 
        }
    }
    public void setValue(int replacementValue)
    {
        if((replacementValue >= 0)&& (replacementValue < limit)){
            value = replacementValue;
    }
    }
    
    public void increment()
    {
            value = (value + 1) % limit; 
    }
    }

