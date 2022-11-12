package terminalGui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JTextField;

import compilerBuffer.CompilerStack;

public class Buttons {
	
	protected Buttons(JTextField writeable, JTextField readable, JButton run, JButton delete) throws IOException
	{
		
		run.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
		
				CompilerStack stack = null;
				
				try {
					stack = new CompilerStack(writeable.getText());
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
				readable.setText(stack.getter());
				
			}
			
	});
		
		delete.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
		
				writeable.setText(null);
				readable.setText(null);
				
			}
			
	});
		
	}

}
