import java.lang.String; 
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import java.util.List;
import java.util.*;
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
     */
    public FlagDrawer()
    {
       
    
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
    
    public void drawLUX(int width) 
    {  
    int height = width * 3 / 5; 
     SimpleCanvas c = new SimpleCanvas("Luxembourg flag", width, height); 
     // This draws the top stripe as a bunch of horizontal lines  
     c.setForegroundColour(java.awt.Color.red); 
    for (int i = 0; i < height/3; i++) { 
         c.drawLine(0, i, width, i);  
        } 
     // This draws the bottom stripe the same way   
     c.setForegroundColour(java.awt.Color.cyan);  
    for (int i = height * 2 / 3; i < height; i++) {   
         c.drawLine(0, i, width, i);  }
    }
    
    public void drawLY(int width) 
    {  
    int height = width / 2; 
    SimpleCanvas c = new SimpleCanvas("Luxembourg flag", width, height); 
     c.setForegroundColour(java.awt.Color.green); 
    for (int i = 0; i < height; i++) { 
         c.drawLine(0, i, width, i);  
        } 
     
    }
    
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
    }
    
 
    public void drawFR(int width) 
    {  
    int height = width * 2 / 3; 
     SimpleCanvas c = new SimpleCanvas("France flag", width, height); 
    
     c.setForegroundColour(java.awt.Color.blue.darker()); 
    for (int i = 0; i < width/3; i++) { 
         c.drawLine(i, 0, i, height);  
        } 
    
     c.setForegroundColour(java.awt.Color.red);  
    for (int i = width * 2 / 3; i < width; i++) {   
         c.drawLine(i, 0, i, height);  
        }
    }
    
    public void drawTH(int width) 
    {  
    int height = width * 3 / 5; 
     SimpleCanvas c = new SimpleCanvas("Luxembourg flag", width, height); 
    
     c.setForegroundColour(java.awt.Color.red.darker()); 
    for (int i = 0; i < height/6; i++) { 
         c.drawLine(0, i, width, i);  
        } 
      
     c.setForegroundColour(java.awt.Color.blue.darker());  
    for (int i = height * 1 / 3; i < height * 2/3; i++) {   
         c.drawLine(0, i, width, i);  }
         
    c.setForegroundColour(java.awt.Color.red.darker());  
    for (int i = height * 5/ 6; i < height; i++) {   
         c.drawLine(0, i, width, i);  }
    }
    
    public void drawFI(int width) 
    {  
    int height = width * 11 / 18; 
     SimpleCanvas c = new SimpleCanvas("Finland flag", width, height); 
    
     c.setForegroundColour(java.awt.Color.blue.darker()); 
    for (int i = width * 2/7; i < width * 3/7; i++) { 
         c.drawLine(i, 0, i, height);  
        } 
      
    int k = width * 1/7; 
        c.setForegroundColour(java.awt.Color.blue.darker());  
    for (int i = height * 1 / 3; i < i + k; i++) {   
         c.drawLine(0, i, width, height * 10/21);  }
         

    }
    
     public void drawUAE(int width) 
    {  
    int height = width * 1 / 2; 
     SimpleCanvas c = new SimpleCanvas("United Arab Emirates flag", width, height); 
    
     c.setForegroundColour(java.awt.Color.red.darker()); 
    for (int i = 0; i < width/4; i++) { 
         c.drawLine(i, 0, i, height);  
        } 
      
     c.setForegroundColour(java.awt.Color.green.darker());  
    for (int i = 0; i < height * 1/3; i++) {   
         c.drawLine(width * 1/4, i, width, i);  }
         
         c.setForegroundColour(java.awt.Color.black);  
    for (int i = height * 2/3; i < height; i++) {   
         c.drawLine(width * 1/4, i, width, i);  }
         
    }
    
     public void drawCB(int width) 
    {  
    int height = width * 2 / 3; 
     SimpleCanvas c = new SimpleCanvas("United Arab Emirates flag", width, height); 
    
     
     c.setForegroundColour(java.awt.Color.green.darker()); 
    for (int i = 0; i < width * 2/3; i++) { 
         c.drawLine(i, 0, 0, height);  
        } 
      
     c.setForegroundColour(java.awt.Color.yellow.darker()); 
         
         c.setForegroundColour(java.awt.Color.red.darker());  
    for (int i = width * 1/3; i < width; i++) {   
         c.drawLine(i, height, width, 0);  }
      

    c.setForegroundColour(java.awt.Color.red.darker());  
    for (int i = width * 1/3; i < width; i++) {   
         c.drawLine(i, height, width, 0);  }
    }
    
    public void drawSY(int width) 
    {  
    int height = width * 1/2; 
     SimpleCanvas c = new SimpleCanvas("Seychelles", width, height); 
    
     
     c.setForegroundColour(java.awt.Color.blue.darker()); 
    for (int i = 0; i < width * 1/3; i++) { 
         c.drawLine(i, 0, 0, height);  
        } 
      
         c.setForegroundColour(java.awt.Color.yellow);  
    for (int i = width * 1/3; i < width * 2/3; i++) {   
         c.drawLine(i, 0, 0, height);  }
         
          c.setForegroundColour(java.awt.Color.red.darker());  
    for (int i = width * 2/3; i < width; i++) {   
         c.drawLine(0, height, i, 0);  }
          
         c.setForegroundColour(java.awt.Color.red.darker());  
    for (int i = 0; i < height * 1/3; i++) {   
         c.drawLine(0, height, width, i);  }
      

    c.setForegroundColour(java.awt.Color.green.darker());  
    for (int i = height * 2/3; i < height; i++) {   
         c.drawLine(0, height, width, i);  }
    
    }
    
    public void drawGD(int width) 
    {  
    int height = width * 1/2; 
     SimpleCanvas c = new SimpleCanvas("United Arab Emirates flag", width, height); 
     
     
         
          c.setForegroundColour(java.awt.Color.red);  
    for (int i = height * 1/2; i < height; i++) {   
         c.drawLine(0, i, width, i);  }
    
    c.setForegroundColour(java.awt.Color.white);
    c.drawCircle(width/10, 0, width/2); 
    
    
    }
}

