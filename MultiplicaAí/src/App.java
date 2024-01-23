import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random rand = new Random();
        int x = rand.nextInt(100);

        for(int i = 1; i<=10; i++){
            System.out.println(x + " x " + i + " = " + (x*i));
        }

    }
}
