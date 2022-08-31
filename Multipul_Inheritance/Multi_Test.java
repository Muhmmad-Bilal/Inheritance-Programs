class A
{
	void show()
	{
		System.out.println("Hello bilal");
	}
}
interface B
{
	int a=100;
	int b=200;
	void show1();
}
class C extends A implements B
{
	void show()
	{
		super.show();
		System.out.println("2k19\\CSE\\63");		
	}
	public void show1()
	{
		int c=a+b;
		System.out.println(c);
	}	
}
class Multi_Test
{
	public static void main(String arg[])
	{
		C obj=new C();
		obj.show();
		obj.show1();
	}
}