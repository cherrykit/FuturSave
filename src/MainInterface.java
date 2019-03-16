import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSplitPane;
import javax.swing.JTextField;

import javax.swing.JLayeredPane;
import java.awt.CardLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.Font;

public class MainInterface extends JFrame implements ActionListener {
    
	//Budget related information stored in Budget class
	Budget budget = new Budget();
	
    //Elements of the interface
	private JLayeredPane contentPane;
	private JTextField amount;
	private JButton btnFood;
	private JButton btnSocial;
	private JButton btnSchool;
	private JButton btnGifts;
    private JSplitPane splitPane;
    private JTextPane textPane;
    private JSplitPane splitPane_4;
    private JButton btnContinue;
    private JSplitPane splitPane_5;
    private JTextPane txtConfirm;
    private JSplitPane splitPane_6;
    private JButton btnConfirmPurchase;
    private JButton btnCancelPurchase;
    private JSplitPane splitPane_7;
    private JSplitPane splitPane_8;
    private JSplitPane splitPane_9;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JSplitPane splitPane_10;
    private JButton btnConfim;

    //Constructor
	public MainInterface() {
		
		initGUI();
		
	}
	
	//Creates an instance of the program when it is run
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainInterface frame = new MainInterface();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	//Initialises GUI
	private void initGUI() {
		
		//Main JFrame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 412, 664);
		contentPane = new JLayeredPane();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		//Setup budget window: contains splitPane_7 and the confirm button
		splitPane_10 = new JSplitPane();
		splitPane_10.setResizeWeight(0.9);
		splitPane_10.setOrientation(JSplitPane.VERTICAL_SPLIT);
		contentPane.add(splitPane_10, "name_236258390386700");
		
		//Confirm button
		btnConfim = new JButton("Confirm");
		splitPane_10.setRightComponent(btnConfim);
		btnConfim.setActionCommand("500");
		btnConfim.addActionListener(this);
		
		//Splitpane containing splitpane 8 and splitpane 9
		splitPane_7 = new JSplitPane();
		splitPane_7.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane_7.setResizeWeight(0.5);
		splitPane_10.setLeftComponent(splitPane_7);
		
		//splitpane containing the food budget and social budget fields
		splitPane_8 = new JSplitPane();
		splitPane_8.setResizeWeight(0.5);
		splitPane_7.setLeftComponent(splitPane_8);
		
		//food budget text field
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 24));
		splitPane_8.setLeftComponent(textField);
		textField.setColumns(10);
		textField.setUI(new JTextFieldHintUI("Food budget...", Color.gray));
		
		//social budget text field
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		splitPane_8.setRightComponent(textField_1);
		textField_1.setColumns(10);
		textField_1.setUI(new JTextFieldHintUI("Social budget...", Color.gray));
		
		//splitpane containing school budget and gifts budget
		splitPane_9 = new JSplitPane();
		splitPane_9.setResizeWeight(0.5);
		splitPane_7.setRightComponent(splitPane_9);
		
		//school budget text field
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		splitPane_9.setLeftComponent(textField_2);
		textField_2.setColumns(10);
		textField_2.setUI(new JTextFieldHintUI("School budget...", Color.gray));
		
		//gifts budget text field
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 24));
		splitPane_9.setRightComponent(textField_3);
		textField_3.setColumns(10);
		textField_3.setUI(new JTextFieldHintUI("Gifts budget...", Color.gray));
		
		//split pane containing main window - contains amount text field and splitpane 1 
		splitPane = new JSplitPane();
		contentPane.setLayer(splitPane, 2);
		splitPane.setContinuousLayout(true);
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane.setOneTouchExpandable(true);
		contentPane.add(splitPane, "name_226386209794000");
		splitPane.setDividerSize(0);
		
		//amount textfield - to specify amount in $
		amount = new JTextField();
		amount.setUI(new JTextFieldHintUI("Enter amount...", Color.gray));
		amount.setFont(new Font("Tahoma", Font.PLAIN, 40));
		splitPane.setLeftComponent(amount);
		amount.setColumns(10);
		
		//splitpane 1 - contains splitpane 2 and splitpane 3
		JSplitPane splitPane_1 = new JSplitPane();
		splitPane_1.setResizeWeight(0.5);
		splitPane.setRightComponent(splitPane_1);
		splitPane_1.setDividerSize(0);
		
		//splitpane 2 - contains food button and school button
		JSplitPane splitPane_2 = new JSplitPane();
		splitPane_2.setResizeWeight(0.5);
		splitPane_2.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane_1.setLeftComponent(splitPane_2);
		splitPane_2.setDividerSize(0);
		
		//food button - indicate purchase belongs to food category
		btnFood = new JButton("");
		btnFood.setBackground(Color.WHITE);
		btnFood.setIcon(new ImageIcon(MainInterface.class.getResource("/Images/2. Food Button.png")));
		splitPane_2.setLeftComponent(btnFood);
		btnFood.setActionCommand("0");
		btnFood.addActionListener(this);
		btnFood.setBorder(BorderFactory.createEmptyBorder());
		
		//school button - indicate purchase belongs to school category
		btnSchool = new JButton("");
		btnSchool.setIcon(new ImageIcon(MainInterface.class.getResource("/Images/2. School Button.png")));
		splitPane_2.setRightComponent(btnSchool);
		btnSchool.setActionCommand("2");
		btnSchool.addActionListener(this);
		btnSchool.setBorder(BorderFactory.createEmptyBorder());
		
		//splitplane 3 - contains social button and gifts button
		JSplitPane splitPane_3 = new JSplitPane();
		splitPane_3.setResizeWeight(0.5);
		splitPane_3.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane_1.setRightComponent(splitPane_3);
		splitPane_3.setDividerSize(0);
		
		//social button - indicate purchase belongs to social category
		btnSocial = new JButton("");
		btnSocial.setIcon(new ImageIcon(MainInterface.class.getResource("/Images/2. Social Button.png")));
		splitPane_3.setLeftComponent(btnSocial);
		btnSocial.setActionCommand("1");
		btnSocial.addActionListener(this);
		btnSocial.setBorder(BorderFactory.createEmptyBorder());
		
		//gifts button - indicate purchase belongs to gifts category
		btnGifts = new JButton("");
		btnGifts.setIcon(new ImageIcon(MainInterface.class.getResource("/Images/2. Gifts Button.png")));
		splitPane_3.setRightComponent(btnGifts);
		btnGifts.setActionCommand("3");
		btnGifts.addActionListener(this);
		btnGifts.setBorder(BorderFactory.createEmptyBorder());
		
		//splitpane 4 - confirmation - contains textPane and continue button
		splitPane_4 = new JSplitPane();
		splitPane_4.setResizeWeight(0.8);
		splitPane_4.setOrientation(JSplitPane.VERTICAL_SPLIT);
		contentPane.add(splitPane_4, "name_228358756910300");
		splitPane_4.setDividerSize(0);
		
		//text pane - contains information about purchase and budget
		textPane = new JTextPane();
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 40));
		textPane.setText("Your transaction has been completed.\r\n\r\nFood\r\n\r\nYou have used 50% of your budget.");
		splitPane_4.setLeftComponent(textPane);
		
		//continue button - return to main window
		btnContinue = new JButton("Continue");
		splitPane_4.setRightComponent(btnContinue);
		btnContinue.setActionCommand("-1");
		btnContinue.addActionListener(this);
		
		//splitpane 5 - budget limit warning - contains txtConfirm and splitpane 6
		splitPane_5 = new JSplitPane();
		splitPane_5.setResizeWeight(0.8);
		splitPane_5.setOrientation(JSplitPane.VERTICAL_SPLIT);
		contentPane.add(splitPane_5, "name_228996040705800");
		splitPane_5.setDividerSize(0);
		
		//warning text with budget information
		txtConfirm = new JTextPane();
		txtConfirm.setFont(new Font("Tahoma", Font.PLAIN, 40));
		txtConfirm.setText("You have used up your budget in this category.\r\n\r\nDo you still want to complete your purchase?");
		splitPane_5.setLeftComponent(txtConfirm);
		
		//splitpane 6 - contains confirm purchase and cancel purchase buttons
		splitPane_6 = new JSplitPane();
		splitPane_6.setResizeWeight(0.5);
		splitPane_5.setRightComponent(splitPane_6);
		splitPane_6.setDividerSize(0);
		
		//confirm purchase button - continues with purchase and goes to confirmation screen
		btnConfirmPurchase = new JButton("Confirm purchase");
		btnConfirmPurchase.setFont(new Font("Tahoma", Font.PLAIN, 13));
		splitPane_6.setLeftComponent(btnConfirmPurchase);
		btnConfirmPurchase.setActionCommand("100");
		btnConfirmPurchase.addActionListener(this);
		
		//cancel purchase button - cancels purchase and returns to main screen
		btnCancelPurchase = new JButton("Cancel purchase");
		splitPane_6.setRightComponent(btnCancelPurchase);
		btnCancelPurchase.setActionCommand("-100");
		btnCancelPurchase.addActionListener(this);
		
		
	}
	
	//starts with the setup window
	public void start() {
		
		setVisible(true);
		
	}
	
	//performs actions initiated by user clicking buttons
	public void actionPerformed(ActionEvent e) {
		
		//hides main window
		splitPane.setVisible(false);
		
		//gets action command
		int cat = Integer.parseInt(e.getActionCommand());
		
		if(cat < 4 && cat >= 0) {
			
			evalPurchase(cat);
			
		}
		
		evalAction(cat);
		
	}
	
	//Evaluates immediate purchases (clicking a category in the main window)
	//Will change the window to the warning or confirmation window
	public void evalPurchase(int cat) {
		
		//amount spent
		int amt;
		
		try {
			
			amt = Integer.parseInt(amount.getText());
			
		} catch(Exception ex) {
			
			amt = 0;
			
		}
		
		//what category is the purchase in?
		String category = "";
		
		switch (cat) {
		
		case 0:
			
			category = "Food";
			
			break;
			
		case 1:
			
			category = "Social";
			
			break;
			
		case 2:
			
			category = "School";
			
			break;
			
		case 3:
			
			category = "Gifts";
			
			break;
		
		}
		
		//get percentage of budget used
		int per = budget.purchase(cat, amt);
		
		//if exceeded limit of budget go to warning page
		if (per > 100) {
			
			splitPane_5.setVisible(true);
			budget.lastPer = per;
			budget.lastCat = category;
			budget.lastAmt = amt;
			
			String text = "This purchase would exceed your " + category + " budget by " + (per - 100) + "%. \n\nAre you sure you want to " +
			       "complete your purchase?";
			
			txtConfirm.setText(text);
			
			return;
			
		}
		
		//budget not exceeded, show confirmation
		splitPane_4.setVisible(true);
		
		String text = "Your transaction has been completed. \nYou paid $" + amt + ". \n\n" + category + "\n\n" + per + "% of budget used";
		
		textPane.setText(text);
		
	}
	
	//Evaluates any action that is not an immediate purchase from the main window
	//Handles setting up budget, confirming or cancelling purchases, or returning to main window
	public void evalAction(int cat) {
		
		switch(cat) {
		
		//go back to main window
		case -1:
			
			splitPane_4.setVisible(false);
			splitPane.setVisible(true);
			
			amount.setText("");
			
			break;
		
		//cancelled purchase, return to main window
		case -100:
			
			splitPane_5.setVisible(false);
			splitPane.setVisible(true);
			
			amount.setText("");
			
			break;
			
		//confirmed purches, continue to confirmation
		case 100:
			
			splitPane_5.setVisible(false);
			splitPane_4.setVisible(true);
			
			String text = "Your transaction has been completed.\nYou paid $" + budget.lastAmt + ".\n\n" + budget.lastCat + "\n\n" 
			     + budget.lastPer + "% of budget used";
			
			textPane.setText(text);
			
			break;
		
		//initialising budget	
		case 500:
			
			int food = 0;
			int social = 0;
			int school = 0;
			int gifts = 0;
			
			try {
				
				food = Integer.parseInt(textField.getText());
				
			} catch(Exception ex) {
				
			}
			
			try {
				
				social = Integer.parseInt(textField_1.getText());
				
			} catch(Exception ex) {
			}
			
			try {
				
				school = Integer.parseInt(textField_2.getText());
				
			} catch(Exception ex) {
				
			}
			
			try {
				
				gifts = Integer.parseInt(textField_3.getText());
				
			} catch(Exception ex) {
				
			}
			
			budget.init(food,social,school,gifts);
			
			splitPane_10.setVisible(false);
			splitPane.setVisible(true);
			
			break;
		
		}
		
	}
	
}
