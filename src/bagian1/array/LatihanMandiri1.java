package bagian1.array;

public class LatihanMandiri1 {
    public static void main(String[] args) {

        // ── Latihan 1: Suhu tertinggi dan terendah ──────────────────────────
        System.out.println("=== Latihan 1: Suhu Harian ===");
        double[] suhu = {30.5, 28.0, 33.2, 27.8, 31.1, 29.4};
        double max = suhu[0], min = suhu[0];
        for (double s : suhu) {
            if (s > max) max = s;
            if (s < min) min = s;
        }
        System.out.println("Suhu tertinggi: " + max);
        System.out.println("Suhu terendah : " + min);

        // ── Latihan 2: Nama hari dengan lebih dari 5 huruf ──────────────────
        System.out.println("\n=== Latihan 2: Nama Hari (> 5 huruf) ===");
        String[] namaHari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
        for (String hari : namaHari) {
            if (hari.length() > 5) {
                System.out.println(hari);
            }
        }

        // ── Latihan 3: Hitung angka genap ───────────────────────────────────
        System.out.println("\n=== Latihan 3: Hitung Angka Genap ===");
        int[] angka = {4, 8, 15, 16, 23, 42};
        int genap = 0;
        for (int a : angka) {
            if (a % 2 == 0) genap++;
        }
        System.out.println("Jumlah angka genap: " + genap);
    }
}
