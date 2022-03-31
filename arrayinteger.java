
public class arrayinteger {

	public static void main(String[] args) {
		
		float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float num = 45.57f;
        boolean isinArray = false;
        for(float element:marks){
            if(num==element){
                isinArray = true;
                break;
	}
        }
	}
}
