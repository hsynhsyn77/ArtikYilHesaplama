import java.util.Scanner;

public class Proje_15 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int yil,kalan;
        System.out.print("Herhangi bir yıl giriniz.  :");
        yil=scanner.nextInt();
        kalan=yil%4;
        if(kalan==0)
        {
            System.out.println(yil + " Bir artık yıldır.");
        }

        else
        {
            System.out.println(yil + " Bir artık yıl değildir.");
        }
    }
}
