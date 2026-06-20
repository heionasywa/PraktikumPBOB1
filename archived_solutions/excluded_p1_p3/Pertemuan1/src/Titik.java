/* Pembuat : Nasywa Alya Kamila / 24060123140163 */


public class Titik {

    /***************ATRIBUT*****************/
    double absis;
    double ordinat;

    /***************METHOD******************/
    // Konstruktor untuk membuat titik (0,0)
    Titik(){
        absis = 0;
        ordinat = 0;
    }

    // Mengembalikan nilai absis
    double getAbsis(){
        return absis;
    }

    // Mengembalikan nilai ordinat
    double getOrdinat(){
        return ordinat;
    }

    // Mengatur absis titik dengan nilai baru x
    void setAbsis(double x){
        absis = x;
    }

    // Mengatur ordinat titik dengan nilai baru y
    void setOrdinat(double y){
        ordinat = y;
    }

    // Menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // Mencetak koordinat titik
    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
}



