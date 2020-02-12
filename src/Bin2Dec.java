
public class Bin2Dec {

	public static int bin2Dec(String input) {
		int res = 0;
		for(int i = 0; i < input.length(); i++) {
			int pow = (int) Math.pow(2, i);
			res += Character.getNumericValue(input.charAt(input.length()-1-i))*pow;
		}
		return res;
	}
}
