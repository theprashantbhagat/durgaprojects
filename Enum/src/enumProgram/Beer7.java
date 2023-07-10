package enumProgram;

public enum Beer7 {

	KF,KO,RC,FO;
	Beer7()
	{
		System.out.println("constructor");
	}
}
class Test7
{
	public static void main(String[] args) {
		Beer7 b=Beer7.RC;
		System.out.println("Hello");
	}
}
