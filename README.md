# Java Syntax and Data Types Handson Practice

**Nama:** [Billyandre Suwandi]
**NIM:** [2481024]
**Kelas:** [Teknik Informatika]
**Mata Kuliah:** Pemrograman Berorientasi Objek

## Catatan Pembelajaran
1. Inheritance (Pewarisan) - Class anak seperti Car dan Motorcycle dapat mewarisi properties dan method dari class parent seperti Vehicle. Ini membuat kode lebih efisien karena tidak perlu menulis ulang kode yang sama berulang kali.
2. Method Overriding - Method yang diwarisi dari parent class bisa diubah implementasinya di class anak sesuai kebutuhan. Misalnya displayInfo() di Car menampilkan info berbeda dengan di Vehicle karena ada data tambahan.
3. Access Modifier - Atribut protected bisa diakses langsung oleh subclass, sedangkan private harus pakai getter/setter. Ini penting untuk mengatur siapa saja yang boleh mengakses data.
4. Getter dan Setter Methods - Method untuk mengambil dan mengubah nilai atribut private. Penting untuk menjaga keamanan data dan memudahkan maintenance kode.
5. Polymorphism - Satu method bisa punya implementasi berbeda di tiap class. Contoh: hitungBiayaRental() untuk Car ada surcharge AC, untuk Motorcycle ada diskon, meski nama methodnya sama.
