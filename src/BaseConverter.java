public class BaseConverter {

	public int convertToBase(int num, int base) {
		String convNum = "";
		String s;
		while(num!=0) {
			s =  (num%base) + "";
			convNum = s + convNum;
			num = num/base;
		}
		return Integer.parseInt(convNum);
	}
	public int convertToDec(int num, int base) {
		int pow = 0;
		int x;
		int y = 0;
		while(num!=0) {
			x = num%10;
			num = num/10;
			y = (int)(x*(Math.pow(base,pow)) + y);
			pow++;
		}
		return y;
	}
}


