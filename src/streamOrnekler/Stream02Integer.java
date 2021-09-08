package streamOrnekler;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Stream02Integer {
    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();
        liste.add(12);
        liste.add(9);
        liste.add(13);
        liste.add(4);
        liste.add(9);
        liste.add(2);
        liste.add(4);
        liste.add(12);
        liste.add(15);

        tekKareYazdir(liste);
        System.out.println("Toplam : " + tekKüpToplami(liste));

    }

    public static void tekKareYazdir(List<Integer> l){

       // l.stream().filter(Streams_01::tekMi).map(x-> x*x).forEach(Streams_01::yazdır);
         l.stream().filter(Metotlar::tekMi).distinct().map(x-> x*x).forEach(Metotlar::yazdir);


    }
    public static Integer tekKüpToplami(List<Integer> l){

       //return l.stream().filter(Streams_01::tekMi).map(x-> x*x*x).reduce(0,(x,y)->(x+y));
       // return l.stream().filter(Streams_01::tekMi).map(x-> x*x*x).reduce(Math::addExact);
        return l.stream().filter(Metotlar::tekMi).map(x-> x*x*x).reduce(0,Integer::sum);
    }



}
