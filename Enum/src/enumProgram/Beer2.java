package enumProgram;

public enum Beer2 {

	KF,KO,RC,FO;
}
class Test2{
	
	public static void main(String args[]){
		Beer2 b2=Beer2.RC;
		
		switch(b2){
		case KF:
			System.out.println("it is childrens brand");
		break;
		case KO:
			System.out.println("it is too lite");
		break;
		case RC:
			System.out.println("it is too hot");
		break;
		case FO:
			System.out.println("buy one get one");
		break;
		default:
			System.out.println("other brands are not good");
		}
	}
}
