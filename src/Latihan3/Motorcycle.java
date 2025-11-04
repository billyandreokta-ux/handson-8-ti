package Latihan3;

public class Motorcycle extends Vehicle {
    // Properties tambahan
    private String jenisMotor; // "Sport", "Matic", "Bebek"
    private int kapasitasMesin; // dalam CC

    // Constructor
    public Motorcycle(String merk, String model, int tahunProduksi,
                      String nomorPolisi, double hargaRentalPerHari,
                      String jenisMotor, int kapasitasMesin) {
        super(merk, model, tahunProduksi, nomorPolisi, hargaRentalPerHari);
        this.jenisMotor = jenisMotor;
        this.kapasitasMesin = kapasitasMesin;
        System.out.println("Constructor Motorcycle dipanggil");
    }

    // Getter method yang diperlukan
    public String getJenisMotor() {
        return jenisMotor;
    }

    public int getKapasitasMesin() {
        return kapasitasMesin;
    }

    // Override displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Jenis Motor: " + jenisMotor);
        System.out.println("Kapasitas Mesin: " + kapasitasMesin + " cc");
    }

    // Override biaya rental (Motor lebih murah)
    @Override
    public double hitungBiayaRental(int jumlahHari) {
        double total = super.hitungBiayaRental(jumlahHari);
        total -= total * 0.2; // potongan 20% untuk motor
        return total;
    }
}