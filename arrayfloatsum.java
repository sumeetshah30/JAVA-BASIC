
public class arrayfloatsum {

	public static void main(String[] args) {
	
        float [] marks = {45.7f, 68.8f, 63.4f, 99.2f, 100.0f};
        float sum = 0;
        for(float values:marks){
            sum = sum + values;
        }
        System.out.println("The value of sum is " + sum);

	}

}
