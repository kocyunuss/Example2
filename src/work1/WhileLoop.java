package work1;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen sayı girin : ");
        int girilenSayi = scan.nextInt();

        int sayi = girilenSayi;
        int birlerBasamagi = 0;
        int rakamlarToplami = 0;

        while (sayi>0){


            birlerBasamagi = sayi%10;
            rakamlarToplami+= birlerBasamagi;
            sayi/=10;





        }

        System.out.println("Girilen sayı " + girilenSayi + " 'nin rakamlar toplamı : " + rakamlarToplami);






    }


}
