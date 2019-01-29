
public class Ch4hw {
	public static String rep1 (String i, int j) {
		String ret = "";
	for (int k = 0; k<j;k++) {
		ret +=i;
	
	}
	return ret;
	}
	
	public static void main (String[]args) {
		System.out.println(rep1("hello",3));
	} 
}