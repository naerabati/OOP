import java.lang.String; 
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import java.util.List;
import java.util.*;
import java.util.Scanner; 
/**
 * Write a description of class FlagDrawer here.
 *
 * @author NIshna Aerabati 
 * @version 9/27/2021
 */
public class FlagDrawer
{

    /**
     * Constructor for objects of class FlagDrawer
     * runs the prompting function userProgram 
     */
    private Scanner scan; 
    private String country; 
    public FlagDrawer()
    {
        country = new String(" "); 
        userProgram(); 

    }

    /**
     * Draws the Luxembourg flag using the simple canvas class
     *
     * @param the user enters an integer width that they want for the flag draiwng
     * @return  the canvas drawing with the size specified of the user for the Luxembourg flag
     */

    public void drawLUX(int width) 
    {  

        int height = width * 3 / 5; 
        SimpleCanvas c = new SimpleCanvas("Luxembourg flag", width, height); 

        c.setForegroundColour(java.awt.Color.red); 
        for (int i = 0; i < height/3; i++) { 
            c.drawLine(0, i, width, i);  
        } 

        c.setForegroundColour(java.awt.Color.cyan);  
        for (int i = height * 2 / 3; i < height; i++) {   
            c.drawLine(0, i, width, i);  }
        c.setForegroundColour(java.awt.Color.black); 
        c.drawString("Luxembourg Flag", width/2, height/2); 
    }
    /**
     * Draws the Libya flag using the simple canvas class
     *
     * @param the user enters an integer width that they want for the flag drawing
     * @return  the canvas with the size specified of the user for the Libya flag
     */
    public void drawLY(int width) 
    {  
        int height = width / 2; 
        SimpleCanvas c = new SimpleCanvas("Libya flag", width, height); 
        c.setForegroundColour(java.awt.Color.green); 
        for (int i = 0; i < height; i++) { 
            c.drawLine(0, i, width, i);  
        } 
        c.setForegroundColour(java.awt.Color.black); 
        c.drawString("Libya Flag", width/2, height/2); 
    }
     /**
     * Draws the Ukraine flag using the simple canvas class
     *
     * @param the user enters an integer width that they want for the flag drawing
     * @return  the canvas drawing with the size specified of the user for the Ukraine flag
     */
    public void drawUKR(int width) 
    {  
        int height = width * 2 / 3; 
        SimpleCanvas c = new SimpleCanvas("Ukraine flag", width, height); 

        c.setForegroundColour(java.awt.Color.blue); 
        for (int i = 0; i < height/2; i++) { 
            c.drawLine(0, i, width, i);  
        } 

        c.setForegroundColour(java.awt.Color.yellow);  
        for (int i = height * 1/ 2; i < height; i++) {   
            c.drawLine(0, i, width, i);  }

        c.setForegroundColour(java.awt.Color.black); 
        c.drawString("Ukraine Flag", width/2, height/2); 
    }
    /**
     * Draws the France flag using the simple canvas class
     *
     * @param the user enters an integer width that they want for the flag draiwng
     * @return  the canvas drawing with the size specified of the user for the France flag
     */
    public void drawFR(int width) 
    {  
        int height = width * 2 / 3; 
        SimpleCanvas c = new SimpleCanvas("France flag", width, height); 

        c.setForegroundColour(java.awt.Color.blue.darker().darker()); 
        for (int i = 0; i < width/3; i++) { 
            c.drawLine(i, 0, i, height);  
        } 

        c.setForegroundColour(java.awt.Color.red);  
        for (int i = width * 2 / 3; i < width; i++) {   
            c.drawLine(i, 0, i, height);  
        }

        c.setForegroundColour(java.awt.Color.black); 
        c.drawString("France Flag", width/2, height/2); 
    }
     /**
     * Draws the Thailand flag using the simple canvas class
     *
     * @param the user enters an integer width that they want for the flag draiwng
     * @return  the canvas drawing with the size specified of the user for the Thailand flag
     */
    public void drawTH(int width) 
    {  
        int height = width * 3 / 5; 
        SimpleCanvas c = new SimpleCanvas("Thailand", width, height); 

        c.setForegroundColour(java.awt.Color.red); 
        for (int i = 0; i < height/6; i++) { 
            c.drawLine(0, i, width, i);  
        } 

        c.setForegroundColour(java.awt.Color.blue.darker().darker());  
        for (int i = height * 1 / 3; i < height * 2/3; i++) {   
            c.drawLine(0, i, width, i);  }

        c.setForegroundColour(java.awt.Color.red);  
        for (int i = height * 5/ 6; i < height; i++) {   
            c.drawLine(0, i, width, i);  }

        c.setForegroundColour(java.awt.Color.black); 
        c.drawString("Thailand Flag", width/2, height/2); 
    }
     /**
     * Draws the Finland flag using the simple canvas class
     *
     * @param the user enters an integer width that they want for the flag draiwng
     * @return  the canvas drawing with the size specified of the user for the Finland flag
     */
    public void drawFI(int width) 
    {  
        int height = width * 11 / 18; 
        SimpleCanvas c = new SimpleCanvas("Finland flag", width, height); 
        int k = width * 1/7;
        k = k + (height * 1/3);
        c.setForegroundColour(java.awt.Color.blue.darker().darker()); 
        for (int i = width * 2/7; i < width * 3/7; i++) { 
            c.drawLine(i, 0, i, height);  
        } 

        c.setForegroundColour(java.awt.Color.blue.darker().darker());  
        for (int i = height * 1/3; i < k; i++) {   
            c.drawLine(0, i, width, i);  }
        c.setForegroundColour(java.awt.Color.black); 
        c.drawString("Finland Flag", width/2, height/2); 
    }
    
    /**
     * Draws the United Arab Emirates flag using the simple canvas class
     *
     * @param the user enters an integer width that they want for the flag draiwng
     * @return  the canvas drawing with the size specified of the user for the United Arab Emirates flag
     */
    public void drawUAE(int width) 
    {  
        int height = width * 1 / 2; 
        SimpleCanvas c = new SimpleCanvas("United Arab Emirates flag", width, height); 

        c.setForegroundColour(java.awt.Color.red.darker()); 
        for (int i = 0; i < width/4; i++) { 
            c.drawLine(i, 0, i, height);  
        } 

        c.setForegroundColour(java.awt.Color.green.darker().darker());  
        for (int i = 0; i < height * 1/3; i++) {   
            c.drawLine(width * 1/4, i, width, i);  }

        c.setForegroundColour(java.awt.Color.black);  
        for (int i = height * 2/3; i < height; i++) {   
            c.drawLine(width * 1/4, i, width, i);  }
        c.setForegroundColour(java.awt.Color.black); 
        c.drawString("United Arab Eimrates Flag", width/2, height/2); 
    }

     /**
     * Draws the Congo-BrazzaVille flag using the simple canvas class
     *
     * @param the user enters an integer width that they want for the flag draiwng
     * @return  the canvas drawing with the size specified of the user for the Congo-BrazzaVille flag
     */
    public void drawCB(int width) 
    {  
        int height = width * 2 / 3; 
        SimpleCanvas c = new SimpleCanvas("Congo-BrazzaVille", width, height); 

        c.setForegroundColour(java.awt.Color.yellow); 
        for (int i = 0; i < height; i++) { 
            c.drawLine(0, i, width, i);  
        } 

        c.setForegroundColour(java.awt.Color.green.darker()); 
        for (int i = 0; i < width * 2/3; i++) { 
            c.drawLine(i, 0, 0, height);  
        }c.setForegroundColour(java.awt.Color.yellow.darker()); 

        c.setForegroundColour(java.awt.Color.red);  
        for (int i = width * 1/3; i < width; i++) {   
            c.drawLine(i, height, width, 0);  }

        c.setForegroundColour(java.awt.Color.red);  
        for (int i = width * 1/3; i < width; i++) {   
            c.drawLine(i, height, width, 0);  }

        c.setForegroundColour(java.awt.Color.black); 
        c.drawString("Congo-BrazzaVille", width/2, height/2); 
    }

     /**
     * Draws the Seychelles flag using the simple canvas class
     *
     * @param the user enters an integer width that they want for the flag draiwng
     * @return  the canvas drawing with the size specified of the user for the Seychelles flag
     */
    public void drawSY(int width) 
    {  
        int height = width * 1/2; 
        SimpleCanvas c = new SimpleCanvas("Seychelles", width, height); 

        c.setForegroundColour(java.awt.Color.blue.darker().darker()); 
        for (int i = 0; i < width * 1/3; i++) { 
            c.drawLine(i, 0, 0, height);  
        } 

        c.setForegroundColour(java.awt.Color.yellow);  
        for (int i = width * 1/3; i < width * 2/3; i++) {   
            c.drawLine(i, 0, 0, height);  }

        c.setForegroundColour(java.awt.Color.red);  
        for (int i = width * 2/3; i < width; i++) {   
            c.drawLine(0, height, i, 0);  }

        c.setForegroundColour(java.awt.Color.red);  
        for (int i = 0; i < height * 1/3; i++) {   
            c.drawLine(0, height, width, i);  }

        c.setForegroundColour(java.awt.Color.green.darker().darker());  
        for (int i = height * 2/3; i < height; i++) {   
            c.drawLine(0, height, width, i);  }

        c.setForegroundColour(java.awt.Color.black); 
        c.drawString("Seychelles Flag", width/2, height/2); 
    }

     /**
     * Draws the Greenland flag using the simple canvas class
     *
     * @param the user enters an integer width that they want for the flag drawing
     * @return  the canvas drawing with the size specified of the user for the Greenland flag
     */
    public void drawGD(int width) 
    {  
        int height = width * 1/2; 
        SimpleCanvas c = new SimpleCanvas("Greenland", width, height); 

        c.setForegroundColour(java.awt.Color.red);  
        for (int i = height * 1/2; i < height; i++) {   
            c.drawLine(0, i, width, i);  }

        c.setForegroundColour(java.awt.Color.white);
        int x = width/10 ; 
        int y =(height/2) - (width/4); 
        int w = width/2; 
        int h = width/2; 
        int start = 180; 
        int end = 180; 
        c.drawArc(x,y,w,h,start,end); 

        c.setForegroundColour(java.awt.Color.red);
        x = width * 1/10 ; 
        y =(height/2) - (width/4); 
        w = width/2; 
        h = width/2; 
        start = 180; 
        end = -180; 
        c.drawArc(x,y,w,h,start,end); 

        c.setForegroundColour(java.awt.Color.black); 
        c.drawString("Greenland Flag", width/2, height/2); 
    }

    /**
     * Draws the Switzerland flag using the simple canvas class
     *
     * @param the user enters an integer width that they want for the flag draiwng
     * @return  the canvas drawing with the size specified of the user for the Switzerland flag
     */

    public void drawSW(int width){
        int height = width; 
        SimpleCanvas f = new SimpleCanvas("Switzerland flag", width, height); 
        f.setForegroundColour(java.awt.Color.red); 
        for (int i = 0; i < height; i++) { 
            f.drawLine(0, i, width, i);  
        } 

        f.setForegroundColour(java.awt.Color.white); 
        for (int i = width * 1/5; i < width * 4/5; i++) { 
            f.drawLine(i, height *2/5, i, height* 3/5);  
        } 

        f.setForegroundColour(java.awt.Color.white);  
        for (int i = height * 1/5; i < height * 4/5 ; i++) {   
            f.drawLine(width * 2/5, i, width * 3/5 , i);  }

        f.setForegroundColour(java.awt.Color.black); 
        f.drawString("Switzerland Flag", width/2, height/2); 
    }
    
     /**
     * Draws the Gambia flag using the simple canvas class
     *
     * @param the user enters an integer width that they want for the flag draiwng
     * @return  the canvas drawing with the size specified of the user for the Gambia flag
     */
    public void drawGA(int width) 
    {  
        int height = width * 2/3; 
        SimpleCanvas c = new SimpleCanvas("Gambia Flag", width, height); 

        c.setForegroundColour(java.awt.Color.red); 
        for (int i = 0; i < height * 1/3; i++) { 
            c.drawLine(0, i, width, i);  
        } 

        c.setForegroundColour(java.awt.Color.blue.darker().darker());  
        for (int i = height * 7/ 18; i < height * 11/18; i++) {   
            c.drawLine(0, i, width, i);  }

        c.setForegroundColour(java.awt.Color.green.darker().darker());  
        for (int i = height * 2/ 3; i < height; i++) {   
            c.drawLine(0, i, width, i);  }

        c.setForegroundColour(java.awt.Color.black); 
        c.drawString("Gambia Flag", width/2, height/2); 
    }
   
    /**
     * Prompts the user to enter what country flag they want to see with
     * a scanner and prompts for an integer for teh flag width and then 
     * runs the corresponding flag drawing program 
     * 
     */
    public void userProgram(){
        boolean running = true;
        int w = 0; 
        while(running){
            scan = new Scanner(System.in); 
            System.out.println("Please input a country flag you would like to see, You can pick LUX, LY, UKR, FI, SW, GA, FR, UAE, CB, SY, GD, TH"); 
            country = scan.nextLine();
            country = country.toUpperCase();

            switch(country){
                case "LY" :
                    System.out.println("Please input an integer for the flag width"); 
                    w = scan.nextInt(); 
                    drawLY(w);
                    break;
                case "FR" :
                    System.out.println("Please input an integer for the flag width"); 
                    w = scan.nextInt(); 
                    drawFR(w);
                    break; 
                case "GA" :
                    System.out.println("Please input an integer for the flag width"); 
                    w = scan.nextInt(); 
                    drawGA(w);
                    break; 
                case "SW" :
                    System.out.println("Please input an integer for the flag width"); 
                    w = scan.nextInt(); 
                    drawSW(w);
                    break; 
                case "LUX" :
                    System.out.println("Please input an integer for the flag width"); 
                    w = scan.nextInt(); 
                    drawLUX(w);
                    break; 
                case "UKR" :
                    System.out.println("Please input an integer for the flag width"); 
                    w = scan.nextInt(); 
                    drawUKR(w);
                    break; 
                case "FI" :
                    System.out.println("Please input an integer for the flag width"); 
                    w = scan.nextInt(); 
                    drawFI(w);
                    break; 
                case "UAE" :
                    System.out.println("Please input an integer for the flag width"); 
                    w = scan.nextInt(); 
                    drawUAE(w);
                    break;
                case "CB" :
                    System.out.println("Please input an integer for the flag width"); 
                    w = scan.nextInt(); 
                    drawCB(w);
                    break; 
                case "SY" :
                    System.out.println("Please input an integer for the flag width"); 
                    w = scan.nextInt(); 
                    drawSY(w);
                    break; 
                case "GD" :
                    System.out.println("Please input an integer for the flag width"); 
                    w = scan.nextInt(); 
                    drawGD(w);
                    break; 
                case "TH" :
                    System.out.println("Please input an integer for the flag width"); 
                    w = scan.nextInt(); 
                    drawTH(w);  
                    break; 
                case "QUIT" :
                    System.out.print("Goodbye, you have ended the program.");  
                    running = false; 
            }
        }

    }
}

