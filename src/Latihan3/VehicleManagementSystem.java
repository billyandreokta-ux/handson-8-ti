package Latihan3;

import java.util.ArrayList;
import java.util.List;

public class VehicleManagementSystem {
    public static void main(String[] args) {
        /*
         * REAL-WORLD PROJECT: Vehicle Rental Management System
         *
         * Deskripsi: Sistem untuk mengelola rental kendaraan dengan berbagai
         * tipe kendaraan dan perhitungan biaya rental yang berbeda.
         */

        // ===== SETUP RENTAL SYSTEM =====
        System.out.println("=== VEHICLE RENTAL MANAGEMENT SYSTEM ===\n");

        // Latihan 1: Create vehicle fleet
        // - Buat 3 Mobil: Toyota Avanza, Honda Jazz, Suzuki Ertiga
        // - Buat 2 Motor: Honda Beat, Yamaha NMAX
        // - Set harga rental per hari untuk masing-masing
        List<Vehicle> fleet = new ArrayList<>();

        fleet.add(new Car("Toyota", "Avanza", 2022, "B1234CD", 300000, 7, "Automatic", true));
        fleet.add(new Car("Honda", "Jazz", 2021, "B2345EF", 350000, 5, "Manual", true));
        fleet.add(new Car("Suzuki", "Ertiga", 2023, "B3456GH", 330000, 7, "Automatic", false));

        fleet.add(new Motorcycle("Honda", "Beat", 2022, "B4567IJ", 150000, "Matic", 110));
        fleet.add(new Motorcycle("Yamaha", "NMAX", 2023, "B5678KL", 200000, "Sport", 155));

        System.out.println("Fleet created: " + fleet.size() + " vehicles\n");

        // Latihan 2: Display all vehicles
        // - Loop semua kendaraan
        // - Display info lengkap masing-masing
        System.out.println("=== DAFTAR KENDARAAN ===");
        for (Vehicle v : fleet) {
            v.displayInfo();
            System.out.println("-----------------------------");
        }

        // Latihan 3: Rent a vehicle
        // - Customer "Andi" rental Toyota Avanza selama 3 hari
        // - Calculate total biaya
        // - Display rental details
        Vehicle avanza = fleet.get(0);
        RentalTransaction rental1 = new RentalTransaction("Andi", avanza, 3);
        System.out.println();
        rental1.displayRentalDetails();

        // Latihan 4: Calculate monthly revenue
        // - Rent beberapa kendaraan
        // - Calculate total revenue bulan ini
        List<RentalTransaction> transactions = new ArrayList<>();
        transactions.add(rental1);
        transactions.add(new RentalTransaction("Budi", fleet.get(1), 4));
        transactions.add(new RentalTransaction("Citra", fleet.get(3), 5));

        double totalRevenue = 0;
        for (RentalTransaction r : transactions) {
            totalRevenue += r.getTotalBiaya();
        }
        System.out.println("\nTotal revenue bulan ini: Rp " + totalRevenue);

        // Latihan 5: Vehicle maintenance
        // - Mark beberapa kendaraan sebagai "under maintenance"
        // - Display available vehicles only
        fleet.get(2).setTersedia(false); // Suzuki Ertiga
        fleet.get(4).setTersedia(false); // Yamaha NMAX

        long available = fleet.stream().filter(Vehicle::isTersedia).count();
        long maintenance = fleet.size() - available;

        System.out.println("\nAvailable vehicles: " + available);
        System.out.println("Under maintenance: " + maintenance);

        // Latihan 6: Find vehicles by criteria
        // - Find all Mobil dengan harga < Rp 350,000/hari
        // - Find all Motor jenis "matic"
        long murah = fleet.stream()
                .filter(v -> v instanceof Car && ((Car) v).getHargaRentalPerHari() < 350000)
                .count();

        long matic = fleet.stream()
                .filter(v -> v instanceof Motorcycle &&
                        ((Motorcycle) v).getJenisMotor().equalsIgnoreCase("Matic"))
                .count();

        System.out.println("\nFound " + murah + " Mobil sesuai kriteria");
        System.out.println("Found " + matic + " Motor matic");

        // Latihan 7: Generate rental report
        // - Display summary rental bulan ini
        // - Group by vehicle type
        // - Show total revenue per type
        double revenueMobil = transactions.stream()
                .filter(r -> r.getKendaraan() instanceof Car)
                .mapToDouble(RentalTransaction::getTotalBiaya)
                .sum();
        double revenueMotor = transactions.stream()
                .filter(r -> r.getKendaraan() instanceof Motorcycle)
                .mapToDouble(RentalTransaction::getTotalBiaya)
                .sum();

        System.out.println("\n=== RENTAL REPORT ===");
        System.out.println("Mobil: " + transactions.stream().filter(r -> r.getKendaraan() instanceof Car).count()
                + " rentals, Rp " + revenueMobil);
        System.out.println("Motor: " + transactions.stream().filter(r -> r.getKendaraan() instanceof Motorcycle).count()
                + " rentals, Rp " + revenueMotor);
        System.out.println("Total: Rp " + (revenueMobil + revenueMotor));
    }
}