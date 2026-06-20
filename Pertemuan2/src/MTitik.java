public class MTitik {
    public static void main(String[] args) {
        System.out.println("Jumlah awal Objek Titik = " + Titik.getCounterTitik());

        Titik t1 = new Titik();
        t1.setAbsis(1.0);
        t1.setOrdinat(2.0);

        Titik t2 = new Titik(3.0, 4.0);

        System.out.println("Titik t1: (" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");
        System.out.println("Titik t2: (" + t2.getAbsis() + ", " + t2.getOrdinat() + ")");

        System.out.println("Jumlah Objek Titik sekarang = " + Titik.getCounterTitik());

        System.out.println("Jarak Pusat t1 = " + t1.getJarakPusat());
        t1.refleksiX();
        System.out.println("Titik t1 setelah refleksi X: (" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");

        Titik t3 = t2.getRefleksiY();
        System.out.println("Titik t3 (refleksi Y dari t2): (" + t3.getAbsis() + ", " + t3.getOrdinat() + ")");
    }
}
