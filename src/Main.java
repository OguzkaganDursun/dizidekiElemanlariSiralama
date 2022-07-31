import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Dizinin boyutu kullanicidan alindi.
        System.out.print("Dizinin Boyutunu Giriniz (Kac Adet Sayi) : ");
        int diziBoyutu = scan.nextInt();
        System.out.println();

        //Alinan deger diziye atandi.
        int[] dizi = new int[diziBoyutu];

        //Dizinin elemanlari kullanicidan istendi.
        for (int i = 0; i < diziBoyutu; i++)
        {
            System.out.print("Dizinin " + (i+1)+ "." + " Elemanini Yaziniz : ");
            dizi[i] = scan.nextInt();
        }

        //Girilen dizi ilk basta normal olarak sonra da siralanarak ekrana yazdirildi.
        System.out.println();
        System.out.println("Girdiginiz Sayilardan Olusan Dizi : " + Arrays.toString(dizi));

        Arrays.sort(dizi);
        System.out.println();
        System.out.println("Dizinin Elemanlarinin Kucukten Buyuge Siralanmis Hali : " + Arrays.toString(dizi));




    }
}
