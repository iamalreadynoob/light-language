package operations;

import java.io.IOException;

import textRecognize.Identify;

public class BrowserOp {
	
	private String browserCommand;
	
	public BrowserOp(String browserCommand)
	{
		this.browserCommand = browserCommand;
	}
	
	public void getOperation() throws IOException
	{
	
		String url = null;
		
		if(browserCommand.equals("INFORMATION")) url = "https://en.wikipedia.org/wiki/Main_Page";
		else if(browserCommand.equals("MAIL")) url = "https://mail.google.com/mail/u/0/#inbox";
		else if(browserCommand.equals("NEWS")) url = "https://www.yahoo.com/";
		else if(browserCommand.equals("CLASS")) url = "https://classroom.google.com/u/0/h";
		else if(browserCommand.equals("YOUTUBE")) url = "https://www.youtube.com/";
		else if(browserCommand.equals("INSTAGRAM")) url = "https://www.instagram.com/";
		else if(browserCommand.equals("TWITTER")) url = "https://twitter.com/";
		else if(browserCommand.equals("FACEBOOK")) url = "https://www.facebook.com/";
		
		java.awt.Desktop.getDesktop().browse( java.net.URI.create(url));
	}
	
	public void getOperation(String[] rawDestination) throws IOException
	{
		String url = null;
		
		Identify id = new Identify(rawDestination);
		String destination = id.getRecognizableText("%20"); 
		
		if(browserCommand.equals("SEARCH")) url = "https://www.google.com/search?q=" + destination;
		java.awt.Desktop.getDesktop().browse( java.net.URI.create(url));
		
	}

}
