package terminalGui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JTextField;

public class Positions {

	protected Positions(JTextField writeable, JTextField readable, JButton run, JButton delete)
	{
		
		Font texts = new Font("Arial", Font.BOLD, 15);
		
		writeable.setBounds(40, 40, 500, 70);
		writeable.setBorder(null);
		writeable.setBackground(Color.GRAY.darker());
		writeable.setForeground(Color.RED);
		writeable.setFont(texts);
		
		
		readable.setBounds(40, 150, 500, 70);
		readable.setBorder(null);
		readable.setBackground(Color.RED.darker());
		readable.setForeground(Color.BLACK);
		readable.setFont(texts);
		readable.setEditable(false);
		
		run.setBounds(40, 250, 70, 30);
		run.setText("run");
		run.setBackground(Color.GREEN.darker());
		run.setForeground(Color.BLACK);
		run.setBorder(null);
		
		delete.setBounds(470, 250, 70, 30);
		delete.setText("del");
		delete.setBorder(null);
		delete.setBackground(Color.RED.darker());
		delete.setForeground(Color.BLACK);
		
	}
	
}
