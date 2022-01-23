package wct;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WordCount {

	private JFrame frame;
	private JTextField txtWords;
	private JTextField txtResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WordCount window = new WordCount();
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
	public WordCount() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.BLUE);
		frame.getContentPane().setBackground(Color.YELLOW);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblWords = new JLabel("Type your words");
		lblWords.setBounds(43, 66, 116, 16);
		frame.getContentPane().add(lblWords);
		
		txtWords = new JTextField();
		txtWords.setBounds(171, 34, 226, 80);
		frame.getContentPane().add(txtWords);
		txtWords.setColumns(10);
		
		JButton btnCountWords = new JButton("Count words");
		btnCountWords.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String words;
				words = txtWords.getText().trim();
				int count = 0, idx = 0;
				
				
				if (words.length() == 0) {
					txtResult.setText(String.valueOf(count));
				}
				else {
					count = 1;
					for(; idx < words.length(); idx++) {
						if (words.charAt(idx) == ' ' && words.charAt(idx-1) != ' ') {
							count++;
						}
					}
				
					txtResult.setText(String.valueOf(count));
				}
				
			}
		});
		btnCountWords.setBackground(Color.CYAN);
		btnCountWords.setForeground(Color.MAGENTA);
		btnCountWords.setBounds(46, 133, 352, 36);
		btnCountWords.setOpaque(true);
		frame.getContentPane().add(btnCountWords);
		
		txtResult = new JTextField();
		txtResult.setBounds(236, 194, 116, 26);
		frame.getContentPane().add(txtResult);
		txtResult.setColumns(10);
		
		JLabel lblTotalWords = new JLabel("Total Words");
		lblTotalWords.setBounds(131, 199, 93, 16);
		frame.getContentPane().add(lblTotalWords);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtWords.setText(null);
				txtResult.setText(null);
			}
		});
		btnClear.setBackground(Color.BLUE);
		btnClear.setForeground(Color.BLUE);
		btnClear.setBounds(42, 232, 117, 40);
		frame.getContentPane().add(btnClear);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBackground(Color.RED);
		btnExit.setForeground(Color.RED);
		btnExit.setBounds(280, 232, 117, 40);
		frame.getContentPane().add(btnExit);
		
		JLabel lblNewLabel_2 = new JLabel("Word Count Tool");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(104, 6, 221, 16);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
