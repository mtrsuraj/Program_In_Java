package org.techinfo;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class LogIN extends JFrame implements ActionListener{
	
	JButton login, singup, clear;
	JTextField cardTextField;
	JPasswordField pinTextField;
	LogIN(){
		setSize(800, 600);
		setTitle("AUTOMATED TELER MACHINE");
		setLayout(null);
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("logo.jpg"));
		Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel label = new JLabel(i3);
		label.setBounds(70, 10, 100, 100);
		add(label);
		JLabel text = new JLabel("Welcome to ATM");
		text.setFont(new Font("Osward", Font.BOLD, 38));
		text.setBounds(190, 40, 400, 40);
		add(text);
		JLabel cardno = new JLabel("Card No:");
		cardno.setFont(new Font("Raleway", Font.BOLD, 28));
		cardno.setBounds(120, 150, 150, 40);
		add(cardno);
		
		cardTextField = new JTextField();
		cardTextField.setBounds(300, 155, 250, 40);
		cardTextField.setFont(new Font("arial", Font.BOLD, 18));
		add(cardTextField);
		
		JLabel pin = new JLabel("PIN:");
		pin.setFont(new Font("Raleway", Font.BOLD, 28));
		pin.setBounds(120, 220, 70, 40);
		add(pin);
		
		pinTextField = new JPasswordField();
		pinTextField.setBounds(300, 225, 250, 40);
		pinTextField.setFont(new Font("Arial", Font.BOLD, 18));
		add(pinTextField);
		
		login = new JButton("SING IN");
		login.setBounds(300, 290, 110, 40);
		login.setBackground(Color.black);
		login.setForeground(Color.white);
		setVisible(true);
		login.addActionListener(this);
		add(login);
		
		clear = new JButton("CLEAR");
		clear.setBounds(440, 290, 110, 40);
		clear.setBackground(Color.black);
		clear.setForeground(Color.white);
		clear.addActionListener(this);
		add(clear);
		
		singup = new JButton("SING UP");
		singup.setBounds(300, 350, 250, 40);
		singup.setBackground(Color.black);
		singup.setForeground(Color.white);
		singup.addActionListener(this);
		add(singup);
		
		getContentPane().setBackground(Color.white);
		setVisible(true);
		setLocation(550, 200);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==clear) {
			cardTextField.setText("");
			pinTextField.setText("");
			
		}else if(e.getSource()==login) {
			
		}else if(e.getSource()==singup) {
			setVisible(false);
			new SingUpOne().setVisible(true);
			
		}
		
		
	}
	public static void main(String[] args) {
		new LogIN();
	}
	

}
