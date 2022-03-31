public class patternfun{
static void pattern_2(int n){
        for (int i=1;i<=n;i++){
            for (int j=i;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }

}
public static void main(String[] args) {
	pattern_2(4);
}

}
    