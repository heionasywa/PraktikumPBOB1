/****************************************************************
 * File : Titik.java
 * Deskripsi : Berisi atribut dan method dalam class Titik
 * Pembuat : heionasywa
 * Tanggal : 4 Maret 2026
 ****************************************************************/

public class Titik {
    double absis;
    double ordinat;

    Titik() {
        absis = 0.0;
        ordinat = 0.0;
    }

    void setAbsis(double a) {
        absis = a;
    }

    void setOrdinat(double o) {
        ordinat = o;
    }

    double getAbsis() {
        return absis;
    }

    double getOrdinat() {
        return ordinat;
    }
}
