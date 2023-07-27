import java.util.*;
import java.util.function.Supplier;
/**
 * Write a description of class Chapter2 here.
 *
 * @author (Nishna Aerabati)
 * @version (9/13/2021)
 */
public class Chapter2
{
    
    private int x;
    private int y; 
    private double min; 
    private double year; 
    private int numberEquation; 
    private double count; 
    private int leapYear; 
    private int count2; 
    private List letters; 
    private List vowels; 
    private double dividend1; 
    /**
     * Constructor for objects of class Chapter2
     */
    public Chapter2()
    {
        min = 0; 
        count = 0; 
        x = 0;
        year = 0; 
        leapYear = 0;
        count2 = 0;
        letters = new ArrayList();
        vowels = new ArrayList(); 
        dividend1 = 0; 
    }

    /** 
     * @print This method prints out the answers to the specific questions below in my method to which I assigned to variables
     */
    public void questionOne()
    {
        
        int ans1 =  101 + 0 / 3 % 5 * 10; 
        int ans2 = (101 + 0) / 3; 
        boolean ans3 = true && true; 
        boolean ans4 = false && true; 
        boolean ans5 = (false && false) || (true && true); 
        boolean ans6 = (false || false) && (true && true); 
        
        
       
        System.out.println( " 101 + 0 / 3 % 5 * 10" + ans1);
        System.out.println("(101 + 0) / 3 " + ans2);
        System.out.println("true && true" + ans3);
        System.out.println("false && true" + ans4); 
        System.out.println("(false && false) || (true && true)" + ans5); 
        System.out.println("false || false) && (true && true)" + ans6); 
    }
    /** 
     * @param The user inputs a dividend and a divisor, two numbers/integer
     * @print This method will print out the remainder and the largest whole number after performing the division
     */
    public void questionTwo(int dividend, int divisior)
    {
        while( dividend <= divisior)
        {
            count = count + 1;
            dividend = dividend - divisior;
            
        }
        
        dividend = dividend/divisior;
        double remainder = dividend%divisior; 
        float fraction = (float) remainder/ (float) divisior; 
        count = count + divisior;
        System.out.println(count + " the remainder is " + remainder + "fraction is" + fraction); 
        
    }
    /** 
     * @param The user inputs three numbers/integers represnted by a,b, and c
     * @print This method will print out the solution to the quadratic equation 
     * if the discriminant allows there to be atleast one solution 
     */
    public void questionThree( int a, int b, int c) 
    { 
        float discriminant = b*b-4*a*c; 
        if ( discriminant > 0){
        double result1 = (b * (-1) + Math.sqrt(b*b - 4*a*c))/(2*a);  
        double result2 = (b * (-1) - Math.sqrt(b*b - 4*a*c))/(2*a);
        System.out.println("The answer is :" + result1 + "and" + result2); 
    }
    else if (discriminant == 0){
        double answer3 = -b/(2*a); 
        System.out.println(" your answer is " + answer3); 
    } 
    else {
       System.out.println("no real answers");  
    }
    }
    /** 
     * @param the user inputs a single capital or lowercase string letter
     * @print This method will print out the vowel or consosnant depending 
     * on the letter inputted by the user and an error if the user input
     * is not a single letter or a letter at all 
     */
        
    public void questionFour2( char userLetter){ 
    if( userLetter(6) == false){
    }
    
    
    
    }
    public void questionFour(String userLetter)
    {   
        if( userLetter.length() > 1){     
        if(Arrays.asList( "a", "A","b", "B", "c" , "C" ,"D" ,"d" ,"e" , "E" ,"F" ,"f" ,"G" , "g",
         "H" ,"h","I" , "J" , "j" , "i" , "K" , "k" ,"L" ,"l" ,"M" , "m",
         "N", "n" , "o", "O" ,"P" , "p" ,"Q","q","R",   "r", "S","s" ,"T" , "t",
         "U",  "u", "v" ,"V" ,"W" ,"w" ,"X" , "x", "Z", "z" , "Y",  "y" ).contains(userLetter)
        ){
        
        
        if( Arrays.asList("a", "A", "e", "E", "I", "i", "o", "O", "U", "u", "Y"
        , "y").contains(userLetter)){
            
            System.out.println("Vowel");
            
        }else{
         System.out.println("Consonant"); 
        
        }}}else{
            System.out.println("error");
        }
    
        
        
    }
    /** 
     * @param a sting of the the user inputted year 
     * @print   if the year is an leap year the program will print it is a 
     * leap year and if not it will print that the year is not a leap year
    */
     
    public void questionFive(String userYear) 
    {
       
       userYear =  userYear.substring(2,4);
       int leapYear = Integer.valueOf(userYear);
       if(leapYear%4 == 0 || leapYear == 00){
           System.out.println("That year is a leap year");
       }else{
           System.out.println("That year is not a leap year"); 
       }
       
    }
    /** 
     * @param The user inputs a single integer 
     * @print This method will print out the amount of years and thed days after
     * converting the user number of minutes to hours, days, and years 
     */
    public void question6(double minutes) 
    {
        double hours = minutes/60; 
        double days = hours/24;
        double years = minutes/365; 
        double finalYears = Math.floor(years);
        double finalDays = minutes%365; 
        
        System.out.println("Number of years: " + finalYears + "  Number of days: " 
        + finalDays); 
    }
    /** 
     * @param The user inputs a string password
     * @print This method will print out if the password is valid based on 
     * whether there are at least two digits and the length is greater than 
     * or equal to 10, if not it prints that the password is invalid 
     */
   public void question7Redo()
   {
       
   }
    public void question7(String userPassword) 
    {
    
        
        if(userPassword.isLetter() | userPassword.isDigit){
        if(userPassword.length() < 10){ 
        
        System.out.println("This password is not valid");
    }else{
        for( x = 0; x <= userPassword.length(); x++){
        
        if(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0).contains(x))
        {
         
            count = count + 1;
    
        } 
        }
        if(count2 < 2){
            System.out.println("Invalid password"); 
        }
    }}

}
}


       
    
    
    
    
