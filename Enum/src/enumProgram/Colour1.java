package enumProgram;

public enum Colour1 {

	BLUE,RED
	{
	public void info() {
		System.out.println("Dangerous Colour");
	}
	},GREEN;
	public void info()
	{
		System.out.println("Universal Colour");
	}
}
class Test10
{
	public static void main(String[] args) {
		
		Colour[] c=Colour.values();
		for(Colour c1:c)
		{
			c1.info();
		}
	}
}

