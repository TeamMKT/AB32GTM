package package1;
class Father
{
	static void car()
	{
		System.out.println("Audi");
	}
}
public class Son extends Father
{
	static void bike()
	{
		System.out.println("Honda");
	}
	public static void main(String[] args) 
	{
		bike();
		car();
	}
}
