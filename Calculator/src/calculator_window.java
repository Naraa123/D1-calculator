import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.SystemColor;

public class calculator_window {

	private JFrame frame;
	private JTextField txt;
	
	private double num1, num2;
	private double result;
	private String temdeg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator_window window = new calculator_window();
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
	public calculator_window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Calculator calc = new Calculator();
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setResizable(false);
		frame.setTitle("Тооны машин");
		frame.setBounds(800, 50, 325, 595);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txt = new JTextField();
		txt.setFont(new Font("Verdana", Font.PLAIN, 17));
		txt.setForeground(Color.WHITE);
		txt.setHorizontalAlignment(SwingConstants.RIGHT);
		txt.setBackground(Color.DARK_GRAY);
		txt.setBounds(10, 11, 290, 75);
		frame.getContentPane().add(txt);
		txt.setColumns(10);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txt.getText().isBlank())
					txt.setText(btn0.getText());
				else if(!txt.getText().equals("0"))
					txt.setText(txt.getText() + btn0.getText());
			}
		});
		btn0.setBackground(Color.LIGHT_GRAY);
		btn0.setForeground(Color.DARK_GRAY);
		btn0.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btn0.setBounds(85, 485, 65, 60);
		frame.getContentPane().add(btn0);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txt.getText().equals("0"))
					txt.setText(btn1.getText());
				else
					txt.setText(txt.getText() + btn1.getText());
			}
		});
		btn1.setBackground(Color.LIGHT_GRAY);
		btn1.setForeground(Color.DARK_GRAY);
		btn1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btn1.setBounds(10, 414, 65, 60);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txt.getText().equals("0"))
					txt.setText(btn2.getText());
				else
					txt.setText(txt.getText() + btn2.getText());
			}
		});
		btn2.setBackground(Color.LIGHT_GRAY);
		btn2.setForeground(Color.DARK_GRAY);
		btn2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btn2.setBounds(85, 414, 65, 60);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txt.getText().equals("0"))
					txt.setText(btn3.getText());
				else
					txt.setText(txt.getText() + btn3.getText());
			}
		});
		btn3.setBackground(Color.LIGHT_GRAY);
		btn3.setForeground(Color.DARK_GRAY);
		btn3.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btn3.setBounds(160, 414, 65, 60);
		frame.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txt.getText().equals("0"))
					txt.setText(btn4.getText());
				else
					txt.setText(txt.getText() + btn4.getText());
			}
		});
		btn4.setBackground(Color.LIGHT_GRAY);
		btn4.setForeground(Color.DARK_GRAY);
		btn4.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btn4.setBounds(10, 343, 65, 60);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txt.getText().equals("0"))
					txt.setText(btn5.getText());
				else
					txt.setText(txt.getText() + btn5.getText());
			}
		});
		btn5.setBackground(Color.LIGHT_GRAY);
		btn5.setForeground(Color.DARK_GRAY);
		btn5.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btn5.setBounds(85, 343, 65, 60);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txt.getText().equals("0"))
					txt.setText(btn6.getText());
				else
					txt.setText(txt.getText() + btn6.getText());
			}
		});
		btn6.setBackground(Color.LIGHT_GRAY);
		btn6.setForeground(Color.DARK_GRAY);
		btn6.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btn6.setBounds(160, 343, 65, 60);
		frame.getContentPane().add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txt.getText().equals("0"))
					txt.setText(btn7.getText());
				else
					txt.setText(txt.getText() + btn7.getText());
			}
		});
		btn7.setBackground(Color.LIGHT_GRAY);
		btn7.setForeground(Color.DARK_GRAY);
		btn7.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn7.setBounds(10, 272, 65, 60);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txt.getText().equals("0"))
					txt.setText(btn8.getText());
				else
					txt.setText(txt.getText() + btn8.getText());
			}
		});
		btn8.setBackground(Color.LIGHT_GRAY);
		btn8.setForeground(Color.DARK_GRAY);
		btn8.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btn8.setBounds(85, 272, 65, 60);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txt.getText().equals("0"))
					txt.setText(btn9.getText());
				else
					txt.setText(txt.getText() + btn9.getText());
			}
		});
		btn9.setBackground(Color.LIGHT_GRAY);
		btn9.setForeground(Color.DARK_GRAY);
		btn9.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btn9.setBounds(160, 272, 65, 60);
		frame.getContentPane().add(btn9);
		
		JButton btn_araw = new JButton(".");
		btn_araw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!txt.getText().isBlank() && !txt.getText().contains("."))
					txt.setText(txt.getText() + ".");
			}
		});
		btn_araw.setBackground(Color.LIGHT_GRAY);
		btn_araw.setForeground(Color.DARK_GRAY);
		btn_araw.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btn_araw.setBounds(160, 485, 65, 60);
		frame.getContentPane().add(btn_araw);
		
		JButton btn_plusminus = new JButton("+/-");
		btn_plusminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!txt.getText().isBlank()) {
					num1 = Double.parseDouble(txt.getText());
					result = calc.plusOrMinus(num1);
					txt.setText(String.valueOf(result));
				}
			}
		});
		btn_plusminus.setForeground(Color.BLACK);
		btn_plusminus.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btn_plusminus.setBackground(Color.LIGHT_GRAY);
		btn_plusminus.setBounds(235, 130, 65, 60);
		frame.getContentPane().add(btn_plusminus);
		
		JButton btn_h = new JButton("%");
		btn_h.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!txt.getText().isBlank()) {
					num1 = Double.parseDouble(txt.getText());
					//num2 = Double.parseDouble(txt.getText());
					//result = calc.huwi(num1, num2);
					//txt.setText(String.valueOf(result) + "*" + num2);
					temdeg = "%";
					
				}
				txt.setText("");
			}
		});
		btn_h.setBackground(Color.LIGHT_GRAY);
		btn_h.setForeground(Color.DARK_GRAY);
		btn_h.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btn_h.setBounds(10, 485, 65, 60);
		frame.getContentPane().add(btn_h);
		
		JButton btn_nemeh = new JButton("+");
		btn_nemeh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!txt.getText().isBlank()) {
					num1 = Double.parseDouble(txt.getText());
					temdeg = "+";
				}
				txt.setText("");
			}
		});
		btn_nemeh.setBackground(Color.LIGHT_GRAY);
		btn_nemeh.setForeground(Color.DARK_GRAY);
		btn_nemeh.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btn_nemeh.setBounds(235, 343, 65, 60);
		frame.getContentPane().add(btn_nemeh);
		
		JButton btn_tentsuu = new JButton("=");
		btn_tentsuu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(temdeg) {
				case "+": {
					num2 = Double.parseDouble(txt.getText());
					result = calc.nemeh(num1, num2);
					txt.setText(String.valueOf(result));
					break;
				}
				case "-": {
					num2 = Double.parseDouble(txt.getText());
					result = calc.hasah(num1, num2);
					txt.setText(String.valueOf(result));
					break;
				}
				case "*": {
					num2 = Double.parseDouble(txt.getText());
					result = calc.urjih(num1, num2);
					txt.setText(String.valueOf(result));
					break;
				}
				case "/": {
					num2 = Double.parseDouble(txt.getText());
					result = calc.huwaah(num1, num2);
					txt.setText(String.valueOf(result));
					break;
				}
				case "%": {
					num2 = Double.parseDouble(txt.getText());
					result = calc.huwi(num1, num2);
					txt.setText(String.valueOf(result));
					break;
				}
				}
			}
		});
		btn_tentsuu.setBackground(Color.LIGHT_GRAY);
		btn_tentsuu.setForeground(Color.DARK_GRAY);
		btn_tentsuu.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btn_tentsuu.setBounds(235, 414, 65, 131);
		frame.getContentPane().add(btn_tentsuu);
		
		
		JButton btn_factorial = new JButton("X!");
		btn_factorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!txt.getText().isBlank()) {
					num1 = Double.parseDouble(txt.getText());
					result = calc.fact(num1);
					txt.setText(String.valueOf(result));
				}
			}
		});
		btn_factorial.setBackground(Color.LIGHT_GRAY);
		btn_factorial.setForeground(Color.BLACK);
		btn_factorial.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btn_factorial.setBounds(10, 130, 65, 60);
		frame.getContentPane().add(btn_factorial);
		
		
		
		JButton btn_zereg = new JButton("X2");
		btn_zereg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!txt.getText().isBlank()) {
					num1 = Double.parseDouble(txt.getText());
					result = calc.zereg2(num1);
					txt.setText(String.valueOf(result));
				}
			}
		});
		btn_zereg.setBackground(Color.LIGHT_GRAY);
		btn_zereg.setForeground(Color.DARK_GRAY);
		btn_zereg.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btn_zereg.setBounds(85, 130, 65, 60);
		frame.getContentPane().add(btn_zereg);
		
		
		
		JButton btn_3zereg = new JButton("X3");
		btn_3zereg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!txt.getText().isBlank()) {
					num1 = Double.parseDouble(txt.getText());
					result = calc.zereg3(num1);
					txt.setText(String.valueOf(result));
				}
			}
		});
		btn_3zereg.setBackground(Color.LIGHT_GRAY);
		btn_3zereg.setForeground(Color.DARK_GRAY);
		btn_3zereg.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btn_3zereg.setBounds(160, 130, 65, 60);
		frame.getContentPane().add(btn_3zereg);
		
		
		JButton btn_clean = new JButton("C");
		btn_clean.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt.setText("");
			}
		});
		btn_clean.setForeground(Color.BLACK);
		btn_clean.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btn_clean.setBackground(Color.LIGHT_GRAY);
		btn_clean.setBounds(10, 201, 65, 60);
		frame.getContentPane().add(btn_clean);
		
		
		JButton btn_hasah = new JButton("-");
		btn_hasah.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!txt.getText().isBlank()) {
					num1 = Double.parseDouble(txt.getText());
					temdeg = "-";
				}
				txt.setText("");
			}
		});
		btn_hasah.setBackground(Color.LIGHT_GRAY);
		btn_hasah.setForeground(Color.DARK_GRAY);
		btn_hasah.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btn_hasah.setBounds(235, 272, 65, 60);
		frame.getContentPane().add(btn_hasah);
		
		JButton btn_urjih = new JButton("*");
		btn_urjih.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!txt.getText().isBlank()) {
					num1 = Double.parseDouble(txt.getText());
					temdeg = "*";
				}
				txt.setText("");
			}
		});
		btn_urjih.setBackground(Color.LIGHT_GRAY);
		btn_urjih.setForeground(Color.DARK_GRAY);
		btn_urjih.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btn_urjih.setBounds(160, 201, 65, 60);
		frame.getContentPane().add(btn_urjih);
		
		JButton btn_huwaah = new JButton("/");
		btn_huwaah.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!txt.getText().isBlank()) {
					num1 = Double.parseDouble(txt.getText());
					temdeg = "/";
				}
				txt.setText("");
			}
		});
		btn_huwaah.setBackground(Color.LIGHT_GRAY);
		btn_huwaah.setForeground(Color.DARK_GRAY);
		btn_huwaah.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btn_huwaah.setBounds(85, 201, 65, 60);
		frame.getContentPane().add(btn_huwaah);
		
		JButton btn1hasah = new JButton("X");
		btn1hasah.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!txt.getText().isBlank()) {
					StringBuilder back = new StringBuilder(txt.getText());
					back.deleteCharAt(txt.getText().length() - 1);
					//num1 = txt.getText().length() - 1;
					txt.setText(String.valueOf(back));
				}
			}
		});
		btn1hasah.setForeground(Color.DARK_GRAY);
		btn1hasah.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btn1hasah.setBackground(Color.LIGHT_GRAY);
		btn1hasah.setBounds(235, 201, 65, 60);
		frame.getContentPane().add(btn1hasah);
		
		
	}
}
