package bagian3.perpustakaan;

public class MainPerpustakaan {
    public static void main(String[] args) {
        // Membuat objek pengelola
        Perpustakaan perpus = new Perpustakaan();

        // Membuat objek Buku lalu memasukkannya ke koleksi
        perpus.tambahBuku(new Buku("Laskar Pelangi",  "Andrea Hirata", 2005));
        perpus.tambahBuku(new Buku("Bumi Manusia",    "Pramoedya",     1980));
        perpus.tambahBuku(new Buku("Negeri 5 Menara", "Ahmad Fuadi",   2009));
        perpus.tambahBuku(new Buku("Anak Semua Bangsa","Pramoedya",    1980));

        perpus.tampilkanKoleksi();
        System.out.println();

        // Uji pinjam buku
        perpus.pinjamBuku("Bumi Manusia");
        perpus.pinjamBuku("Bumi Manusia");   // coba pinjam kedua kali
        System.out.println();

        perpus.tampilkanKoleksi();
        System.out.println("Buku tersedia: " + perpus.jumlahTersedia());
        System.out.println();

        // Latihan 3.4 No. 1 – kembalikan buku
        perpus.kembalikanBuku("Bumi Manusia");
        System.out.println();

        perpus.tampilkanKoleksi();
        System.out.println("Buku tersedia: " + perpus.jumlahTersedia());
        System.out.println();

        // Latihan 3.4 No. 3 – cari berdasarkan penulis
        perpus.cariPenulis("Pramoedya");
    }
}
