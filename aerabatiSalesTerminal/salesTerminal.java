import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JButton;





/**
 * Write a description of class salesTerminal here.
 *
 * @author Nishna Aerabati 
 * @version 12/3
 */
public class salesTerminal
{
   private JFrame frame;
   private JTextField tField;
   private JLabel totalLabel; 
   private JLabel amountPh;
   private JLabel amountC; 
   private JLabel amountP;
   private JLabel costP;
   private JLabel costPh;
   private JLabel costC;
   private JLabel totalP;
   private JLabel totalPh;
   private JLabel totalC;  

   private int iPrntCount;
   private int iPhnCount;
   private int iLptpCount;
   private double dPrntTotal;
   private double dPhnTotal;
   private double dLptpTotal;;
   private boolean lptp =false; 
   private boolean prnt =false; 
   private boolean phn = false; 
   private double totalCost = 0; 
    /**
     * Constructor for objects of class salesTerminal
     */
    public salesTerminal()
    {
     makeFrame(); 
    }
    
    /**
     * Sets up the frame and adds the buttons and basic layout 
     */
    public void makeFrame(){
        frame = new JFrame("My Sales Terminal");
        frame.setResizable(false);
        frame.setPreferredSize(new Dimension(450,600));
        frame.setLayout(new BorderLayout());
        //frame.pack();
        makeMenuBar(frame);
        
        JPanel topPanel = new JPanel(); 
        topPanel.setLayout(new BorderLayout());
        totalLabel = new JLabel("Your Invoice:");
        totalLabel.setHorizontalAlignment(SwingConstants.CENTER);
        totalLabel.setVerticalAlignment(SwingConstants.CENTER);
        topPanel.add(totalLabel, BorderLayout.NORTH); 
      
        tField = new JTextField();
        tField.setEditable(false);
        tField.setPreferredSize(new Dimension(300,30));
        //tField.setBounds(100,100,100,100);
        
        tField.setBackground(Color.GRAY);
        //tField.setFont(new Font("Serif"));  
        tField.setForeground(Color.WHITE); 
        tField.setHorizontalAlignment(JTextField.RIGHT);
        
        topPanel.add(tField,BorderLayout.SOUTH);
        
        frame.add (topPanel, BorderLayout.NORTH);
        JPanel panel = new JPanel(new GridLayout(3,2)); 
        JPanel panel2 = new JPanel(new GridLayout(3,1)); 
        JPanel panel3 = new JPanel(new GridLayout(3,1)); 
        panel3.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        //panel.setBorder(new EmptyBorder(12, 12, 12, 12)); 
          
        frame.add(panel, BorderLayout.WEST);
        frame.add(panel2,BorderLayout.CENTER); 
        frame.add(panel3,BorderLayout.EAST);
        frame.pack();
      
        JButton phone = new JButton(); 
        phone.setIcon(new ImageIcon("Phone.jpg"));
        JButton laptop = new JButton();
        laptop.setIcon( new ImageIcon("Laptop.jpg"));
        JButton print = new JButton(); 
        print.setIcon( new ImageIcon("Printer.jpg"));
        
        
        
        //SamountPh = "0"; 
        iPhnCount = 0;
        amountPh = new JLabel("0 at");
        //sCountLaptop = "0"; 
        iLptpCount = 0;
        amountC= new JLabel("0 at"); 
        //SamountPrnt = "0"; 
        iPrntCount = 0;
        amountP= new JLabel("0 at");
        costP= new JLabel("$125.49");
        costPh= new JLabel("$19.99");
        costC= new JLabel("$565.35");
        
        dPrntTotal = 0;
        //StotalPrnt = "0.00"; 
        totalP= new JLabel("is $0.00");
        //StotalPh = "0.00";
        dPhnTotal = 0;
        totalPh= new JLabel("is $0.00");
        //StotalC = "0.00";
        dLptpTotal = 0;
        totalC= new JLabel("is $0.00");
        
        panel.add(phone);
        panel.add(amountPh);
        panel.add(laptop);
        panel.add(amountC);
        panel.add(print); 
        panel.add(amountP);
        
        panel2.add(costPh);
        panel2.add(costC);
        panel2.add(costP);
        
        panel3.add(totalPh); 
        panel3.add(totalC); 
        panel3.add(totalP); 
        
        print.addActionListener(e -> addPrinter());
        phone.addActionListener(e -> addPhone());
        laptop.addActionListener(e -> addComputer());
        
        
        
        frame.setVisible(true);
    }
    /**
     * sets up the menu bar
     */
    private void makeMenuBar(JFrame frame)
    {
        
        JMenuBar menubar = new JMenuBar();
        frame.setJMenuBar(menubar);
        
        // create the File manu
        JMenu quitMenu = new JMenu("Quit");
        JMenu clearMenu = new JMenu("Clear"); 
        
        menubar.add(quitMenu);
        menubar.add(clearMenu); 
        
        JMenuItem quitItem = new JMenuItem("Quit");
        quitItem.addActionListener(e -> quit());
        quitMenu.add(quitItem);
        
        JMenuItem clearItem = new JMenuItem("Clear");
        clearItem.addActionListener(e -> clear());
        clearMenu.add(clearItem);
        
        
        
    }
    /**
     * Method for exiting the system 
     */
    private void quit()
    {
        System.exit(0);
    }
    
    /**
     * Resets the fram and variables to the beginning layout 
     */
    private void clear(){
        totalLabel.setText("Your Invoice"); 
        totalCost = 0; 
        
        costP.setText("$125.49");
        costPh.setText("$19.99");
        costC.setText("$565.35");
        
        dPrntTotal = 0;
        dLptpTotal = 0;
        dPhnTotal = 0;
        
        iPhnCount = 0;
        iLptpCount = 0;
        iPrntCount = 0;
        
        amountP.setText("0 at");
        amountPh.setText("0 at");
        amountC.setText("0 at");
        
        totalC.setText("is $0.00");
        totalPh.setText("is $0.00");
        totalP.setText("is $0.00");
        
        tField.setText(" "); 
    }
    /**
     * Sets prnt to true runs updateLabels() sets prnt to true again and runs updateTextField()
     */
    private void addPrinter(){
        prnt = true;  
        updateLabels();
        prnt = true;  
        updateTextField(); 
     }
     /**
     * Sets phn to true runs updateLabels() sets prnt to true again and runs updateTextField()
     */
    private void addPhone(){
         phn = true; 
         updateLabels();
         phn = true; 
         updateTextField(); 
     }
     /**
     * Sets lptp to true runs updateLabels() sets prnt to true again and runs updateTextField()
     */
    private void addComputer(){
        lptp = true; 
        updateLabels(); 
        lptp = true;
        updateTextField(); 
        
    }
    /**
     * updates the label with teh correct amounts and total cost 
     */
    public void updateLabels()
    {
       // System.out.println("lptp "+ lptp + "phn " + phn + "prnt " + prnt);
        if(lptp){
          
          iLptpCount = iLptpCount + 1;
          amountC.setText(iLptpCount + " at"); 
          dLptpTotal = dLptpTotal + 565.35;
          totalC.setText("is $" + String.format("%.2f",dLptpTotal)); 
          totalCost = totalCost + 565.35; 
          totalLabel.setText("The cost of the total sale is: " + String.format("%.2f",totalCost)); 
     
          lptp = false;
          
      }else if(phn){
    
          iPhnCount = iPhnCount + 1;
          amountPh.setText(iPhnCount + " at"); 
          dPhnTotal = dPhnTotal + 19.99;
          totalPh.setText("is $" + String.format("%.2f",dPhnTotal)); 
          totalCost = totalCost + 19.99; 
          totalLabel.setText("The cost of the total sale is: " + String.format("%.2f",totalCost));
          phn= false;
      }else if(prnt){
     
          iPrntCount = iPrntCount + 1;
          amountP.setText(iPrntCount + " at"); 
          dPrntTotal = dPrntTotal + 125.49; 
          totalP.setText("is $" + String.format("%.2f",dPrntTotal)); 
          totalCost = totalCost + 125.49; 
          totalLabel.setText("The cost of the total sale is: " + String.format("%.2f",totalCost));
          prnt = false;
        }
    }
         String textLptp = ""; 
         String textPrnt = ""; 
         String textPhn = ""; 
         int iPrntC = 0; 
         int iPhnC = 0; 
         int iLptpC = 0; 
         double dLptpT = 0; 
         double dPrntT = 0; 
         double dPhnT = 0; 
    /**
     * updates the text field to dispaly the correct cost and amounts
     */
    public void updateTextField(){
         
         if(lptp){
          iLptpC = iLptpC + 1; 
          dLptpT = dLptpT + 565.35;
          textLptp = (" The total number of item2 :" + iLptpC + " Total cost for item2: " + String.format("%.2f",dLptpT)); 
        
          tField.setText(textLptp +  "\n" + textPrnt + "\n" + textPhn + "\n") ; 
          lptp = false;
          
      }else if(phn){
    
          iPhnC = iPhnC + 1;
          
          dPhnT = dPhnT + 19.99;
          
          textLptp = (" The total number of item1 :" + iPhnC + " Total cost for item1: " + String.format("%.2f",dPhnT)); 
        
          tField.setText(textLptp +  "\n" + textPrnt + "\n" + textPhn + "\n") ; 
        
          phn= false;
      }else if(prnt){
     
          iPrntC= iPrntC + 1;
          dPrntT = dPrntT + 125.49; 
         
          textLptp = (" The total number of item3 :" + iPrntC + " Total cost for item3: " + String.format("%.2f",dPrntT)); 
        
          tField.setText(textLptp +  "\n" + textPrnt + "\n" + textPhn + "\n") ; 
     
          prnt = false;
        }
        }
        
    }

