package operations;

import textRecognize.Identify;

public class OutputOp 
{

	private String outputCommand;
	
	public OutputOp(String outputCommand)
	{
		this.outputCommand = outputCommand;
	}
	
	public String getOperation(String[] words)
	{
		if(outputCommand.equals("WRITE"))
		{
			Identify id = new Identify(words);
			
			return id.getRecognizableText(" ");
		}
		
		else
		{
			Identify id = new Identify(words);
			
			return Integer.toString(id.getRecognizableText(" ").length());
		}
		
	}
	
}
