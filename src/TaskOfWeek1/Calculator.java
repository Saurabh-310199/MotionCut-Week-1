package TaskOfWeek1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Calculator {

	private JFrame frame;
	private JTextField cal;
	
	
	double first;
	double second;
	double result;
	String operation;
	String ans;
	

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
		frame = new JFrame();
		frame.setBounds(100, 100, 381, 529);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		cal = new JTextField();
		cal.setFont(new Font("Tahoma", Font.BOLD, 18));
		cal.setBounds(10, 57, 348, 97);
		frame.getContentPane().add(cal);
		cal.setColumns(10);
		
		JButton backspace = new JButton("\uF0E7");
		backspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			String back= null;
			if(cal.getText().length()>0){
			StringBuilder str = new StringBuilder(cal.getText());
			str.deleteCharAt(cal.getText().length()-1);
			back= str.toString();
			cal.setText(back);
			}
			
			}
		});
		backspace.setFont(new Font("Wingdings", Font.BOLD, 18));
		backspace.setBounds(10, 164, 62, 44);
		frame.getContentPane().add(backspace);
		
		final JButton seven = new JButton("7");
		seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String number = cal.getText()+seven.getText();
				cal.setText(number);
			}
		});
		seven.setFont(new Font("Tahoma", Font.BOLD, 18));
		seven.setBounds(10, 230, 62, 44);
		frame.getContentPane().add(seven);
		
		final JButton four = new JButton("4");
		four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String number = cal.getText()+four.getText();
				cal.setText(number);
			}
		});
		four.setFont(new Font("Tahoma", Font.BOLD, 18));
		four.setBounds(10, 295, 62, 44);
		frame.getContentPane().add(four);
		
		final JButton one = new JButton("1");
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = cal.getText()+one.getText();
				cal.setText(number);
			}
		});
		one.setFont(new Font("Tahoma", Font.BOLD, 18));
		one.setBounds(10, 360, 62, 44);
		frame.getContentPane().add(one);
		
		JButton cut = new JButton("C");
		cut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			cal.setText(null);
			}
		});
		cut.setFont(new Font("Tahoma", Font.BOLD, 18));
		cut.setBounds(101, 164, 62, 44);
		frame.getContentPane().add(cut);
		
		final JButton zeroo = new JButton("00");
		zeroo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String number = cal.getText()+zeroo.getText();
				cal.setText(number);
			}
		});
		zeroo.setFont(new Font("Tahoma", Font.BOLD, 18));
		zeroo.setBounds(194, 164, 62, 44);
		frame.getContentPane().add(zeroo);
		
		final JButton eight = new JButton("8");
		eight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String number = cal.getText()+eight.getText();
				cal.setText(number);
			}
		});
		eight.setFont(new Font("Tahoma", Font.BOLD, 18));
		eight.setBounds(101, 230, 62, 44);
		frame.getContentPane().add(eight);
		
		final JButton nine = new JButton("9");
		nine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String number = cal.getText()+nine.getText();
				cal.setText(number);
			}
		});
		nine.setFont(new Font("Tahoma", Font.BOLD, 18));
		nine.setBounds(194, 230, 62, 44);
		frame.getContentPane().add(nine);
		
		final JButton five = new JButton("5");
		five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String number = cal.getText()+five.getText();
				cal.setText(number);
			}
		});
		five.setFont(new Font("Tahoma", Font.BOLD, 18));
		five.setBounds(101, 295, 62, 44);
		frame.getContentPane().add(five);
		
		final JButton six = new JButton("6");
		six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String number = cal.getText()+six.getText();
				cal.setText(number);
			}
			
		});
		six.setFont(new Font("Tahoma", Font.BOLD, 18));
		six.setBounds(194, 295, 62, 44);
		frame.getContentPane().add(six);
		
		final JButton two = new JButton("2");
		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String number = cal.getText()+two.getText();
				cal.setText(number);
			}
		});
		two.setFont(new Font("Tahoma", Font.BOLD, 18));
		two.setBounds(101, 360, 62, 44);
		frame.getContentPane().add(two);
		
		final JButton three = new JButton("3");
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String number = cal.getText()+three.getText();
				cal.setText(number);
			}
		});
		three.setFont(new Font("Tahoma", Font.BOLD, 18));
		three.setBounds(194, 360, 62, 44);
		frame.getContentPane().add(three);
		
		final JButton zero = new JButton("0");
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String number = cal.getText()+zero.getText();
				cal.setText(number);
			}
		});
		zero.setFont(new Font("Tahoma", Font.BOLD, 18));
		zero.setBounds(10, 431, 153, 44);
		frame.getContentPane().add(zero);
		
		final JButton point = new JButton(".");
		point.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String number = cal.getText()+point.getText();
				cal.setText(number);
			}
		});
		point.setFont(new Font("Tahoma", Font.BOLD, 18));
		point.setBounds(194, 431, 62, 44);
		frame.getContentPane().add(point);
		
		JButton add = new JButton("+");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			first= Double.parseDouble(cal.getText());
			cal.setText("");
			operation= "+";
			}
		});
		add.setFont(new Font("Tahoma", Font.BOLD, 18));
		add.setBounds(288, 164, 62, 44);
		frame.getContentPane().add(add);
		
		JButton sub = new JButton("-");
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			first= Double.parseDouble(cal.getText());
			cal.setText("");
			operation= "-";
			
			}
		});
		sub.setFont(new Font("Tahoma", Font.BOLD, 18));
		sub.setBounds(288, 230, 62, 44);
		frame.getContentPane().add(sub);
		
		JButton mul = new JButton("*");
		mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			first= Double.parseDouble(cal.getText());
			cal.setText("");
			operation= "*";
			
			}
		});
		mul.setFont(new Font("Tahoma", Font.BOLD, 18));
		mul.setBounds(288, 295, 62, 44);
		frame.getContentPane().add(mul);
		
		JButton div = new JButton("/");
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			first= Double.parseDouble(cal.getText());
			cal.setText("");
			operation= "/";
			
			}
		});
		div.setFont(new Font("Tahoma", Font.BOLD, 18));
		div.setBounds(288, 360, 62, 44);
		frame.getContentPane().add(div);
		
		JButton isto = new JButton("=");
		isto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				second=Double.parseDouble(cal.getText());
				if(operation=="+") {
		        	result=first+ second;
		        	ans= Double.toString(result);	
					cal.setText(ans);
				}else if(operation=="-") {
					result=first-second;
					ans= Double.toString(result);	
					cal.setText(ans);
				}else if(operation=="*") {
					result=first+ second;
					ans= Double.toString(result);	
					cal.setText(ans);
				}else if(operation=="/") {
					if (second != 0) {
			            result = first / second;
			            ans= Double.toString(result);	
						cal.setText(ans);
			        } else {
			   
			        	cal.setText("");
			            
			        }
				}
								
				
			}
		});
		isto.setFont(new Font("Tahoma", Font.BOLD, 18));
		isto.setBounds(288, 431, 62, 44);
		frame.getContentPane().add(isto);
	}
}
