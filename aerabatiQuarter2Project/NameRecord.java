import java.util.Scanner;
import java.util.ArrayList;
 

/**
 * Write a description of class NameRecord here.
 *
 * @author Nishna Aerabati 
 * @version 11/29
 */
public class NameRecord
{
    
   
    private String name; 
    private ArrayList<Integer> rank; 
    /**
     * Constructor for objects of class NameRecord
     */
    public NameRecord(String n)
    { 
        rank = new ArrayList<>(); 
        String[] l = n.split(" "); 
        name = l[0]; 
        for(int i=1; i < l.length; i++){
            String s = l[i]; 
            int r = Integer.parseInt(l[i]); 
            rank.add(r); 
         }
        }
           
        
    

    /**
     * Main method creates a new instance of NameRecords
     */
    public static void main(String args[])
    {
        NameRecord n = new NameRecord(""); 
    }
    
    /**
     * returns names
     */
    public String getName(){
       return name;  
    }
    /**
     * sets the name to an empty string 
     */
    public void setName(){
        name = ""; 
    }
    /**
     * returns rank 
     */
    public ArrayList<Integer> getRank(){
        return rank; 
    }
    /**
     * Sets the ranks to null
     */
    public void setRank(){
        for( int i = 0; i < rank.size(); i++){
             rank.add(i, null);  
        }
    }
}
