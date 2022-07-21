package Bagian1;

public class ForLoop {
    public static void main(String[] args) {

        var counter = 1;

        // perulangan dengan kondisi
        for (; counter <= 10; ) {
            System.out.println("Perulangan " + counter);
            counter++;
        }

        // perulangan dengan init statement
        for (var blank = 1; blank <= 10; ) {
            System.out.println("Perulangan " + blank);
            blank++;
        }

        // perulangan dengan post statement
        for (var distance = 1; distance <= 10; distance++) {
            System.out.println("Perulangan " + distance);

        }
    }
}
