import java.util.Scanner;
public class tempfun {
static float conversion(float c) {
	float f = (c*9/5)+32;
	return f;
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float Celsius = sc.nextFloat();
		float result = conversion(Celsius);
	}

}
