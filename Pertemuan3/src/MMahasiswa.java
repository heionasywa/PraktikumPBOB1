/****************************************************************
 * File : MMahasiswa.java
 * Deskripsi : Kelas utama untuk menguji relasi antar objek (Mahasiswa, Dosen,
 * Kendaraan, MataKuliah)
 * Pembuat : Nasywa Alya Kamila
 * Tanggal : 4 Maret 2026
 ****************************************************************/

public class MMahasiswa {
    public static void main(String[] args) {
        // 1. Membuat Objek Dosen
        Dosen dsn1 = new Dosen("198001012010121001", "Pak Budi", "Informatika");

        // 2. Membuat Objek Kendaraan
        Kendaraan knd1 = new Kendaraan("H 1234 AB", "Motor");

        // 3. Membuat beberapa Objek MataKuliah
        MataKuliah mk1 = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah mk2 = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        MataKuliah mk3 = new MataKuliah("RPL", "Rekayasa Perangkat Lunak", 3);

        // 4. Membuat Objek Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("24060122140123", "Nasywa Alya Kamila", "Informatika");

        // 5. Mengatur Relasi Mahasiswa dengan Dosen dan Kendaraan
        mhs1.setDosenWali(dsn1);
        mhs1.setKendaraan(knd1);

        // 6. Menambahkan MataKuliah ke Mahasiswa
        mhs1.addMatKul(mk1);
        mhs1.addMatKul(mk2);
        mhs1.addMatKul(mk3);

        // 7. Menampilkan Detail
        System.out.println("=========================================");
        mhs1.printDetailMhs();
        System.out.println("=========================================");
        System.out.println("Total SKS yang diambil : " + mhs1.getJumlahSKS() + " SKS");
        System.out.println("Total Mata Kuliah      : " + mhs1.getJumlahMatKul());
        System.out.println("=========================================");
    }
}
