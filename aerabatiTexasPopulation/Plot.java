
/**
 * Write a description of class Plot here.
 *
 * @author Nishna Aerabati
 * @version 
 */
public class Plot
{
    private SimpleCanvas canvas;
    private int width;
    private int height;
    private int plotW;
    private int plotH;
    private int plotX0;
    private int plotY0;

    /**
     * Constructor for objects of class Plot
     */
    public Plot(int w, int h)
    {
        width = w;
        height = h;
        plotW = (int)(width*0.8);
        plotH = (int)(height*0.1);
        plotX0 = (int)(width*.1);
        plotY0 = (int)(height*.9);

        canvas = new SimpleCanvas("Texas Population 1st Digit Spread", width, height);
        drawGridLines();
    }

    /**
     * draws gridlines for 9 on x axis and 6 on the y axis
     *
     */
    public void drawGridLines()
    {
        canvas.drawLine(plotX0,plotY0,plotW,plotY0);
        canvas.drawLine(plotX0+10,plotY0,plotX0-15, plotY0); 
        canvas.drawLine(plotX0,plotH,plotX0,plotY0);
        canvas.drawLine(plotX0,plotY0,plotX0,plotY0+15);
        canvas.drawLine(plotX0+15,plotH,plotX0-15,plotH);
        for (int i =2;i<11;i++){
            canvas.drawLine(plotW*i/11,plotY0+15,plotW*i/11,plotY0-15);
            canvas.drawString(String.valueOf(i-1),plotW*i/11,plotY0+height/35);
        }
        
        for (int i =6;i>1;i--){
            canvas.drawLine(plotX0+15,plotY0*i/6,plotX0-15,plotY0*i/6);
        }
        for (int i = 6;i>0;i--){
            int d = (6-i)*10;
            d = d;

            String s = String.valueOf(d);

            canvas.drawString(s,plotX0-15,plotY0*i/6);
        }
    }
    /**
     * draws bars on the graph based on the percentage
     *@param the integer digit for the leading number and the percentage of the total 
     *each leading digit is 
     */
    public void drawGraph(int digit, int percentage ){
        int scaleFactor = plotH/6; 
           int x1 = digit * (plotW/9) + plotX0; 
           int x2 = x1 + 10;
           int y1 = plotY0;  
           int y2 = y1  + scaleFactor * percentage;
        for( int i=0; i < 9; i++){
            for( int s = 0; s < 20; s++){
               canvas.drawLine(x1,y2, x2, y2); 
            }
        }
        
    }
    
    
}

