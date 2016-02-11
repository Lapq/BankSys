package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;;

public class ErrorScreen extends JPanel {
	private static final long serialVersionUID = 1L;

	private int flag = 10;
	private OkAction okaction;
	
	public ErrorScreen(String msg) {
		
		okaction = new OkAction();
		
		setLayout(null);
		
		JLabel lblError = new JLabel("ERROR");
		lblError.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblError.setHorizontalAlignment(SwingConstants.CENTER);
		lblError.setBounds(139, 11, 155, 29);
		add(lblError);

		int count = msg.indexOf(' ', 60);
		
		JLabel description = new JLabel(msg.substring(0, count));
		description.setBounds(10, 82, 430, 29);
		add(description);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBounds(178, 223, 89, 23);
		btnOk.addActionListener(okaction);
		add(btnOk);
		
		String msg2 = "";
		if (msg.length()>=20)	msg2 = msg.substring(count);
		JLabel description2 = new JLabel(msg2);
		description2.setBounds(10, 137, 430, 29);
		add(description2);
	}
	
	private class OkAction implements ActionListener{

		@Override
		public void actionPerformed (ActionEvent e){
			flag = 1;
		}		
	}
	
	public int getFlag(){
		return flag;
	}
}
