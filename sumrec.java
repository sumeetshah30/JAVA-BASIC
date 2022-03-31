 
public class sumrec {
	static int sumrect(int n) {
		if(n==1) {
			return 1;
		}
		return n + sumrect(n-1);
	} 
	public static void main(String[] args) {
		int c = sumrect(4);
		System.out.println(c);
	}

}
