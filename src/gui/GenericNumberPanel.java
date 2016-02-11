package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GenericNumberPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private int flag;

	/**
	 * Create the panel.
	 */
	public GenericNumberPanel(String lbl) {
		setLayout(null);
		
		flag = 0;
		JLabel label = new JLabel(lbl);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(137, 11, 177, 14);
		add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(137, 36, 177, 20);
		add(textField);
		
		JButton buttonOK = new JButton("OK");
		buttonOK.setBounds(256, 211, 54, 23);
		add(buttonOK);
		
		JButton buttonCancel = new JButton("Cancel");
		buttonCancel.setBounds(178, 255, 89, 23);
		add(buttonCancel);
		
		JButton buttonBack = new JButton("<-");
		buttonBack.setBounds(137, 211, 58, 23);
		add(buttonBack);
		
		JButton button_1 = new JButton("1");
		button_1.setBounds(137, 84, 39, 23);
		add(button_1);
		
		JButton button_2 = new JButton("2");
		button_2.setBounds(205, 84, 39, 23);
		add(button_2);
		
		JButton button_3 = new JButton("3");
		button_3.setBounds(271, 84, 39, 23);
		add(button_3);
		
		JButton button_4 = new JButton("4");
		button_4.setBounds(137, 128, 39, 23);
		add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.setBounds(205, 128, 39, 23);
		add(button_5);
		
		JButton button_6 = new JButton("6");
		button_6.setBounds(271, 128, 39, 23);
		add(button_6);
		
		JButton button_7 = new JButton("7");
		button_7.setBounds(137, 171, 39, 23);
		add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.setBounds(205, 171, 39, 23);
		add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.setBounds(271, 171, 39, 23);
		add(button_9);
		
		JButton button_0 = new JButton("0");
		button_0.setBounds(205, 211, 39, 23);
		add(button_0);

	}
	
	public String getString(){
		
		return this.textField.getText();
		
	}
	
	private class OneAction implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			String s = textField.getText();
			textField.setText(s.concat("1"));
		}
	}
	private class TwoAction implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			String s = textField.getText();
			textField.setText(s.concat("2"));
		}
	}
	private class ThreeAction implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			String s = textField.getText();
			textField.setText(s.concat("3"));
		}
	}
	private class FourAction implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			String s = textField.getText();
			textField.setText(s.concat("4"));
		}
	}
	private class FiveAction implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			String s = textField.getText();
			textField.setText(s.concat("5"));
		}
	}
	private class SixAction implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			String s = textField.getText();
			textField.setText(s.concat("6"));
		}
	}
	private class SevenAction implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			String s = textField.getText();
			textField.setText(s.concat("7"));
		}
	}
	private class EightAction implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			String s = textField.getText();
			textField.setText(s.concat("8"));
		}
	}
	private class NineAction implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			String s = textField.getText();
			textField.setText(s.concat("9"));
		}
	}
	private class ZeroAction implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			String s = textField.getText();
			textField.setText(s.concat("0"));
		}
	}
	private class OKAction implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			return; //might be useless
		}
	}
	private class BackAction implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			String s = textField.getText();
			new StringBuilder(s).reverse().toString();
			s = s.substring(1);
			new StringBuilder(s).reverse().toString();
			textField.setText(s);
		}
	}
	
	private class CancelAction implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			flag = 1;
		}
	}
	
	public int getFlag(){
		return flag;
	}
	
}
