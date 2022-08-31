class A
{
	private int feet;
	private int inch;
	A()
	{
		feet=0;
		inch=0;
		
		System.out.println("I am no Argument Constructor of Class A");
	}
	A(int len)
	{
		feet=len;
		inch=len;
		System.out.println("I am one argument Constructor of Class A");
	}
	A(A ob)
	{
		feet=ob.feet;
		inch=ob.inch;
		System.out.println("I am Object Argument Constructor of class A");
	}
	A(int a,int b)
	{
		feet=a;
		inch=b;
		System.out.println("I am Two argument Constructor of Class A");
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
		System.out.println("I am no argument Constructor of Class B");
	}
	B(int a,int b,int c)
	{
		super(a,b);
		width=c;
		System.out.println("I am Three argument Constructor of Class B");
	}
	B(int len)
	{
		super(len);
		width=len;
		System.out.println("I am One argument Constructor of class B");
	}
	B(B ob)
	{
		super(ob);
		width=ob.width;
		System.out.println("Object Pass as Argument Constructor of class B");
	}
	void show()
	{
		super.show();
		System.out.println("Width is:"+width);
	}
}
class C extends B
{
	private   int height;
	C()
	{
		height=0;
		System.out.println("I am no argument Constructor of class C");
	}
	C(int a,int b,int c,int d)
	{
		super(a,b,c);
		height=d;
		System.out.println("I am Four Argument Constructor of class C");
	}
	C(int len)
	{
		super(len);
		height=len;
		System.out.println("I am one argument Constructor of class C");
	}
	C(C ob)
	{
		height=ob.height;
		System.out.println("I am Object pass As Argument Constructor of class C");
	}
	void show()
	{
		super.show();
		System.out.println("Height is:"+height);
	}
}
class Objectpass
{
	public static void main(String argp[])
	{
		C ob1=new C();
		C ob2=new C(100);
		C ob3=new C(10,20,30,40);
		C ob4=new C(ob3);
		ob1.show();
		ob2.show();
		ob3.show();
		ob4.show();
	}
}