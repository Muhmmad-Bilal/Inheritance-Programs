class PhysicsAndTectknowlodge
{
	void electronics()
	{
		System.out.println("First year Bs electronics ");
		System.out.println("Second year Bs electronics");
		System.out.println("Third year Bs electronics");
	}
	void physics()
	{
		System.out.println("First year of Physics");
		System.out.println("Second year Of Physics ");
		System.out.println("Third Year Of Physics");
	}
	void lab()
	{
		System.out.println("first year of Lab-science");
		System.out.println("Second year of Lab-Science");
		System.out.println("third year of lab-Science");
	}
	void telecom()
	{
		System.out.println("first year of Telecom");
		System.out.println("Second year of Telecom");
		System.out.println("Third year of Telecom");
	}
}
class IIT extends PhysicsAndTectknowlodge
{
	void electronics()
	{
		super.electronics();
		System.out.println("four year of Bs Electronic");
	}
	void telecom()
	{
		super.telecom();
		System.out.println("four year of Telecom");
	}
	void it()
	{
		System.out.println("First year of it");
		System.out.println("Second year of it");
		System.out.println("Third year of it");
		System.out.println("Four year of it");
	}
	void lab()
	{
		super.lab();
		System.out.println("Four year of Lab");
	}
	
}
class PhysicsToTectknowlodge
{
	public static void main(String arg[])
	{
	IIT iit=new IIT();
	iit.electronics();
	iit.telecom();
	iit.it();
	iit.lab();
	}
}