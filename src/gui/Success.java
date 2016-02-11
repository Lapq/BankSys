package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Success extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private int flag = 10;
	private YesAction yesaction;
	private NoAction noaction;

	public Success() {
		
		yesaction = new YesAction();
		noaction = new NoAction();
		
		setLayout(null);
		
		JLabel lblOperationWasSuccessful = new JLabel("Operation was successful!");
		lblOperationWasSuccessful.setHorizontalAlignment(SwingConstants.CENTER);
		lblOperationWasSuccessful.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblOperationWasSuccessful.setBounds(120, 94, 209, 27);
		add(lblOperationWasSuccessful);
		
		JLabel lblDoYouWish = new JLabel("Do you wish to do another operation?");
		lblDoYouWish.setHorizontalAlignment(SwingConstants.CENTER);
		lblDoYouWish.setBounds(88, 132, 271, 19);
		add(lblDoYouWish);
		
		JButton btnYes = new JButton("Yes");
		btnYes.setBounds(120, 197, 89, 23);
		btnYes.addActionListener(yesaction);
		add(btnYes);
		
		JButton btnNo = new JButton("No");
		btnNo.setBounds(240, 197, 89, 23);
		btnNo.addActionListener(noaction);
		add(btnNo);
	}
	
	private class YesAction implements ActionListener{
		
		@Override
		public void actionPerformed (ActionEvent e){
			flag = 0;
		}
	}
	private class NoAction implements ActionListener{
		
		@Override
		public void actionPerformed (ActionEvent e){
			flag = 1;
		}
	}
	public int getFlag(){
		return flag;
	}
}
