package Bagian1;

public class Continue {
    public static void main(String[] args) {

        // menampilkan bilangan ganjil
        for (int counter = 1; counter <= 100; counter++) {
            if (counter % 2 == 0) {
                continue;
            }
            System.out.println("Perulangan Ganjil " + counter);

            // menampilkan bilangan genap
            for (int blank = 1; blank <= 100; blank++) {
                if (blank % 2 == 1) {
                    continue;
                }

                System.out.println("Perulangan Genap " + blank);
            }
        }
    }
}
