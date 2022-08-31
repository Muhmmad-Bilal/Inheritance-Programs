class A
{
	int feet;
	int inch;
	A()
	{
		feet=0;
		inch=0;
		System.out.println(" i am No Argument Constructor class A");
	}
	A(int a,int b)
	{
		feet=a;
		inch=b;
		System.out.println("i am two Argument Constructor of class A");
	}
	
}
class B extends A
{
	int width;
	B()
	{
		feet=0;
		inch=0;
		width=0;
	System.out.println("I am no Argument Contrutor of a class B");
	}
B(int a,int b)
	{
		feet=a;
		inch=b;
		
		System.out.println("I am two Argument of the constructor Class B");
	}

	B(int a,int b,int c)
	{
		feet=a;
		inch=b;
		width=c;
		System.out.println("I am three Argument of the constructor Class B");
	}
}
class C extends B
{
	int height;
	C()
	{
		feet=0;
		inch=0;
		width=0;
		height=0;
		System.out.println("I am no Argument constructor of class c");
	}
C(int a, int b)

{
super(a,b);

feet=a;
		inch=b;	


System.out.println("I am two arugument of constructor of class c");

}
	C(int a,int b,int c,int d)
	{
		feet=a;
		inch=b;	
		width=c;
		height=d;
		System.out.println("I am four arugument of constructor of class c");
	}
}
class Abc{
	public static void main(String agr[])
	{
		C c=new C();
		C c1=new C(10,20,30,40);
C c2=new C(10,20);

	}
}