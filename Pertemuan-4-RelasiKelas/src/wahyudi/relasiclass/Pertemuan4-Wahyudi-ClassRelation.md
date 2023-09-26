**Pertanyaan - Percobaan 1** <br>
<a href="percobaan1">Percobaan 1</a> <br>
Berdasarkan percobaan 1, jawablah pertanyaan‑pertanyaan yang terkait:
1. Di dalam class Processor dan class Laptop , terdapat method setter dan getter untuk masing‑masing atributnya. Apakah gunanya method setter dan getter tersebut ? <br>
Jawab: <br>
Method setter digunakan untuk mengatur nilai atribut dari suatu objek, sedangkan method getter digunakan untuk mendapatkan nilai atribut dari suatu objek. <br>
2. Di dalam class Processor dan class Laptop, masing‑masing terdapat konstruktor default dan konstruktor berparameter. Bagaimanakah beda penggunaan dari kedua jenis konstruktor tersebut ? <br>
Jawab: <br>
Konstruktor default digunakan untuk membuat objek dengan nilai atribut default jika tidak ada nilai yang diberikan saat objek dibuat. <br>
Konstruktor berparameter digunakan membuat objek dengan nilai-nilai tertentu saat objek dibuat. <br>
3. Perhatikan class Laptop, di antara 2 atribut yang dimiliki (merk dan proc), atribut manakah yang bertipe object ? <br>
Jawab: <br>
Atribut yang bertipe objek dalam class Laptop adalah proc, yang merupakan objek dari class Processor. <br>
4. Perhatikan class Laptop, pada baris manakah yang menunjukan bahwa class Laptop memiliki relasi dengan class Processor ? <br>
Jawab: <br>
Relasi antara class Laptop dan class Processor adalah komposisi. Karena konstruktor class Laptop yang menerima objek Processor sebagai salah satu argumennya. <br>
5. Perhatikan pada class Laptop , Apakah guna dari sintaks proc.info() ? <br>
Jawab: <br>
Sintaks proc.info() digunakan mencetak informasi tentang Processor yang terkait dengan Laptop tersebut. <br>
1. Pada class MainPercobaan1, terdapat baris kode:Laptop l = new Laptop("Thinkpad", p);. Apakah p tersebut ? <br>
Dan apakah yang terjadi jika baris kode tersebut diubah menjadi: <br>
Laptop l = new Laptop("Thinkpad", new Processor("Intel i5",3)); <br> 
Bagaimanakah hasil program saat dijalankan, apakah ada perubahan ? <br>
Jawab: <br>
Variabel p adalah objek Processor yang telah dibuat sebelumnya dengan merk "Intel i5" dan cache 3.
<img src=img\P1S6.png> <br>
Hasil program saat dijalankan tidak akan berubah. Keduanya akan menghasilkan objek Laptop dengan merk "Thinkpad" dan objek Processor yang memiliki merk "Intel i5" dan cache 3.

**Pertanyaan - Percobaan 2** <br>
<a href="percobaan2">Percobaan 2</a> <br>
Berdasarkan percobaan 2, jawablah pertanyaan‑pertanyaan yang terkait:
1. Perhatikan class Pelanggan. Pada baris program manakah yang menunjukan bahwa class Pelanggan memiliki relasi dengan class Mobil dan class Sopir ? <br>
Jawab: <br>
Relasi antara class Pelanggan, Mobil, dan Sopir ditunjukkan pada baris berikut dalam class Pelanggan: <br>
private Mobil mobil; <br>
private Sopir sopir; <br>
2. Perhatikan method hitungBiayaSopir pada class Sopir, serta method hitungBiayaMobil pada class Mobil. Mengapa menurut Anda method tersebut harus memiliki argument hari ? <br>
Jawab: <br>
Karena biaya yang dikenakan untuk mobil dan sopir dapat berubah berdasarkan jumlah hari. <br>
3. Perhatikan kode dari class Pelanggan. Untuk apakah perintah mobil.hitungBiayaMobil(hari) dan sopir.hitungBiayaSopir(hari) ? <br>
Jawab: <br>
Perintah mobil.hitungBiayaMobil(hari) dan sopir.hitungBiayaSopir(hari) digunakan untuk menghitung biaya total yang harus dibayar oleh pelanggan. <br>
4. Perhatikan class MainPercobaan2. Untuk apakah sintaks p.setMobil(m) dan p.setSopir(s) ? <br>
Jawab: <br>
Sintaks p.setMobil(m) dan p.setSopir(s) digunakan untuk mengatur mobil dan sopir yang digunakan oleh pelanggan p. <br>
5. Perhatikan class MainPercobaan2. Untuk apakah proses p.hitungBiayaTotal() tersebut ? <br>
Jawab: <br>
Proses p.hitungBiayaTotal() digunakan untuk menghitung biaya total yang harus dibayar oleh pelanggan berdasarkan biaya mobil dan biaya sopir yang sudah diatur sebelumnya melalui p.setMobil(m) dan p.setSopir(s). <br>
6. Perhatikan class MainPercobaan2, coba tambahkan pada baris terakhir dari method main dan amati perubahan saat di‑run! <br>
System.out.println(p.getMobil().getMerk()); <br>
Jadi untuk apakah sintaks p.getMobil().getMerk() yang ada di dalam method main tersebut? <br>
Jawab: <br>
<img src=img\P2S6.png> <br>
Sintaks p.getMobil().getMerk() digunakan untuk mengakses merk mobil yang digunakan oleh pelanggan p dan mencetaknya. <br>

**Pertanyaan - Percobaan 3** <br>
<a href="percobaan3">Percobaan 3</a> <br>
Berdasarkan percobaan 3, jawablah pertanyaan‑pertanyaan yang terkait:
1. Di dalam method info() pada class KeretaApi, baris this.masinis.info() dan this.asisten.info() digunakan untuk apa ? <br>
Jawab: <br>
baris this.masinis.info() digunakan mengambil informasi tentang masinis dan this.asisten.info() digunakan untuk mengambil informasi tentang asisten kereta api. <br>
2. Buatlah main program baru dengan nama class MainPertanyaan pada package yang sama. Tambahkan kode berikut pada method main() !
Pegawai masinis = new Pegawai("1234", "Spongebob
Squarepants"); <br>
KeretaApi keretaApi = new KeretaApi("Gaya Baru","Bisnis",masinis); <br>
System.out.println(keretaApi.info()); <br>
Jawab: <br>
<a href="percobaan3/MainPertanyaan.java">MainPertanyaan</a> <br>
3. Apa hasil output dari main program tersebut ? Mengapa hal tersebut dapat terjadi ? <br>
Jawab: <br>
<img src=img\P3S3.png> <br>
Karena hanya satu pegawai (masinis) yang diinisialisasi. Pegawai asisten tidak diinisialisasi, sehingga nilainya adalah null secara default. <br>
4. Perbaiki class KeretaApi sehingga program dapat berjalan ! <br>
Jawab: <br>
Perbaikan source code class KeretaApi:
<img src=img\P3S41.png> <br>
Hasil running:
<img src=img\P3S42.png> <br>

**Pertanyaan - Percobaan 4** <br>
<a href="percobaan4">Percobaan 4</a> <br>
Berdasarkan percobaan 4, jawablah pertanyaan‑pertanyaan yang terkait:
1. Pada main program dalam class MainPercobaan4, berapakah jumlah kursi dalam Gerbong A ? <br>
Jawab: <br>
Jumlah kursi dalam Gerbong A adalah 10. <br>
2. Perhatikan potongan kode pada method info() dalam class Kursi. Apa maksud kode tersebut ? <br>
... <br>
if (this.penumpang != null) { <br>
info += "Penumpang: " + penumpang.info() + "\n"; <br>
} <br>
... <br>
Jawab: <br>
 Potongan kode tersebut digunakan untuk memeriksa apakah kursi memiliki penumpang atau tidak.<br>
3. Mengapa pada method setPenumpang() dalam class Gerbong, nilai nomor dikurangi dengan angka 1 ? <br>
Jawab: <br>
nomor kursi yang diterima sebagai argumen dimulai dari 1 (kursi pertama memiliki nomor 1, kursi kedua memiliki nomor 2, dan seterusnya). Namun, dalam array, indeks dimulai dari 0, sehingga perlu dikurangi 1 agar sesuai dengan indeks array yang benar. <br>
4. Instansiasi objek baru budi dengan tipe Penumpang, kemudian masukkan objek baru tersebut pada gerbong dengan gerbong.setPenumpang(budi, 1). Apakah yang terjadi ? <br>
Jawab: <br>
Penambahan source code class MainPercobaan4:
<img src=img\P4S41.png> <br>
Hasil running:
<img src=img\P4S42.png> <br>
Penumpang bernama budi menempati kursi milik penumpang bernama Mr.Krab. <br>
5. Modifikasi program sehingga tidak diperkenankan untuk menduduki kursi yang sudah ada
penumpang lain ! <br>
Jawab: <br>
Penambahan source code class Gerbong:
<img src=img\P4S51.png> <br>
Hasil running:
<img src=img\P4S52.png> <br>
<br>**Tugas** <br>
Berdasarkan latihan di pertemuan teori, rancang dengan class diagram, kemudian implementasikan ke dalam program! Studi kasus harus mewakili relasi class dari percobaan‑percobaan yang telah dilakukan pada materi ini, setidaknya melibatkan minimal 4 class (class yang berisi main tidak dihitung).<br>
Jawab: <br>

Source code studi kasus pesawat: <br>
<a href="Tugas">Tugas</a> <br>
Hasil running: <br>
<img src=img\T.png> <br>
