/*
    File        : Anggora.java
    Deskripsi   : Polimorfisme universal tipe Generic
    Nama/NIM    : Nasywa Alya Kamila / 24060123140163
    Tanggal     : 29 April 2026
*/

public class Anggora extends Kucing {
    /* Atribut */
    /* - */

    /* Methods */
    
    // Konstruktor tak berparameter
    Anggora() {
        super();
    }
    
    // Konstruktor berparameter
    Anggora(String Nama) {
        super(Nama);
    }

    // Konstruktor berparameter + bobot
    Anggora(String Nama, int bobot) {
        super(Nama, bobot);
    }

    // Gerak
    @Override
    public void Gerak() {
        System.out.println("Anggora "+ (this.getNama() == "" ? "" : this.getNama() + " ") + "melata.");
    }

    @Override
    public void Bersuara() {
        System.out.println("meong");
    }
}
