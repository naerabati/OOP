import java.io.PrintWriter;
import java.util.HashMap;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.*;
import java.io.*;

/**
 * Write a description of class Vocabulary here.
 *
 * @author Nishna Aerabati 
 * @version 11/15/2021
 */
public class Vocabulary
{
    private HashMap<String, Integer> map; 
    private PrintWriter pWriter; 

    /**
     * Constructor for objects of class Vocabulary
     */
    public Vocabulary()
    {
        map = new HashMap <String, Integer>();
    }
    /**
     * main method which runs the read, print, and writeToFile methods
     */
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Vocabulary v = new Vocabulary(); 
        v.read();
        v.print();
        v.writeToFile();
        
    
        
    }
    /**
     * Adds ever single word after splitting the file into an array list, 
     * which removes all the words that are just spaces or tabs and 
     * then adding each word to the hashmap with its corresponding count
     */
    public void read()throws FileNotFoundException
    {
        ArrayList<String[]> allWords = new ArrayList<>(); 
        ArrayList<String> lineWords = new ArrayList<>();
        File file = new File("hamlet (1).txt"); 
        Scanner scan = new Scanner(file);
        int i = 0; 
        while(scan.hasNextLine()){

            String word = scan.nextLine(); 
            allWords.add(i, word.split("//s)); 
            i++; 
        }

        for(String[] word : allWords){
            for(String w: word){
                w = w.toLowerCase();
                w = w.replaceAll("[^a-z']", ""); 
                w = w.trim(); 

                lineWords.add(w); 

            }

        }        

        for(int v = 0; v < lineWords.size(); v++){
            String wor = lineWords.get(v); 
            int c = 1;
            for(int s = 0; s < lineWords.size(); s++){
                if(!(wor.equals(""))){
                  if(lineWords.get(s).equals(wor)){
                    map.put(wor, c++);  
                }   
                }
            }

        }

    }

    /**
     * @return an integer which is the amount of different words in the Hamlet file
     * or the size of the hashmap 
     */
    public int findDifferent(){
    int diffCount = map.size(); 
    return diffCount; 
    }
    /**
     * @return a string key which is the word that has the highest frequency
     * in the Hamley file
     */
    public String findMax(){
        String m = ""; 
        int max = 0; 
        for(String key : map.keySet()){
            
            int x = map.get(key); 

            if( x > max){
                max = x; 
                m = key; 
                
            }

        }
        return m; 
    }
    /**
     * @return a hashmap with each of the values and keys only for the common words
     * rather than every single word
     */
    public HashMap commonWords(){
        HashMap<String, Integer> common = new HashMap <String, Integer>(); 
        int theCount = map.get("the"); 
        int anCount = map.get("an"); 
        int aCount = map.get("a"); 
        common.put("the", theCount); 
        common.put("an", anCount); 
        common.put("a", aCount); 
        return common; 
    }
    /**
     * prints out in a loop very word and its corrresponding value 
     * and then print out the common words hashmap and the amount 
     * of different words and the word that appears the most 
     */
    public void print(){
       
        for(String key : map.keySet()){
            String k = key; 
            int value = map.get(k); 

            System.out.printf("%s appears %d times.\n", key, value); 

        }

        System.out.println("There are " + findDifferent() + " different words.");

        System.out.println("Word " + "'" + findMax()  +"'" + " is the most used: " +  "wordCount.get(findMax())" + " times"); 
       

        HashMap<String, Integer> c = commonWords(); 

        System.out.println("'an' was used: " + c.get("an") + " times");
        System.out.println("'a' was used: " + c.get("a") + " times");
        System.out.println("'The' was used: " + c.get("the")+  " times");

    }
    /**
     * writes everything in the print method also into to a new text file 
     */
    public void writeToFile() throws IOException{
        FileWriter fWriter = new FileWriter(new File("output.txt"));
        PrintWriter pWriter = new PrintWriter(fWriter);
        pWriter.print(map);  
        pWriter.print("There are " + map.size() + " different words.");
        pWriter.print("The most common word is " + map.get(findMax()));
        pWriter.print("'an' was used: " + map.get("an") + " times");
        pWriter.print("'a' was used: " + map.get("an") + " times");
        pWriter.print("'The' was used: " + map.get("an") + " times");
        System.out.println("Your summary is written to a file"); 
        pWriter.close(); 
    }

}
