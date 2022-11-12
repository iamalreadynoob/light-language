package compilerBuffer;

import java.util.ArrayList;
import java.util.List;

public class Keywords {
	
	private final String[] arithmeticOperators = {"PLUS", "MINUS", "TIMES", "OVER", "TILLONE", "EXPONENT", "MODE", "ROOT", "PERM", "COMB"};
	private final String[] outputOperators = {"WRITE", "TEXT_LENGTH"};
	private final String[] browserOperators = {"INFORMATION", "MAIL", "NEWS", "CLASS", "YOUTUBE", "INSTAGRAM", "TWITTER", "FACEBOOK", "SEARCH"};
	
	private List<String[]> wholeKeywords = new ArrayList<>();
	
	protected Keywords()
	{
		wholeKeywords.add(arithmeticOperators);
		wholeKeywords.add(outputOperators);
		wholeKeywords.add(browserOperators);
	}
	
	protected String[] getArray(int index)
	{
		return wholeKeywords.get(index);
	}
	
	protected int getLength()
	{
		return wholeKeywords.size();
	}

}
