package rumeysahoca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class C6_Obje_Kullanimi2 {
    public static void main(String[] args) {
        Ogretmen ogretmen1 = new Ogretmen("Hafsa", "Sultan", "Matematik", 25, 3);
        Ogretmen ogretmen2 = new Ogretmen("Hakan", "Uslu", "Fen", 50, 25);
        Ogretmen ogretmen3 = new Ogretmen("Ali", "San", "Bilgisayar", 35, 10);
        Ogretmen ogretmen4 = new Ogretmen("Canan", "Okur", "Resim", 40, 15);
        Ogretmen ogretmen5 = new Ogretmen("Zeynep", "Bulut", "Kimya", 30, 7);
        Ogretmen ogretmen6 = new Ogretmen("Can", "Tan", "Edebiyat", 46, 21);
        Ogretmen ogretmen7 = new Ogretmen("Zeynep", "Bul", "Matematik", 35, 12);
        Ogretmen ogretmen8 = new Ogretmen("Cansu", "KUL", "Edebiyat", 26, 4);
        List<Ogretmen> list = new ArrayList<>();
        list.add(ogretmen1);
        list.add(ogretmen2);
        list.add(ogretmen3);
        list.add(ogretmen4);
        list.add(ogretmen5);
        list.add(ogretmen6);
        list.add(ogretmen7);
        list.add(ogretmen8);
        //System.out.println(list);

       // otuzdanBuyuk(list);
        yasSıralaAdYaz(list);

    }

    //S1 : yasi 30DAN buyuk olanlari listeleyelim
        public static void otuzdanBuyuk(List<Ogretmen> list){
        list.stream().filter(t-> t.getYas()>30).forEach(System.out::println);
        //list.stream().filter(t-> t.getYas()>30).forEach(t-> System.out.println(t.getOgretmenADI() + " : "+t.getYas()));
        }

    // S2 : 10 yildan fazla calisan var mi

    // S3 : isimlerini alfabedik siraya gore sirala

// S4: bransi matematik olanlari listeleyelim

    //S5: bransi geometri  olmayan var mi

    //  S6: yaslarinin buyukten kucuge siralayalim ve ya ve adlari yazdiralim
    public static void yasSıralaAdYaz(List<Ogretmen> list){
      list.stream().sorted(Comparator.comparing(Ogretmen::getYas ).reversed()).forEach(t-> System.out.println(t.getOgretmenADI() + " : "+t.getYas()));

    }
}
