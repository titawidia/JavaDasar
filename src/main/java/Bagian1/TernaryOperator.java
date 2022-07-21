package Bagian1;

public class TernaryOperator {
    public static void main(String[] args) {

        var nilai = 75;
        String ucapan;

        // tanpa ternary operator
        if(nilai >= 75) {
            ucapan = "Selamat Anda Lulus";
        } else {
            ucapan = "Silahkan Coba Lagi";
        }

        System.out.println(ucapan);

        // dengan ternary operator
        var absen = 70;
        String ungkapan = absen >= 75 ? "Selamat Anda Lulus" : "Silahkan Coba Lagi";

        System.out.println(ungkapan);
    }
}
