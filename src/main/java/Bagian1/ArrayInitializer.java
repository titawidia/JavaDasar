package Bagian1;

public class ArrayInitializer {
    public static void main(String[] args) {
        String[] namaNama = {
                "Aera", "Hye", "Ren"
        };

        namaNama[0] = null; // operasi menghapus array

        int[] arrayInt = new int[] {
                1, 2, 3, 4, 5, 6, 7, 8, 9
        };

        long[] arrayLong = {
                10L, 20L, 30L
        };

        System.out.println(arrayLong.length); //operasi mengambil panjang array

    }
}
