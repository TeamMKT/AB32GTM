package package1;
public class LocalGlobal 
{
	static int z=100;//global variable
	double pi=3.14;//non static global variable
	static String name;
	
	void add()
	{ 	int a;
	a=900;
		System.out.println(z);
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		System.out.println(name);
		int a=10;
		System.out.println(a);//local variable
		System.out.println(z);
		LocalGlobal l1=new LocalGlobal();
		System.out.println(l1.pi);
	}
}
