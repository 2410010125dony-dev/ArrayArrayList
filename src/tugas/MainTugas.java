package tugas;

public class MainTugas {
    public static void main(String[] args) {

        // ── 4. Array String mata kuliah (ukuran tetap, minimal 3) ────────────
        String[] mataKuliah = {
            "Pemrograman Berbasis Objek 1",
            "Basis Data",
            "Struktur Data",
            "Matematika Diskrit"
        };

        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║          DAFTAR MATA KULIAH              ║");
        System.out.println("╚══════════════════════════════════════════╝");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.println("  " + (i + 1) + ". " + mataKuliah[i]);
        }
        System.out.println();

        // ── Buat objek pengelola kelas ───────────────────────────────────────
        KelasKuliah kelas = new KelasKuliah();

        // ── Tambah minimal 5 mahasiswa ───────────────────────────────────────
        kelas.tambahMahasiswa(new Mahasiswa("Andi Saputra",    "2023001", 85.0));
        kelas.tambahMahasiswa(new Mahasiswa("Budi Santoso",    "2023002", 72.5));
        kelas.tambahMahasiswa(new Mahasiswa("Citra Dewi",      "2023003", 55.0));
        kelas.tambahMahasiswa(new Mahasiswa("Dian Purnama",    "2023004", 91.0));
        kelas.tambahMahasiswa(new Mahasiswa("Eko Prasetyo",    "2023005", 48.5));

        // ── Tampilkan seluruh data awal ──────────────────────────────────────
        kelas.tampilkanSemua();
        System.out.println();

        // ── 5. Rata-rata nilai dan jumlah mahasiswa lulus ────────────────────
        System.out.printf("Rata-rata nilai  : %.2f%n", kelas.hitungRataRata());
        System.out.println("Jumlah lulus     : " + kelas.jumlahLulus());
        System.out.println();

        // ── 6. Tambah satu mahasiswa baru, tampilkan jumlah terbaru ─────────
        System.out.println(">> Menambahkan mahasiswa baru...");
        kelas.tambahMahasiswa(new Mahasiswa("Fitri Handayani", "2023006", 78.0));

        kelas.tampilkanSemua();
        System.out.println();
        System.out.printf("Rata-rata nilai  : %.2f%n", kelas.hitungRataRata());
        System.out.println("Jumlah lulus     : " + kelas.jumlahLulus());
    }
}
