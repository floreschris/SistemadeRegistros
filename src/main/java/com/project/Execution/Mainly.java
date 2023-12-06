package com.project.Execution;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.project.Registration.Login;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Mainly extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public Mainly() {
		setBackground(Color.BLACK);
		setLocale(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 800);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(Color.DARK_GRAY);
		menuBar.setBackground(Color.DARK_GRAY);
		setJMenuBar(menuBar);
		
		JMenu mnRegistrationMenu = new JMenu("Registration");
		mnRegistrationMenu.setIcon(new ImageIcon("C:\\Users\\Usuario\\OneDrive - Universidad Tecnologica del Peru\\Desktop\\Interfaces\\user_84308.png"));
		mnRegistrationMenu.setForeground(Color.BLACK);
		mnRegistrationMenu.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		menuBar.add(mnRegistrationMenu);
		
		JMenuItem mntmLoginItem = new JMenuItem("Login");
		mntmLoginItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Login L = new Login();
				L.setVisible(true);
				L.setLocationRelativeTo(null);
				
			}
		});
		mntmLoginItem.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		mnRegistrationMenu.add(mntmLoginItem);
		
		JMenu mnExitMenu = new JMenu("Exit");
		mnExitMenu.setIcon(new ImageIcon("C:\\Users\\Usuario\\OneDrive - Universidad Tecnologica del Peru\\Desktop\\Interfaces\\logout_90894.png"));
		mnExitMenu.setForeground(Color.BLACK);
		mnExitMenu.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		menuBar.add(mnExitMenu);
		
		JMenuItem mntmLeaveItem = new JMenuItem("Leave");
		mntmLeaveItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mntmLeaveItem.setForeground(Color.BLACK);
		mntmLeaveItem.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		mnExitMenu.add(mntmLeaveItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome to Luxurious baking sytem");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 46));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setBounds(265, 11, 709, 216);
		contentPane.add(lblNewLabel_1);
		
		JLabel nFondoGeneral = new JLabel("");
		nFondoGeneral.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\System_Venta\\src\\com\\project\\img\\concepto-de-sistema-crm-gestión-relaciones-con-el-cliente-para-marketing-comercial-clientes-ventas-negocios-presentado-en-la-202504100.jpg"));
		nFondoGeneral.setBounds(0, 0, 1511, 725);
		contentPane.add(nFondoGeneral);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Usuario\\OneDrive - Universidad Tecnologica del Peru\\Desktop\\images.png"));
		lblNewLabel_3.setBounds(1131, 356, 305, 216);
		contentPane.add(lblNewLabel_3);
	}
}
