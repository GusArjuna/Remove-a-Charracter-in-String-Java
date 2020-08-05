// Copyright M. Taufan Ma'ruf 1461900089
package penghilanghuruf;
import java.util.Scanner;
public class X0089ETS2 {
    public static void main(String[] args) {
        String kalimat,huruf;
        Scanner in=new Scanner(System.in);
        System.out.print("Masukkan Kalimat : ");
        kalimat=in.nextLine();
        System.out.print("Masukkan huruf yang di hilangkan : ");
        huruf=in.nextLine();
        kalimat = kalimat.replaceAll(huruf, "");
        System.out.println(kalimat);
    }
}
