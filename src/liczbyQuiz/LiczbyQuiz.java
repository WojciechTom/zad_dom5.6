package liczbyQuiz;

import java.util.Scanner;

public class LiczbyQuiz {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int liczba;

        System.out.println("Proszę podać liczbę");

        do {

            liczba = scan.nextInt();

            if (liczba < 100 ){
                System.out.println("Za mała");
                System.out.println("Proszę podać liczbę");
                continue;
            }

            if (liczba > 200 ){
                System.out.println("Za duża");
                System.out.println("Proszę podać liczbę");
                continue;
            }

            if (liczba%3 != 0 ){
                System.out.println("Nie podzielna przez 3");
                System.out.println("Proszę podać liczbę");
                continue;
            }

        } while (liczba < 100 || liczba > 200 || liczba % 3 != 0);

        System.out.println("Liczba prawidłowa");

    }
}
