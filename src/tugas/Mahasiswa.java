package tugas;

public class Mahasiswa {
    private String nama;
    private String npm;
    private double nilai;

    public Mahasiswa(String nama, String npm, double nilai) {
        this.nama  = nama;
        this.npm   = npm;
        this.nilai = nilai;
    }

    // Getter
    public String getNama()   { return nama; }
    public String getNpm()    { return npm; }
    public double getNilai()  { return nilai; }

    // Mengembalikan true jika nilai >= 60
    public boolean lulus() {
        return nilai >= 60;
    }

    @Override
    public String toString() {
        return String.format("%-20s | %-12s | %.1f | %s",
                nama, npm, nilai, lulus() ? "LULUS" : "TIDAK LULUS");
    }
}
