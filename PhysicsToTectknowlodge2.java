class PhysicsAndTech
{
	void electronics()
	{
		System.out.println("3 Years of Bsc Electronic");
	}
	void telecom()
	{
		System.out.println("3 Years of Bsc Telecom");
	}
	void computertec()
	{
		System.out.println("3  Years of Bsc ComputerTec");
	}
	void lab()
	{
		System.out.println("3 years of Bsc Lab");
	}
}
class IIT extends PhysicsAndTech
{
	void electronics()
	{
		super.electronics();
		System.out.println("4 years of Bsc");
	}
	void telecom()
	{
		super.telecom();
		System.out.println("4 years of Bsc Telecom");
	}
	void it()
	{
		System.out.println("4 Years of It");
	}
}
class IICT extends IIT
{
	void software()
	{
		System.out.println("4 years of  Bs Software Engineering");
	}
	
}
class FacultyofEngineeringtec extends IICT
{
	void software()
	{
		System.out.println("4 years of BE Sofwtare Engineering");
	}
	void electronics()
	{
		System.out.println("4 years of BE Electronic Engineering");
	}
}
class PhysicsTOTectknowlodge2
{
	public static void main(String arg[])
	{
	FacultyofEngineeringtec fact=new FacultyofEngineeringtec();
	fact.lab();
	fact.it();
	fact.software();
	fact.telecom();
	fact.electronics();
	fact.computertec();
	}
}