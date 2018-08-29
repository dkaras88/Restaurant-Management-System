import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JTabbedPane;
import java.awt.Checkbox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Restaurant {

	private JFrame frame;
	private JTextField jtxtChicBurger;
	private JTextField jtxtChicBurgerMeal;
	private JTextField jtxtBCBurger;
	private JTextField jtxtQty;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restaurant window = new Restaurant();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Restaurant() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1368, 689);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel.setBounds(117, 34, 311, 248);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel jtxtChicBurger1 = new JLabel("Chicken Burger");
		jtxtChicBurger1.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		jtxtChicBurger1.setBounds(25, 29, 129, 42);
		panel.add(jtxtChicBurger1);
		
		JLabel jtxtChicBurgerMeal1 = new JLabel("Beef Burger");
		jtxtChicBurgerMeal1.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		jtxtChicBurgerMeal1.setBounds(25, 71, 129, 42);
		panel.add(jtxtChicBurgerMeal1);
		
		JLabel jtxtBCBurger1 = new JLabel("Veggie Burger");
		jtxtBCBurger1.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		jtxtBCBurger1.setBounds(25, 114, 129, 42);
		panel.add(jtxtBCBurger1);
		
		jtxtChicBurger = new JTextField();
		jtxtChicBurger.setBounds(166, 39, 130, 26);
		panel.add(jtxtChicBurger);
		jtxtChicBurger.setColumns(10);
		
		jtxtChicBurgerMeal = new JTextField();
		jtxtChicBurgerMeal.setColumns(10);
		jtxtChicBurgerMeal.setBounds(166, 81, 130, 26);
		panel.add(jtxtChicBurgerMeal);
		
		jtxtBCBurger = new JTextField();
		jtxtBCBurger.setColumns(10);
		jtxtBCBurger.setBounds(166, 114, 130, 26);
		panel.add(jtxtBCBurger);
		
		JLabel label_7 = new JLabel("Drinks");
		label_7.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		label_7.setBounds(25, 152, 129, 40);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("Tax");
		label_8.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		label_8.setBounds(35, 204, 62, 42);
		panel.add(label_8);
		
		JLabel jtxtQty1 = new JLabel("Qty");
		jtxtQty1.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		jtxtQty1.setBounds(167, 152, 129, 42);
		panel.add(jtxtQty1);
		
		Checkbox checkbox = new Checkbox("New check box");
		checkbox.setBounds(10, 215, 23, 23);
		panel.add(checkbox);
		
		JLabel label_10 = new JLabel("Home Delevery");
		label_10.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		label_10.setBounds(166, 204, 129, 42);
		panel.add(label_10);
		
		Checkbox checkbox_2 = new Checkbox("New check box");
		checkbox_2.setBounds(137, 215, 23, 23);
		panel.add(checkbox_2);
		
		Checkbox checkbox_1 = new Checkbox("New check box");
		checkbox_1.setBounds(131, 215, 23, 23);
		panel.add(checkbox_1);
		
		jtxtQty = new JTextField();
		jtxtQty.setColumns(10);
		jtxtQty.setBounds(166, 181, 130, 26);
		panel.add(jtxtQty);
		
		JComboBox jCmbDrink = new JComboBox();
		jCmbDrink.setModel(new DefaultComboBoxModel(new String[] {"Select a drink", "Coke", "Fanta", "Water ", "Spezi"}));
		jCmbDrink.setBounds(19, 182, 129, 27);
		panel.add(jCmbDrink);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(84, 144, 1, 12);
		panel.add(separator);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_1.setBounds(440, 34, 380, 248);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox jcmbCurrency = new JComboBox();
		jcmbCurrency.setModel(new DefaultComboBoxModel(new String[] {"Choose One…", "Germany", "USA", "France", "Spain", "UK", "Australia"}));
		jcmbCurrency.setBounds(91, 26, 216, 27);
		panel_1.add(jcmbCurrency);
		
		JTextPane jtxtConvert = new JTextPane();
		jtxtConvert.setBounds(97, 86, 198, 27);
		panel_1.add(jtxtConvert);
		
		JButton jlblConvert1 = new JButton("Convert");
		jlblConvert1.setBounds(24, 200, 117, 29);
		panel_1.add(jlblConvert1);
		
		JButton button = new JButton("Close");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(229, 200, 117, 29);
		panel_1.add(button);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(new Color(0, 0, 0), 7));
		panel_14.setBounds(100, 135, 195, 35);
		panel_1.add(panel_14);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_2.setBounds(117, 289, 311, 260);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel jlblCostOfDrinks1 = new JLabel("Cost of Drinks");
		jlblCostOfDrinks1.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		jlblCostOfDrinks1.setBounds(19, 27, 129, 42);
		panel_2.add(jlblCostOfDrinks1);
		
		JLabel jlblCosOfMeal1 = new JLabel("Cost of Meal");
		jlblCosOfMeal1.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		jlblCosOfMeal1.setBounds(19, 79, 129, 42);
		panel_2.add(jlblCosOfMeal1);
		
		JLabel jlblCostOfDelivery1 = new JLabel("Cost of Delevery");
		jlblCostOfDelivery1.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		jlblCostOfDelivery1.setBounds(19, 133, 148, 42);
		panel_2.add(jlblCostOfDelivery1);
		
		JPanel jlblCostOfDrinks = new JPanel();
		jlblCostOfDrinks.setBorder(new LineBorder(new Color(0, 0, 0), 7));
		jlblCostOfDrinks.setBounds(160, 27, 129, 42);
		panel_2.add(jlblCostOfDrinks);
		
		JPanel jlblCostofMeal = new JPanel();
		jlblCostofMeal.setBorder(new LineBorder(new Color(0, 0, 0), 7));
		jlblCostofMeal.setBounds(160, 79, 129, 42);
		panel_2.add(jlblCostofMeal);
		
		JPanel jlblCostOfDelivery = new JPanel();
		jlblCostOfDelivery.setBorder(new LineBorder(new Color(0, 0, 0), 7));
		jlblCostOfDelivery.setBounds(160, 133, 129, 42);
		panel_2.add(jlblCostOfDelivery);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_3.setBounds(440, 289, 380, 260);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JPanel jlblsubTotal = new JPanel();
		jlblsubTotal.setBorder(new LineBorder(new Color(0, 0, 0), 7));
		jlblsubTotal.setBounds(195, 32, 155, 33);
		panel_3.add(jlblsubTotal);
		
		JPanel jlblTax = new JPanel();
		jlblTax.setBorder(new LineBorder(new Color(0, 0, 0), 7));
		jlblTax.setBounds(195, 144, 155, 33);
		panel_3.add(jlblTax);
		
		JPanel jlblTotal = new JPanel();
		jlblTotal.setBorder(new LineBorder(new Color(0, 0, 0), 7));
		jlblTotal.setBounds(195, 87, 155, 33);
		panel_3.add(jlblTotal);
		
		JLabel jlblsubTotal1 = new JLabel("SubTotal");
		jlblsubTotal1.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		jlblsubTotal1.setBounds(38, 42, 85, 23);
		panel_3.add(jlblsubTotal1);
		
		JLabel jlblTotal1 = new JLabel("Total");
		jlblTotal1.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		jlblTotal1.setBounds(38, 97, 69, 23);
		panel_3.add(jlblTotal1);
		
		JLabel jlblTax1 = new JLabel("Tax");
		jlblTax1.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		jlblTax1.setBounds(38, 154, 69, 23);
		panel_3.add(jlblTax1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_4.setBounds(832, 34, 467, 515);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(21, 40, 406, 437);
		panel_4.add(tabbedPane);
		
		JPanel panel_12 = new JPanel();
		tabbedPane.addTab("Receipt", null, panel_12, null);
		
		JPanel panel_13 = new JPanel();
		tabbedPane.addTab("Calculator", null, panel_13, null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_6.setBounds(115, 561, 1184, 87);
		frame.getContentPane().add(panel_6);
		panel_6.setLayout(null);
		
		JButton btnNewButton = new JButton("Total");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ChicBurger = Double.parseDouble(jtxtChicBurger.getText());
				double iChickBurger = 2.39;
				double Burger;
				
				Burger = (ChicBurger * iChickBurger);
				String pMeal = String.format("%.2f",  Burger);
				jlblCostofMeal.setToolTipText(pMeal);
				
				double ChichBurgerMeal = Double.parseDouble(jtxtChicBurgerMeal.getText());
				double iChichBurgerMeal = 4.39;
				double BurgerMeal;
				
				BurgerMeal = (ChichBurgerMeal + iChichBurgerMeal);
				String cbMeal = String.format("%.2f", BurgerMeal + Burger);
				jlblCostofMeal.setToolTipText(cbMeal);
				
				double CheesBurger = Double.parseDouble(jtxtBCBurger.getText());
				double CheesBurherPrice = 3.39;
				double CheesBurgerMeal;
				
				CheesBurgerMeal = (CheesBurger*CheesBurherPrice);
				String chees = String.format("%.2f", CheesBurgerMeal + BurgerMeal + Burger);
				jlblCostofMeal.setToolTipText(chees);
				
				// -------------------Delivery------------------------------
				
				if(jcDelivery.isSelected()) 
				{
					String (pDelivery.isSelected());
					{
						String pDelivery = String.format("%.2f", iDelivery);
							jlblCostOfDelivery.setToolTipText(pDelivery);
					}
					
					else {
						jlblCostOfDelivery.setToolTipText("0");
						
					}
					
					// -----------------------Drinks --------------------------- 32:20
					
					double Drinks = Double.parseDouble(jtxtQty.getText());
					double Tea = 1.20 * Drinks;
					double Ice_Tea = 0.90 * Drinks;
					double Coffe = 2.50 * Drinks;
					double Ice_Coffe = 1.10 * Drinks;
					double Cola = 2.10 * Drinks;
					double Coke = 1.60 * Drinks;
					double Orange = 1.70 * Drinks;
					double Appel_Jucie = 1.99 * Drinks;
					
					if(jCmbDrink.getSelectedItem().equals("Apple Juice"))
					{
						String CApple_Juice = String.format("%.2f", Appel_Jucie);
						jlblCostOfDrinks.setToolTipText(CApple_Juice);
					}
					
					if(jCmbDrink.getSelectedItem().equals("Tea"))
					{
						String cTea = String.format("%.2f", Appel_Jucie);
						jlblCostOfDrinks.setToolTipText(cTea);
					}
					
					if(jCmbDrink.getSelectedItem().equals("Ice Tea"))
					{
						String cIce_Tea = String.format("%.2f", Ice_Tea);
						jlblCostOfDrinks.setToolTipText(cIce_Tea);
					}
					
					if(jCmbDrink.getSelectedItem().equals("Coffe"))
					{
						String cCoffe = String.format("%.2f", Coffe);
						jlblCostOfDrinks.setToolTipText(cCoffe);
					}
					
					if(jCmbDrink.getSelectedItem().equals("Ice_Coffe"))
					{
						String cIce_Coffe = String.format("%.2f", Ice_Coffe);
						jlblCostOfDrinks.setToolTipText(cIce_Coffe);
					}
					
					if(jCmbDrink.getSelectedItem().equals("Cola"))
					{
						String cCola = String.format("%.2f", Cola);
						jlblCostOfDrinks.setToolTipText(cCola);
					}
					
					if(jCmbDrink.getSelectedItem().equals("Coke"))
					{
						String cCoke = String.format("%.2f", Coke);
						jlblCostOfDrinks.setToolTipText(cCoke);
					}
					
					if(jCmbDrink.getSelectedItem().equals("Orange"))
					{
						String cOrange = String.format("%.2f", Orange);
						jlblCostOfDrinks.setToolTipText(cOrange);
					}
					
				//	-----------Tax Rate  -----------
					
					double cTotal1 = Double.parseDouble(.getText());
					double cTotal2 = Double.parseDouble(.getText());
					double cTotal3 = Double.parseDouble(.getText());
					double AllTotal = (cTotal1+cTotal2+cTotal3)/100;
					if(jCTax.isselected())
					{
						String iAllTotal = String.format("%.2f", AllTotal);
						jlblTax.setToolTipText(iAllTotal);
					}
					
					//	-----------Total  -----------
					double cTotal4 = Double.parseDouble(jlblTax.getToolTipText());
					
					double subTotal = (cTotal1 +cTotal2+cTotal3);
					String isubTotal = String.format("£ %.2f", subTotal);
					jlblSubTotal.setText(iTotal);
					
					double allTOtal = (cTotal1 +cTotal2+cTotal3+cTotal4);
					String iTotal = String.format("£ %.2f", subTotal);
					jlblTotal.setToolTipText(iTotal);

					String iTaxTotal = String.format("£ %.2f", subTotal);
					jlblTax.setToolTipText(iTotal);


					
				}
				
				
			}
		});
		btnNewButton.setBounds(292, 22, 117, 29);
		panel_6.add(btnNewButton);
		
		JButton button_1 = new JButton("Receipt");
		button_1.setBounds(438, 22, 117, 29);
		panel_6.add(button_1);
		
		JButton button_2 = new JButton("Reset");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jlblCostOfDelivery.setToolTipText(null);
				jlblsubTotal.setToolTipText(null);
				jlblTax.setToolTipText(null);
				jlblCostOfDelivery.setToolTipText(null);
				jlblCostOfDrinks.setToolTipText(null);
				jlblsubTotal.setToolTipText(null);
				jlblTax.setToolTipText(null);
				jlblTotal.setToolTipText(null);
				jtxtChicBurger.setText(null);
				jtxtChicBurgerMeal.setText(null);	
				jtxtBCBurger.setText(null);
				jtxtQty.setText(null);
				jtxtConvert.setText(null);
				jCmbDrink.setSelectedItem("Select a drink");
				jcmbCurrency.setSelectedItem("Choose One..");
			}
		});
		button_2.setBounds(588, 22, 117, 29);
		panel_6.add(button_2);
		
		JButton button_3 = new JButton("Exit");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		button_3.setBounds(728, 22, 117, 29);
		panel_6.add(button_3);
		
		JLabel lblNewLabel = new JLabel("Bob Burgers GmbH - Bestellung System - Made by TiggieTech");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 21));
		lblNewLabel.setBounds(295, 6, 713, 26);
		frame.getContentPane().add(lblNewLabel);
	}
}
