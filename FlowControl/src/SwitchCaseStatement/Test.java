package SwitchCaseStatement;

public class Test {

	public static void main(String args[]){
		int x=10;
		final int y=20;
		
		switch(x)
		{
		case 10:
	
			System.out.println("10");
		case y:		
			System.out.println("20");
		}
	}
}
