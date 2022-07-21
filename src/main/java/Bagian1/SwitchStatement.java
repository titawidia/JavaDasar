package Bagian1;

public class SwitchStatement {
    public static void main(String[] args) {

        var nilai = "A";

        switch (nilai) {
            case "A":
                System.out.println("Wow, Anda Lulus Dengan Baik");
                break; // untuk menghentikan percabangan
            case "B":
            case "C":
                System.out.println("Nilai Anda Lulus Cukup Baik");
                break; // untuk menghentikan percabangan
            case "D":
                System.out.println("Anda Tidak Lulus");
                break; // untuk menghentikan percabangan
            default: // fungsinya sama dengan else
                System.out.println("Mungkin Anda Salah Jurusan");
        }
    }
}
