import java.util.Scanner;

public class TaksimetreHesaplama {
    public static void main(String[] args) {

        //kullanıcıdan veri almak için
        Scanner inp=new Scanner(System.in);

        //değişkenler
        int km;
        double taksimetre=2.20,toplam,baslangicFiyati=10;

        System.out.print("Alinan yolu KM cinsinden giriniz: ");
        km=inp.nextInt();

        toplam=km*taksimetre;
        toplam+=baslangicFiyati;

        toplam=(toplam<20)?20:toplam;
        System.out.println("Odenecek toplam taksimetre ucreti: "+toplam);


    }
}