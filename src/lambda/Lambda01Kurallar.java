package lambda;

import java.util.Arrays;
import java.util.List;

public class Lambda01Kurallar {
    public static void main(String[] args) {

        List<Integer> liste = Arrays.asList(1, 2, 3, 4, 5);

        liste.forEach(t -> System.out.println(t + 2 + " "));
        liste.forEach(t -> {
            int miktar = 2;
            System.out.println(t + miktar + " ");
        });


    }
}
