package selciya;

class School1
{
	void first()
	{
		System.out.println("I am 1");
	}
}
class School2 extends School1
{
	void second()
	{
		System.out.println("I am 2");
	}
}
class School3 extends School2
{
	void third()
	{
		System.out.println("I am 3");
	}
}
class selciya
{
	public static void main(String[]args)
	{
		School2 s1=new School2();
		//s1.third();
		s1.second();
		s1.first();
		
	
	}
}