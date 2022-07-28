import java.util.Scanner;

public class NotOrtalmasi {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in); //kullanıcıdan ver alabilmek için ekran okuma nesnesini oluşturduk.

        //değişkenler
        int mat,fizik,kimya,turk,tarih,muzik,toplam;
        double ortalama;
        String sonuc;

        //kullaıcıdan veri alma sırası
        System.out.print("Matematik dersi notunuzu girin: ");
        mat=inp.nextInt();

        System.out.print("Fizik dersi notunuzu girin: ");
        fizik=inp.nextInt();

        System.out.print("Kimya dersi notunuzu girin: ");
        kimya=inp.nextInt();

        System.out.print("Turkce dersi notunuzu girin: ");
        turk=inp.nextInt();

        System.out.print("Tarih dersi notunuzu girin: ");
        tarih=inp.nextInt();

        System.out.print("Muzik dersi notunuzu girin: ");
        muzik=inp.nextInt();

        //ortalama hesapla
        toplam=(mat+fizik+kimya+turk+tarih+muzik);
        ortalama=toplam/6.0;
        System.out.println("\nNotlarinizin ortalamasi: "+ortalama);

        //sorgu sırası
        sonuc=(ortalama>=60)?"Sinifi Gecti":"Sinifta Kaldi";
        System.out.println(sonuc);

    }
}