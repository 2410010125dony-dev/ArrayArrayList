package tugas;

import java.util.ArrayList;

public class KelasKuliah {
    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

    // Menambah satu mahasiswa ke daftar
    public void tambahMahasiswa(Mahasiswa m) {
        daftarMahasiswa.add(m);
    }

    // Menghitung rata-rata nilai seluruh mahasiswa
    public double hitungRataRata() {
        if (daftarMahasiswa.isEmpty()) return 0;
        double total = 0;
        for (Mahasiswa m : daftarMahasiswa) {
            total += m.getNilai();
        }
        return total / daftarMahasiswa.size();
    }

    // Menghitung jumlah mahasiswa yang lulus
    public int jumlahLulus() {
        int lulus = 0;
        for (Mahasiswa m : daftarMahasiswa) {
            if (m.lulus()) lulus++;
        }
        return lulus;
    }

    // Menampilkan seluruh data mahasiswa
    public void tampilkanSemua() {
        System.out.println("╔══════════════════════════════════════════════════════╗");
        System.out.println("║              DAFTAR NILAI MAHASISWA                 ║");
        System.out.println("╠══════════════════════════════════════════════════════╣");
        System.out.printf("║  %-20s %-12s %6s  %-13s║%n",
                "Nama", "NPM", "Nilai", "Keterangan");
        System.out.println("╠══════════════════════════════════════════════════════╣");
        for (Mahasiswa m : daftarMahasiswa) {
            System.out.println("║  " + m + "  ║");
        }
        System.out.println("╚══════════════════════════════════════════════════════╝");
        System.out.println("Jumlah data   : " + daftarMahasiswa.size());
    }
}
