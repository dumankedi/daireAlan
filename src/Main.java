import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        int r;
        double pi=3.14,alan,cevre;
        System.out.print("Dairenin yarı çapını giriniz: ");
        r= input.nextInt();
        alan=pi*r*r;
        cevre=2*pi*r;
        System.out.println("Dairenin Alanı: "+alan);
        System.out.println("Dairenin Çevresi: "+cevre);
    }
}