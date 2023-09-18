**Pertanyaan – Percobaan 1 dan 2** <br>
1. Pada class MotorDemo, saat kita menambah kecepatan untuk pertama kalinya, mengapa
muncul peringatan “Kecepatan tidak bisa bertambah karena Mesin Off!”? <br>
Jawab: <br>
Karena pada saat pertama kali memanggil metode tambahKecepatan(), mesin belum dinyalakan. Pada saat itu, variabel kontakOn masih memiliki nilai false (karena secara default di set ke false), sehingga kode di dalam blok else dijalankan. <br>
1. Mengapat atribut kecepatan dan kontakOn diset private? <br>
Jawab: <br> 
Agar mencegah pengguna untuk mengakses atau memodifikasi atribut secara sembarangan. Pengguna dapat menggunakan metode-metode publik (seperti nyalakanMesin(), MatikanMesin(), tambahKecepatan(), dll.) untuk berinteraksi dengan class Motor. <br>
1. Ubah class Motor sehingga kecepatan maksimalnya adalah 100! <br>
Jawab: <br>
<img src=img\P1S3.png> <br>

**Pertanyaan – Percobaan 3 dan 4** <br>
1. Apa yang dimaksud getter dan setter? <br>
Jawab: <br>
Getter adalah metode yang digunakan untuk mengambil nilai dari suatu atribut atau properti di dalam sebuah objek.
Setter adalah metode yang digunakan untuk mengubah nilai dari suatu atribut atau properti di dalam sebuah objek. <br>
2. Apa kegunaan dari method getSimpanan()? <br>
Jawab: <br>
Method getSimpanan() digunakan untuk mendapatkan nilai dari atribut simpanan pada objek kelas Anggota. <br>
3. Method apa yang digunakan untk menambah saldo? <br>
Jawab: <br>
Method untuk menambah saldo adalah setor(float uang). <br>
4. Apa yand dimaksud konstruktor? <br>
Jawab: <br>
Konstruktor adalah metode khusus dalam suatu kelas yang memiliki nama yang sama dengan nama kelas itu sendiri. Konstruktor digunakan untuk inisialisasi objek saat objek pertama kali diciptakan. <br>
5. Sebutkan aturan dalam membuat konstruktor? <br>
Jawab: <br>
Nama konstruktor harus sama dengan nama kelas.
Konstruktor tidak memiliki tipe pengembalian.
Konstruktor dapat memiliki parameter atau tidak. <br>
6. Apakah boleh konstruktor bertipe private? <br>
Jawab: <br>
Ya, konstruktor boleh memiliki akses modifier private. Konstruktor bertipe private mengharuskan kelas hanya bisa diinstansiasi di dalam kelas itu sendiri atau di dalam kelas yang berada dalam package yang sama. <br>
7. Kapan menggunakan parameter dengan passsing parameter? <br>
Jawab: <br>
ketika mengirim data atau informasi dari satu metode ke metode lain di dalam kelas atau antar kelas. <br>
8. Apa perbedaan atribut class dan  instansiasi atribut? <br>
Jawab: <br>
Atribut class adalah variabel yang nilainya bersama-sama untuk semua objek yang dibuat dari kelas tersebut. 
Instansiasi atribut  adalah variabel yang nilainya unik untuk setiap objek yang dibuat dari kelas tersebut. <br>
9.  Apa perbedaan class method dan instansiasi method? <br>
Jawab: <br>
class method adalah metode yang terkait dengan kelas itu sendiri, bukan dengan instansiasi objek dari kelas tersebut.
Instansiasi Method adalah metode yang bekerja pada objek spesifik yang telah diinstansiasi dari kelas tersebut. Metode dapat menggunakan dan memanipulasi nilai dari atribut serta dapat memanggil metode lain dari objek yang sama. <br>

**Tugas**
1. Cobalah program dibawah ini dan tuliskan hasil outputnya.<br> <img src=img\T1UML.png> <br>
Jawab: <br>
<a href="encap">Tugas 1</a> <br>
<img src=img\T1R.png> <br>
2. Pada program diatas, pada class EncapTest kita mengeset age dengan nilai 35, namun pada saat ditampilkan ke layar nilainya 30, jelaskan mengapa.<br>
Jawab: <br>
Pada setter setAge(int newAge), terdapat kondisi yang membatasi nilai age agar tidak lebih dari 30.  Jika mencoba mengeset nilai age menjadi lebih dari 30, maka nilai age akan diatur menjadi 30. <br>
3. Ubah program diatas agar atribut age dapat diberi nilai maksimal 30 dan minimal 18.<br>
Jawab: <br>
<img src=img\T3K.png> <br>
<img src=img\T3R.png> <br>
4. Pada sebuah sistem informasi koperasi simpan
pinjam, terdapat class Anggota yang memiliki atribut antara lain nomor KTP, nama, limit peminjaman, dan jumlah pinjaman. Anggota dapat meminjam uang dengan batas limit peminjaman yang ditentukan. Anggota juga dapat mengangsur pinjaman. Ketika Anggota tersebut mengangsur pinjaman, maka jumlah pinjaman akan berkurang sesuai dengan nominal yang diangsur. Buatlah class Anggota
tersebut, berikan atribut, method dan konstruktor sesuai dengan kebutuhan. Uji dengan TestKoperasi berikut ini untuk memeriksa apakah class Anggota yang anda buat telah sesuai dengan yang diharapkan.<br>
Jawab: <br>
<img src=img\T4UML.png> <br>
<a href="koperasiSimpanPinjam">Tugas 4</a> <br>
<img src=img\T4R.png> <br>
5. Modifikasi soal no. 4 agar nominal yang dapat diangsur minimal adalah 10% dari jumlah pinjaman saat ini. Jika mengangsur kurang dari itu, maka muncul peringatan “Maaf, angsuran harus 10% dari jumlah pinjaman”.<br>
Jawab: <br>
<img src=img\T5.png> <br>
<img src=img\T5R.png> <br>
6. Modifikasi class TestKoperasi, agar jumlah pinjaman dan angsuran dapat menerima input dari console.<br>
Jawab: <br>
<img src=img\T61.png> <br>
<img src=img\T62.png> <br>
<img src=img\T6R1.png> <br>
<img src=img\T6R2.png> <br>
