package bagian3.perpustakaan;

public class Buku {
    // Atribut: data yang dimiliki setiap buku
    private String judul;
    private String penulis;
    private int    tahunTerbit;   // Latihan 3.4 No. 2
    private boolean dipinjam;

    // Constructor
    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul       = judul;
        this.penulis     = penulis;
        this.tahunTerbit = tahunTerbit;
        this.dipinjam    = false;   // buku baru dianggap tersedia
    }

    // Getter
    public String getJudul()      { return judul; }
    public String getPenulis()    { return penulis; }
    public int    getTahunTerbit(){ return tahunTerbit; }
    public boolean isDipinjam()   { return dipinjam; }

    // Setter status pinjam
    public void setDipinjam(boolean dipinjam) {
        this.dipinjam = dipinjam;
    }

    // Keterangan buku dalam bentuk teks (termasuk tahun terbit)
    public String info() {
        String status = dipinjam ? "Dipinjam" : "Tersedia";
        return judul + " oleh " + penulis
                + " (" + tahunTerbit + ") [" + status + "]";
    }
}
