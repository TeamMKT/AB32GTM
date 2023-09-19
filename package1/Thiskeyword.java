package package1;
public class Thiskeyword 
{	int a;//global variables have default value
	double b;
	String c;
	void mkt(int a,double b,String c)//should always be non static in case of this keyword
	{
		System.out.println("I am rockstar");
		//this.a=a;//if u commit this then u will get default value of global variable
		//this.b=b;
		//this.c=c;
	}	
	public static void main(String[] args) 
	{	Thiskeyword t=new Thiskeyword();
		t.mkt(1, 1.11, "mkt");
		System.out.println(t.a);
		System.out.println(t.b);
		System.out.println(t.c);
}
}