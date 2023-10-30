package Tugas1;

/**
 * kelas ini digunakan untuk menghitung rata rata penghasilan
 */
public class HitungRataRataPenghasilan {
    public static void main(String[] args) {
        /**
         * contoh data penghasilan
         */

        int[] penghasilan = {1000, 1500, 2000, 2500, 3000};
        /**
         * Digunakan untuk menghitung total penghasilan
         */
        int totalPenghasilan = 0;
        for (int i = 0; i < penghasilan.length; i++) {
            totalPenghasilan += penghasilan[i];
        }

        /**
         * digunakan untuk Menghitung rata-rata
          */
        double rataRata = (double) totalPenghasilan / penghasilan.length;

        /**
         * menampilkan rata rata penghasilan
         */
        System.out.println("Rata-rata penghasilan: " + rataRata);
    }
}
