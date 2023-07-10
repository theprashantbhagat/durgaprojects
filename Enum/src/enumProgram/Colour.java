package enumProgram;

public enum Colour {

	BLUE,RED,GREEN;
	public void info() {
		System.out.println("Universal Colour");
	}
}
class Test9
{
	public static void main(String[] args) {
		
		Colour[] c=Colour.values();
		for(Colour c1:c)
		{
			c1.info();
		}
	}
}
