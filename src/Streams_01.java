import java.util.ArrayList;
import java.util.List;

public class Streams_01 {

    public static void main(String[] args) {
//Stream api de pupeline de islemler lazy'dir.
//Cunku arkadan gelecek islemlerin durumu degisebileceginden dolayi.
//Terminal islemleri eager'dir.Yazilmazsa calismaz
//Stream kaynagi:collection,List,Set,Array,File...
//Ara islemler:Filter()(filtrele)->basta olmali,map()(guncelle),sorted()(sirala),findfirst(ilkeleman)
//             skip(ilk 5 elamani alma gibi-atlama),dintinc()t(tekrarsiz urun),
//             limit(sinirlama),flatMap(birden fazla coll birlestirir)
//Terminal islemleri:forEach(yazdirir),reduce()(kendi term islemi yapabiliriz ama lambda ifadesi),
//                   collect()(olusturulan degerleri yeni coll yapmak icin;Bir listeye saklamak icin),
//                   //max()(verinin max),min()(min deger),count()(kac tane o veriden var)
        List<Integer> rakamlar = new ArrayList<>();
        rakamlar.add(5);
        rakamlar.add(5);
        rakamlar.add(7);
        rakamlar.add(7);
        rakamlar.add(9);
        rakamlar.add(-1);
        rakamlar.add(2);
        rakamlar.add(4);
        rakamlar.add(-1000);
        rakamlar.add(4);

        System.out.println("==== TEK SAYILAR ======");
        rakamlar.stream().filter(t -> t%2 != 0).forEach(x ->System.out.print(x));

        System.out.println("\n==== ÇİFT SAYILAR ======");
        rakamlar.stream().filter(t -> t%2 == 0).forEach(Streams_01::yazdır);

        System.out.println("\n==== TEK SAYILAR =====");
        rakamlar.stream().filter(Streams_01::tekMi).forEach(Streams_01::yazdır);

        System.out.println("\n==== ÇİFTLERİYAZDIR SAYILAR ======");
        ciftleriYazdir(rakamlar);

    }

    public static void ciftleriYazdir(List<Integer> liste){
        //liste.stream().filter(x-> x%2==0).forEach(System.out::println);
        liste.stream().filter(Streams_01::ciftMi).forEach(Streams_01::yazdır);
    }
    public static boolean ciftMi(int x){
        return x%2==0;
    }

    public static boolean tekMi(int x){
        return x % 2 != 0;
    }


    public static void yazdır(int x){
        System.out.print( x + " ");
    }



}
