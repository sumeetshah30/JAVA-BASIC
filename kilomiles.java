import java.util.Scanner;
public class kilomiles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your distance in kilometre :");
        Double kilo = sc.nextDouble();
        Double miles= kilo*0.621371;
        System.out.println(" Kilometres to miles:"+miles);
        
	}

}
