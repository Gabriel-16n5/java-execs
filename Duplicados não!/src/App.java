import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        String[] array1 = {"sapo", "sapa", "pipoca", "sapato", "amoamar"};
        String[] array2 = {"sapo", "sapão", "pipoco", "sapata", "amoamar", "paçoca"};

        for(int i = 0; i<array2.length;i++){
            for(int j = 0; j<array2.length;j++){
                if(array1[i] == array2[j]){
                    System.out.println(array1[i]);
                }
            }
        }

        
    }
}
