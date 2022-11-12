package terminalGui;

import javax.swing.JButton;
import javax.swing.JTextField;

public class CreateNew {
	
	protected CreateNew()
	{
		Screen.writeable = new JTextField();
		Screen.readable = new JTextField();
		
		Screen.run = new JButton();
		Screen.delete = new JButton();
	}

}
