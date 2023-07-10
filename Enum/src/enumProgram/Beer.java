package enumProgram;

public enum Beer {

	KF,KO,RC,FO;
}
class Test {
	
	public static void main(String[] args) {
		
		Beer b= Beer.FO;
		System.out.println(b);
	}
}
