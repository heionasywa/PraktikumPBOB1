public class Garis {
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    public Garis() {
        this.titikAwal = new Titik(0, 0);
        this.titikAkhir = new Titik(1, 1);
        counterGaris++;
    }

    public Garis(Titik awal, Titik akhir) {
        this.titikAwal = awal;
        this.titikAkhir = akhir;
        counterGaris++;
    }

    public Titik getTitikAwal() {
        return this.titikAwal;
    }

    public Titik getTitikAkhir() {
        return this.titikAkhir;
    }

    public void setTitikAwal(Titik awal) {
        this.titikAwal = awal;
    }

    public void setTitikAkhir(Titik akhir) {
        this.titikAkhir = akhir;
    }

    public static int getCounterGaris() {
        return counterGaris;
    }

    public double getPanjang() {
        double dx = this.titikAkhir.getAbsis() - this.titikAwal.getAbsis();
        double dy = this.titikAkhir.getOrdinat() - this.titikAwal.getOrdinat();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double getGradien() {
        double dx = this.titikAkhir.getAbsis() - this.titikAwal.getAbsis();
        double dy = this.titikAkhir.getOrdinat() - this.titikAwal.getOrdinat();
        if (dx == 0)
            return Double.NaN;
        return dy / dx;
    }

    public Titik getTitikTengah() {
        double x = (this.titikAwal.getAbsis() + this.titikAkhir.getAbsis()) / 2;
        double y = (this.titikAwal.getOrdinat() + this.titikAkhir.getOrdinat()) / 2;
        return new Titik(x, y);
    }

    public boolean isSejajar(Garis G) {
        return this.getGradien() == G.getGradien();
    }

    public boolean isTegakLurus(Garis G) {
        return (this.getGradien() * G.getGradien()) == -1;
    }

    public void menampilkanTitik() {
        System.out.println("Titik Awal: (" + this.titikAwal.getAbsis() + ", " + this.titikAwal.getOrdinat() + ")");
        System.out.println("Titik Akhir: (" + this.titikAkhir.getAbsis() + ", " + this.titikAkhir.getOrdinat() + ")");
    }

    public String getPersamaan() {
        double m = this.getGradien();
        double c = this.titikAwal.getOrdinat() - m * this.titikAwal.getAbsis();
        return "y = " + m + "x + " + c;
    }
}
