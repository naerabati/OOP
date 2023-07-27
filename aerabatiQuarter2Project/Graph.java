import java.util.ArrayList;
import java.awt.*;
import java.io.*;
/**
 * Write a description of class Plot here.
 *
 * @author Nishna Aerabati 
 * @version 12/1
 */

public class Graph 
{
    
    private SimpleCanvas canvas; 
    private int width;
    private int height;
    private int plotW;
    private int plotH;
    private int plotX0;
    private int plotY0;
    private int plotD;
    private ArrayList<Integer> ypoints = new ArrayList<>();
    private ArrayList<Integer> xpoints = new ArrayList<>();
    /**
     * Constructor for objects of class Plot
     * @param int w is the width and int h is the height of the grpah 
     */
    public Graph(int w, int h)
    {
      
        
        width = w;
        height = h;
        plotW = (int)(width*0.8);
        plotH = (int)(height*0.1);
        plotX0 = (int)(width*.1);
        plotY0 = (int)(height*.9);
        plotD = width-plotX0;
        
        canvas = new SimpleCanvas("Name Through The Decades", width, height);
        drawGridLines();
        
    }
    /**
     * draws the axis and marks 
     */
    public void drawGridLines(){
        canvas.drawLine(0,plotY0,width,plotY0);
        canvas.drawLine(0,plotH,width,plotH);
        
        
        for (int i =0;i<12;i++){
            canvas.drawLine(plotW*i/10,plotY0,plotW*i/10,plotH);
            String year = "";
            if (i<10){
                year = "19"+String.valueOf(i)+"0";
            }
            else if (i==10){
                year = "20"+String.valueOf(i-10)+"0";
            }
            canvas.drawString(year,plotW*(i+1)/10,plotY0+height/35);
        }
        for (int i = 11;i>=1;i--){
            int dash = (i-1)*100;
            dash = dash;

            String l = String.valueOf(dash);

            canvas.drawString(l,plotX0-30,plotY0*i/11);

        }
    }
    /**
     * draws the graph based on which number location and percentage
     * @param takes in the number for location and the percentage for height
     */
    public void points(String n, ArrayList<Integer> rank ){
        String text = "Here is the name " +  n  + " through the decades"; 
        
        canvas.drawString(text, width/2, 10); 
        
        String year = "1900";
        int count = 0;
        for(Integer v: rank)  {      
            int i = 0;
                if (year.substring(0,2).equals("19")){
                    i = Integer.valueOf(year.substring(2,3));
                }
                else{
                    i = Integer.valueOf(year.substring(2,3))+10;
                }
                if (rank.get(count) ==0 ){
                    canvas.drawString("NR", plotW*(i+1)/10,plotH-10);
                }else{
                    canvas.drawCircle(plotW*(i+1)/10,plotH+rank.get(count)*4/10,3);
                    xpoints.add(plotW*(i+1)/10);
                    ypoints.add(plotH+rank.get(count)*4/10);
                }
            int x = Integer.valueOf(year)+10;
            year = String.valueOf(x);
            count++;
            }
        drawConnectingLines();
    }
    /**
     * draws lines for the grpah based on the x points and y points connect the points 
     */
    public void drawConnectingLines(){
        for (int i = 1;i<xpoints.size();i++){

            canvas.drawLine(xpoints.get(i-1),ypoints.get(i-1),xpoints.get(i),ypoints.get(i));
        }
    }
    
   
        
    
    
}