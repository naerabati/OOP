
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.LinkedHashMap;

/**
 *This class will analyze fictious contact tracing data for a fictious zombie disease.
 *
 * @author (Tatyana Pronitcheva)
 * @version (12/10/22)
 */
// the following is the class called Zombie
public class Zombie
{
    private Scanner scan;
    private HashMap <String, ArrayList <String> > contactTracing = new LinkedHashMap<String, ArrayList<String>>();
    private ArrayList<String> peopleContacted;
    private ArrayList<String> totalPeople;
    //the following is the main method
    public static void main(String args[])
    {
        new Zombie();
    }
    //the following analyzes/reads the file
    public void analyzeFile() throws FileNotFoundException
    {
        File files = new File("Dataset1.txt"); 
        scan = new Scanner(files);
        String[] totalPeopleArray;
        String line = "";
        String infectedPerson = "";
        //the following will scan for the next line
        while(scan.hasNextLine())
        {
            //the following will initializes an array 
            ArrayList<String> totalPeople = new ArrayList<String>();
            line = scan.nextLine();
            totalPeopleArray = line.split(",");
            for (String i: totalPeopleArray){
                //the following will create an array list from an array
                totalPeople.add(i);
            }
            //the following will add the information to the hashmap
            infectedPerson = totalPeople.get(0);
            totalPeople.remove(0);
            peopleContacted = totalPeople;
            contactTracing.put(infectedPerson, peopleContacted);
        }
    }
    //the following corresponds to the first part
    //the following method lists everybody that each sick person had contact with using nice formatting.
    //two parts to the printing of this part, first is the name of the person, in between are the words "had contact with"
    //what follows is a formatted list of the people contacted by the first person
    //commas appear after all items EXCEPT the last and second last items
    //the word "and" appears between the last and second last items
    public void contactRecords() throws FileNotFoundException
    {
        analyzeFile();
        System.out.println("Contact Records:");
        for (String i : contactTracing.keySet())
    {
            ArrayList<String> contactedList = contactTracing.get(i);
            String contacted = "";
            for (String k: contactedList)
            {
                int initialElements = contactedList.size();
                if (initialElements > 1)
                {
                    //the following will ensure that the grammar is correct at the end
                    if (contactedList.indexOf(k) == contactedList.size() - 1)
                    {
                        contacted = contacted + "and " + k; 
                    }
                    else if (contactedList.indexOf(k) == contactedList.size() - 2)
                    {
                        contacted = contacted + k + " ";
                    }
                    else{
                        contacted = contacted + k + ", ";   
                    }
                }
                //following is if its one word long
                else if (initialElements == 1){
                    contacted = contacted + k;
                }
            }
            System.out.println("\t" + i + " had contact with " + contacted);
        }
    }
    //the following corresponds to part two
    //identifies the possible patient zeros
    public void possiblePatientZero() throws FileNotFoundException
    {
        analyzeFile();//reads the file
        ArrayList<String> possiblePatientZero = new ArrayList<String>();
        ArrayList<String> contacted = new ArrayList<String>();
        String contactedPrint = "";
        int cnt = 0;
        int initialElements = contactTracing.size();
        for(ArrayList list : contactTracing.values()){
            contacted.addAll(list);
        }
        for(String key : contactTracing.keySet()){
            if(!contacted.contains(key)){
                possiblePatientZero.add(key);    
            }
        }
        for (String i : possiblePatientZero)
        {
            if (cnt < possiblePatientZero.size()-2)
            {
                contactedPrint = contactedPrint + i + ", ";
              
            }
            else if (cnt < possiblePatientZero.size()-1)
            {
                contactedPrint = contactedPrint + i + " ";
                
            }
            else if(cnt == possiblePatientZero.size()-1){
                contactedPrint = contactedPrint + "and " + i;
                
            }
            
            cnt += 1;
        }
        System.out.println("Patient Zero(s): " + contactedPrint);
        
    }
    
    private ArrayList<String> helperPossiblePatientZero() throws FileNotFoundException
    {
        analyzeFile();//reads the file
        ArrayList<String> possiblePatientZero = new ArrayList<String>();
        ArrayList<String> contacted = new ArrayList<String>();
        ArrayList<String> idk = new ArrayList<String>();
        String contactedPrint = "";
        int cnt = 0;
        int initialElements = contactTracing.size();
        for(ArrayList list : contactTracing.values()){
            contacted.addAll(list);
        }
        for(String key : contactTracing.keySet()){
            if(!contacted.contains(key)){
                possiblePatientZero.add(key);    
            }
        }
        for (String i : possiblePatientZero)
        {
            if (cnt < possiblePatientZero.size()-2)
            {
                contactedPrint = contactedPrint + i + ", ";
                idk.add(i); 
            }
            else if (cnt < possiblePatientZero.size()-1)
            {
                contactedPrint = contactedPrint + i + " ";
                idk.add(i); 
            }
            else if(cnt == possiblePatientZero.size()-1){
                contactedPrint = contactedPrint + "and " + i;
                idk.add(i); 
            }
            
            cnt += 1;
        }
        //System.out.println("Patient Zero(s): " + contactedPrint);
        return idk; 
    }
    //The following corresponds to part three
    //identifies the potential zombies
    public void potentialZombies() throws FileNotFoundException
    {
        analyzeFile();
        ArrayList<String> potentialZombies = new ArrayList<String>();
        ArrayList<String> contacts = new ArrayList<String>();
        ArrayList<String> infected = new ArrayList<String>();
        String potentialZombiesPrint = "";
        
        for(ArrayList<String> list: contactTracing.values())
        {
            for(int i =0; i < list.size(); i++){
            String s = list.get(i);
            if(infected.contains(s) == false){
                infected.add(s); 
            }
            }
            
            }
            
        for(String inf : infected){
            
            if(contactTracing.keySet().contains(inf) == false){
                potentialZombies.add(inf); 
            }
        }
        System.out.println("Potential Zombies: " + potentialZombies);
        }
    
    
    //the following corresponds to part four
    //identifies people that are neither patient zero(s) not potential zombies
    public void Neither() throws FileNotFoundException
    {
        analyzeFile();
        ArrayList<String> Neither = new ArrayList<String>();
        ArrayList<String> Both = new ArrayList<String>();
        
        for(String name : contactTracing.keySet()){
            if(helperPossiblePatientZero().contains(name) == false){
                Neither.add(name); 
            }
        }
        
        System.out.println("Neither Patient Zero or Potential Zombie: " + Neither);
    }
    //the following corresponds to part five
    //the following will define the most viral people as the people who likely infected the greatest number of other people in the data set
    public void mostViral() throws FileNotFoundException
    {
        analyzeFile();
        int max = 0; 
        ArrayList<String> mostViral= new ArrayList<String>();
        for(String name : contactTracing.keySet()){
            ArrayList<String> list = contactTracing.get(name); 
            if(list.size() > max){
                max = list.size(); 
            }
            
        }
        
        for(String name : contactTracing.keySet()){
            ArrayList<String> list = contactTracing.get(name); 
            if(list.size() == max){
                mostViral.add(name);  
            }
            
        }
       System.out.println("Most Viral People: " + mostViral); 
    }
    //the following corresponds to part six
    //the following will define the most contacted person as the member of the data set that has 
    public void mostContacted() throws FileNotFoundException
    {
        analyzeFile();
        ArrayList<String> mostContacted = new ArrayList<String>();
        ArrayList<String> everyName = new ArrayList<String>();
        ArrayList<String> contacts = new ArrayList<String>();
        int max = 0; 
        for(ArrayList<String> list: contactTracing.values())
        {
            for(int i =0; i < list.size(); i++){
            String s = list.get(i);
            if(everyName.contains(s) == false){
               everyName.add(s);  
            }
            }
            }
            
        for(String name: everyName){ 
            int count = 0; 
            for(ArrayList list: contactTracing.values()){
                if(list.contains(name) == true){
                    count = count + 1; 
                }
            }
            
            if(count > max){
                max = count; 
            }
            }
        
        for(String name: everyName){ 
            int count = 0; 
            for(ArrayList list: contactTracing.values()){
                if(list.contains(name) == true){
                    count = count + 1; 
                }
            }
            
            if(count == max){
                mostContacted.add(name); 
            }
            }
        System.out.println("Most Contacted: " + mostContacted);
    }
}