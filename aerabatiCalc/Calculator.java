import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JButton;
import java.lang.Math; 
import javax.swing.border.Border;

/**
 * This class implements a calculator.
 * 
 * @author Nishna Aerabati 
 * @version 11/30
 */
public class Calculator
{
    // class Fields
    private JFrame frame;
    private JTextField tField;
    private String s1 = "";
    private String s2 = "";
    private boolean add = false;
    private boolean subtract = false;
    private boolean multiply = false;
    private boolean divide = false;
    private boolean modulo = false; 
    private boolean exponent = false; 
    private boolean sqrt = false; 
    private boolean log = false; 
    private boolean cos = false; 
    private boolean factorial = false; 
    private boolean tan = false; 
    private boolean sin = false; 
    /**
     * Constructor for objects of class Calculator
     */
    public Calculator()
    {
        makeFrame();
    }

    /**
     * makeFrame - sets up the calculator appearance and the buttons
     * event listeners.
     */
    private void makeFrame()
    {
        frame = new JFrame("Simple Calculator");
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {

                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                break;

            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        frame.setResizable(false);
        frame.setPreferredSize(new Dimension(350,350));

        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        makeMenuBar(frame);

        Container contentPane = frame.getContentPane();
        //this impact pane appearence
        //contentPane.setLayout(new GridLayout(2,4));

        JPanel panel = new JPanel(); 
        JPanel panel2 = new JPanel(); 
        JPanel panel3 = new JPanel(); 

        //panel.setBorder(new EmptyBorder(12, 12, 12, 12)); 
        tField = new JTextField();
        tField.setPreferredSize(new Dimension(10,50));
        tField.setBounds(0,0,50,150);
        tField.setHorizontalAlignment(JTextField.RIGHT);
        contentPane.add(tField,BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton b0 = new JButton("0");
        JButton bs = new JButton("-");
        JButton bd = new JButton("/");
        JButton bm = new JButton("*");
        JButton bAdd = new JButton("+");
        JButton bEqual = new JButton("=");
        bEqual.setBackground(new Color(77,176,230));
        JButton bClear = new JButton("C");
        JButton bEx = new JButton("^"); 
        JButton bMod = new JButton("%");
        JButton bSqrt = new JButton("√");
        JButton bFactorial = new JButton("!"); 
        JButton bCos = new JButton("COS"); 
        JButton bTan = new JButton("TAN"); 
        JButton bSin = new JButton("SIN"); 
        JButton bLog = new JButton("LOG"); 
        //Determines rows columns
        panel.setLayout(new GridLayout(6,4,0,0));
        //Col 1
        panel.add(bMod);
        panel.add(bSqrt); 
        panel.add(bFactorial);
        panel.add(bClear);
        //Col 2
        panel.add(bSin);
        panel.add(bCos);
        panel.add(bTan);
        panel.add(bd);
        //Col 3
        panel.add(b7);
        panel.add(b8);
        panel.add(b9);
        panel.add(bm);
        //Co 4
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(bs); 
        //Col 5
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(bAdd);   
        //Col 6
        panel.add(bEx);
        panel.add(b0);
        panel.add(bLog);
        panel.add(bEqual); 

        b1.addActionListener(e -> b1());
        b2.addActionListener(e -> b2());
        b3.addActionListener(e -> b3());
        b4.addActionListener(e -> b4());
        b5.addActionListener(e -> b5());
        b6.addActionListener(e -> b6());
        b7.addActionListener(e -> b7());
        b8.addActionListener(e -> b8());
        b9.addActionListener(e -> b9());
        b0.addActionListener(e -> b0());
        bs.addActionListener(e -> bs());
        bd.addActionListener(e -> bd());
        bm.addActionListener(e -> bm());
        bSqrt.addActionListener(e -> bSqrt()); 
        bFactorial.addActionListener(e -> bFactorial()); 
        bTan.addActionListener(e -> bTan()); 
        bLog.addActionListener(e -> bLog()); 
        bSin.addActionListener(e -> bSin()); 
        bCos.addActionListener(e -> bCos()); 
        bClear.addActionListener(e -> bClear());
        bAdd.addActionListener(e -> bAdd());
        bMod.addActionListener(e -> bMod());
        bEx.addActionListener( e -> bEx()); 
        bEqual.addActionListener(e -> bEqual());

        frame.add(panel, BorderLayout.CENTER);
        // building is done - arrange the components and show        
        frame.pack();
        frame.setVisible(true);
    }

    /**
     * Create the main frame's menu bar.
     * @param frame   The frame that the menu bar should be added to.
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
     * Quit function: quit the application.
     */
    private void quit()
    {
        System.exit(0);
    }

    /**
     * b1() inputs text "1" into the text window
     */

    private void b1()
    {
        tField.setText(tField.getText()+"1");
    }

    /**
     * b2() inputs text "2" into the text window
     */

    private void b2()
    {
        tField.setText(tField.getText()+"2");
    }

    /**
     * b3() inputs text "3" into the text window
     */

    private void b3()
    {
        tField.setText(tField.getText()+"3");
    }

    /**
     * b0() inputs text "0" into the text window
     */

    private void b0()
    {
        tField.setText(tField.getText()+"0");
    }

    /**
     * b4() inputs text "4" into the text window
     */

    private void b4()
    {
        tField.setText(tField.getText()+"4");
    }

    /**
     * b5() inputs text "5" into the text window
     */

    private void b5()
    {
        tField.setText(tField.getText()+"5");
    }

    /**
     * b6() inputs text "6" into the text window
     */

    private void b6()
    {
        tField.setText(tField.getText()+"6");
    }

    /**
     * b7() inputs text "7" into the text window
     */

    private void b7()
    {
        tField.setText(tField.getText()+"7");
    }

    /**
     * b8() inputs text "8" into the text window
     */

    private void b8()
    {
        tField.setText(tField.getText()+"8");
    }

    /**
     * b9() inputs text "9" into the text window
     */

    private void b9()
    {
        tField.setText(tField.getText()+"9");
    }

    /**
     * bAdd() sets the add flag to True
     */
    private void bAdd()
    {
        s1 = tField.getText();
        add = true;
        //System.out.println(s1);
        tField.setText("");
    }

    /**
     * bm() sets the multiply flag to True
     */
    private void bm()
    {
        s1 = tField.getText();
        multiply = true;
        //System.out.println(s1);
        tField.setText("");
    }

    /**
     * bs() sets the subtract flag to True
     */
    private void bs()
    {
        s1 = tField.getText();
        subtract = true;
        //System.out.println(s1);
        tField.setText("");
    }

    /**
     * bClear() sets the text field to an empty string
     */
    private void bClear()
    {   
        tField.setText("");
    }

    /**
     * bd() sets the divide flag to True
     */
    private void bd()
    {
        s1 = tField.getText();
        divide = true;
        //System.out.println(s1);
        tField.setText("");
    }

    /**
     * bSqrt() sets the sqrt flag to True
     * outputs th sqrt
     */
    private void bSqrt()
    {
        sqrt = true;
        int nSqrt = Integer.parseInt ( tField.getText());
        tField.setText(""+ Math.sqrt(nSqrt));
    }

    /**
     * bLog() sets the log flag to True
     * does the math and outputs the log
     */
    private void bLog()
    {
        log = true;
        int nLog = Integer.parseInt ( tField.getText());
        tField.setText(""+ Math.log(nLog));
    }

    /**
     * bCos() sets the cos flag to True
     * does the math and outputs the cosine
     */
    private void bCos()
    {
        double dInputCos = Double.parseDouble(tField.getText());
        double dCos = Math.sin(Math.toRadians(dInputCos));
        tField.setText(String.format("%.6f", dCos));
        //cos =true;
    }

    /**
     * bSin() sets the sin flag to True
     * Does the math and outputs the sin
     */
    private void bSin()
    {
        double dInputSin = Double.parseDouble(tField.getText());
        double dSin = Math.sin(Math.toRadians(dInputSin));
        tField.setText(String.format("%.6f", dSin));
        //sin = true;
    }

    /**
     * bTan() sets the tan flag to True
     * Solves the tan math and outputs
     */
    private void bTan()
    {
        double dInputTan = Double.parseDouble(tField.getText());
        double dTan = Math.sin(Math.toRadians(dInputTan));
        tField.setText(String.format("%.6f", dTan));
    }

    /**
     * bMod() sets the modulo flag to True
     */
    private void bMod()
    {
        s1 = tField.getText();
        modulo = true;
        //System.out.println(s1);
        tField.setText("");
    }

    /**
     * bEx() sets the exponent flag to True
     */
    private void bEx()
    {
        s1 = tField.getText();
        exponent = true;
        //System.out.println(s1);
        tField.setText("");
    }

    /**
     * bFactorial() sets the factorialT flag to True
     * and runs and solves the fatcorial 
     */
    private void bFactorial()
    {
        factorial = true;
        int n = Integer.parseInt ( tField.getText());
        if (n == 0)
            tField.setText("1");
        int res = 1, i;
        for (i=2; i<=n; i++)
            res = res * i; 
        tField.setText(String.valueOf(res)); 

    }

    /**
     * bEqual - reads in the two variables and converts them to ints.
     * Then checks the operation flag and does the math.
     * Once done. writes the output to the text field.
     */
    private void bEqual()
    {
        s2 = tField.getText();
        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);
        if (add)
        {           
            tField.setText(""+(num1+num2));
            add = false; 
        }else if(divide){
            tField.setText(""+(num1/num2));
            divide = false; 
        }else if(subtract){
            tField.setText(""+(num1-num2));
            subtract = false;
        }else if(multiply){
            tField.setText(""+(num1*num2));
            multiply = false; 
        }else if(modulo){
            tField.setText(""+(num1%num2));
            modulo = false; 
        }else if(exponent){
            tField.setText(""+ Math.pow(num1, num2));
            exponent = false; 
        }else if(sqrt){
            //tField.setText(""+ Math.sqrt(num1));
            sqrt = false; 
        }else if(factorial){
            /*int s = 0; 
            for(int i=1;i<=num1;i++){    
            s = s * i;
            }
            tField.setText(""+ s);
             */
            factorial = false; 
        }else if(log){
            //tField.setText(""+ Math.log(num1));
            log = false; 
        }else if(cos){
            //tField.setText(""+ Math.cos(num1));
            cos = false;
        }else if(tan){
            //tField.setText(""+ Math.tan(num1));
            cos = false;
        }else if(sin){
            //tField.setText(""+ Math.tan(num1));
            sin = false;
        }

    }
}

