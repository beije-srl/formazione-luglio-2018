
public class Converter {

	public static String fromBase10aBaseX(int value, int newBase) {
		int val = value;
		String retVal = "";
		while (val > 0) {
			int cVal = val % newBase;
			String carattere = cVal >= 10 ?  Character.toString((char) (cVal + 55)) : String.valueOf(cVal);
			retVal += carattere;
			val = Math.abs(val / newBase);
		}
		return new StringBuilder(retVal).reverse().toString();
	}

	public static int fromBaseXaBase10(String value, int base) {
		value = value.toUpperCase();
		value = new StringBuilder(value).reverse().toString();
		double result = 0;
		for (int i = 0; i < value.length(); i++) {
			char c = value.charAt(i);
			double integerValue;
			integerValue = c>='A' ? c - 55 : c-48;
			result += integerValue * Math.pow(base, i);
		}

		return (int) result;
	}

	public static void main(String[] args) {

		System.out.println(fromBase10aBaseX(256,20));
		System.out.println(fromBaseXaBase10("CACCA", 16));
	}
}
