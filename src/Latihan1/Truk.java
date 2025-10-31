package Latihan1;

public class Truk extends Kendaraan {
    // Properties tambahan
    private double kapasitasMuatan; // dalam ton
    private int jumlahRoda;

    // Constructor
    public Truk(String merk, String warna, int tahunProduksi, double kapasitasMuatan, int jumlahRoda) {
        // TODO: Implementasi constructor
    }

    // Override method
    @Override
    public void displayInfo() {
        // TODO: Override dan tambahkan info Truk
    }

    @Override
    public void klakson() {
        // TODO: Panggil super.klakson() dulu
        // TODO: Kemudian print "HONK HONK! (suara klakson truk yang lebih keras)"
    }
}

