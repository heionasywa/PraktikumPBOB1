public class Titik {
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    public Titik() {
        this.absis = 0.0;
        this.ordinat = 0.0;
        counterTitik++;
    }

    public Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    public void setAbsis(double absis) {
        this.absis = absis;
    }

    public void setOrdinat(double ordinat) {
        this.ordinat = ordinat;
    }

    public double getAbsis() {
        return this.absis;
    }

    public double getOrdinat() {
        return this.ordinat;
    }

    public static int getCounterTitik() {
        return counterTitik;
    }

    public double getJarakPusat() {
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    public void refleksiX() {
        this.ordinat = -this.ordinat;
    }

    public void refleksiY() {
        this.absis = -this.absis;
    }

    public Titik getRefleksiX() {
        return new Titik(this.absis, -this.ordinat);
    }

    public Titik getRefleksiY() {
        return new Titik(-this.absis, this.ordinat);
    }
}
