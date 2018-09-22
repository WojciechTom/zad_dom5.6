package Cwiartki;
import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Cwiartki {

    public static void main(String[] args) {

        double x;
        double y;
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadź wspołrzędną X");
        x = scan.nextDouble();

        System.out.println("Wprowadź wspołrzędną Y");
        y = scan.nextDouble();
        scan.nextLine();


        if (x>0 && y>0) {
            System.out.println("ćwiartka pierwsza");
        }

        if (x>0 && y<0) {
            System.out.println("ćwiartka druga");
        }

        if (x<0 && y<0) {
            System.out.println("ćwiartka trzecia");
        }
        if (x<0 && y>0) {
            System.out.println("ćwiartka czwarta");
        }
        if (x==0 && y==0) {
            System.out.println("Początek układu - punkt (0,0)");
        }




    }

}
