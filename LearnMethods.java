package week1.day2;

public class LearnMethods 
{
	
	public static void main(String [] args)
	{
		LearnMethods obj= new LearnMethods();
		obj.printCarName();
		int regNum=obj.getRegNum();
		System.out.println(regNum);
		String variant= obj.getVariant();
		System.out.println(obj.getVariant());
		int mul=obj.multiplyTwoNumbers(5, 8);
		System.out.println(mul);
	}
	
	public void printCarName()
	{
		System.out.println("TATA");
	}
	
	
	public int getRegNum()
	{
	int regNum= 8790;
	return regNum;
	
	
		
	}
	
	public String getVariant()
	{
		return "Diesel";
		
	}
	
	public int multiplyTwoNumbers(int a, int b)
	{
		return a*b;
	}
	
	}


