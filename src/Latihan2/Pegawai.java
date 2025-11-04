package Latihan2;

public class Pegawai {
    // Properties
    protected String nip;
    protected String nama;
    protected String jurusan;

    // Constructor
    public Pegawai(String nip, String nama, String jurusan) {
        this.nip = nip;
        this.nama = nama;
        this.jurusan = jurusan;
        System.out.println("Constructor Pegawai dipanggil");
    }

    // Getter methods (diperlukan untuk akses dari luar)
    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    // Method untuk di-override
    public void displayInfo() {
        System.out.println("=== Info Pegawai ===");
        System.out.println("NIP: " + nip);
        System.out.println("Nama: " + nama);
        System.out.println("Jurusan: " + jurusan);
    }

    // Method clone dengan return type Pegawai
    public Pegawai clone() {
        return new Pegawai(this.nip, this.nama, this.jurusan);
    }

    // Protected method untuk ditest widening
    protected void methodProtected() {
        System.out.println("Protected method in Pegawai");
    }

    // Final method - tidak bisa di-override
    public final void calculateSalary() {
        System.out.println("Menghitung gaji pegawai...");
    }

    @Override
    public String toString() {
        return "Pegawai {" +
                "NIP='" + nip + '\'' +
                ", Nama='" + nama + '\'' +
                ", Jurusan='" + jurusan + '\'' +
                '}';
    }
}