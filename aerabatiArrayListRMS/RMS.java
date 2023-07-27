import java.util.ArrayList; 
import java.util.*;

/**
 * Write a description of class RMS here.
 *
 * @author Nishna Aerabati 
 * @version (a version number or a date)
 */
public class RMS
{
    
    private ArrayList<Integer> arr; 
    /**
     * Constructor for objects of class RMS
     */
    public RMS()
    {
      arr = new ArrayList<>();  
      populateList(); 
      outputResults(); 
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void populateList(){
      Random rng = new Random();
      Scanner scan = new Scanner(System.in); 
      System.out.println("Please enter an integer for the upper bound for a number of random integers:"); 
      int length = scan.nextInt(); 
      int rNumber = 0; 
      for(int i = 0; i < length; i++){
            rNumber = 0; 
            rNumber = rng.nextInt(101);  

            arr.add(rNumber); 

        }
      
    }
    
    public int calcSum(ArrayList<Integer> array){
    int sum = 0; 
    int index = 0; 
        for(int i : array){
        sum = sum + array.get(index); 
        index++; 
    }
    return sum; 
    }
    
    public double calcAvg(ArrayList<Integer> array ){
      int sum = 0; 
      int index = 0; 
      for( int i : array){
       
        sum = sum + array.get(index); 
        index++; 
    }  
    int length = array.size(); 
    int average = sum/length; 
    return average; 
    }
    
    public double calcRMS(ArrayList<Integer> arra){
        int length = 0; 
        double sum = 0; 
        for(int element : arra){
        sum = sum + (element * element); 
        length++; 
        }
        
        double s = (sum/length);
        double rms = Math.sqrt(s); 
        return rms; 
        
    }
    public ArrayList<Integer> modifiedLis(ArrayList<Integer> modArr){
        
        ArrayList<Integer> modifiedArray = new ArrayList<>(); 
        int index = 0; 
        for(int element : modArr){
        
        if(modArr.get(index) >= 95 || modArr.get(index) <= 5){
            modifiedArray.add(modArr.get(index)); 
            index++; 
        }
        }
        
        return modifiedArray; 
     }
    
    
    public ArrayList<Integer> modifiedList(ArrayList<Integer> modArr){
        Iterator<Integer> itr = modArr.iterator(); 
        ArrayList<Integer> modifiedArray = new ArrayList<>(); 
        
        while(itr.hasNext()) {
        int f = itr.next(); 
        if( f >= 95 || f <= 5){
            itr.remove(); 
            
        }
        }
        
        return modArr; 
     }
    
    
    public void  outputResults()
    {
        System.out.println("Determining the RMS values of 5000 random integers between 1 and 100:"); 
        System.out.println(" ");
        System.out.println("Analysis for the original ArrayList: "); 
        System.out.println(" ");
        System.out.println("An arraylist of " + arr.size() + " random integers has been created. ");
        System.out.println(" ");
        System.out.println("The sum of values in the arraylist is: " + calcSum(arr));
        System.out.println("The mean of values in the arraylist is:  " + calcAvg(arr));
        System.out.printf("The rms of values in the arraylist is: " +  "%.2f",calcRMS(arr));
        
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Analysis for the modified ArrayList: ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("An arraylist of " + modifiedList(arr).size() + " random integers has been create"); 
        System.out.println("Using that arraylist we have calculated the following:"); 
        System.out.println("The sum of values in the arraylist is: " + calcSum(modifiedList(arr)));
        System.out.println("The mean of values in the arraylist is:  " + calcAvg(modifiedList(arr)));
        System.out.printf("The rms of values in the arraylist is: " +  "%.2f",calcRMS(modifiedList(arr)));
        System.out.println(" ");
        System.out.println("Thank you for using my program. Have a nice day!");
        
        
        
    }
}
