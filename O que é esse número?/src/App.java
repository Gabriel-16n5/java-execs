import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random rand = new Random();
        int number = rand.nextInt(100);
        if(number % 2 == 0){
            System.out.println("o número " + number + " é par!");
        } else {
            System.out.println("o número " + number + " é impar!");
        }
    }
}
