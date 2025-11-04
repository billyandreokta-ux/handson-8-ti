package Latihan2;

public class DosenProfessor extends Dosen {
    // Properties tambahan
    private String gelarProfesor;
    private int jumlahPenelitian;

    // Constructor
    public DosenProfessor(String nip, String nama, String jurusan,
                          String mataKuliah, int pengalamanMengajar,
                          String gelarProfesor, int jumlahPenelitian) {
        // TODO: Implementasi
        super(nip, nama, jurusan, mataKuliah, pengalamanMengajar);
        this.gelarProfesor = gelarProfesor;
        this.jumlahPenelitian = jumlahPenelitian;
        System.out.println("Constructor DosenProfessor dipanggil");
    }

    // Override displayInfo (chain dari Dosen)
    @Override
    public void displayInfo() {
        // TODO: Call super dan tambah info profesor
        super.displayInfo(); // memanggil info dari Dosen (dan otomatis dari Pegawai juga)
        System.out.println("Gelar Profesor: " + gelarProfesor);
        System.out.println("Jumlah Penelitian: " + jumlahPenelitian);
    }
}
