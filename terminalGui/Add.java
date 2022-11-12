package terminalGui;

import javax.swing.JFrame;

public class Add {
	
	protected Add(JFrame frame)
	{
		frame.add(Screen.writeable);
		frame.add(Screen.readable);
		frame.add(Screen.run);
		frame.add(Screen.delete);
	}

}
