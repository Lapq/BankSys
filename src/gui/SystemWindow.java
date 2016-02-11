package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SystemWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	public SystemWindow() {
		contentPane = new JPanel();
		setTitle("Automated Teller Machine");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		this.setContentPane(contentPane);
		this.setResizable(false);
	}

}
