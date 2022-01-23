package heightconvertor;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HeightConvertor {

	private JFrame frame;
	private JTextField txt_feet;
	private JTextField txt_inch;
	private JTextField txt_result;
	private final float INCH_TO_CM_FACTOR = (float)2.54;
	private JButton btn_clear;
	private JButton btn_exit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HeightConvertor window = new HeightConvertor();
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
	public HeightConvertor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 250, 250));
		frame.getContentPane().setForeground(Color.CYAN);
		frame.setForeground(Color.WHITE);
		frame.setBackground(UIManager.getColor("Desktop.background"));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lbl_feet = new JLabel("Feet");
		lbl_feet.setFont(new Font("Verdana", Font.BOLD, 13));
		lbl_feet.setBounds(81, 39, 61, 16);
		frame.getContentPane().add(lbl_feet);
		
		txt_feet = new JTextField();
		txt_feet.setBounds(170, 29, 130, 39);
		frame.getContentPane().add(txt_feet);
		txt_feet.setColumns(10);
		
		JLabel lbl_inch = new JLabel("Inches");
		lbl_inch.setFont(new Font("Verdana", Font.BOLD, 13));
		lbl_inch.setBounds(81, 97, 61, 16);
		frame.getContentPane().add(lbl_inch);
		
		txt_inch = new JTextField();
		txt_inch.setBounds(170, 87, 130, 39);
		frame.getContentPane().add(txt_inch);
		txt_inch.setColumns(10);
		
		JButton btn_convert = new JButton("Convert");
		btn_convert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float feet, inches, result;
				feet = Float.parseFloat(txt_feet.getText());
				inches = Float.parseFloat(txt_inch.getText());
				
				result = (feet * 12 + inches) * INCH_TO_CM_FACTOR;
				
				txt_result.setText(String.valueOf(result));
				
			}
		});
		
		txt_result = new JTextField();
		txt_result.setBackground(new Color(255, 255, 255));
		txt_result.setForeground(new Color(0, 128, 0));
		txt_result.setBounds(226, 188, 130, 26);
		frame.getContentPane().add(txt_result);
		txt_result.setColumns(10);
		btn_convert.setForeground(new Color(255, 69, 0));
		btn_convert.setBackground(new Color(255, 99, 71));
		btn_convert.setBounds(81, 147, 270, 29);
		frame.getContentPane().add(btn_convert);
		
		JLabel lbl_cm = new JLabel("Centimeters");
		lbl_cm.setFont(new Font("Verdana", Font.BOLD, 13));
		lbl_cm.setBounds(81, 193, 101, 16);
		frame.getContentPane().add(lbl_cm);
		
		btn_clear = new JButton("Clear");
		btn_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_feet.setText(null);
				txt_inch.setText(null);
				txt_result.setText(null);
			}
		});
		btn_clear.setBounds(37, 226, 117, 29);
		frame.getContentPane().add(btn_clear);
		
		btn_exit = new JButton("Exit");
		btn_exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btn_exit.setBounds(300, 226, 117, 29);
		frame.getContentPane().add(btn_exit);
	}

}
