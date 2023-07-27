
/**
 * Write a description of class FromScratch here.
 *
 * @author Nishna Aerabati
 * @version 9/2/2021
 */
public class FromScratch
{
    private int number;
    private double decimal; 
    private boolean truth;
    private String name;
    
    public FromScratch()
    {
       number = 0;
       decimal = 2.1; 
       truth = true;
       name = "whatever";
    }
    
    /**
     * @param sets new value to be assigned to num
     */
    public FromScratch(int num, double dec, String nm, boolean truth)
    {
       number = num;
       decimal = dec;
       name = nm;
       this.truth = truth;
        
    }
    
    public void setName(String n){
    name = n;
    }
    
    /**
     *  sets value in field number
     *  @param new value to be assigned to number. 
     */
    
    public void setNumber(int number)
    {
        this.number = number;
    }
    
    public void setDecimal(double n)
    {
        decimal = n;
    }
    
    
    public void setTruth(boolean n)
    {
        truth = n;
    }
    /**
     * Returns value in name 
     * @return value in name 
     */
    
    public String getName()
    {
        return name;
    }
    
    public boolean getTruth()
    {
        return truth;
    }
    
    public double getDecimal(){
        return decimal;
    }
    
    public int getNumber(){
        return number;
    }
    
    
    public void print()
    {
      System.out.println(truth);
      System.out.println(name);
      System.out.println(number);
      System.out.println(decimal);
      
      String output = " ";
      output = output + "The output is ";
      output= output + number; 
      output = output + decimal;
      
      System.out.println(output); 
      
      
    }
    
    
   
}
