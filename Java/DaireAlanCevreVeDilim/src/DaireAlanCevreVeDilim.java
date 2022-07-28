import java.util.Scanner;

public class DaireAlanCevreVeDilim {
    public static void main(String[] args) {
        //kullanıcıdan veri almak için
        Scanner inp=new Scanner(System.in);

        //değişkenler
        double pi=3.14,alan,cevre,dilim;
        int r,aci;

        //kullanıcıdan değerleri alma
        System.out.print("Dairenin yaricapini giriniz: ");
        r=inp.nextInt();

        System.out.print("Dairenin merkez acisini giriniz: ");
        aci=inp.nextInt();

        //hesaplamalar
        alan=pi*r*r;
        cevre=2*pi*r;
        dilim=(pi*(r*r)*aci)/360;

        //yazdırma
        System.out.println("Dairenin Alani: "+alan);
        System.out.println("Dairenin Cevresi: "+cevre);
        System.out.println("Daire Dilimi: "+dilim);

    }
}
