import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class BurgerMenu extends JFrame{
	private static final long serialVersionUID = 1L;
JRadioButton btnAloo, btnVeggie, btnEgg;
  JRadioButton btnChicken, btnPaneer, btnKebab;
  ButtonGroup burgerGroup;
  JCheckBox chkCoke, chkFries, chkCake;
  JCheckBox chkCoffee, chkMuffin, chkSmoothie;
  JTextField txtPrice;
 JPanel choicePanel, topPanel, bottomPanel, burgerPanel, additionalPanel;
  Double burgerPrice = 0.0;
 Double totalPrice = 0.0;
 Double additionalPrice=0.0;
  public BurgerMenu(){
  super("Burger Menu");
	
   btnAloo = new JRadioButton("Aloo Tikki Burger (Rs.51.45)");
   btnVeggie = new JRadioButton("Veggie Burger (Rs.102.60)");
    btnEgg = new JRadioButton("Egg and Cheese Burger (Rs.120.65)");
   btnChicken = new JRadioButton("Chicken Burger (Rs.150.50)");
   btnPaneer = new JRadioButton("Paneer Tikka Burger (Rs.145.50)");
    btnKebab = new JRadioButton("Chicken Kebab Burger (Rs.165.80)");
    burgerGroup = new ButtonGroup();
    burgerGroup.add(btnAloo);
    burgerGroup.add(btnVeggie);
    burgerGroup.add(btnEgg);
    burgerGroup.add(btnChicken);
    burgerGroup.add(btnPaneer);
    burgerGroup.add(btnKebab);

   chkCoke = new JCheckBox("Coke (Rs.45)");
    chkFries = new JCheckBox("French Fries (Rs.60)");
    chkCake = new JCheckBox("CheeseCake(Rs.100)");
    chkCoffee = new JCheckBox("Coffee (Rs.75)");
   chkMuffin = new JCheckBox(" Chocolate Muffin (Rs.75)");
   chkSmoothie = new JCheckBox("Smoothie (Rs.65)");
  txtPrice = new JTextField("Total price = 0.00",15);
  txtPrice.setHorizontalAlignment(JTextField.CENTER);
btnAloo.addItemListener(new BurgerListener(51.45));
	btnVeggie.addItemListener(new BurgerListener(102.60));
	btnEgg.addItemListener(new BurgerListener(120.65));
	btnChicken.addItemListener(new BurgerListener(150.50));
	btnPaneer.addItemListener(new BurgerListener(145.50));
	btnKebab.addItemListener(new BurgerListener(165.80));
		
	chkCoke.addItemListener(new AdditionalListener(45.00));
	chkFries.addItemListener(new AdditionalListener(60.00));
	chkCake.addItemListener(new AdditionalListener(100.00));
	chkCoffee.addItemListener(new AdditionalListener(75.00));
	chkMuffin.addItemListener(new AdditionalListener(75.00));
	chkSmoothie.addItemListener(new AdditionalListener(65.00));
		
    choicePanel = new JPanel();
   choicePanel.setLayout(new GridLayout(2,1));
   topPanel = new JPanel();
   topPanel.setLayout(new BorderLayout());
    topPanel.setBorder(BorderFactory.createLineBorder(Color.red));
   bottomPanel = new JPanel();
    bottomPanel.setLayout(new BorderLayout());
    bottomPanel.setBorder(BorderFactory.createLineBorder(Color.red));
    burgerPanel = new JPanel();
    burgerPanel.setLayout(new GridLayout(3, 2));
   additionalPanel = new JPanel();
    additionalPanel.setLayout(new GridLayout(3, 2));
		
    burgerPanel.add(btnAloo);
    burgerPanel.add(btnVeggie);
    burgerPanel.add(btnEgg);
    burgerPanel.add(btnChicken);
    burgerPanel.add(btnPaneer);
    burgerPanel.add(btnKebab);
   topPanel.add(new JLabel("Choice of Burger"), "North");
   topPanel.add( burgerPanel, "Center");
		
   additionalPanel.add(chkCoke);
   additionalPanel.add(chkFries);
   additionalPanel.add(chkCake);
   additionalPanel.add(chkCoffee);
    additionalPanel.add(chkMuffin);
   additionalPanel.add(chkSmoothie);
   bottomPanel.add(new JLabel("Add to your meal"), "North");
   bottomPanel.add(additionalPanel, "Center");

	choicePanel.add(topPanel);
	choicePanel.add(bottomPanel);
	add(choicePanel,"Center");
	add(txtPrice, "South");
 }

  class BurgerListener implements ItemListener {
	Double price = 0.0;
		
	public BurgerListener (Double amount){	
	  price = amount;
	}
		
	public void itemStateChanged(ItemEvent event){		
		burgerPrice = price;
	 
	  totalPrice = burgerPrice + additionalPrice;
	  txtPrice.setText(String.format("Total price = Rs%.2f", totalPrice));
	}
  }

  class AdditionalListener implements ItemListener {
	Double price = 0.0;		
	public AdditionalListener(Double amount){		
	  price = amount;
	}
			public void itemStateChanged(ItemEvent event){		
	  JCheckBox item = (JCheckBox) event.getItem();
	  if (item.isSelected())
	     additionalPrice += price;
	  else
	    additionalPrice -= price;
	  totalPrice = burgerPrice + additionalPrice;
	  txtPrice.setText(String.format("Total price = Rs%.2f", totalPrice));
	}
  }
	
  public static void main(String args[]){
	BurgerMenu window = new BurgerMenu();
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	window.setSize(450,500);
	window.setVisible(true);
  }
}