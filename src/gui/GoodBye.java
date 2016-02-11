package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class GoodBye extends JPanel {
	private static final long serialVersionUID = 1L;

	private int flag = 0;
	private CloseAction closeaction;
	
	public GoodBye() {
		closeaction = new CloseAction();
		
		setLayout(null);
		
		JLabel lblGoodBye = new JLabel("Good bye and have a nice day!");
		lblGoodBye.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblGoodBye.setHorizontalAlignment(SwingConstants.CENTER);
		lblGoodBye.setBounds(102, 92, 247, 23);
		add(lblGoodBye);
		
		JButton btnClose = new JButton("Close");
		btnClose.setBounds(180, 164, 89, 23);
		btnClose.addActionListener(closeaction);
		add(btnClose);
		
		JLabel lblByLamartineAntonio = new JLabel("by Lamartine Antonio P. de Queiroga");
		lblByLamartineAntonio.setHorizontalAlignment(SwingConstants.RIGHT);
		lblByLamartineAntonio.setBounds(215, 275, 214, 14);
		add(lblByLamartineAntonio);

	}
	
	private class CloseAction implements ActionListener{
		
		@Override
		public void actionPerformed (ActionEvent e)
		{
			flag = 1;
		}
	}
	
	public int getFlag()
	{
		return flag;
	}
}


