import java.util.Random; 
import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner; 
import java.util.ArrayList;

/**
 * Write a description of class Population here.
 *
 * @author Nishna Aerabati 
 * @version 11/1
 */
public class Population
{
    private Scanner scan; 
    private Scanner sc; 
    private ArrayList<String> counties;
    private ArrayList<Integer> population;

    /**
     * Constructor for objects of class Population
     */
    public Population() throws FileNotFoundException 
    {

        counties = new ArrayList<>(); 
        population = new ArrayList<>(); 

        menu(); 

    }

    /**
     * Creates the menu and runs method based on what option the user picks 
     */

    public void menu() throws FileNotFoundException {
        sc = new Scanner(System.in);
        boolean  running = true; 
        
        while(running){
            printPrompt(); 
            int choice = sc.nextInt(); 
            if( choice == 1)

            {
                printData(); 

            }else if(choice == 2){

                System.out.println("The total population of Texas is " + findTotal());
            } else if( choice == 3){
                randomCounty(); 

            } else if(choice == 4){
                showLeadingDigit(); 

            } else if(choice == 5){
                analysis(); 

            }else if(choice == 6){
                shuffle(); 

            }else if(choice == 7){
                running = false; 
            }

        }
    }
    
    
    /**
     * Prompts the user by printing the text of the options and runs the method populate
     */
    public void printPrompt() throws FileNotFoundException {
        System.out.println("Population of Texas"); 
        populate(); 
        System.out.println("Please select one of the following:");  
        System.out.println("1. Print the data from the file.");
        System.out.println("2. Find Texas total population");
        System.out.println("3. Randomly choose a county and display its population");
        System.out.println("4. Find counties population with a leading digit, entered by the user");
        System.out.println("5. Find total number of counties/percentage of population with each leading digit formatted using printf");
        System.out.println("6. Shuffle the order of the counties and display the counties and population in random order"); 
        System.out.println("7. Exit the program");  

    }
    /**
     * Creates a new object population
     */
    public static void main(String[] args) throws FileNotFoundException{
        Population p = new Population();

    }
    /**
     * reads the texas data file and add the counties to it's own ArrayList and 
     * adds the populations their own ArrayList
     */
    public void populate()  throws FileNotFoundException{
        File text = new File("TexasCountyFile.txt");
        scan = new Scanner(text);
        String nextLine = "";
        String[] sArray = new String[2];
        int i = 0;
        while (scan.hasNextLine())
        {
            nextLine = scan.nextLine();

            sArray = nextLine.split("\t");   
            counties.add(i,sArray[0] ); 
            population.add(i, Integer.parseInt(sArray[1]));
            i++;
        }

    }
    
    /**
     * Prints the counties and its corresponding population using printf from the ArrayLists
     */
    public void printData()throws FileNotFoundException{ 
        File text = new File("TexasCountyFile.txt");
        Scanner s = new Scanner(text);
        System.out.println("Reading data from a file into an array: "); 
        for(int i = 0; i < counties.size(); i++){
            String county = counties.get(i); 
            int pop = population.get(i); 
            System.out.printf("%s    %d\n", county, pop); 
        }

    }

    /**
     * Chooses a random number from 0 - 253 and prints the county and population 
     * of the randomly chosen number
     */
    public void randomCounty(){
        Random rng = new Random(); 
        int rNumber = rng.nextInt(254);  

        System.out.println("Randomly chosen county at index " + rNumber + " is: " + counties.get(rNumber)); 
        System.out.println("and its population is: " + population.get(rNumber)); 

    }

    public int findTotal(){
        int total = 0; 

        for(int i = 0; i < population.size(); i++){
            total = total + population.get(i); 
        }

        return total; 
    }
    
    /**
     * takes in the user's inputted integer and iterates through the ArrayList looking
     * for every population value that begins with that integer and then prints 
     * all the counties and populations that it found with the user's integer
     */
    public void showLeadingDigit(){
        System.out.println("Enter the leading digit 1-9:");
        int digit = sc.nextInt(); 

        System.out.println("Showing data with a leading digit of: " + digit); 
        for(int i = 0; i < population.size(); i++){
            String pname = String.valueOf(population.get(i));  
            pname = pname.substring(0,1);
            int p = Integer.parseInt(pname); 
            if(p == digit){
                System.out.printf("%s  %d\n", counties.get(i), population.get(i));

            }
        }
    }
    
    
    /**
     * Iterates through all the populations and adds the amount of time each one is 
     * found for each 1-9 integer, while also adding up all of the populations to 
     * find the percentage of the total for each digit
     */
    public void analysis(){
        int total = findTotal();
        System.out.println("digit     number    percentage"); 
        int case1 = 0;
        double pop1 = 0;
        int case2 = 0;
        double pop2 = 0;
        int case3 = 0;
        double pop3 = 0;
        int case4 = 0;
        double pop4 = 0;
        int case5 = 0;
        double pop5= 0;
        int case6 = 0;
        double pop6 = 0;
        int case7 = 0;
        double pop7 = 0;
        int case8 = 0;
        double pop8 = 0;
        int case9 = 0;
        double pop9 = 0;
        for(int i = 0; i < population.size(); i++){
            String pname =  String.valueOf(population.get(i)); 
            pname = pname.substring(0,1);
            switch(pname){
                case "1": 
                    {
                        case1 = case1 + 1;

                        pop1 = pop1 + population.get(i);
                        break;
                    }
                case "2": 
                    {
                        case2 = case2 + 1;
                        pop2 = pop2 + population.get(i);
                        break;
                    }
                case "3": 
                    {
                        case3 = case3 + 1;
                        pop3 = pop3 + population.get(i);
                        break;
                    }
                case "4": 
                    {
                        case4 = case4 + 1;
                        pop4 = pop4 + population.get(i);
                        break;
                    }
                case "5": 
                    {
                        case5 = case5 + 1;
                        pop5 = pop5 + population.get(i);
                        break;
                    }
                case "6": 
                    {
                        case6 = case6 + 1;
                        pop6 = pop6 + population.get(i);
                        break;
                    }   
                case "7": 
                    {
                        case7 = case7 + 1;
                        pop7 = pop7 + population.get(i);
                        break;
                    }
                case "8": 
                    {
                        case8 = case8 + 1;
                        pop8 = pop8 + population.get(i);
                        break;
                    }
                case "9": 
                    {
                        case9 = case9 + 1;
                        pop9 = pop9 + population.get(i);
                        break;
                    }

                default:
                    {
                        System.out.print("That was not a valid input, please enter an integer 1-9"); 
                        break;
                    }

            }

        }

        System.out.printf(" 1 %9d %11.2f\n", case1,(pop1/total) * 100);
        System.out.printf(" 2 %9d %11.2f\n", case2, (pop2/total) * 100);
        System.out.printf(" 3 %9d %11.2f\n", case3, (pop3/total) * 100);
        System.out.printf(" 4 %9d %11.2f\n", case4, (pop4/total) * 100);
        System.out.printf(" 5 %9d %11.2f\n", case5, (pop5/total) * 100);
        System.out.printf(" 6 %9d %11.2f\n", case6, (pop6/total) * 100);
        System.out.printf(" 7 %9d %11.2f\n", case7, (pop7/total) * 100);
        System.out.printf(" 8 %9d %11.2f\n", case8, (pop8/total) * 100);
        System.out.printf(" 9 %9d %11.2f\n", case9, (pop9/total) * 100);
        
        /**
        * drawing the graph with the plot 
        */
        int per1 = case1/254;
        int per2 = case2/254;
        int per3 = case3/254;
        int per4 = case4/254;
        int per5 = case5/254;
        int per6 = case6/254;
        int per7 = case7/254;
        int per8 = case8/254;
        int per9 = case9/254;
        
        Plot p = new Plot(500, 500); 
        p.drawGridLines(); 
        p.drawGraph(1, per1);
        p.drawGraph(2, per2);
        p.drawGraph(3, per3);
        p.drawGraph(4, per4);
        p.drawGraph(5, per5);
        p.drawGraph(6, per6);
        p.drawGraph(7, per7);
        p.drawGraph(8, per8);
        p.drawGraph(9, per9);
    }
    
    /**
     * Picks a random number and adds them in a random order to a new ArrayList 
     * and then prints out each county and population with the corresponding index from 
     * each integer in the ArrayList
     */
    public void shuffle(){
        ArrayList<Integer> holder = new ArrayList<>();
        for(int i=0; i < population.size(); i++ ){  
            Random rng = new Random(); 
            int rNumber = rng.nextInt(254);

            if(holder.contains(rNumber)!= true){
                holder.add(rNumber); 

            }

        }
        for(int n : holder){
            System.out.println(counties.get(n) + "     " + population.get(n));

        }
    }

   

}

