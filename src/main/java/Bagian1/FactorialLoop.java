package Bagian1;

public class FactorialLoop {
    public static void main(String[] args) {

        System.out.println(factorialLoop(5));
    }

    static int factorialLoop(int value) {
        var result = 1;

        for (var counter = 1; counter <= value; counter++) {
            result *= counter;
        }

        return result;
    }
}
