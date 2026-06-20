/*
    File        : Kucing.java
    Deskripsi   : Polimorfisme Ad Hoc tipe Inclusion
    Nama/NIM    : Nasywa Alya Kamila / 24060123140163
    Tanggal     : 23 April 2026
*/

public class Kucing extends Anabul {
    /* Atribut */
    /* - */

    /* Methods */
    
    // Konstruktor tak berparameter
    Kucing() {
        super();
    }
    
    // Konstruktor berparameter
    Kucing(String Nama) {
        super(Nama);
    }

    // Gerak
    @Override
    public void Gerak() {
        System.out.println("Kucing " + (this.getNama() == "" ? "" : this.getNama() + " ") + "melata.");
    }

    @Override
    public void Bersuara() {
        System.out.println("meong");
    }
}
