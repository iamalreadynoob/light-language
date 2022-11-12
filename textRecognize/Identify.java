package textRecognize;

public class Identify {
	
	private String[] rawText;
	
	public Identify(String[] rawText)
	{
		this.rawText = rawText;
	}
	
	public String getRecognizableText(String filler)
	{
		return(recognize(filler));
	}
	
	private String recognize(String filler)
	{
		String identified = "";
		int indexI = 0;
		int indexF = 0;
		
		for(int i = 0; i < rawText.length; i++)
		{
			if(rawText[i].charAt(0) == '"')
			{
				indexI = i;
				break;
			}
		}
		
		for(int i = 0; i < rawText.length; i++)
		{
		
			int length = rawText[i].length();
			
			if(rawText[i].charAt(length - 1) == '"')
			{
				indexF = i;
			}
			
		}
		
		
		
		if(indexI != indexF)
		{
			identified = wordSlicer(rawText[indexI], true) + filler;
			
			for(int i = indexI + 1; i < indexF; i++)
			{
				identified = identified + rawText[i] + filler;
			}
		
			identified = identified + wordSlicer(rawText[indexF], false);
		
		}
		
		else
		{
			identified = wordSlicer(wordSlicer(rawText[indexI], true), false);
		}
		
		return identified;
	}
	
	private String wordSlicer(String word, boolean isFirstLetter)
	{
		String sliced = "";
		
		if(isFirstLetter)
		{	
			for(int i = 1; i < word.length(); i++)
			{
				sliced += Character.toString(word.charAt(i));
			}
			
		}
		
		else
		{
			for(int i = 0; i < word.length() - 1; i++)
			{
				sliced += Character.toString(word.charAt(i));
			}
		}
		
		return sliced;
	}

}
