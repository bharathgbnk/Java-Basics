package percentagecalculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PercentageCalculator {

	private JFrame frame;
	private JTextField txt_1;
	private JTextField txt_2;
	private JTextField txt_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PercentageCalculator window = new PercentageCalculator();
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
	public PercentageCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(10, -22, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label_1 = new JLabel("What is");
		label_1.setBounds(52, 69, 61, 16);
		frame.getContentPane().add(label_1);
		
		txt_1 = new JTextField();
		txt_1.setBounds(110, 64, 89, 26);
		frame.getContentPane().add(txt_1);
		txt_1.setColumns(10);
		
		JLabel label_2 = new JLabel("% of");
		label_2.setBounds(211, 69, 61, 16);
		frame.getContentPane().add(label_2);
		
		txt_2 = new JTextField();
		txt_2.setBounds(252, 64, 89, 26);
		frame.getContentPane().add(txt_2);
		txt_2.setColumns(10);
		
		JLabel label_3 = new JLabel("?");
		label_3.setBounds(341, 69, 61, 16);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("Percentage=");
		label_4.setBounds(118, 119, 99, 16);
		frame.getContentPane().add(label_4);
		
		txt_3 = new JTextField();
		txt_3.setBounds(199, 114, 130, 26);
		frame.getContentPane().add(txt_3);
		txt_3.setColumns(10);
		
		JButton exit_btn = new JButton("Exit");
		exit_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		JButton clear_btn = new JButton("Clear");
		clear_btn.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				txt_1.setText(null);
				txt_2.setText(null);
				txt_3.setText(null);
			}
		});
		
		JButton cal_btn = new JButton("Calculate");
		cal_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float inp1, inp2, result;
				inp1 = Float.parseFloat(txt_1.getText());
				inp2 = Float.parseFloat(txt_2.getText());
				result = inp2 / 100 * inp1;
				txt_3.setText(String.valueOf(result));
				
			}
		});
		cal_btn.setBounds(100, 152, 117, 29);
		frame.getContentPane().add(cal_btn);
		clear_btn.setBounds(212, 152, 117, 29);
		frame.getContentPane().add(clear_btn);
		exit_btn.setBounds(163, 206, 117, 29);
		frame.getContentPane().add(exit_btn);
	}
}
