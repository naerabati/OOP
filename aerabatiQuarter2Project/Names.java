import java.util.*;
import java.util.HashMap;
import java.io.FileNotFoundException;
import java.io.File;

/**
 * Write a description of class Names here. vidy was here
 *
 * @author Nishn Aerabati 
 * @version 11/22
 */
public class Names
{
    private Scanner scan; 
    private HashMap<String, ArrayList<Integer>> nameRanks; 
    /**
     * Constructor for objects of class Names
     */
    public Names() throws FileNotFoundException
    {
    nameRanks = new HashMap<String, ArrayList<Integer>>(); 
    File text = new File("name.txt"); 
    scan = new Scanner(text); 
    String line = "";     
    while( scan.hasNextLine() ){
        line = scan.nextLine(); 
        NameRecord obj = new NameRecord(line); 
        nameRanks.put(obj.getName(), obj.getRank()); 
    }
    }

    /**
     * Finds the popular names in the hashmap
     * @return returns an arrayList with all the names 
     */
    public ArrayList<String> lessPopularNames(){
        ArrayList<String> names = new ArrayList<>(); 
        for(String name : nameRanks.keySet()){
            int r = 0; 
            int v = 0;
            for( int rank : nameRanks.get(name)){
                if( rank > r){
                    r = rank;
                    v++; 
                        
                }
            }
            if( v == 11){
                names.add(name); 
            }
            }
         Collections.sort(names); 
            return names; 
        
        }
        
    public ArrayList<String> popularNames(){   
      ArrayList<String> names = new ArrayList<String>();
        for (String n: nameRanks.keySet()){
            ArrayList<Integer> rank = nameRanks.get(n);
            int length = rank.size() - 1; 
            for(int i = 0;i < length ;i++){
                if (rank.get(i)<= rank.get(i+1)){
                    break;
                }
                if (i == rank.size()-2){
                    names.add(n);
                }
            }
            
        }
        Collections.sort(names);
        return  names;
    }
    
    /**
     * finds the ranks for a name for all decade
     * @param string name with Capital first letter
     * @return returns an arrayList with all the names 
     */
    public ArrayList<Integer> nameRankForDecade(String name){
        ArrayList<Integer> list = nameRanks.get(name);
        Collections.sort(list); 
        return list; 
        
    }
    /**
     * finds all the names in one decade 
     * @return returns an arrayList with all the names 
     */
    public ArrayList<String> namesInOneDecade(){
        ArrayList<String> names = new ArrayList<>(); 
        for( String name : nameRanks.keySet()){
            int x = 0; 
            for(int rank : nameRanks.get(name)){
                if(rank == 0){
                    x++; 
                }
            }
            if(x == 10){
             names.add(name); 
            }
        }
        Collections.sort(names); 
        return names; 
    }
    /**
     * finds all the names that appear in every decade
     * @return returns an arrayList with all the names 
     */
    public ArrayList<String> namesInAllDecades(){
        ArrayList<String> names = new ArrayList<>(); 
        for( String name : nameRanks.keySet()){
            int x = 0; 
            for(int rank : nameRanks.get(name)){
                if(rank == 0){
                    x++; 
                }
            }
            if(x == 0){
                names.add(name); 
            }
        }
        Collections.sort(names); 
        return names; 
    }
    /**
     * finds the rank for a name and year 
     * @param String name, String year 
     */
    public int nameInCertainDecade(String name, String year){
        int w = Integer.parseInt(year); 
        String y = Integer.toString(w);
        System.out.println(y + "year"); 
        String[] y2 = y.split(""); 
        int[] ints = new int[4]; 
        int rank = 0;  
    for (int i = 0; i < y.length(); i++){
    {
        
        // fix this ints[i] = Integer.parseInt(y.valueOf(i));
        System.out.println(ints[i]); 
    }
    }
    
    if(ints[2] == 0){
        System.out.print(ints[2]); 
        ArrayList<Integer> ranks = nameRanks.get(name);
        
        System.out.println(ranks); 
        rank = ranks.get(0); 
        System.out.print(rank); 
    }else if(ints[2] == 1){
        ArrayList<Integer> ranks = nameRanks.get(name);
        rank = ranks.get(1);
        
    }else if(ints[2] == 2){
        ArrayList<Integer> ranks = nameRanks.get(name);
        rank = ranks.get(2);
        
    }else if(ints[2] == 3){
        ArrayList<Integer> ranks = nameRanks.get(name);
        rank = ranks.get(0);
        System.out.print(ranks.get(3)); 
    }else if(ints[2] == 4){
        ArrayList<Integer> ranks = nameRanks.get(name);
        rank = ranks.get(4); 
        System.out.print(ranks.get(4)); 
    }else if(ints[2] == 5){
        ArrayList<Integer> ranks = nameRanks.get(name);
        rank = ranks.get(5); 
        System.out.print(ranks.get(5)); 
    }else if(ints[2] == 6){
        ArrayList<Integer> ranks = nameRanks.get(name);
        rank = ranks.get(6); 
        System.out.print(ranks.get(6)); 
    }else if(ints[2] == 7){
        ArrayList<Integer> ranks = nameRanks.get(name);
        rank = ranks.get(7); 
        System.out.print(ranks.get(7)); 
    }else if(ints[2] == 8){
        ArrayList<Integer> ranks = nameRanks.get(name);
        rank = ranks.get(8); 
        System.out.print(ranks.get(8)); 
    }else if(ints[2] == 9){
        ArrayList<Integer> ranks = nameRanks.get(name);
        rank = ranks.get(9); 
        System.out.print(ranks.get(9)); 
    }else if(ints[0] == 2){
        ArrayList<Integer> ranks = nameRanks.get(name);
        rank = ranks.get(10); 
        System.out.print(ranks.get(10)); 
    }
    
    return rank; 
    }
    /**
     * creates a new graph and plots th graph based on the parameter string 
     * @param String name
     */
    public void graphForName(String name){
        Graph g = new Graph(500,500); 
        g.points(name, nameRanks.get(name)); 
        g.drawConnectingLines(); 
    }
}
