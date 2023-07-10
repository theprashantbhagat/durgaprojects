package enumProgram;

public enum Beer8 {

	KF,KO,RC,FO;
	int price;
	Beer8(int price)
	{
		this.price=price;
	}
	Beer8()
	{
		this.price=65;
	}
	public int getprice()
	{
		return price;
	}
}
class Test8
{
	public static void main(String[] args) {
		
		Beer8[] b=Beer8.values();
		for(Beer8 b1:b)
		{
			System.out.println(b1+" "+b1.getprice());
		}
	}
}
