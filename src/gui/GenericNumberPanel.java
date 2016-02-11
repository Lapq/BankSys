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
	private int flag = 10;
	private OneAction oneaction;
	private TwoAction twoaction;
	private ThreeAction threeaction;
	private FourAction fouraction;
	private FiveAction fiveaction;
	private SixAction sixaction;
	private SevenAction sevenaction;
	private EightAction eightaction;
	private NineAction nineaction;
	private ZeroAction zeroaction;
	private OKAction okaction;
	private BackAction backaction;
	private CancelAction cancelaction;

	/**
	 * Create the panel.
	 */
	public GenericNumberPanel(String lbl) {
		
		oneaction = new OneAction();
		twoaction = new TwoAction();
		threeaction = new ThreeAction();
		fouraction = new FourAction();
		fiveaction = new FiveAction();
		sixaction = new SixAction();
		sevenaction = new SevenAction();
		eightaction = new EightAction();
		nineaction = new NineAction();
		zeroaction = new ZeroAction();
		okaction = new OKAction();
		backaction = new BackAction();
		cancelaction = new CancelAction();

		setLayout(null);
		
		JLabel label = new JLabel(lbl);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(50, 11, 345, 14);
		add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(117, 36, 207, 20);
		add(textField);
		
		JButton buttonOK = new JButton("OK");
		buttonOK.setBounds(270, 211, 54, 23);
		buttonOK.addActionListener(okaction);
		add(buttonOK);
		
		JButton buttonCancel = new JButton("Cancel");
		buttonCancel.setBounds(178, 255, 89, 23);
		buttonCancel.addActionListener(cancelaction);
		add(buttonCancel);
		
		JButton buttonBack = new JButton("<-");
		buttonBack.setBounds(117, 211, 53, 23);
		buttonBack.addActionListener(backaction);
		add(buttonBack);
		
		JButton button_1 = new JButton("1");
		button_1.setBounds(117, 84, 53, 23);
		button_1.addActionListener(oneaction);
		add(button_1);
		
		JButton button_2 = new JButton("2");
		button_2.setBounds(193, 84, 51, 23);
		button_2.addActionListener(twoaction);
		add(button_2);
		
		JButton button_3 = new JButton("3");
		button_3.setBounds(270, 84, 54, 23);
		button_3.addActionListener(threeaction);
		add(button_3);
		
		JButton button_4 = new JButton("4");
		button_4.setBounds(117, 128, 53, 23);
		button_4.addActionListener(fouraction);
		add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.setBounds(193, 128, 51, 23);
		button_5.addActionListener(fiveaction);
		add(button_5);
		
		JButton button_6 = new JButton("6");
		button_6.setBounds(270, 128, 54, 23);
		button_6.addActionListener(sixaction);
		add(button_6);
		
		JButton button_7 = new JButton("7");
		button_7.setBounds(117, 171, 53, 23);
		button_7.addActionListener(sevenaction);
		add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.setBounds(193, 171, 51, 23);
		button_8.addActionListener(eightaction);
		add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.setBounds(270, 171, 54, 23);
		button_9.addActionListener(nineaction);
		add(button_9);
		
		JButton button_0 = new JButton("0");
		button_0.setBounds(193, 211, 51, 23);
		button_0.addActionListener(zeroaction);
		add(button_0);

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
			flag = 0;
			System.out.println("pressed");
		}
	}
	private class BackAction implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			String s = textField.getText();

			s = s.substring(0, s.length()-1);
			
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
	public String getString(){
		
		return textField.getText();
		
	}
}
