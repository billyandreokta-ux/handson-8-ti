package Latihan1;

public class Kendaraan {
    // Properties
    protected String merk;
    protected String warna;
    protected int tahunProduksi;
    private String nomorRangka;

    // Constructor
    public Kendaraan(String merk, String warna, int tahunProduksi) {
        // TODO: Implementasi constructor
        // - Inisialisasi semua properties
        System.out.println("Constructor Kendaraan dipanggil");
        // - Print pesan "Constructor Kendaraan dipanggil"
        this.merk = merk;
        this.warna = warna;
        this.tahunProduksi = tahunProduksi;
        this.nomorRangka = generateNomorRangka();
    }

    private String generateNomorRangka() {
        return merk.substring(0, 3).toUpperCase() + tahunProduksi + "001";
    }

    public String getNomorRangka() {
        return nomorRangka;
    }

    // Method untuk menampilkan info
    public void displayInfo() {
        // TODO: Print semua informasi kendaraan
        System.out.println("=== Info Kendaraan ===");
        System.out.println("Merk: " + merk);
        System.out.println("Warna: " + warna);
        System.out.println("Tahun Produksi: " + tahunProduksi);
    }

    // Method klakson
    public void klakson() {
        // TODO: Print "Tin tin!"
        System.out.println("Tin tin!");
    }

    // Method untuk menghitung umur kendaraan
    public int hitungUmur() {
        // TODO: Return umur kendaraan (tahun sekarang - tahun produksi)
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        int tahunSekarang = calendar.get(java.util.Calendar.YEAR);
        return tahunSekarang - tahunProduksi;
    }

    // Getter dan Setter
    public void setNomorRangka(String nomorRangka) {
        this.nomorRangka = nomorRangka;
    }
}
