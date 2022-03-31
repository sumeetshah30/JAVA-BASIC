
public class rectangle {
	int l,b;
	public int area() {
		return l*b;
	}public int perimeter() {
		return 2*(l*b);
	}
	
	public static void main(String[] args) {
		rectangle example = new rectangle();
		example.l = 3;
		example.b = 3;
		System.out.println(example.area());
		System.out.println(example.perimeter());

		
	}

}
