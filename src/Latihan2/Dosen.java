package Latihan2;

public class Dosen extends Pegawai {
    // Properties tambahan
    private String mataKuliah;
    private int pengalamanMengajar;

    // Constructor
    public Dosen(String nip, String nama, String jurusan,
                 String mataKuliah, int pengalamanMengajar) {
        super(nip, nama, jurusan);
        this.mataKuliah = mataKuliah;
        this.pengalamanMengajar = pengalamanMengajar;
    }

    // Getter methods
    public String getMataKuliah() {
        return mataKuliah;
    }

    public int getPengalamanMengajar() {
        return pengalamanMengajar;
    }

    // Override displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo(); // memanggil method displayInfo() dari Pegawai
        System.out.println("Mata Kuliah: " + mataKuliah);
        System.out.println("Pengalaman Mengajar: " + pengalamanMengajar + " tahun");
    }

    // Override clone dengan covariant return type
    @Override
    public Dosen clone() {
        // Karena atribut parent adalah protected, bisa diakses langsung
        return new Dosen(this.nip, this.nama, this.jurusan, this.mataKuliah, this.pengalamanMengajar);
    }

    // Override dengan widening access
    @Override
    public void methodProtected() {
        System.out.println("Method protected dari Pegawai diakses secara public di Dosen.");
    }
}