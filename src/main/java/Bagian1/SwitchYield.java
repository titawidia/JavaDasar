package Bagian1;

public class SwitchYield {
    public static void main(String[] args) {

        var nilai = "A";

        // switch tanpa yield
        String ucapan;
        switch (nilai) {
            case "A" -> ucapan = "Wow, Anda Lulus Dengan Baik";
            case "B", "C" -> ucapan = "Nilai Anda Cukup Baik";
            case "D" -> ucapan = "Anda Tidak Lulus";
            default -> {
                ucapan = "Mungkin Anda Salah Jurusan";
            }
        }

        System.out.println(ucapan);

        // switch dengan yield
        ucapan = switch (nilai) {
            case "A": yield "Wow, Anda Lulus Dengan Baik";
            case "B", "C": yield "Nilai Anda Cukup Baik";
            case "D": yield  "Anda Tidak Lulus";
            default : yield  "Mungkin Anda Salah Jurusan";
        };

        System.out.println(ucapan);
    }
}
