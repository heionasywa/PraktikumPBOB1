/*
    File        : Burung.java
    Deskripsi   : Polimorfisme Ad Hoc tipe Inclusion
    Nama/NIM    : Nasywa Alya Kamila / 24060123140163
    Tanggal     : 23 April 2026
*/

public class Burung extends Anabul {
    /* Atribut */
    /* - */

    /* Methods */
    
    // Konstruktor tak berparameter
    Burung() {
        super();
    }
    
    // Konstruktor berparameter
    Burung(String Nama) {
        super(Nama);
    }

    // Gerak
    @Override
    public void Gerak() {
        System.out.println("Burung " + (this.getNama() == "" ? "" : this.getNama() + " ") + "terbang.");
    }

    @Override
    public void Bersuara() {
        System.out.println("cuit cuit");
    }    
}
