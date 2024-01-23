import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random rand = new Random();
        int number = rand.nextInt(100);

        for(int i = 1;i<=number;i++){
            String numeroString = String.valueOf(i);
            String a = "";
            for(int j = 1;j<=i;j++){
                a = a + numeroString;
            }
            System.out.println(a);
        }

    }
}
