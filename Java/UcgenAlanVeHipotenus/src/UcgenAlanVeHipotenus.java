import java.util.Scanner;

public class UcgenAlanVeHipotenus {
    public static void main(String[] args) {
        //kullanıcıdan veri almak için
        Scanner inp=new Scanner(System.in);

        //değişkenler
        int a,b,c,u;
        double alan,hipotenus;

        System.out.print("Ucgenin a kenarini giriniz: ");
        a=inp.nextInt();

        System.out.print("Ucgenin b kenarini giriniz: ");
        b=inp.nextInt();

        System.out.print("Ucgenin c kenarini giriniz: ");
        c=inp.nextInt();

        u=(a+b+c)/2;
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Verilen a ve b kenarinin dik ucgene ait oldugu varsayilarak c kenari yani hipotenus hesaplanıyor.");
        hipotenus=Math.sqrt((a*a)+(b*b));

        System.out.println("Hipotenus:"+hipotenus);
        System.out.println("Alan:"+alan);





    }
}