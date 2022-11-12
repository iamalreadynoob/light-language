package compilerBuffer;

import java.util.ArrayList;
import java.util.List;

public class Parser {
	
	private String code;
	private List<String> tokens = new ArrayList<>(); 
	
	protected Parser(String code)
	{
		this.code = code;
	}
	
	public void determine()
	{
		int word = 0;
		boolean isFirstLetter = false;
		boolean isHeadline = true;
		
		for(int i = 0; i < code.length(); i++)
		{
			
			if(isHeadline)
			{
				
				if(code.charAt(i) != ' ')
				{
					isHeadline = false;
					
					tokens.add(Character.toString(code.charAt(i)));
				}
				
			}
			
			else
			{
				
				if(code.charAt(i) == ' ')
				{
					
					if(isFirstLetter == false) 
					{
							word++;
							isFirstLetter = true;
					}
					
				}
				
				else
				{
					
					if(isFirstLetter)
					{
						tokens.add(Character.toString(code.charAt(i)));
						isFirstLetter = false;
					}
					
					else
					{
						String currentWord = tokens.get(word) + Character.toString(code.charAt(i));
						tokens.set(word, currentWord);
					}
					
				}
				
			}
			
		}
		
	}
	
	public String[] getOrders()
	{
		String[] orders = new String[tokens.size()];
		
		for(int i = 0; i < tokens.size(); i++)
		{
			orders[i] = tokens.get(i);
		}
		
		return orders;
		
	}

}
