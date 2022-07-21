package Bagian1;

public class ForEach {
    public static void main(String[] args) {

        // tanpa for each
        String[] names = {
                "Aera", "Hye", "Ren",
                "Programmer", "Zaman", "Now"
        };

        for (var i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("------------------------------");

        // dengan for each
        for (var name: names) {
            System.out.println(name);
        }
    }
}
