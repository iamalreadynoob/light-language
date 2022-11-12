package operations;

import java.lang.Math;

public class ArithmeticOp {

	String arithmeticCommand;
	
	public ArithmeticOp(String arithmeticCommand)
	{
		this.arithmeticCommand = arithmeticCommand;
	}
	
	public float getOperation(Float numOne, Float numTwo)
	{
		if(arithmeticCommand.equals("PLUS")) return numOne + numTwo;
		else if(arithmeticCommand.equals("MINUS")) return numOne - numTwo;
		else if(arithmeticCommand.equals("TIMES")) return numOne * numTwo;
		else if(arithmeticCommand.equals("OVER")) return numOne / numTwo;
		else if(arithmeticCommand.equals("TILLONE")) return factorial(numOne);
		else if(arithmeticCommand.equals("EXPONENT")) return (float)Math.pow(numOne, numTwo);
		else if(arithmeticCommand.equals("MODE")) return numOne % numTwo;
		else if(arithmeticCommand.equals("PERM")) return factorial(numOne) / factorial(numOne - numTwo);
		else if(arithmeticCommand.equals("COMB")) return factorial(numOne) / (factorial(numOne - numTwo) * factorial(numTwo));
		else return (float)Math.pow(numOne, 1/numTwo);
	}
	
	private Float factorial(float bound)
	{
		
		if(bound > 0 && bound == Math.round(bound))
		{
			
		Float answer = (float) 1;
		
		for(int i = 1; i <= bound; i++)
		{
			answer *= i;
		}
		
		return answer;
		
		}
		
		else if(bound == 0) return (float)1;
		else return null;
		
	}

}
