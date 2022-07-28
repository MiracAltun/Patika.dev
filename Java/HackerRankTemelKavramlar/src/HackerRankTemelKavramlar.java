import java.util.Scanner;

public class HackerRankTemelKavramlar {
    public static void main(String[] args) {
        //kullanıcıdan veri almak için
        Scanner inp=new Scanner(System.in);

        //değişkenler
        System.out.print("dongu sayisi girin: ");
        int dongu=inp.nextInt();
        long sayi;
        String sonuc;


        for(int i=0;i<dongu;i++)
        {
            try{
                System.out.print("Bir sayi girin: ");
                sayi= inp.nextLong();

                System.out.println(sayi+" can be fitted in:");

                sonuc=(sayi>=-128 && sayi<=127)?"* byte\n":"";
                System.out.print(sonuc);

                sonuc=(sayi>=-32768 && sayi<=32767)?"* short\n":"";
                System.out.print(sonuc);

                sonuc=(sayi>=-2147483648 && sayi<=2147483647)?"* int\n":"";
                System.out.print(sonuc);

                sonuc=(sayi>=-9223372036854775808L && sayi<=9223372036854775807L)?"* long":"";
                System.out.println(sonuc);
            }
            catch (Exception e)
            {
                System.out.print(inp.next()+" can't be fitted anywhere.\n");
            }
        }


    }
}