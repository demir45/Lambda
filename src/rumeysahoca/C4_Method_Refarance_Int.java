package rumeysahoca;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class C4_Method_Refarance_Int {
    public static void main(String[] args) {
        List<Integer> intList= Arrays.asList(-2,-8,-5,0,2,5,6,7,15,6,8);

        System.out.println("negatifKareToplam(int1) = " + negatifKareToplam(intList));

    }
    // S1: tekleri aralarinda bir bosluk birakarak yazdiralim
    public static void tekYaz(List<Integer> liste){
        liste.stream().filter(Methods::tekMi).forEach(Methods::yaz);
    }

    // S2: ciftlein carpimini bulalim
    public static Optional<Integer> ciftCarp(List<Integer> liste){
        return liste.stream().filter(Methods::ciftMi).reduce(Math::multiplyExact);
    }

    // S3: negatiflerin kare toplamlarini  bulalim
    public static int negatifKareToplam(List<Integer> liste){
        return liste.stream().filter(Methods::negatifMi).map(t-> t*t).reduce(0,(x,y)->x+y);
    }

    //S4: poziflerin kuplerinden max yazdiralim
}
