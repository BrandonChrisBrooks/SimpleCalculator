import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;


public class Calculator {

	private JFrame frame;
	private final JButton b0 = new JButton("0");
	private final JButton b1 = new JButton("1");
	private final JButton b2 = new JButton("2");
	private final JButton b3 = new JButton("3");
	private final JButton b4 = new JButton("4");
	private final JButton b5 = new JButton("5");
	private final JButton b6 = new JButton("6");
	private final JButton b7 = new JButton("7");
	private final JButton b8 = new JButton("8");
	private final JButton b9 = new JButton("9");
	private final JButton bdec = new JButton(".");
	private final JButton badd = new JButton("+");
	private final JButton bsub = new JButton("-");
	private final JButton bmul = new JButton("x");
	private final JButton bdiv = new JButton("/");
	private final JButton beq = new JButton("=");
	private final JButton bans = new JButton("Ans");
	private final JButton bdel = new JButton("Del");
	private final JButton bclr = new JButton("Clr");
	private final JTextField onScreen = new JTextField();
	
	private double input_1, input_2, result;	
	static int operation;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		onScreen.setBackground(Color.WHITE);
		onScreen.setEditable(false);
		onScreen.setHorizontalAlignment(SwingConstants.RIGHT);
		onScreen.setBounds(12, 13, 236, 50);
		onScreen.setColumns(10);
		frame = new JFrame();
		frame.setBounds(0, -22, 281, 308);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		b0.setBounds(12, 191, 50, 25);
		frame.getContentPane().add(b0);		
		
		b1.setBounds(12, 153, 50, 25);
		frame.getContentPane().add(b1);
	
		b2.setBounds(74, 153, 50, 25);	
		frame.getContentPane().add(b2);
		
		b3.setBounds(136, 153, 50, 25);
		frame.getContentPane().add(b3);
		
		b4.setBounds(12, 115, 50, 25);
		frame.getContentPane().add(b4);
		
		b5.setBounds(74, 115, 50, 25);
		frame.getContentPane().add(b5);
		
		b6.setBounds(136, 115, 50, 25);
		frame.getContentPane().add(b6);
		
		b7.setBounds(12, 77, 50, 25);
		frame.getContentPane().add(b7);
		
		b8.setBounds(74, 77, 50, 25);
		frame.getContentPane().add(b8);
		
		b9.setBounds(136, 77, 50, 25);
		frame.getContentPane().add(b9);
		
		bdec.setFont(bdec.getFont().deriveFont(bdec.getFont().getStyle() | Font.BOLD));
		bdec.setVerticalAlignment(SwingConstants.TOP);

		bdec.setBounds(74, 191, 50, 25);
		frame.getContentPane().add(bdec);
		badd.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		badd.setBounds(198, 191, 50, 25);		
		frame.getContentPane().add(badd);
		bsub.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		bsub.setBounds(198, 153, 50, 25);
		frame.getContentPane().add(bsub);
		
		bmul.setBounds(198, 115, 50, 25);
		frame.getContentPane().add(bmul);
		
		bdiv.setBounds(198, 77, 50, 25);
		frame.getContentPane().add(bdiv);
		
		beq.setBounds(136, 191, 50, 25);
		frame.getContentPane().add(beq);
		
		frame.getContentPane().add(onScreen);
		bans.setBounds(12, 226, 76, 25);
		
		frame.getContentPane().add(bans);
		bdel.setBounds(92, 226, 76, 25);
		
		frame.getContentPane().add(bdel);
		bclr.setBounds(175, 226, 76, 25);
		
		frame.getContentPane().add(bclr);
		
		Calculation();
	}

	/**
	 * Do the calculations
	 */
	private void Calculation(){
		
		//Numbers
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (onScreen.getText().length() != 0 || (onScreen.getText() != "0")){
					//Prevents excessive zeros on the front
					onScreen.setText(onScreen.getText() + "0");
				}
			}
		});
		
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onScreen.setText(onScreen.getText() + "1");
				
			}
		});


		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onScreen.setText(onScreen.getText() + "2");
				
			}
		});

		
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onScreen.setText(onScreen.getText() + "3");
				
			}
		});

		
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onScreen.setText(onScreen.getText() + "4");
				
			}
		});

		
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onScreen.setText(onScreen.getText() + "5");
				
			}
		});

		
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onScreen.setText(onScreen.getText() + "6");
				
			}
		});

		
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onScreen.setText(onScreen.getText() + "7");
				
			}
		});

		
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onScreen.setText(onScreen.getText() + "8");
				
			}
		});

		
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onScreen.setText(onScreen.getText() + "9");
				
			}
		});


		//Decimal
		bdec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (onScreen.getText() != "0"){
					//If there is no previous numbers, add zero for formatting
					onScreen.setText("0.");
				}
				
				if (onScreen.getText().indexOf('.') == -1){
					//Check if there is decimal, if not add one
					onScreen.setText(onScreen.getText()+ '.');
				}	
			}
		});
		//Add operation
		badd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (onScreen.getText().length() != 0){
					//Save the number to do an add operation, if it is an number
					input_1 = Double.parseDouble(onScreen.getText());
					operation = 1;
					onScreen.setText("");
				}
			}
		});
		
		//Subtraction operation
		bsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (onScreen.getText().length() != 0){
					//Save the number to do an add operation, if it is an number
					input_1 = Double.parseDouble(onScreen.getText());
					operation = 2;
					onScreen.setText("");
				}
			}
		});

		//Multiplication operation
		bmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (onScreen.getText().length() != 0){
					//Save the number to do an multiplication operation, if it is an number
					input_1 = Double.parseDouble(onScreen.getText());
					operation = 3;
					onScreen.setText("");
				}				
			}
		});
		
		//Division operation
		bdiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (onScreen.getText().length() != 0){
					//Save the number to do an add operation, if it is an number
					input_1 = Double.parseDouble(onScreen.getText());
					operation = 4;
					onScreen.setText("");
				}
			}
		});
		
		//Equals operation
		beq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (onScreen.getText().length() != 0){
					//Save the number and check which operation to use
					input_2 = Double.parseDouble(onScreen.getText());
					switch(operation){
						case 1:
							result = input_1 + input_2;
							break;
						case 2:
							result = input_1 - input_2;
							break;
						case 3:
							result = input_1 * input_2;
							break;
						case 4:
							if (onScreen.getText() != "0"){
								result = input_1 / input_2;
							}
							else
								//Handles division by zero error
								onScreen.setText("Undefined");
							break;
						
						default:
							result = 0;
					}
					onScreen.setText("" + result);
				
				}
			}
		});		
		
		
		//Uses previous answer for next operation
		bans.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onScreen.setText("" + result);
			}
		});
		

		//Clears the screen
		bclr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onScreen.setText("");
			}
		});
		
		
		//Clears the screen
		bdel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!(onScreen.getText()).isEmpty());
					onScreen.setText(onScreen.getText().substring(0, onScreen.getText().length()-1));
			}
		});
		
		
		
	}
}
