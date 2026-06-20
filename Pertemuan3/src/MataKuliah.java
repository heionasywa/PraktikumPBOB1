/****************************************************************
 * File : MataKuliah.java
 * Deskripsi : Kelas yang merepresentasikan mata kuliah yang diambil Mahasiswa
 * Pembuat : Nasywa Alya Kamila
 * Tanggal : 4 Maret 2026
 ****************************************************************/

public class MataKuliah {
    private String idMatKul;
    private String nama;
    private int sks;

    public MataKuliah() {
        this.idMatKul = "";
        this.nama = "";
        this.sks = 0;
    }

    public MataKuliah(String idMatKul, String nama, int sks) {
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }

    public String getIdMatKul() {
        return this.idMatKul;
    }

    public String getNama() {
        return this.nama;
    }

    public int getSks() {
        return this.sks;
    }

    public void setIdMatKul(String idMatKul) {
        this.idMatKul = idMatKul;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }
}
