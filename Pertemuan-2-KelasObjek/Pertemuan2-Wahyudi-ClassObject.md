**Percobaan 1: Membuat Class Diagram** <br>
Studi Kasus 1: <br>
Dalam suatu perusahaan salah satu data yang diolah adalah data karyawan. Setiap karyawan memiliki id, nama, jenis kelamin, jabatan, jabatan, dan gaji. Setiap mahasiswa juga bisa menampilkan data diri pribadi dan melihat gajinya. <br>
1. Gambarkan desain class diagram dari studi kasus 1! <br>
   Jawab: <br>
   <img src=img/P1S1.png>
2. Sebutkan Class apa saja yang bisa dibuat dari studi kasus 1! <br>
   Jawab: <br>
   Karyawan
3. Sebutkan atribut beserta tipe datanya yang dapat diidentifikasi dari masing-masing class dari studi kasus 1! <br>
   Jawab: <br>
   Atribut Id dengan tipe data integer, Atribut nama dengan tipe data String, Atrbut jenisKelamin dengan tipe data String, Atribut jabatan dengan tipe data String, dan Atrbut  gaji dengan tipe data integer
4. Sebutkan method-method yang sudah anda buat dari masing-masing class pada studi kasus 1! <br>
   Jawab: <br>
   Method tampilBiodata() dengan tipe data void, dan Method tampilGaji() dengan tipe data void

**Percobaan 2: Membuat dan mengakses anggota suatu class** <br>
Studi Kasus 2: <br>
Perhatikan class diagram dibawah ini. Buatlah program berdasarkan class diagram tersebut! <br>
<img src="img/P2.png"> <br>
7. Jelaskan pada bagian mana proses pendeklarasian atribut pada program diatas! <br>
   Jawab: <br>
   <img src=img/P2S1.png>
   Atribut dideklarasikan di class Mahasiswa dengan akses public. Dengan deklarasi ini, setiap objek dari kelas Mahasiswa akan memiliki empat atribut: nim, nama, alamat, dan kelas. Atribut-atribut ini akan digunakan untuk menyimpan informasi tentang setiap mahasiswa. <br>
8. Jelaskan pada bagian mana proses pendeklarasian method pada program diatas! <br>
   Jawab: <br>
   <img src=img/P2S2.png>
   Method tampilBiodata() dideklarasikan di class Mahasiswa dengan akses public dan tidak mengembalikan nilai (void). Method ini mencetak biodata mahasiswa. <br>
9. Berapa banyak objek yang di instansiasi pada program diatas! <br>
   Jawab: <br>
   Satu. <br>
10. Apakah yang sebenarnya dilakukan pada sintaks program “mhs1.nim=101”? <br>
   Jawab: <br>
   Dilakukan inisialisasi atau pengisian nilai dari atribut nim yang dimiliki oleh objek mhs1. <br>
11. Apakah yang sebenarnya dilakukan pada sintaks program “mhs1.tampilBiodata()”? <br>
   Jawab: <br>
   Memanggil method tampilBiodata() pada class Mahasiswa kemudian akan mencetak biodata mahasiswa seperti NIM, nama, alamat, dan kelas yang dimiliki oleh objek mhs1. <br>
12. Instansiasi 2 objek lagi pada program diatas! <br>
   Jawab: <br>
   <img src=img/P2S6.png> <br>
**Percobaan 3: Menulis method yang memiliki argument/parameter dan memiliki return** <br>
7. Apakah fungsi argumen dalam suatu method? <br>
   Jawab: <br>
   Menambah nilai inputan pada saat method dipanggil. <br>
8. Ambil kesimpulan tentang kegunaan dari kata kunci return , dan kapan suatu method harus memiliki return! <br>
   Jawab: <br>
   return digunakan jika memerlukan suatu nilai balik, contoh menghitung stok setelah dilakukan penambahan stok. <br><br3>
**Tugas** <br>
1. Suatu toko persewaan video game salah satu yang diolah adalah peminjaman, dimana data yang dicatat ketika ada orang yang melakukan peminjaman adalah id, nama member, nama game, dan harga yang harus dibayar. Setiap peminjaman bisa menampilkan data hasil peminjaman dan harga yang harus dibayar. Buatlah class diagram pada studi kasus diatas! <br>
Penjelasan: <br>
Harga yang harus dibayar diperoleh dari lama sewa x harga. <br>
Diasumsikan 1x transaksi peminjaman game yang dipinjam hanya 1 game saja. <br>
Jawab: <br>
<img src=img/P2T1.png> <br>
2. Buatlah program dari class diagram yang sudah anda buat di no 1! <br>
Jawab: <br>
<a href="PeminjamanGame">Tugas 2</a>
3. Buatlah program sesuai dengan class diagram berikut ini: <br>
<img src=img/P2T3.png> <br>
Jawab: <br>
<a href="Lingkaran">Tugas 3</a>
4. Buatlah program sesuai dengan class diagram berikut ini: <br>
Deskripsi / Penjelasan : <br>
Nilai atribut hargaDasar dalam Rupiah dan atribut diskon dalam % <br>
Method hitungHargaJual() digunakan untuk menghitung harga jual dengan
perhitungan berikut ini: <br>
harga jual = harga dasar – (diskon x harga dasar) <br>
Method tampilData() digunakan untuk menampilkan nilai dari kode, namaBarang, hargaDasar, diskon dan harga jual. <br>
<img src=img/P2T4.png> <br>
Jawab: <br>
<a href="BarangTugas">Tugas 4</a>