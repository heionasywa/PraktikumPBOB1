/****************************************************************
 * File : Mahasiswa.java
 * Deskripsi : Kelas yang merepresentasikan mahasiswa dan relasinya
 * Pembuat : Nasywa Alya Kamila
 * Tanggal : 4 Maret 2026
 ****************************************************************/

public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    private MataKuliah[] listMatKul;
    private int jumlahMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    public Mahasiswa() {
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.listMatKul = new MataKuliah[50];
        this.jumlahMatKul = 0;
    }

    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new MataKuliah[50];
        this.jumlahMatKul = 0;
    }

    public void addMatKul(MataKuliah newMatKul) {
        if (this.jumlahMatKul < 50) {
            this.listMatKul[this.jumlahMatKul] = newMatKul;
            this.jumlahMatKul++;
        } else {
            System.out.println("Batas maksimum mata kuliah (50) telah tercapai.");
        }
    }

    public int getJumlahSKS() {
        int totalSks = 0;
        for (int i = 0; i < this.jumlahMatKul; i++) {
            totalSks += this.listMatKul[i].getSks();
        }
        return totalSks;
    }

    public int getJumlahMatKul() {
        return this.jumlahMatKul;
    }

    public void printMhs() {
        System.out.println("NIM   : " + this.nim);
        System.out.println("Nama  : " + this.nama);
        System.out.println("Prodi : " + this.prodi);
    }

    public void printDetailMhs() {
        printMhs();
        System.out.println("--- Daftar Mata Kuliah ---");
        if (this.jumlahMatKul == 0) {
            System.out.println("(Belum ada mata kuliah yang diambil)");
        } else {
            for (int i = 0; i < this.jumlahMatKul; i++) {
                System.out.println("- " + this.listMatKul[i].getNama() + " (" + this.listMatKul[i].getSks() + " SKS)");
            }
        }

        System.out.println("--------------------------");
        if (this.dosenWali != null) {
            System.out.println("Dosen Wali : " + this.dosenWali.getNama() + " (NIP: " + this.dosenWali.getNip() + ")");
        } else {
            System.out.println("Dosen Wali : (Belum diset)");
        }

        if (this.kendaraan != null) {
            System.out.println("Kendaraan  : " + this.kendaraan.getJenis() + " - " + this.kendaraan.getNoPlat());
        } else {
            System.out.println("Kendaraan  : (Belum diset/Tidak ada)");
        }
    }

    // Getters and Setters
    public String getNim() {
        return this.nim;
    }

    public String getNama() {
        return this.nama;
    }

    public String getProdi() {
        return this.prodi;
    }

    public Dosen getDosenWali() {
        return this.dosenWali;
    }

    public Kendaraan getKendaraan() {
        return this.kendaraan;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }
}
