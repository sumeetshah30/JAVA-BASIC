import java.util.Scanner;

public class marks {

	public static void main(String[] args) {
		int m1,m2,m3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Marks in Physics :");
		m1 = sc.nextInt();
		System.out.println("Enter Your Marks in Biology :");
		m2 = sc.nextInt();
		System.out.println("Enter Your Marks in Mathematics :");
		m3 = sc.nextInt();
		float avg = (m1+m2+m3)/3.0f;
		if(avg>=40 && m1>=33 && m2>=33 && m3>=33) {
			System.out.println("You have Passed!");
		}
		else {
			System.out.println("Failed! Try luck next time");
		}

	}

}
