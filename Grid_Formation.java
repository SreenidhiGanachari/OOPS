import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JButton;
public class Grid_Formation {
  JFrame J1;
  Grid_Formation()
  {
	  J1=new JFrame();
	  JButton b1=new JButton("A");
	  JButton b2=new JButton("B");
	  JButton b3=new JButton("C");
	  JButton b4=new JButton("D");
	  JButton b5=new JButton("E");
	  JButton b6=new JButton("F");
	  JButton b7=new JButton("G");
	  JButton b8=new JButton("H");
	  JButton b9=new JButton("I");
	  JButton b10=new JButton("J");
	  JButton b11=new JButton("K");
	  JButton b12=new JButton("L");
	  JButton b13=new JButton("M");
	  JButton b14=new JButton("N");
	  JButton b15=new JButton("O");
	  JButton b16=new JButton("P");
	  JButton b17=new JButton("Q");
	  JButton b18=new JButton("R");
	  JButton b19=new JButton("S");
	  JButton b20=new JButton("T");
	  JButton b21=new JButton("U");
	  JButton b22=new JButton("V");
	  JButton b23=new JButton("W");
	  JButton b24=new JButton("X");
	  JButton b25=new JButton("Y");
	  JButton b26=new JButton("Z");
	  
	  J1.add(b1);
	  J1.add(b2);
	  J1.add(b3);
	  J1.add(b4);
	  J1.add(b5);
	  J1.add(b6);
	  J1.add(b7);
	  J1.add(b8);
	  J1.add(b9);
	  J1.add(b10);
	  J1.add(b11);
	  J1.add(b12);
	  J1.add(b13);
	  J1.add(b14);
	  J1.add(b15);
	  J1.add(b16);
	  J1.add(b17);
	  J1.add(b18);
	  J1.add(b19);
	  J1.add(b20);
	  J1.add(b21);
	  J1.add(b22);
	  J1.add(b23);
	  J1.add(b24);
	  J1.add(b25);
	  J1.add(b26);
	  J1.setLayout(new GridLayout(5,5));
	  
	  J1.setSize(500,500);
	  J1.setVisible(true);
	  
	  
  }
  public static void main(String[] args) {  
	    new Grid_Formation();  
	}  
	}

