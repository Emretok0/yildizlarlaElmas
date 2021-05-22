import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Basamak sayısı: ");

        int basamakSayisi = in.nextInt();
        int ilkBosluk = basamakSayisi - 1;
        int ilkYildiz = 1;

        int ilkYildiz1 = ilkYildiz;
        int ilkBosluk1 = ilkBosluk;
        int basamakSayisi1 = basamakSayisi;

        while (basamakSayisi1 > 0) {
            for (int i = 0; i < ilkBosluk1; i++) {
                System.out.print(" ");
            }
            for (int a = 0; a < ilkYildiz1; a++) {
                System.out.print("*");
            }
            System.out.println();
            ilkBosluk1--;
            ilkYildiz1 += 2;
            basamakSayisi1--;
        }

        int ilkYildiz2 = ilkYildiz1-4;
        int ilkBosluk2 = 1;
        int basamakSayisi2 = basamakSayisi;

        while (basamakSayisi2 > 0) {
            for (int b = 0; b<ilkBosluk2; b++){
                System.out.print(" ");
            }
            ilkBosluk2++;
            for (int c =0; c<ilkYildiz2; c++){
                System.out.print("*");
            }
            System.out.println();
            ilkYildiz2-=2;
            basamakSayisi2--;
        }


    }
}
