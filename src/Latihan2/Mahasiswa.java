package Latihan2;

import java.util.Objects;

public class Mahasiswa {
    // Properties
    private String nim;
    private String nama;
    private String jurusan;
    private double ipk;

    // Constructor
    public Mahasiswa(String nim, String nama, String jurusan, double ipk) {
        // TODO: Implementasi
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.ipk = ipk;
        System.out.println("Constructor Mahasiswa dipanggil");
    }

    // Override toString
    @Override
    public String toString() {
        // TODO: Return string representation
        return "Mahasiswa {" +
                "NIM='" + nim + '\'' +
                ", Nama='" + nama + '\'' +
                ", Jurusan='" + jurusan + '\'' +
                ", IPK=" + ipk +
                '}';
    }

    // Override equals - compare by NIM
    @Override
    public boolean equals(Object obj) {
        // TODO: Implementasi equals berdasarkan NIM
        if (this == obj) return true; // jika objeknya sama
        if (obj == null || getClass() != obj.getClass()) return false; // beda tipe
        Mahasiswa that = (Mahasiswa) obj;
        return Objects.equals(this.nim, that.nim); // bandingkan berdasarkan NIM
    }

    // Override hashCode (best practice dengan equals)
    @Override
    public int hashCode() {
        // TODO: Return hash dari NIM
        return Objects.hash(nim);
    }
}
