package Latihan1;

public class Mobilsport extends Mobil {
    // Properties tambahan
    private boolean turbo;
    private int kecepatanMaksimal;

    // Constructor
    public Mobilsport(String merk, String warna, int tahunProduksi, int jumlahPintu,
                      String jenisBahanBakar, boolean turbo, int kecepatanMaksimal) {
        super(merk, warna, tahunProduksi, jumlahPintu, jenisBahanBakar);
        System.out.println("Constructor MobilSport dipanggil");
        this.turbo = turbo;
        this.kecepatanMaksimal = kecepatanMaksimal;
    }

    // Override method
    @Override
    public void displayInfo() {
        // TODO: Override dan tambahkan info MobilSport
        super.displayInfo(); // Tambahan agar info dari class Mobil juga tampil
        System.out.println("Turbo: " + (turbo ? "Ya" : "Tidak"));
        System.out.println("Kecepatan Maksimal: " + kecepatanMaksimal + " km/jam");
    }

    // Method khusus MobilSport
    public void aktifkanTurbo() {
        // TODO: Print "TURBO DIAKTIFKAN! [merk] melaju dengan kecepatan maksimal!"
        if (turbo) {
            System.out.println("TURBO DIAKTIFKAN! " + merk + " melaju dengan kecepatan maksimal!");
        } else {
            System.out.println("Mobil ini tidak memiliki turbo.");
        }
    }
}
