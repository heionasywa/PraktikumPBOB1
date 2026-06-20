# Solusi Pertemuan 3: Relasi Antar Objek (Kompleks)

## Materi
- Relasi antar class dengan reference
- Komposisi object
- ArrayList untuk koleksi
- Operasi pada koleksi

## Tugas
Implementasi struktur Mahasiswa dengan relasi kompleks:

### Class Dosen
- NIP, Nama, Program Studi
- Getter dan Setter
- Print Info

### Class Kendaraan
- Nomor Plat, Jenis Kendaraan
- Getter dan Setter

### Class MataKuliah
- Kode, Nama, Jumlah SKS
- Getter dan Setter

### Class Mahasiswa
- NIM, Nama, Program Studi
- Reference ke Dosen (wali)
- Reference ke Kendaraan
- ArrayList<MataKuliah> untuk daftar mata kuliah
- Method untuk menambah mata kuliah
- Hitung jumlah SKS total
- Hitung jumlah mata kuliah
- Print info lengkap dengan detail

## File yang Dikerjakan
- `Titik.java` - Basic Titik
- `Dosen.java` - Class Dosen
- `Kendaraan.java` - Class Kendaraan
- `MataKuliah.java` - Class MataKuliah
- `Mahasiswa.java` - Class Mahasiswa dengan ArrayList
- `MMahasiswa.java` - Driver program

## Hasil Test
Menampilkan informasi Dosen, Kendaraan, Mata Kuliah, dan Mahasiswa dengan relasi lengkap

## Pembelajaran
- Komposisi object (object dalam object)
- ArrayList untuk koleksi object
- Iterasi pada koleksi
- Operasi agregat pada koleksi
