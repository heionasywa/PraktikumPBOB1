/*
    File        : CivitasAkademika.java
    Deskripsi   : Polimorfisme Ad Hoc tipe Inclusion (superclass/abstract)
    Nama/NIM    : Nasywa Alya Kamila / 24060123140163
    Tanggal     : 25 April 2026
*/


public abstract class CivitasAkademika {
    /* Atribut */
    String nama;
    
    /* Methods */
    CivitasAkademika(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public abstract String getNomor();
}
