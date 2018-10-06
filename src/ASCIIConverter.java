package src;
import src.BaseConverter;
public class ASCIIConverter {
	public int base = 2;
	public BaseConverter baseConv;
	public static int findBit() {
	int length = 1;
	int x = base;
	while(x -1 < 128) {
	x = (x * base);
	length++;
	}
	public String convert() {
	int length = findBit();
	for(int x = 0; x <= length; x++) {
		//take string of length
		//convert to decimal
		//convert to ASCII
	}
	public static void main(String[] args) {
	for(;;) {
		System.out.println("Welcome. What is the name of the file you'd like\n to convert to ASCII Characters?");
		System.out.println("What base is the file encoded in (enter an integer)?");
		}
	}
}
