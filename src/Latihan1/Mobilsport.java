package Latihan1;

public class MobilSport extends Mobil {
    // Properties tambahan
    private boolean turbo;
    private int kecepatanMaksimal;

    // Constructor
    public MobilSport(String merk, String warna, int tahunProduksi,
                      int jumlahPintu, String jenisBahanBakar,
                      boolean turbo, int kecepatanMaksimal) {
        // TODO: Implementasi constructor
    }

    // Override method
    @Override
    public void displayInfo() {
        // TODO: Override dan tambahkan info MobilSport
    }

    // Method khusus MobilSport
    public void aktifkanTurbo() {
        // TODO: Print "TURBO DIAKTIFKAN! [merk] melaju dengan kecepatan maksimal!"
    }
}
