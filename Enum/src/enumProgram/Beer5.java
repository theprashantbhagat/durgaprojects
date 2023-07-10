package enumProgram;

public enum Beer5 {

	KF,KO,RC,FO;
}
class Test5{
	public static void main(String[] args) {
	
		Beer5[] b=Beer5.values();
		for(Beer5 b1:b)
		{
			System.out.println(b1);
		}
	}
}
