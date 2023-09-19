package package1;
public class ThisCalling 
{
	ThisCalling()
	   {
	        System.out.println("My Zero Constructor"); 
	   }
	ThisCalling(int a)
	   {
			this();
	        System.out.println("My First Constructor"); 
	        
	   }
	ThisCalling(double b, int a)
	   {
			this(1);
	        System.out.println("My Second Constructor"); 
	   }
	ThisCalling(char c,double b,int a)
	   {
			this(21.11,11);
	        System.out.println("My Third Constructor"); 
	   }
	ThisCalling(char c,double b)
	   {
			this('Q',43.54,11);
	        System.out.println("My Forth Constructor"); 
	   }
	ThisCalling(double b)
	   {
		this('A',98.65);
	        System.out.println("My Fifth Constructor"); 
	   }
	   
	    public static void main(String[] args)
	   {
	     System.out.println("We love software testing"); 
		 new ThisCalling(0.98);		 
}
}
