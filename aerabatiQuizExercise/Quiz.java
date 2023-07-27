import java.util.Scanner; 
import java.util.ArrayList; 
import java.io.*;
import java.io.File;
import java.util.Arrays; 
import java.util.Iterator;
import java.util.*;

/**
 * Write a description of class Quiz here.
 *
 * @author Nishna Aerabati & Janelle Le Roy 
 * @version 11/8 
 */
public class Quiz
{
    ArrayList <String> questions; 
    ArrayList <String[]> answers; 
    Scanner scan; 
    char[] yourAnswers; 

    /**
     * Constructor for objects of class Quiz
     */
    public Quiz()throws FileNotFoundException
    {
        answers = new ArrayList<>(); 
        questions = new ArrayList<>(); 
        scan = new Scanner(System.in); 
        yourAnswers = new char[4]; 
        populate();
        createQuiz();
        score(); 
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */

    /**
     *Splits the file into an arrayList and fills the questions arryalist 
     *Afterwords it creates four new arrays for each of the answers and 
     *appends them to the answers ArrayList 
     */
    public void populate()throws FileNotFoundException
    {
        File text = new File("quizData.txt"); 
        Scanner scn = new Scanner(text);

        ArrayList<String> wholeLine = new ArrayList<>(); 
        ArrayList<String> options1 = new ArrayList<>();
        ArrayList<String> options2 = new ArrayList<>();
        ArrayList<String> options3 = new ArrayList<>();
        ArrayList<String> options4 = new ArrayList<>();

        while(scn.hasNextLine()){
            String line = scn.nextLine(); 
            wholeLine.add(line); 

        }

        ArrayList<Integer> ints = new ArrayList<>(); 
        for(int s = 0; s < wholeLine.size(); s++){
            if(s%5 == 0){

                questions.add(wholeLine.get(s)); 

            }else if(s < 5){

                options1.add(wholeLine.get(s));

            }else if(s < 10){

                options2.add(wholeLine.get(s)); 

            }else if(s < 15){

                options3.add(wholeLine.get(s)); 

            }else if(s < 25){

                options4.add(wholeLine.get(s)); 

            }
        }
        for(int w = 0; w < 4; w++){
            if(w == 0){
                String one = "a." + options1.get(w); 
                options1.set(w, one); 
                String two = "a." + options2.get(w); 
                options2.set(w, two); 
                String three = "a." + options3.get(w); 
                options3.set(w, three); 
                String four = "a." + options4.get(w); 
                options4.set(w, four); 

            }else if(w == 1){

                String one = "b." + options1.get(w); 
                options1.set(w, "b." + options1.get(w)); 
                String two = "b." + options2.get(w); 
                options2.set(w, two); 
                String three = "b." + options3.get(w); 
                options3.set(w, three); 
                String four = "b." + options4.get(w); 
                options4.set(w, four);

            }else if( w == 2){
                String one = "c." + options1.get(w); 
                options1.set(w, one); 
                String two = "c." + options2.get(w); 
                options2.set(w, two); 
                String three = "c." + options3.get(w); 
                options3.set(w, three); 
                String four = "c." + options4.get(w); 
                options4.set(w, four);

            }else if(w == 3){
                String one = "d." + options1.get(w); 
                options1.set(w, one); 
                String two = "d." + options2.get(w); 
                options2.set(w, two); 
                String three = "d." + options3.get(w); 
                options3.set(w, three); 
                String four = "d." + options4.get(w); 
                options4.set(w, four);

            }

        }
        String array1[] = options1.toArray(new String[options1.size()]);
        String array2[] = options2.toArray(new String[options2.size()]);
        String array3[] = options3.toArray(new String[options3.size()]);
        String array4[] = options4.toArray(new String[options4.size()]);

        answers.add(array1); 
        answers.add(array2); 
        answers.add(array3); 
        answers.add(array4); 

        //for(int i = 0; i < answers.size(); i++){
        //System.out.println(Arrays.toString(answers.get(i))); 
    }

    /**
     * iterates through the answers and questions arrayList and prints them 
     * while adding the user's answers to a new char array
     */
    

    public void createQuiz(){
        System.out.println("Welcome to the online quiz! Please select a best possible answer for each of the following: "); 
        int qN = 1; 
        for(int i = 0; i < 4; i++){

            
            System.out.println(qN + ". " + questions.get(i)); 

            for(String ans : answers.get(i)){
                System.out.println(ans); 
            }
            System.out.println(" "); 
            System.out.println("Your answer please: "); 
            char a = scan.next().trim().charAt(0); 
            yourAnswers[i] = a;
            qN++; 
        }
    }
    /**
     * Compares the user's answers array to the correct answers array and 
     * uses a switch statement to print out the corresponding answers
     */

    public void score(){
        int correct = 0; 

        char[] correctAnswers = new char[4];
        correctAnswers[0] = 'c';
        correctAnswers[1] = 'd';
        correctAnswers[2] = 'a';
        correctAnswers[3] = 'c';

        

        for(int i = 0; i < 4; i++){
            if(yourAnswers[i] == correctAnswers[i]){
                correct = correct + 1;
            }
        }
        switch(correct){
            case 0:{
                    System.out.println("You scored " + correct +  " correct answers out of 4"); 
                    System.out.println("You failed. You have some studying to do!"); 
                    break; 
                }

            case 1:{
                    System.out.println("You scored " + correct +  " correct answers out of 4"); 
                    System.out.println(" Better luck next time.You have some studying to do!"); 
                    break; 
                }

            case 2:{
                    System.out.println("You scored " + correct +  " correct answers out of 4"); 
                    System.out.println("You did not earn a passing grade. You have some studying to do!"); 
                    break;
                }

            case 3: {
                    System.out.println("You scored " + correct +  " correct answers out of 4"); 
                    System.out.println("You got a C. Barely passing!"); 
                    break;
                }

            case 4:{
                    System.out.println("You scored " + correct +  " correct answers out of 4"); 
                    System.out.println("You got a perfect score!"); 
                    break; 
                    
                }
            default: {
                    break; 
                }
        }
    }
}

