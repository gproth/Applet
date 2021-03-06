package edu.elon.template.applet;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorApplet extends JApplet {
	private JFrame frame;
	private JPanel buttonPanel;
	private JTextField displayField;
	private double total;
	private String input;
	private String op;
	private boolean isResult;

	public void CalculatorApplet() {
		isResult = false;
		input = "0";
		total = 0.0;
		op = "";

	}

	public void init() {
		displayField = new JTextField(input);
		buttonPanel = createButtons();
		JPanel main = new JPanel(new GridLayout(2, 0));
		main.add(displayField);
		main.add(buttonPanel);
		add(main);
	}

	public void createPane() {

	}

	public JPanel createButtons() {
		JPanel panel = new JPanel(new GridLayout(4, 4));

		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (isResult) {
					total = 0.0;
					isResult = false;
				}
				if (input == null) {
					input = "" + 0;
				} else {
					input = input + 0;
				}
				displayField.setText(input);

			}

		});
		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (isResult) {
					total = 0.0;
					isResult = false;
				}
				if (input == null) {
					input = "" + 1;
				} else {
					input = input + 1;
				}
				displayField.setText(input);
			}

		});

		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (isResult) {
					total = 0.0;
					isResult = false;
				}
				if (input == null) {
					input = "" + 2;
				} else {
					input = input + 2;
				}
				displayField.setText(input);
			}

		});

		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (isResult) {
					total = 0.0;
					isResult = false;
				}
				if (input == null) {
					input = "" + 3;
				} else {
					input = input + 3;
				}
				displayField.setText(input);
			}

		});

		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (isResult) {
					total = 0.0;
					isResult = false;
				}
				if (input == null) {
					input = "" + 4;
				} else {
					input = input + 4;
				}
				displayField.setText(input);
			}

		});

		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (isResult) {
					total = 0.0;
					isResult = false;
				}
				if (input == null) {
					input = "" + 5;
				} else {
					input = input + 5;
				}
				displayField.setText(input);
			}

		});

		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (isResult) {
					total = 0.0;
					isResult = false;
				}
				if (input == null) {
					input = "" + 6;
				} else {
					input = input + 6;
				}
				displayField.setText(input);
			}

		});

		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (isResult) {
					total = 0.0;
					isResult = false;
				}
				if (input == null) {
					input = "" + 7;
				} else {
					input = input + 7;
				}
				displayField.setText(input);
			}

		});

		JButton button8 = new JButton("8");
		button7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (isResult) {
					total = 0.0;
					isResult = false;
				}
				if (input == null) {
					input = "" + 8;
				} else {
					input = input + 8;
				}
				displayField.setText(input);

			}

		});

		JButton button9 = new JButton("9");
		button7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (isResult) {
					total = 0.0;
					isResult = false;
				}
				if (input == null) {
					input = "" + 9;
				} else {
					input = input + 9;
				}
				displayField.setText(input);
			}

		});

		JButton buttonDot = new JButton(".");
		button7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (isResult) {
					total = 0.0;
					isResult = false;
				}
				if (input == null) {
					input = "" + ".";
				} else {
					input = input + ".";
				}
				displayField.setText(input);
			}

		});

		JButton buttonEquals = new JButton("=");
		buttonEquals.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				runCalcs();
				displayField.setText("" + total);
				op = "";
				isResult = true;
				input = "";
			}

		});

		JButton buttonPlus = new JButton("+");
		buttonPlus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (isResult) {
					isResult = false;
				} else {
					if (total == 0.0) {
						total = Double.parseDouble(input);
						System.out.println(total);
					} else {
						runCalcs();
					}
					op = "+";
					input = "";
				}
			}

		});

		JButton buttonMinus = new JButton("-");
		buttonMinus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (isResult) {
					isResult = false;
				} else {
					if (total == 0.0) {
						total = Double.parseDouble(input);
					} else {
						runCalcs();
					}
					op = "-";
					input = "";
				}
			}

		});

		JButton buttonDiv = new JButton("/");
		buttonDiv.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (isResult) {
					isResult = false;
				} else {
					if (total == 0.0) {
						total = Double.parseDouble(input);
					} else {
						runCalcs();
					}
					op = "/";
					input = "";
				}
			}

		});

		JButton buttonMult = new JButton("*");
		buttonMult.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (isResult) {
					isResult = false;
				} else {
					if (total == 0.0) {
						total = Double.parseDouble(input);
					} else {
						runCalcs();
					}
					op = "*";
					input = "";
				}
			}

		});
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(buttonDiv);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(buttonMult);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(buttonMinus);
		panel.add(button0);
		panel.add(buttonDot);
		panel.add(buttonEquals);
		panel.add(buttonPlus);
		return panel;

	}

	public void runCalcs() {
		if (op.equals("+")) {
			total = total + Double.parseDouble(input);
		} else if (op.equals("-")) {
			total = total - Double.parseDouble(input);
		} else if (op.equals("/")) {
			total = total / Double.parseDouble(input);
		} else {
			total = total * Double.parseDouble(input);
		}
	}
}
