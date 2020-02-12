
public class test {

	public static void main(String args[]) {
		byte b1 = (byte)0b00100001;
		//int i = b1;
		
		//System.out.println(b1 + " / " + i);
		
		int i = Bin2Dec.bin2Dec(b1);
		System.out.println(i);
		
		
	}
	
}
