package Bagian1;

public class ErrorStackOverflow {
    public static void main(String[] args) {

        loop(10); // tidak bisa lebih dari 4000
    }
    static void  loop(int value) {
        if (value == 0) {
            System.out.println("Selesai");
        } else {
            System.out.println("Loop " + value);
            loop(value - 1);
        }
    }
}
