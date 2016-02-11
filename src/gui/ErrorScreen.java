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
		
		JLabel description = new JLabel(msg);
		description.setBounds(10, 80, 430, 104);
		add(description);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBounds(178, 223, 89, 23);
		btnOk.addActionListener(okaction);
		add(btnOk);
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
