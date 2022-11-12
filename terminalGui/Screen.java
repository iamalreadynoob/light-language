package terminalGui;

import java.awt.Color;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Screen extends JFrame
{
	
	protected static JTextField writeable, readable;
	protected static JButton run, delete;

	public Screen() throws IOException
	{
		this.setSize(600, 400);
		this.setLocation(360, 170);
		this.getContentPane().setBackground(Color.BLACK);
		this.setLayout(null);
		this.setResizable(false);
		
		new CreateNew();
		new Add(this);
		new Positions(writeable, readable, run, delete);
		new Buttons(writeable, readable, run, delete);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
}
