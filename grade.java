import java.util.Scanner;
public class grade {

	public static void main(String[] args) {
		char grade ='B';
		grade = (char)(grade + 8);
		System.out.println(grade);
		//Decrypting the grade
		grade = (char)(grade - 8);
		System.out.println(grade);
		
	}

}
