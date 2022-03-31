
public class cellphone {
	public void ring() {
		System.out.println("Ringing...");
	}
	public void vibrate() {
		System.out.println("Vibrating...");
	}
	public void callfriend() {
		System.out.println("Calling dhiraj...");
	}
	public static void main(String[] args) {
		cellphone samsung = new cellphone();
		samsung.ring();
		samsung.vibrate();
		samsung.callfriend();
	}

}

