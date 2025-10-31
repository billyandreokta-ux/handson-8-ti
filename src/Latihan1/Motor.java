package Latihan1;

public class Motor extends Kendaraan {
    // Properties tambahan
    private String jenisMotor; // "sport", "matic", "bebek"
    private boolean hadRemCakram;

    // Constructor
    public Motor(String merk, String warna, int tahunProduksi, String jenisMotor) {
        // TODO: Implementasi constructor dengan super
    }

    // Override method
    @Override
    public void displayInfo() {
        // TODO: Implementasi dengan memanggil super dan menambahkan info Motor
    }

    @Override
    public void klakson() {
        // TODO: Print "Tiiin tiiin! (suara motor)"
    }

    // Method khusus Motor
    public void lakukanWheely() {
        // TODO: Print "[merk] melakukan wheelie!"
    }
}
