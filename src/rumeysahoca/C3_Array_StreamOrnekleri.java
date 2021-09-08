package rumeysahoca;
// Arraylerde Stream kullanabilmek icin 2 yol vardir
// 1) Stream <Integer> isim=StreamOf(cevrilecek olan)
// 2) Arrays.stream(arr).

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class C3_Array_StreamOrnekleri {
    public static void main(String[] args) {
        Integer arr [] ={1,5,-5,6,12,-8,9,3,4}; // primitive tipleri stream method'lara sokamıyoruz.
        int arr1 [] ={1,5,-5,6,12,-8,9,3,4};
        //System.out.println("listele(arr) = " + listele(arr));
        //System.out.println("elemanlarToplami1(arr1) = " + elemanlarToplami1(arr1));
        ort01(arr1);
        System.out.println("ort02(arr1) = " + ort02(arr1));

    }
    //S1: arrayin elemanlarini bir liste yazdiralim
    public static List<Integer> listele(Integer [] arr){
        return Arrays.stream(arr).collect(Collectors.toList());
    }
    //S2: Arrayin elemanlarini toplamini bulalim
    public static int elemanlarToplami(Integer [] arr){
        Stream<Integer> arr1 = Stream.of(arr);
        return arr1.reduce(0, (x,y) -> x+y );
    }
    public static int elemanlarToplami1(int [] arr1){
        return Arrays.stream(arr1).sum();
    }
    // S3: Array in elemanlarinin ortalamasini bulalim

    public static void ort01(int[] arr){
        Arrays.stream(arr).average().ifPresent(t-> System.out.println(t));
    }
    public static int ort02(int[] arr){
        return Arrays.stream(arr).reduce(0,(x,y) -> (x+y))/arr.length;
    }

}
