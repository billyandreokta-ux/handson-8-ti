package Latihan3;

public class RentalTransaction {
    // Properties
    private String namaPelanggan;
    private Vehicle kendaraan;
    private int durasiHari;
    private double totalBiaya;

    // Constructor
    public RentalTransaction(String namaPelanggan, Vehicle kendaraan, int durasiHari) {
        // TODO: Implementasi
        this.namaPelanggan = namaPelanggan;
        this.kendaraan = kendaraan;
        this.durasiHari = durasiHari;

        // TODO: Calculate total biaya
        if (kendaraan != null) {
            this.totalBiaya = kendaraan.hitungBiayaRental(durasiHari);
            kendaraan.setTersedia(false); // kendaraan dianggap disewa
        } else {
            this.totalBiaya = 0;
        }

        System.out.println("Constructor RentalTransaction dipanggil");
    }

    // Method display rental details
    public void displayRentalDetails() {
        // TODO: Print detail rental
        System.out.println("=== Detail Transaksi Rental ===");
        System.out.println("Nama Pelanggan: " + namaPelanggan);
        if (kendaraan != null) {
            System.out.println("Kendaraan: " + kendaraan.merk + " " + kendaraan.model);
            System.out.println("Durasi: " + durasiHari + " hari");
            System.out.println("Total Biaya: Rp" + totalBiaya);
        } else {
            System.out.println("Kendaraan tidak tersedia untuk disewa.");
        }
    }

    // Getters
    public double getTotalBiaya() {
        return totalBiaya;
    }

    public Vehicle getKendaraan() {
        return kendaraan;
    }
}
