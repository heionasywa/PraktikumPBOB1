public class MGaris {
    public static void main(String[] args) {
        System.out.println("Jumlah awal Objek Garis = " + Garis.getCounterGaris());

        Titik t1 = new Titik(-2, 0);
        Titik t2 = new Titik(0, 4);

        Garis g1 = new Garis(t1, t2);
        System.out.println("\nDetail Garis g1:");
        g1.menampilkanTitik();
        System.out.println("Panjang g1: " + g1.getPanjang());
        System.out.println("Gradien g1: " + g1.getGradien());
        System.out.println("Persamaan g1: " + g1.getPersamaan());

        Titik t3 = g1.getTitikTengah();
        System.out.println("Titik tengah g1: (" + t3.getAbsis() + ", " + t3.getOrdinat() + ")");

        Garis g2 = new Garis(new Titik(0, 0), new Titik(1, 2));
        System.out.println("\nDetail Garis g2:");
        g2.menampilkanTitik();
        System.out.println("Persamaan g2: " + g2.getPersamaan());

        System.out.println("\nApakah g1 sejajar g2? " + g1.isSejajar(g2));
        System.out.println("Apakah g1 tegak lurus g2? " + g1.isTegakLurus(g2));

        System.out.println("\nJumlah Total Objek Garis = " + Garis.getCounterGaris());
    }
}
