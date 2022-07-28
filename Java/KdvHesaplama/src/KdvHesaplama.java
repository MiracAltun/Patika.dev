import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        //kullanıcıdan veri alabilmek için
        Scanner inp=new Scanner(System.in);

        //değişkenler
        double kdv,para,kdvliPara,kdvTutari;

        //kullanıcıdan veri temini
        System.out.print("Hesaplamak istediginiz para miktarini giriniz:");
        para=inp.nextDouble();

        //kdv ne kadar olucak
        //para>1000 ise 0.8 ; 0<para>=1000 ise 0,18
        kdv=(para>1000)?0.8:0.18;

        kdvTutari=kdv*para;
        kdvliPara=kdvTutari+para;

        System.out.println("Eski Paraniz: "+para);
        System.out.println("KDV tutari: "+kdvTutari);
        System.out.println("KDV'li yeni para: "+kdvliPara);






    }
}