import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
class Calculator extends JFrame implements ActionListener {
   private static final long serialVersionUID = 1L;


	static JFrame J1;
 
 
    static JTextField T1;
 
    
    String s0, s1, s2;
 
    
    Calculator()
    {
        s0 = s1 = s2 = "";
    }
 
    
    public static void main(String args[])
    {
       
        J1 = new JFrame("Calculator");
 
        try {
            
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
 
        
        Calculator c = new Calculator();
 
        
        T1 = new JTextField(16);
 
        
        T1.setEditable(false);
 
        
        JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
 
       
        b0 = new JButton("9");
        b1 = new JButton("-");
        b2 = new JButton("*");
        b3 = new JButton("/");
        b4 = new JButton("1");
        b5 = new JButton("2");
        b6 = new JButton("3");
        b7 = new JButton("5");
        b8 = new JButton("6");
        b9 = new JButton("7");
        b10 = new JButton("=");
        b11 = new JButton("+");
        b12 = new JButton(".");
        b13 = new JButton("4");
        b14 = new JButton("8");
        b15 = new JButton("Clear");
        b16= new JButton("0");
 
        
        JPanel p = new JPanel();
 
        
        b10.addActionListener(c);
        b11.addActionListener(c);
        b12.addActionListener(c);
        b13.addActionListener(c);
        b9.addActionListener(c);
        b8.addActionListener(c);
        b7.addActionListener(c);
        b6.addActionListener(c);
        b5.addActionListener(c);
        b4.addActionListener(c);
        b3.addActionListener(c);
        b2.addActionListener(c);
        b1.addActionListener(c);
        b0.addActionListener(c);
        b14.addActionListener(c);
        b15.addActionListener(c);
        b16.addActionListener(c);
 
        
        p.add(T1);
        p.add(b11);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b12);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b13);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(b15);
        p.add(b14);
        p.add(b0);
        p.add(b15);
        p.add(b16);
        p.add(b10);

        p.setBackground(Color.white);
 
        
        J1.add(p);
 
        J1.setSize(250,250);
        J1.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();
 
        
        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
           
            if (!s1.equals(""))
                s2 = s2 + s;
            else
                s0 = s0 + s;
 
            
            T1.setText(s0 + s1 + s2);
        }
        else if (s.charAt(0) == 'C') {
            
            s0 = s1 = s2 = "";
 
            
            T1.setText(s0 + s1 + s2);
        }
        else if (s.charAt(0) == '=') {
 
            double function;
 
            
            if (s1.equals("+"))
            	function = (Double.parseDouble(s0) + Double.parseDouble(s2));
            else if (s1.equals("-"))
            	function = (Double.parseDouble(s0) - Double.parseDouble(s2));
            else if (s1.equals("/"))
            	function = (Double.parseDouble(s0) / Double.parseDouble(s2));
            else
            	function = (Double.parseDouble(s0) * Double.parseDouble(s2));
 
           
            T1.setText(s0 + s1 + s2 + "=" + function);
 
            
            s0 = Double.toString(function);
 
            s1 = s2 = "";
        }
        else {
            
            if (s1.equals("") || s2.equals(""))
                s1 = s;
            
            else {
                double function;
 
                
                if (s1.equals("+"))
                	function = (Double.parseDouble(s0) + Double.parseDouble(s2));
                else if (s1.equals("-"))
                	function = (Double.parseDouble(s0) - Double.parseDouble(s2));
                else if (s1.equals("/"))
                	function = (Double.parseDouble(s0) / Double.parseDouble(s2));
                else
                	function = (Double.parseDouble(s0) * Double.parseDouble(s2));
 
                
                s0 = Double.toString(function);
 
                
                s1 = s;
 
                
                s2 = "";
            }
 
           
            T1.setText(s0 + s1 + s2);
        }
    }
}
