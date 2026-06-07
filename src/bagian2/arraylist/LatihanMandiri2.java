package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanMandiri2 {
    public static void main(String[] args) {

        // ── Latihan 1: Daftar Belanja ────────────────────────────────────────
        System.out.println("=== Latihan 1: Daftar Belanja ===");
        ArrayList<String> belanja = new ArrayList<>();
        belanja.add("Beras");
        belanja.add("Minyak Goreng");
        belanja.add("Telur");
        belanja.add("Gula");

        System.out.println("Sebelum hapus: " + belanja);
        belanja.remove(1);   // hapus item ke-2 (indeks 1)
        System.out.println("Sesudah hapus: " + belanja);
        System.out.println("Jumlah item  : " + belanja.size());

        // ── Latihan 2: Nilai Terbesar ─────────────────────────────────────────
        System.out.println("\n=== Latihan 2: Nilai Terbesar ===");
        ArrayList<Integer> nilai = new ArrayList<>();
        nilai.add(70);
        nilai.add(95);
        nilai.add(60);
        nilai.add(88);
        nilai.add(75);

        int max = nilai.get(0);
        for (int n : nilai) {
            if (n > max) max = n;
        }
        System.out.println("Data    : " + nilai);
        System.out.println("Terbesar: " + max);

        // ── Latihan 3: Nama Berawalan Huruf A ────────────────────────────────
        System.out.println("\n=== Latihan 3: Nama Berawalan 'A' ===");
        ArrayList<String> nama = new ArrayList<>();
        String[] data = {"Andi", "Budi", "Ayu", "Citra", "Adit", "Doni"};
        for (String d : data) nama.add(d);

        for (String n : nama) {
            if (n.startsWith("A")) {
                System.out.println(n);
            }
        }
    }
}
