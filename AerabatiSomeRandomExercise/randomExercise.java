import java.util.Scanner; 
import java.util.Random;
import java.util.Arrays; 
/**
 * Write a description of class randomExercise here.
 *
 * @author Nishna Aerabati 
 * @version 10/15/2021
 */
public class randomExercise
{

    private Scanner scan;
    private int length; 
    private int[] randomNumberArray; 
    private Random rng; 
    /**
     * Constructor for objects of class randomExercise
     */
    public randomExercise()
    {
        int size = arrayNumber();
        populateArray(size);
        printArray(); 
        scan = new Scanner(System.in);  
        rng = new Random(); 
        
    }

    
    
    public int arrayNumber()
    {
        System.out.println("Please input an integer for the length of the array");
        Scanner scan2 = new Scanner(System.in);
        return scan2.nextInt();  
    }
    public void populateArray(int size){
        Random rnp = new Random();
        randomNumberArray = new int[size];
         
        for(int i = 0; i < size; i++){ 
            randomNumberArray[i] = rnp.nextInt(); 

        }
    }
    public void printArray(){
      for(int i = 0; i< randomNumberArray.length; i++){
          if(i %5 == 0 ){
                System.out.printf("\n"); 
              System.out.printf( "%14d", randomNumberArray[i]); 
            }
      }
      
    }
    
    /**
     * Determines what the length of the array is by prompting the user
     */
    public void getArrayNumber()
    {
        System.out.println("Please input an integer for the length of the array");
        length = scan.nextInt();  
        randomNumberArray = new int[length];
        createRandomNumberArray(); 

    }
    /**
     * Uses the rng to add random numbers to the array of the user's determined length
     */
    public void createRandomNumberArray(){
        int rNumber = 0; 
        for(int i = 0; i < length; i++){
            rNumber = 0; 
            rNumber = rng.nextInt(101);  

            randomNumberArray[i] = rNumber; 

        }
        formatArray();
    }
    /**
     * Prints the array using a printf statement for every 6 numbers it starts a new line
     */
    public void formatArray(){
    
        for(int i = 0; i < length; i++){
            if(i%5 == 0 && i < length - 5){
                System.out.printf( "%5d,%5d,%5d,%5d,%5d,%5d\n ", randomNumberArray[i], randomNumberArray[i+1], randomNumberArray[i+2],randomNumberArray[i+3],randomNumberArray[i+4],randomNumberArray[i+5]);
                ;
            }

            
        }
        calculateAverage(); 
    }
    /**
     * Prints the average 
     */
    public void calculateAverage(){
            int sum = 0; 

            for( int i = 0; i < length; i++){
                sum = randomNumberArray[i] + sum;    
            }

            int average = sum/length; 
            System.out.println(" "); 
            System.out.println("The average is " + average); 
        }
    }
