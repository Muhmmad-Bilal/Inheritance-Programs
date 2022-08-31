class A
{
	private int feet;
	private int inch;
	A()
	{
		feet=0;
		inch=0;
		System.out.println("I am no argument of Contsructor of class A");
	}
	A(int a,int b)
	{
		feet=a;
		
		inch=b;
		System.out.println("I am Two Argument of Constructor of class A");
	}
	void show()
	{
		System.out.println("Feet is:"+feet);
		System.out.println("Inch is:"+inch);
	}
}
class B extends A
{
	private int width;
	B()
	
	
	{
		width=0;
		System.out.println("I am no argument Constructor of class B ");
	}
	B(int a,int b,int c)
	{
		super(a,b);
		width=c;
		System.out.println("I am three argument Constructor of class B");
	}
	void show()
	{
		super.show();
		System.out.println("Width:"+width);
	}
}
class C extends B
{
	private int heigth;
	C()
	{
		heigth=0;
		System.out.println("I am no argument Constructor of the class C ");
	}
	C(int a,int b,int c,int d)
	{
		super(a,b,c);
		heigth=d;
		System.out.println("I am four argument Constructor of class C");
	}
	void show()
	{
		super.show();
		System.out.println("Height is:"+heigth);
	}
}
class Contructor_inheritance
{
	public static void main(String arg[])
	{
		C c1=new C();
		C c2=new C(10,20,30,40);
//c1.show();
		c2.show();
	}
}