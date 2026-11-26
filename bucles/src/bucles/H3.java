package bucles;

import java.util.Random;

public class H3 {
    public static void main(String[] args) {
        Random random = new Random();
        char letraMinuscula = (char) ('a' + random.nextInt(26));
        System.out.println(letraMinuscula);
    }
}




