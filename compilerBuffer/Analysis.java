package compilerBuffer;

import java.io.IOException;

import operations.ArithmeticOp;
import operations.BrowserOp;
import operations.OutputOp;

public class Analysis {
	
	private String[] words;
	
	protected Analysis(String[] words)
	{
		this.words = words;
	}
	
	protected String reaction() throws IOException
	{
		Keywords keys = new Keywords();
		
		String result = "";
		
		for(int i = 0; i < keys.getLength(); i++)
		{
			String[] keywordSet = keys.getArray(i);
			
			for(int j = 0; j < words.length; j++)
			{
				
				for(int k = 0; k < keywordSet.length; k++)
				{
					if(words[j].equals(keywordSet[k]))
					{
						if(i == 0)
						{
							ArithmeticOp arithmetic = new ArithmeticOp(keywordSet[k]);
							
							try 
							{
								Float numTwo;
								if(k != 4)
								{
									numTwo = Float.parseFloat(words[j+2]);
								}
								else
								{
									numTwo = null;
								}
								
								result = result + " " + Float.toString(arithmetic.getOperation(Float.parseFloat(words[j+1]), numTwo)) + " ";
								
							}
							catch(Exception e)
							{
								result = result + " " + "EXCEPTION ";
							}
							
						}
						
						else if(i == 1)
						{
							OutputOp output = new OutputOp(keywordSet[k]);
							
							result = output.getOperation(words);
							
						}
						
						else if(i == 2)
						{
							BrowserOp browser = new BrowserOp(keywordSet[k]);
							
							if(words.length == 1) browser.getOperation();
							else browser.getOperation(words);
						}
						
					}
					
				}
				
			}
		}
		
		return result;
	}

}
