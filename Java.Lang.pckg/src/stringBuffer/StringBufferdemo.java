package stringBuffer;

public class StringBufferdemo {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());//16
		sb.append("abcdefghijklmnop");
		System.out.println(sb.capacity());//16
		sb.append("q");
		System.out.println(sb.capacity());//34
		
		StringBuffer sb1=new StringBuffer(19);
		System.out.println(sb1.capacity());//19
		
		StringBuffer sb2=new StringBuffer("akash");
		System.out.println(sb2.capacity());//21
		
		StringBuffer sb4=new StringBuffer("saiashokkumarreddy");
		System.out.println(sb4.length());//18
		System.out.println(sb4.capacity());//34
		System.out.println(sb4.charAt(14));//e
		
		StringBuffer sb5=new StringBuffer("saicharankumar");
		System.out.println(sb5);//saicharankumar
		sb.delete(6,13);
		System.out.println(sb5);//saichar
		sb.deleteCharAt(5);
		System.out.println(sb5);//saichr
		
		StringBuffer sb6=new StringBuffer("ashokkumar");
		System.out.println(sb6);//ashokkumar
		System.out.println(sb6.reverse());//ramukkohsa
		
		StringBuffer sb7=new StringBuffer("ashokkumar");
		sb.setLength(6);
		System.out.println(sb7);//ashokk
		
		StringBuffer sb8=new StringBuffer(1000);
		System.out.println(sb8.capacity());//1000
		sb.append("ashok");
		System.out.println(sb8.capacity());//1000
		sb.trimToSize();
		System.out.println(sb8.capacity());//5
		
		StringBuffer sb9=new StringBuffer();
		System.out.println(sb9.capacity());//16
		sb.ensureCapacity(1000);
		System.out.println(sb9.capacity());//1000
		
	}
}
