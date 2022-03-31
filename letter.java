import java.util.Scanner;
public class letter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name :");
		String letter="Dear name,Thanks a Lot";
		System.out.println(letter.replace("name",sc.nextLine()));

	}

}





