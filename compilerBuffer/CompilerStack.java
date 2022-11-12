package compilerBuffer;

import java.io.IOException;

public class CompilerStack {

	private String print;
	
	public CompilerStack(String code) throws IOException
	{
		Parser newOrder = new Parser(code);
		newOrder.determine();
		
		Analysis orders = new Analysis(newOrder.getOrders());
		print = orders.reaction();
		
	}
	
	public String getter()
	{
		return print;
	}
	
}
