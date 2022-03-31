
public class tommyvecetti {
	public void hit() {
		System.out.println("Hitting THe Enemy");
	}
	public void run() {
		System.out.println("Running THe Enemy");
	}
	public void fire() {
		System.out.println("firing  on THe Enemy");
	}
	public static void main(String[] args) {
		tommyvecetti player1 = new tommyvecetti();
		player1.fire();
		player1.hit();
		player1.run();
	}

}
