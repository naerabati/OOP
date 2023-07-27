import java.util.Random;

/**
 * Write a description of class ArrayData here.
 *
 * @author Nishna Aerabati
 * @version 10/22
 */
public class ArrayData
{

    private double[] dArray; 
    private double[] testArray; 
    /**
     * Constructor for objects of class ArrayData
     */
    public ArrayData()
    {
        dArray = new double[10000]; 
        testArray = new double[10000.0]; 
    }

    /**
     * This adds a new double to the array d Array
     */
    public void populate()
    {
        Random rng = new Random();
        for(int i = 0; i < dArray.length; i++){ 
            dArray[i] = rng.nextInt(10000);
            testArray[i] = rng.nextDouble(10000.0);
            dArray[i] = (double)dArray[i];
        } 
    }
    /**
     * This finds the value of the number at the specified index
     * @param the number index that you want the value of in the array
     * @return the value at the parameter index 
     */
    public double getValue(int index)
    {
        double returnValue = dArray[index]; 
        return returnValue; 
    }
    /**
     * This gets the highest number in the array 
     * 
     * @return the maximum value in the array 
     */
    public double getHighest()
    {
        double max = 0; 
        for(int i = 0; i < dArray.length; i++){ 

            if(getValue(i) > max){
                max = getValue(i); 
            }

        } 
        return max; 
    }
    /**
     * This gets the highest number in the array 
     * 
     * @return the minimum value in the array 
     */
    public double getLowest()
    {
        double min = getValue(0); 
        for(int i = 0; i < dArray.length; i++){ 

            if(getValue(i) < min){
                min = getValue(i); 
            }

        }  
        return min; 
    }
    /**
     * This prints out the number what numbers are the largest and smallest in the array 
     * 
     */
    public void printHighAndLow()
    {
        double min = getLowest();
        double max = getHighest();
        System.out.printf("the highest value in the array is %10.5f\n", getLowest());
        System.out.printf("the highest value in the array is %10.5f\n", getHighest());
    }
}
