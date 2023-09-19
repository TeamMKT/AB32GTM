package package1;
public class ConditionalStatement2 {
	public static void main(String[] args) 
	{
		int a=100;
		int b=200;
		if(a>b)
		{
			System.out.println("1");//NO
		}
		if(a>=b)
		{
			System.out.println("2");//NO
		}
		if(a<b)
		{
			System.out.println("3");//YES
		}
		if(a<=b)
		{
			System.out.println("4");//YES
		}
		if(a==b)
		{
			System.out.println("5");//NO
		}
		if(a!=b)
		{
			System.out.println("6");//YES
		}
		
	}

}
