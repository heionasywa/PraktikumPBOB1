/****************************************************************
 * File : Dosen.java
 * Deskripsi : Kelas yang merepresentasikan dosen, berelasi dengan Mahasiswa
 * Pembuat : Nasywa Alya Kamila
 * Tanggal : 4 Maret 2026
 ****************************************************************/

public class Dosen {
    private String nip;
    private String nama;
    private String prodi;

    public Dosen() {
        this.nip = "";
        this.nama = "";
        this.prodi = "";
    }

    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    public String getNip() {
        return this.nip;
    }

    public String getNama() {
        return this.nama;
    }

    public String getProdi() {
        return this.prodi;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
}
