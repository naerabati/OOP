import java.io.*;
import java.util.Scanner;
import java.io.File; 
import java.io.FileNotFoundException; 
import java.util.Random;
import java.util.Arrays;
/**
 * Write a description of class readFileIntoArray here.
 *
 * @author Nishna Aerabati 
 * @version 10/1
 */
public class readFileIntoArray
{
    private Random rng = new Random(); 
    private Scanner scan; 
    private File file; 
    private File file2; 
    private String[] sArray; 
    private int[] iArray; 
    private int[] randomArray; 
    private int[] ageArray; 
    private String[] nameArray; 
    private Scanner fileScan; 
    private Scanner nameScan; 
    /**
     * Constructor for objects of class readFileIntoArray
     */
    public readFileIntoArray()throws FileNotFoundException
    {
        file = new File("names.txt");
        file2 = new File("numbers.txt");
        scan = new Scanner(System.in); 
        sArray = new String[30];
        iArray = new int[30];
        randomArray = new int[20]; 
        nameArray = new String[30];
        ageArray = new int[30]; 
        fileScan = new Scanner(file); 
        nameScan = new Scanner(file2); 
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void amountOfNumbers() throws FileNotFoundException 
    {
    
    int i = 0;
        while(fileScan.hasNextInt()){
        iArray[i] = scan.nextInt();
        i++; 
    }
    System.out.println("There are " + i + " numbers in the file"); 
    }
    
    public void greaterThanFifty()
    {
    int i = 0;
        while(fileScan.hasNextLine()){
        iArray[i] = scan.nextInt();
         
        if(iArray[i] > 50){
            System.out.println(iArray[i]); 
        }
    }
     
    }
    
    public void isOddOrEven(){
     
        int i = 0;
        while(fileScan.hasNextInt()){
        iArray[i] = scan.nextInt();
       
        if(iArray[i]%2 == 0){
        System.out.println(i + "is even");
        
    }else{
        System.out.println( i + " is odd"); 
    }
        i++;
    }
    }
    
    
    public void isDivisibleByFive(){
     
        int i = 0;
        while(fileScan.hasNextInt()){
        i = scan.nextInt();
      
        if(i%5 == 0){
        System.out.println(i);
        
    }
        i++;
    }
    }
    
    
    public void namesIntoArray(){
        int x = 0; 
        while(nameScan.hasNextLine()){
            System.out.println(x); 
            
            sArray[x] = scan.nextLine();
            
            x++; 
        }
    }
    
    
    public void randomNumberArray(){
       int rNumber = 0; 
        for(int i = 0; i < 21; i++){
       rNumber = 0; 
       rNumber = rng.nextInt(6);  
       rNumber = rNumber + 14;  
       
       randomArray[i] = rNumber; 
       
    }
    System.out.print(Arrays.toString(randomArray));
    }
    
    
    public void studentNameAndAge(){
     int x = 0; 
        while(nameScan.hasNextLine()){
            System.out.println(x); 
            
            nameArray[x] = scan.nextLine();
            
            x++; 
        }
     int g = 0; 
         while(fileScan.hasNextInt()){
            System.out.println(g); 
            
            ageArray[g] = scan.nextInt();
            
            g++; 
        }
        
        for( int n = 0; n < 25; n++){
            System.out.printf("Student is %s", nameArray[n]);
            System.out.printf(" and they are %d/n years old", ageArray[n]); 
        }
     
    }
}
