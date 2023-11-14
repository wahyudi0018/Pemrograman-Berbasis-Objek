package Soal2;

public class SoalArray1 {
    public static void main(String[] args) {
        int[][] arrayInt = { { 1, 1, 4 }, { 2, 1, 2 }, { 3, 2, 1 } };
        // Inisialisasi variabel jumlahElemen
        int jumlahElemen = 0;

        // Menghitung jumlah elemen array
        for (int i = 0; i < arrayInt.length; i++) { // Perulangan pertama (i) untuk mengakses baris
            for (int j = 0; j < arrayInt[i].length; j++) { // Perulangan kedua (j) untuk mengakses elemen di dalam baris
                jumlahElemen++; // Setiap kali perulangan j dieksekusi, jumlahElemen bertambah satu
            }
        }

        // Mencetak jumlah elemen array
        System.out.println("Jumlah elemen array 2 dimensi: " + jumlahElemen);
    }
}
