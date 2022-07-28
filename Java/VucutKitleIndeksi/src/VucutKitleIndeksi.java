import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {
        //kullanıcıdan veri almak için
        Scanner inp=new Scanner(System.in);

        //değişkenler
        double boy,kilo,indeks;

        //kullanıcıdan veri temini
        System.out.print("Lutfen boyunuzu (metre cinsinden) giriniz: ");
        boy=inp.nextDouble();

        System.out.print("Lutfen kilonuzu (kilogram cinsinden) giriniz: ");
        kilo=inp.nextDouble();

        //hesaplama
        indeks=kilo/(boy*boy);

        System.out.println("Vucut Kitle Indeksiniz: "+indeks);

    }
}