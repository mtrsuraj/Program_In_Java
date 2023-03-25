package org.techinfo;


import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

import com.toedter.calendar.JDateChooser;


public class SingUpOne extends JFrame implements ActionListener{
	
	long random;
	JTextField nameTextField,fatherTextField,emailTextField,addressTextField,
	cityTextField,pincodeTextField,stateTextField;
	JButton next;
	JRadioButton male, female, married, unmarried, others;
	JDateChooser dateChooser;
	
	SingUpOne(){
		
		JButton next;
		
		setLayout(null);
		Random ran = new Random();
		long random = (Math.abs(ran.nextLong()%9000L+1000 ));
		
		JLabel formno = new JLabel("APPLICATION FORM NO: " + random);
		formno.setFont(new Font("Raleway", Font.BOLD, 34));
		formno.setBounds(140, 20, 600, 40);
		add(formno);
		
		JLabel personalDetails = new JLabel("Page 1: Personal Details");
		personalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
		personalDetails.setBounds(290, 80, 400, 30);
		add(personalDetails);
		
		JLabel name = new JLabel("Name:" );
		name.setFont(new Font("Raleway", Font.BOLD, 20));
		name.setBounds(100, 140, 100, 30);
		add(name);
		
		nameTextField = new JTextField();
		nameTextField.setBounds(300, 140, 400, 30);
		nameTextField.setFont(new Font("Raleway", Font.BOLD, 20));
		add(nameTextField);
	
		
		JLabel fathername = new JLabel("Father Name:" );
		fathername.setFont(new Font("Raleway", Font.BOLD, 20));
		fathername.setBounds(100, 190, 200, 30);
		add(fathername);
		
		fatherTextField = new JTextField();
		fatherTextField.setBounds(300, 190, 400, 30);
		fatherTextField.setFont(new Font("raleway", Font.BOLD, 20));
		add(fatherTextField);	
		
		
		JLabel dob = new JLabel("Date of Birth: ");
		dob.setFont(new Font("raleway", Font.BOLD, 20));
		dob.setBounds(100, 240, 400, 30);
		add(dob);
		
//		JTextField dobTextField = new JTextField();
//		dobTextField.setBounds(300, 240, 400, 30);
//		dobTextField.setFont(new Font("raleway", Font.BOLD, 20));
//		add(dobTextField);
		
		dateChooser = new JDateChooser();
		dateChooser.setBounds(300, 240, 400, 30);
		dateChooser.setFont(new Font("Raleway", Font.BOLD, 20));
		dateChooser.setForeground(new Color(0, 0, 0, 0));
//		dateChooser.setEnabled(false);
		add(dateChooser);
		
		
		JLabel gender = new JLabel("Gender:");
		gender.setFont(new Font("Raleway", Font.BOLD, 20));
		gender.setBounds(100, 290, 200, 30);
		add(gender);
		
//		JTextField genderTextField = new JTextField();
//		genderTextField.setBounds(300, 290, 400, 30);
//		genderTextField.setFont(new Font("raleway", Font.BOLD, 20));
//		add(genderTextField);
		
		male = new JRadioButton("Male");
		male.setBounds(300, 290, 100, 30);
		male.setFont(new Font("Raleway", Font.BOLD, 15));
		male.setBackground(Color.white);
		add(male);
		
		female = new JRadioButton("Female");
		female.setBounds(450, 290, 100, 30);
		female.setFont(new Font("Raleway", Font.BOLD, 15));
		female.setBackground(Color.white);
		add(female);
		
		ButtonGroup gerndarGroup = new ButtonGroup();
		gerndarGroup.add(male);
		gerndarGroup.add(female);
		
		
		
		JLabel email = new JLabel("Email Address:");
		email.setFont(new Font("raleway", Font.BOLD, 20));
		email.setBounds(100, 340, 400, 30);
		add(email);
		
		emailTextField = new JTextField();
		emailTextField.setBounds(300, 340, 400, 30);
		emailTextField.setFont(new Font("raleway", Font.BOLD, 20));
		add(emailTextField);
		
		
		
		JLabel martial = new JLabel("Martial Stetus:");
		martial.setFont(new Font("Raleway", Font.BOLD, 20));
		martial.setBounds(100, 390, 400, 30);
		add(martial);
		
		
		married = new JRadioButton("Married");
		married.setBounds(300, 390, 100, 30);
		married.setFont(new Font("Raleway", Font.BOLD, 15));
		married.setBackground(Color.white);
		add(married);
		
		unmarried = new JRadioButton("Unmarried");
		unmarried.setBounds(450, 390, 115, 30);
		unmarried.setFont(new Font("Raleway", Font.BOLD, 15));
		unmarried.setBackground(Color.white);
		add(unmarried);
		
		others = new JRadioButton("Others");
		others.setBounds(620, 390, 100, 30);
		others.setFont(new Font("Raleway", Font.BOLD, 15));
		others.setBackground(Color.white);
		add(others);
		
		ButtonGroup marriedStetus = new ButtonGroup();
		marriedStetus.add(married);
		marriedStetus.add(unmarried);
		marriedStetus.add(others);
		
//		JTextField martialTextField = new JTextField();
//		martialTextField.setBounds(300, 390, 400, 30);
//		martialTextField.setFont(new Font("raleway", Font.BOLD, 20));
//		add(martialTextField);
		
		
		
		JLabel address = new JLabel("Address:");
		address.setFont(new Font("raleway", Font.BOLD, 20));
		address.setBounds(100, 440, 200, 30);
		add(address);
		
		addressTextField = new JTextField();
		addressTextField.setBounds(300, 440, 400, 30);
		addressTextField.setFont(new Font("raleway", Font.BOLD, 20));
		add(addressTextField);
		
		
		
		JLabel city = new JLabel("City:");
		city.setFont(new Font("raleway", Font.BOLD, 20));
		city.setBounds(100, 490, 200, 30);
		add(city);
		
		cityTextField = new JTextField();
		cityTextField.setBounds(300, 490, 400, 30);
		cityTextField.setFont(new Font("raleway", Font.BOLD, 20));
		add(cityTextField);
		
		
		
		JLabel pincode = new JLabel("Pincode:");
		pincode.setFont(new Font("raleway", Font.BOLD, 20));
		pincode.setBounds(100, 540, 200, 30);
		add(pincode);
		
		pincodeTextField = new JTextField();
		pincodeTextField.setBounds(300, 540, 400, 30);
		pincodeTextField.setFont(new Font("raleway", Font.BOLD, 20));
		add(pincodeTextField);
		
		
		
		JLabel state = new JLabel("State:");
		state.setFont(new Font("raleway", Font.BOLD, 20));
		state.setBounds(100, 590, 200, 30);
		add(state);
		
		
		stateTextField = new JTextField();
		stateTextField.setBounds(300, 590, 400, 30);
		stateTextField.setFont(new Font("raleway", Font.BOLD, 20));
		add(stateTextField);
		
		
		
		
		next = new JButton("Next");
		next.setBounds(600, 650, 100, 40);
		next.setBackground(Color.black);
		next.setForeground(Color.white);
		next.setFont(new Font("raleway", Font.BOLD, 15));
		next.addActionListener(this);
		add(next);
		
		getContentPane().setBackground(Color.white);
		setSize(850, 800);
		setLocation(350, 10);
		setVisible(true);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
	
		String formno=""+random;//long
		String name = nameTextField.getText();
		String fname = fatherTextField.getText();
		String dob =((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
		String gendar = null;
		if(male.isSelected()) {
			gendar="Male";
		}else if(female.isSelected()) {
			gendar="Female";
		}
	
		String email = emailTextField.getText();
		String marital = null;
		if(married.isSelected()) {
			marital="Married";
		}else if(unmarried.isSelected()) {
			marital = "Unmarried";
		}else if(others.isSelected()) {
			marital = "Others";
		}
		
		String address = addressTextField.getText();
		String city = cityTextField.getText();
		String pincode = pincodeTextField.getText();
		String state = stateTextField.getText();
		
		try {
			if(name.equals("")) {
				JOptionPane.showMessageDialog(null, "Name is Required!");
			}
		/*	else if(fname.equals("")) {
				JOptionPane.showMessageDialog(null,"Father Name Is Required");
			}else if(dob.equals("")) {
				JOptionPane.showMessageDialog(null, "DOB is Requied");	
			}else if(email.equals("")) {
				JOptionPane.showMessageDialog(null, "Email is Required");
			}else if(pincode.equals("")) {
				JOptionPane.showMessageDialog(null, "Pin is Required!");
			} */
			else {
				ConJDBC c = new ConJDBC();
				String query = "insert into signup values('"+formno+"', '"+name+"', '"+fname+"','"+dob+"', '"+gendar+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
				c.s.executeUpdate(query);
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	
	public static void main(String[] args) {
		new SingUpOne();
	}

	

}
