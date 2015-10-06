package edu.elon.template.applet;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorApplet extends JApplet{
    private JFrame frame;
    private JPanel buttonPanel;
    private JTextField displayField;
    private double total;
    private String input;
    private String op;
	
	public void CalculatorApplet(){
		
	}
	
	public JFrame createPane(){
		
		
		return frame;
	}
	
	public JPanel createButtons(){
		JPanel panel = new JPanel(new GridLayout(4,4));
		
		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				input = input + 0;
			}
			
		});
		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				input = input + 1;
			}
			
		});
		
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				input = input + 2;
			}
			
		});
		
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				input = input + 3;
			}
			
		});
		
		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				input = input + 4;
			}
			
		});
		
		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				input = input + 5;
			}
			
		});
		
		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				input = input + 6;
			}
			
		});
		
		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				input = input + 7;
			}
			
		});
		
		JButton button8 = new JButton("8");
		
		JButton button9 = new JButton("9");
		
		JButton buttonDot = new JButton(".");
		
		JButton buttonEquals = new JButton("=");
		buttonEquals.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				double in = Double.parseDouble(input);
				if (op.equals("+")){
					
				}
				else if(op.equals("-")){
					
				}
				else if(op.equals("/")){
					
				}
				else{
					
				}
			}
			
		});
		
		JButton buttonPlus = new JButton("+");
		
		JButton buttonMinus = new JButton("-");
		
		JButton buttonDiv = new JButton("*");
		
		JButton buttonMult = new JButton("/");
		buttonMult.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				
					total = Double.parseDouble(input);
					input = "0";
				
			}
			
		});
		return buttonPanel;
		
	}
	
	
	public double runCalcs(){
		return total;
		
	}
}
