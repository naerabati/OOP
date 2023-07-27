import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;
import javax.swing.JButton;
import java.lang.Math; 
import java.util.ArrayList;

/**
 * Write a description of class GUI here.
 *
 * @author Nishna Aerabati 
 * @version 11/30
 */
public class GUI
{
    private JFrame frame; 
    private Names n; 
    private JTextField tField; 
    private JTextField textField2; 
    private JTextField textField3; 
    private JLabel topLabel; 
    private JLabel topLabel2; 
    private JTextArea tArea;
    private JScrollPane scrollBar; 
    /**
     * Constructor for objects of class GUI
     */
    public GUI() throws FileNotFoundException 
    {
       makeFrame(); 
    }

    /**
     * 
     *Makes the frams and sets up the GUI 
     */
    public void makeFrame() throws FileNotFoundException
    {
        n = new Names(); 
        
        frame = new JFrame("Name Analysis");
        frame.setResizable(false);
        frame.setPreferredSize(new Dimension(900,350));
        frame.setLayout(new BorderLayout());
        
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {

                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                break;

            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        
        makeMenuBar(frame);
        
        tArea = new JTextArea("",4,70);
        tArea.setBackground(Color.GRAY);
        tArea.setEditable(false);
        
        JPanel topPanel = new JPanel(); 
        
        JLabel imageLabel = new JLabel(new ImageIcon("usImage.png"));
        JPanel imagePanel = new JPanel();
        imagePanel.add(imageLabel);
        
        //JPanel centerPanel = new JPanel(new BorderLayout());
        JPanel centerPanel = new JPanel();
        JPanel buttonPanel = new JPanel(new GridLayout(4,2));
        scrollBar = new JScrollPane(tArea);
        scrollBar.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollBar.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); 
       
        
        
        centerPanel.add(scrollBar); 
        JPanel middlePanel = new JPanel(new BorderLayout());
        middlePanel.add(centerPanel, BorderLayout.NORTH);
        middlePanel.add(buttonPanel, BorderLayout.CENTER);
        
        
        
        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(middlePanel,BorderLayout.CENTER); 
        //frame.add(buttonPanel, BorderLayout.EAST);
        frame.add(imagePanel, BorderLayout.WEST);
        frame.pack(); 
         
        topLabel = new JLabel("<html>Welcome to my Name Analysis Program. What would you like to do?<br><center>Please click one on of the following:</center></html>", SwingConstants.CENTER );
        //topLabel2 = new JLabel("Please click one one of the following", SwingConstants.CENTER);
        //centerPanel.add(tField); 
        topPanel.setBackground(new Color(200,100,231)); 
        topPanel.add(topLabel); 
        //topPanel.add(topLabel2); 
        
        
        //imagePanel.setBackground 
        
        JButton popularNames = new JButton("Find all the names that are getting popular"); 
        JButton allRanksNames = new JButton("Find out the ranks of a given name"); 
        JButton allDecadeNames = new JButton("Display the names that appear in all decades"); 
        JButton oneDecadeNames = new JButton("Display the names that appear in only one decade"); 
        JButton oneRankOneDecade= new JButton("Find the rank of a name in a particular decade"); 
        JButton graphName = new JButton("Draw the graph for a given name");
       
       
        buttonPanel.add(popularNames); 
        buttonPanel.add(allRanksNames); 
        buttonPanel.add(oneDecadeNames); 
        buttonPanel.add(allDecadeNames); 
        buttonPanel.add(oneRankOneDecade); 
        buttonPanel.add(graphName); 
        
        popularNames.addActionListener(e -> popularNames()); 
        allRanksNames.addActionListener(e -> allRanksForOneName());  
        oneDecadeNames.addActionListener(e -> namesInOneDecade()); 
        allDecadeNames.addActionListener(e ->namesInAllDecades());
        oneRankOneDecade.addActionListener(e -> particularDecadeRank());
        graphName.addActionListener(e -> graph());
        
        
        frame.pack(); 
        frame.setVisible(true);
    }
    
    /**
     *makes the menubar
     */
    private void makeMenuBar(JFrame frame)
    {
        
        JMenuBar menubar = new JMenuBar();
        frame.setJMenuBar(menubar);
        
        // create the File manu
        JMenu quitMenu = new JMenu("Quit");
        
        
        menubar.add(quitMenu);
       
        
        JMenuItem quitItem = new JMenuItem("Quit");
        quitItem.addActionListener(e -> quit());
        quitMenu.add(quitItem);
        
        
    }
    
    /**
     * exits the system 
     */
    private void quit()
    {
        System.exit(0);
    }
    /**
     * calls popularNames method and sets the text area to display it 
     */
    public void popularNames() {
        ArrayList<String> list = n.popularNames(); 
        String str = "";
    for (String name : list) {
            str+= name+"\n";
    }
        
        tArea.setText(str); 
    }
    /**
     * calls nameRankForDecade method and sets the text area to display it 
     */
    public void allRanksForOneName(){
        String name = JOptionPane.showInputDialog(frame, "Name:");
        ArrayList<Integer> list = n.nameRankForDecade(name); 
        tArea.setText("For the years 1900 till 2000 the ranks for name " + name + " are " + list); 
    }
    
      /**
     * calls namesInOneDecade method and sets the text area to display it 
     */
    
    public void namesInOneDecade(){
  
        ArrayList<String> list = n.namesInOneDecade(); 
        String str = "";
    for (String name : list) {
            str += name + "\n";
    }
    System.out.println(str);     
        tArea.setText(str); 
    }
    
    /**
     * calls namesInAllDecades method and sets the text area to display it 
     */
    public void namesInAllDecades(){
       
        ArrayList<String> list = n.namesInAllDecades(); 
        String str = "";
    for (String name : list) {
            str+= name+"\n";
    }
        
        tArea.setText(str); 
        
    }
    /**
     * calls nameInCertainDecade method and sets the text area to display it 
     */
    public void particularDecadeRank() {
        String name = JOptionPane.showInputDialog(frame, "Name:");
        String year = JOptionPane.showInputDialog(frame, "Year:");
        int y = n.nameInCertainDecade(name, year); 
        
        tArea.setText("The rank for " + year + " is " + y); 
    }
    
   /**
     * calls graphForName method and displays it  
     */
    public void graph() {
       String name = JOptionPane.showInputDialog(frame, "Name:");
       n.graphForName(name); 
    }
    

}
