package rumeysahoca;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class C3_MultiArrays_StreamOrnekleri {
    public static void main(String[] args) {
        String arr[][] = {
                {"Elma", "Muz"},
                {"Portakal", "Cilek", "Limon"},
                {"Havuc" , "Erik"}
        };
        //System.out.println("listele() = " + listele(arr));
        doubleYaz(arr);


    }
    // S1 : tum elemanlari list yapayim
    public static List<String> listele(String[][] arr){
        return Arrays.stream(arr).flatMap(t-> Arrays.stream(t)).collect(Collectors.toList());
    }
    // S2: E ile baslayan elemanlari double (elmaelma) olarak yazdiralim yazdiralim
    public static void doubleYaz(String[][] arr){
        Arrays.stream(arr).flatMap(t-> Arrays.stream(t)).map(t-> t+t).forEach(t-> System.out.println(t));
    }
    //k ile bitenlerin sonuna '*' ekleyelim
}


