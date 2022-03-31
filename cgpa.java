import java.util.Scanner;

public class cgpa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of Subject 1 :");
		int a = sc.nextInt();
		System.out.println("Enter marks of Subject 2 :");
		int b = sc.nextInt();
		System.out.println("Enter marks of Subject 3 :");
		int c = sc.nextInt();
		int cgpa = (a+b+c)/30;
		System.out.println("Your CGPA is:"+cgpa);


		
		

	}

}
