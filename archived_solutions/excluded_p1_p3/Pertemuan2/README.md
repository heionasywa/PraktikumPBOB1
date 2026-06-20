# Solusi Pertemuan 2: Relasi Antar Objek

## Materi
- Atribut reference (objek sebagai atribut)
- Operasi pada class dengan relasi
- Static variable dan method
- Operasi geometri

## Tugas
Implementasi 2 class dengan relasi:

### Class Titik
- Koordinat (x, y)
- Jarak dari pusat (0,0)
- Jarak ke titik lain
- Refleksi terhadap sumbu X dan Y
- Static counter untuk menghitung jumlah Titik

### Class Garis
- Memiliki 2 Titik (titik awal dan akhir)
- Panjang garis (menggunakan Titik)
- Gradient garis
- Titik tengah garis
- Cek apakah sejajar atau tegak lurus dengan garis lain
- Persamaan garis (y = mx + c)
- Static counter

## File yang Dikerjakan
- `Titik.java` - Class Titik dengan operasi geometri
- `Garis.java` - Class Garis dengan relasi ke Titik
- `MGaris.java` - Driver program
- `MTitik.java` - Test Titik

## Hasil Test
```
Saat ini ada sebanyak 0 garis.
Saat ini ada sebanyak 2 garis.
Garis((0.0,0.0), (1.0,1.0)
Gradien garis G1 adalah 1.0
Apakah G1 sejajar dengan G2: Iya
Apakah G1 tegak lurus terhadap G2: Iya
```

## Pembelajaran
- Reference sebagai atribut
- Operasi antar object
- Static variable dan method
- Operasi geometri dasar
