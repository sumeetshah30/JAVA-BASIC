import java.util.Scanner;

public class percentage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of Subject 1 :");
		int a = sc.nextInt();
		System.out.println("Enter marks of Subject 2 :");
		int b = sc.nextInt();
		System.out.println("Enter marks of Subject 3 :");
		int c = sc.nextInt();
		System.out.println("Enter marks of Subject 4 :");
		int d = sc.nextInt();
		System.out.println("Enter marks of Subject 5 :");
		int e = sc.nextInt();
		double percentage = (a+b+c+d+e)*0.2;
		System.out.println("the percentage is:"+percentage);
		//System.out.println(percentage);

		
		

	}

}
