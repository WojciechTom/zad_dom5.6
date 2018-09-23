package liczbyParzyste;

public class LiczbyParzyste {
    public static void main(String[] args) {

        int suma = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + ", ");
                suma = suma + i;
            }
        }

        System.out.println("Suma: " + suma);
    }
}
