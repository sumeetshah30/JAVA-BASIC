import java.util.Scanner;
public class expression {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the values of v,u,a,s:");
		 double v = sc.nextInt();
		 double u = sc.nextInt();
		 double a = sc.nextInt();
		 double s = sc.nextInt();
		 double K = (v*v-u*u)/(2*a*s);
		 System.out.println(K);

	}

}
