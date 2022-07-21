package Bagian1;

public class Scope {
    public static void main(String[] args) {

        sayHello("Aera");
    }

    static void sayHello(String name) {
        String hello = "Hello " + name;

        if (!name.isBlank()) { // block
            String hi = "Hi " + name;
            System.out.println(hi);
        } // block end

        System.out.println(hello);
    }
}
