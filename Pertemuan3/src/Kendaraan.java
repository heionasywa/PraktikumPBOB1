/****************************************************************
 * File : Kendaraan.java
 * Deskripsi : Kelas yang merepresentasikan kendaraan Mahasiswa
 * Pembuat : Nasywa Alya Kamila
 * Tanggal : 4 Maret 2026
 ****************************************************************/

public class Kendaraan {
    private String noPlat;
    private String jenis;

    public Kendaraan() {
        this.noPlat = "";
        this.jenis = "";
    }

    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    public String getNoPlat() {
        return this.noPlat;
    }

    public String getJenis() {
        return this.jenis;
    }

    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
}
