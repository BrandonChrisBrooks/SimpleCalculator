import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;


public class Calculator {

	private JFrame frame;
	private final JButton b0 = new JButton("0");
	private final JButton bdec = new JButton(".");
	private final JButton beq = new JButton("=");
	private final JButton b3 = new JButton("3");
	private final JButton b2 = new JButton("2");
	private final JButton b1 = new JButton("1");
	private final JButton b4 = new JButton("4");
	private final JButton b5 = new JButton("5");
	private final JButton b6 = new JButton("6");
	private final JButton b9 = new JButton("9");
	private final JButton b8 = new JButton("8");
	private final JButton b7 = new JButton("7");
	private final JButton bmul = new JButton("x");
	private final JButton bdiv = new JButton("/");
	private final JButton badd = new JButton("+");
	private final JButton bsub = new JButton("-");
	private final JTextField textField = new JTextField();

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
		textField.setBounds(30, 10, 236, 50);
		textField.setColumns(10);
		frame = new JFrame();
		frame.setBounds(100, 100, 301, 292);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		b0.setBounds(30, 190, 50, 25);
		
		frame.getContentPane().add(b0);
		bdec.setFont(bdec.getFont().deriveFont(bdec.getFont().getStyle() | Font.BOLD));
		bdec.setVerticalAlignment(SwingConstants.TOP);
		bdec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		bdec.setBounds(92, 190, 50, 25);
		
		frame.getContentPane().add(bdec);
		beq.setBounds(154, 190, 50, 25);
		
		frame.getContentPane().add(beq);
		b1.setBounds(30, 152, 50, 25);
		
		frame.getContentPane().add(b1);
		b2.setBounds(92, 152, 50, 25);
		
		frame.getContentPane().add(b2);
		b3.setBounds(154, 152, 50, 25);
		
		frame.getContentPane().add(b3);
		b4.setBounds(30, 114, 50, 25);
		
		frame.getContentPane().add(b4);
		b5.setBounds(92, 114, 50, 25);
		
		frame.getContentPane().add(b5);
		b6.setBounds(154, 114, 50, 25);
		
		frame.getContentPane().add(b6);
		b7.setBounds(30, 76, 50, 25);
		
		frame.getContentPane().add(b7);
		b8.setBounds(92, 76, 50, 25);
		
		frame.getContentPane().add(b8);
		b9.setBounds(154, 76, 50, 25);
		
		frame.getContentPane().add(b9);

		bmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		bmul.setBounds(216, 114, 50, 25);
		
		frame.getContentPane().add(bmul);
		bdiv.setBounds(216, 76, 50, 25);
		
		frame.getContentPane().add(bdiv);
		badd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		badd.setBounds(216, 190, 50, 25);
		
		frame.getContentPane().add(badd);
		bsub.setBounds(216, 152, 50, 25);
		
		frame.getContentPane().add(bsub);
		
		frame.getContentPane().add(textField);
	}

}
