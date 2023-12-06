package com.project.Registration;

import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;

import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textId;
	private JTextField textName;
	private JTextField textLastName;
	private JTextField textGender;
	private JTextField textAge;
	private JTextField textEmail;
	private JTextField textPhone;
	private JTextField textDirection;

	private ArrayList<Username> list;

	private JTable table;
	private JTable table_1;

	private void clean_Up() {

		textId.setText("");
		textLastName.setText("");
		textAge.setText("");
		textName.setText("");
		textDirection.setText("");
		textEmail.setText("");
		textGender.setText("");
		textPhone.setText("");
	}

	private void see_Date() {

		String Mat[][] = new String[list.size()][8];
		Username aux;
		for (int i = 0; i < Mat.length; i++) {
			aux = list.get(i);
			Mat[i][0] = Integer.toString(aux.getId());
			Mat[i][1] = aux.getName();
			Mat[i][2] = aux.getLast_Name();
			Mat[i][3] = aux.getGender();
			Mat[i][4] = Integer.toString(aux.getAge());
			Mat[i][5] = aux.getEmail();
			Mat[i][6] = Integer.toString(aux.getPhone());
			Mat[i][7] = aux.getDirection();

		}
		table_1.setModel(new DefaultTableModel(Mat,
				new String[] { "Id", "Name", "Last Name", "Gender", "Age", "Email", "Phone", "Direction" }));

	}

	public Login() {

		list = new ArrayList<Username>();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 800);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("User Registration");
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 99));
		lblNewLabel.setBounds(161, 34, 962, 117);
		contentPane.add(lblNewLabel);

		JLabel lblId = new JLabel("Id");
		lblId.setForeground(Color.DARK_GRAY);
		lblId.setBackground(Color.DARK_GRAY);
		lblId.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblId.setBounds(40, 162, 146, 45);
		contentPane.add(lblId);

		JLabel lblName = new JLabel("Name");
		lblName.setForeground(Color.DARK_GRAY);
		lblName.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblName.setBounds(40, 235, 146, 45);
		contentPane.add(lblName);

		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setForeground(Color.DARK_GRAY);
		lblLastName.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblLastName.setBounds(40, 303, 146, 45);
		contentPane.add(lblLastName);

		JLabel lblGender = new JLabel("Gender");
		lblGender.setForeground(Color.DARK_GRAY);
		lblGender.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblGender.setBounds(40, 371, 146, 45);
		contentPane.add(lblGender);

		JLabel lblAge = new JLabel("Age");
		lblAge.setForeground(Color.DARK_GRAY);
		lblAge.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblAge.setBounds(40, 432, 146, 45);
		contentPane.add(lblAge);

		JLabel lblDirection = new JLabel("Direction");
		lblDirection.setForeground(Color.DARK_GRAY);
		lblDirection.setBackground(Color.BLACK);
		lblDirection.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblDirection.setBounds(40, 657, 146, 45);
		contentPane.add(lblDirection);

		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setForeground(Color.DARK_GRAY);
		lblPhone.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblPhone.setBounds(40, 588, 146, 45);
		contentPane.add(lblPhone);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(Color.DARK_GRAY);
		lblEmail.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblEmail.setBounds(40, 511, 146, 45);
		contentPane.add(lblEmail);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\eclipse-workspace\\Menus\\src\\com\\mitocode\\Imagenes\\icono-de-banco-piggy-en-fondo-negro-ilustración-vectores-estilo-plano-170442049.jpg"));
		lblNewLabel_1.setBounds(1036, 220, 415, 381);
		contentPane.add(lblNewLabel_1);

		textId = new JTextField();
		textId.setBounds(196, 162, 126, 36);
		contentPane.add(textId);
		textId.setColumns(10);

		textName = new JTextField();
		textName.setColumns(10);
		textName.setBounds(196, 235, 126, 36);
		contentPane.add(textName);

		textLastName = new JTextField();
		textLastName.setColumns(10);
		textLastName.setBounds(200, 303, 126, 36);
		contentPane.add(textLastName);

		textGender = new JTextField();
		textGender.setColumns(10);
		textGender.setBounds(200, 371, 126, 36);
		contentPane.add(textGender);

		textAge = new JTextField();
		textAge.setColumns(10);
		textAge.setBounds(200, 440, 126, 36);
		contentPane.add(textAge);

		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBounds(200, 511, 126, 36);
		contentPane.add(textEmail);

		textPhone = new JTextField();
		textPhone.setColumns(10);
		textPhone.setBounds(200, 588, 126, 36);
		contentPane.add(textPhone);

		textDirection = new JTextField();
		textDirection.setColumns(10);
		textDirection.setBounds(200, 657, 126, 36);
		contentPane.add(textDirection);

		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String names, last_names, genders, directions, emails;
				Integer phones, ids, ages;

				try {

					ids = Integer.parseInt(textId.getText());
					last_names = textLastName.getText();
					names = textName.getText();
					genders = textGender.getText();
					ages = Integer.parseInt(textAge.getText());
					emails = textEmail.getText();
					phones = Integer.parseInt(textPhone.getText());
					directions = textDirection.getText();

					list.add(new Username(ids, names, last_names, genders, ages, emails, phones, directions));

				} catch (Exception e2) {

					JOptionPane.showMessageDialog(null, "Check the data");

				}

				clean_Up();
				see_Date();

			}

		});
		btnAdd.setBounds(1036, 653, 116, 45);
		contentPane.add(btnAdd);

		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int delete_Row;

				try {

					delete_Row = table_1.getSelectedRow();

					list.remove(delete_Row);

				} catch (Exception e2) {

					JOptionPane.showMessageDialog(null, "Choose a row to delete");

				}

				see_Date();

			}
		});
		btnDelete.setBounds(1193, 653, 116, 45);
		contentPane.add(btnDelete);

		JButton btnModify = new JButton("Modify");
		btnModify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int delete_Row, id;
				Username aux;
				String names, last_names, genders, directions, emails;
				Integer phones, ages;

				try {

					delete_Row = table_1.getSelectedRow();
					aux = list.get(delete_Row);

					String selecioon = JOptionPane.showInputDialog(
							"Choose what you want to modify \nId \nName \nLast_Name \nGender \nAge \nEmail \nPhone \nDirection ");
					switch (selecioon.toLowerCase()) {
					case "id":
						id = Integer.parseInt(JOptionPane.showInputDialog("New Id"));
						aux.setId(id);

						break;
					case "name":
						names = JOptionPane.showInputDialog("New Name");
						aux.setName(names);

						break;
					case "last_name":
						last_names = JOptionPane.showInputDialog("New Last Name");
						aux.setLast_Name(last_names);

						break;
					case "gender":
						genders = JOptionPane.showInputDialog("New Gender");
						aux.setGender(genders);
						break;

					case "age":
						ages = Integer.parseInt(JOptionPane.showInputDialog("New Age"));
						aux.setAge(ages);
						break;
					case "email":
						emails = JOptionPane.showInputDialog("New Email");
						aux.setEmail(emails);
						break;
					case "phone":
						phones = Integer.parseInt(JOptionPane.showInputDialog("New Phone"));
						aux.setPhone(phones);
						break;
					case "direction":
						directions = JOptionPane.showInputDialog("New Direction");
						aux.setDirection(directions);
						break;

					default:
						JOptionPane.showMessageDialog(null, "Modification box not found");
						break;
					}

				} catch (Exception e2) {

					JOptionPane.showMessageDialog(null, "Choose a row to modify");

				}

				see_Date();

			}
		});

		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(new Object[][] {
				{ "Id", "Name", "Last Name", "Gender", "Age", "Email", "Phone", "Direction" },
				{ null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null }, { null, null, null, null, null, null, null, null },
				{ null, null, null, null, null, null, null, null }, },
				new String[] { "Id", "Name", "Last Name", "Gender", "Age", "Email", "Phone", "Direction" }));
		table_1.getColumnModel().getColumn(4).setPreferredWidth(32);
		table_1.getColumnModel().getColumn(5).setPreferredWidth(103);
		table_1.getColumnModel().getColumn(6).setPreferredWidth(83);
		table_1.getColumnModel().getColumn(7).setPreferredWidth(113);
		table_1.setBackground(Color.LIGHT_GRAY);
		table_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		table_1.setBounds(360, 162, 649, 540);
		contentPane.add(table_1);
		btnModify.setBounds(1334, 653, 116, 45);
		contentPane.add(btnModify);

		table = new JTable();
		table.setBounds(374, 304, 285, -141);
		contentPane.add(table);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(
				"C:\\Users\\Usuario\\OneDrive - Universidad Tecnologica del Peru\\Desktop\\Interfaces\\Porsche_design-High_Quality_Wallpaper_1366x768.jpg"));
		lblNewLabel_2.setBounds(10, 34, 1464, 750);
		contentPane.add(lblNewLabel_2);
	}

}
