
public class square {
	int side;
	public int area() {
		return side*side;
	}public int perimeter() {
		return 4*side;
	}
	
	public static void main(String[] args) {
		square example = new square();
		example.side = 3;
		System.out.println(example.area());
		System.out.println(example.perimeter());

		
	}

}
