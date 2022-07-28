import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        //kullanıcıdan veri almak için
        Scanner inp=new Scanner(System.in);

        //değişkenler
        double elma=3.67,armut=2.14,domates=1.11,muz=0.95,patlican=5.0,toplam=0.0,kg;

        //kullanıcıdan veri temini
        System.out.print("Kac kilo armut?: ");
        kg= inp.nextDouble();
        toplam+=kg*armut;

        System.out.print("Kac kilo elma?: ");
        kg= inp.nextDouble();
        toplam+=kg*elma;

        System.out.print("Kac kilo domates?: ");
        kg= inp.nextDouble();
        toplam+=kg*domates;

        System.out.print("Kac kilo muz?: ");
        kg= inp.nextDouble();
        toplam+=kg*muz;

        System.out.print("Kac kilo patlican?: ");
        kg= inp.nextDouble();
        toplam+=kg*patlican;

        System.out.print("Toplam Tutar: "+toplam+" TL");
    }
}