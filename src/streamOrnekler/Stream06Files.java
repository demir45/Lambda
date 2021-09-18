package streamOrnekler;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Stream;

public class Stream06Files {

    public static void main(String[] args) throws IOException{

            String path = "src/streamOrnekler/StreamMars.txt";

            Stream<String> satirlar = Files.lines(Path.of("src/streamOrnekler/StreamMars.txt"));// Path.get()'de olur.
            satirlar.forEach(System.out::println);
            System.out.println("=============================================");
            // Bir dosyadan okunan satırları büyük harf olarak konsola yazdıralım
            //satirlar.map(x->x.toUpperCase()).forEach(System.out::println); bu satır hata verir çünkü stream 1 kere oluşur.
            //Su gibi akar gider. Bu yüzden tekrar stream oluşturmalıyız..
           // Files.lines(Path.of(path)).map(x->x.toUpperCase()).forEach(System.out::println);
            Files.lines(Path.of(path)).map(String::toUpperCase).forEach(System.out::println);
        System.out.println("=============================================");
        // Dosyadan sadece ilk satırı okuyarak büyük harflerle yazdıralım.
        Files.lines(Path.of(path)).limit(1).map(String::toUpperCase).forEach(System.out::println);
        System.out.println("=============================================");
        // sadece 3 ve 4ncü satırları büyük harf ile yazdıralım.
        Files.lines(Path.of(path)).skip(2).limit(2).map(String::toUpperCase).forEach(System.out::println);
        System.out.println("=============================================");
        //int toplam =(int)Files.lines(Path.of(path)).map(String::toLowerCase).filter(t-> t.contains("bu")).count();
        int toplam =(int)Files.lines(Path.of(path)).map(String::toLowerCase).filter(t-> t.contains("tapan")).count();
        System.out.println(toplam);// direkt de yazdırabiliriz.
        System.out.println("=============================================");
        //Dosyadaki tüm farklı kelimeleri alt alta yazdıralım.
        Files.lines(Path.of(path)).map(t-> t.toLowerCase().split(" ")).
                flatMap(Arrays::stream).distinct().forEach(System.out::println);
        System.out.println("=============================================");
        //Kelimeler içerisinde M ve m harfi olanları sayalım ve sonucu ekrana yazdıralım.
        long mSayisi = Files.lines(Path.of(path)).map(t-> t.toLowerCase().split("")).
                flatMap(Arrays::stream).filter(t-> t.contains("m")).count();
        System.out.println("Toplam m sayısı : " + mSayisi);
        System.out.println("=============================================");
        //Boşluk ve noktalama işaretleri hariç dosyada kaç adet karakter kullanıldığını
        // hesaplayarak sonucu konsola yazdıran uygulamayı yazınız.
        System.out.println(Files.lines(Path.of(path)).map(t->t ));




    }

}
