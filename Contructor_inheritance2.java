class A
{
private int feet;
private int inch;
A()
{
	feet=0;
	inch=0;
	System.out.println("I am no arugment Constructor Of class A");
}	
A(int a,int b)
{
	feet=a;
	inch=a;
	System.out.println("I am two arugment Constructor of Class A");
}
void show()
{
	System.out.println("Feet is"+feet);
	System.out.println("Inch is:"+inch);
}
}
class B extends A
{
	private int width;
	B()
	{
		width=0;
		System.out.println("I am no arugment Constructor of class B");
	}
	B(int a,int b,int c)
	{
		super(a,b);
		width=c;
		System.out.println("I am Three argument of class B");
	}
	void show()
	{
	super.show();
	System.out.println("Width is:"+width);
	}
}
class C extends B
{
	private int height;
	C()
	{
		height=0;
		System.out.println("i am no arugment Constructor of class C");
	}
	C(int a,int b,int c,int d)
	{
		super(a,b,c);
		System.out.println("I am four argument constructor of class C");
	}
	void show()
	{
		super.show();
		System.out.println("Heigth:"+height);
	}
}
class Contructor_inheritance2
{
	public static void main(String arg[])
	{
		C c=new C();
		C c1=new C(10,20,30,40);
		c1.show();
	}
}