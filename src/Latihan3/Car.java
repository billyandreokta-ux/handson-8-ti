package Latihan3;

public class Car extends Vehicle {
    private double hargaRentalPerHari;
    // Properties tambahan
    private int jumlahPenumpang;
    private String tipeTransmisi; // "Manual", "Automatic"
    private boolean acTersedia;

    // Constructor
    public Car(String merk, String model, int tahunProduksi, String nomorPolisi,
               double hargaRentalPerHari, int jumlahPenumpang,
               String tipeTransmisi, boolean acTersedia) {
        super(merk, model, tahunProduksi, nomorPolisi, hargaRentalPerHari);
        this.hargaRentalPerHari = hargaRentalPerHari;
        this.jumlahPenumpang = jumlahPenumpang;
        this.tipeTransmisi = tipeTransmisi;
        this.acTersedia = acTersedia;
        System.out.println("Constructor Car dipanggil");
    }

    // Getter method yang diperlukan
    public double getHargaRentalPerHari() {
        return hargaRentalPerHari;
    }

    public int getJumlahPenumpang() {
        return jumlahPenumpang;
    }

    public String getTipeTransmisi() {
        return tipeTransmisi;
    }

    public boolean isAcTersedia() {
        return acTersedia;
    }

    // Override displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Jumlah Penumpang: " + jumlahPenumpang);
        System.out.println("Tipe Transmisi: " + tipeTransmisi);
        System.out.println("AC Tersedia: " + (acTersedia ? "Ya" : "Tidak"));
    }

    // Override biaya rental (Car bisa punya surcharge)
    @Override
    public double hitungBiayaRental(int jumlahHari) {
        double total = super.hitungBiayaRental(jumlahHari);
        if (acTersedia) {
            total += 0.1 * total; // surcharge 10% jika AC tersedia
        }
        return total;
    }
}