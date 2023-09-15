package com.swing.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import com.swing.controller.Logincontroller;

import java.awt.FlowLayout;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Loginview {

	private JFrame frmWelcomeToJava;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loginview window = new Loginview();
					window.frmWelcomeToJava.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Loginview() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWelcomeToJava = new JFrame();
		frmWelcomeToJava.setTitle("Welcome to java");
		frmWelcomeToJava.setBounds(100, 100, 450, 300);
		frmWelcomeToJava.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWelcomeToJava.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User Name");
		lblNewLabel.setBounds(35, 90, 89, 14);
		frmWelcomeToJava.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(35, 151, 89, 14);
		frmWelcomeToJava.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setToolTipText("Enter the user name");
		textField.setBounds(155, 87, 154, 20);
		frmWelcomeToJava.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setToolTipText("password");
		textField_1.setBounds(155, 148, 154, 20);
		frmWelcomeToJava.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Username=textField.getText();
				String Password=textField_1.getText()	;	
				 
				if(Username.isBlank()||Password.isBlank())
				{
					Alert dialog = new Alert("Please enter the user name Or password");
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);


				}
				
				
				else
				{
					String value="{\"username\":"+Username+",\"password\":"+Password+"}";
					Logincontroller login =new Logincontroller();
			String output=login.vaild(value);
			System.out.println(output);
				}
		

			}
		});
		btnNewButton.setBounds(296, 211, 89, 23);
		frmWelcomeToJava.getContentPane().add(btnNewButton);
	}
}
