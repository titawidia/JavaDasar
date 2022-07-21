package Bagian1;

public class MethodParameter {
    public static void main(String[] args) {

        sayHello("Aera", "Hye Ren"); // method-parameter
    }
    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
