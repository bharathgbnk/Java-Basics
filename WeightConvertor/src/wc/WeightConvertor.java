package wc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class WeightConvertor {

	private JFrame frame;
	private JTextField txtOutPounds;
	private JTextField txtInpKg;
	private final double KgToPound = 2.20462;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WeightConvertor window = new WeightConvertor();
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
	public WeightConvertor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtInpKg.setText(null);
				txtOutPounds.setText(null);
			}
		});
		btnClear.setForeground(Color.BLUE);
		btnClear.setBounds(35, 214, 111, 43);
		frame.getContentPane().add(btnClear);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setForeground(Color.RED);
		btnExit.setBounds(300, 214, 117, 43);
		frame.getContentPane().add(btnExit);
		
		txtOutPounds = new JTextField();
		txtOutPounds.setBounds(145, 131, 130, 58);
		frame.getContentPane().add(txtOutPounds);
		txtOutPounds.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Pounds");
		lblNewLabel_1.setBounds(287, 152, 61, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtInpKg = new JTextField();
		txtInpKg.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String kgValue = txtInpKg.getText();
				try {
					double kgs = Double.parseDouble(kgValue);
					double pounds = Math.round(kgs * KgToPound * 1000.0) / 1000.0;
					txtOutPounds.setText(String.valueOf(pounds));
				}
				catch (NumberFormatException exe){
					txtOutPounds.setText("Enter number only!");
				}
				
			}
		});
		txtInpKg.setBounds(145, 46, 130, 58);
		frame.getContentPane().add(txtInpKg);
		txtInpKg.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Kilos to Pound Convertor");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(95, 6, 266, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("KG");
		lblNewLabel.setBounds(287, 67, 61, 16);
		frame.getContentPane().add(lblNewLabel);
	}
}
