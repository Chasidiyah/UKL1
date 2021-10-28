
package belajar;

public class Latihan4a {
    public static void main(String[] args) {
        System.out.println("Latihan Soal 4a");
        // deklarasi variabel
        int Awal = 5;
        int beda = 5;
        int sukuSaatIni;
        
        for(int a=0;a<=4;a++){// untuk membuat pola angka kebawah
            for(int b=0;b<a;b++){// untuk membuat pola angka kesamping
                sukuSaatIni = Awal;
                Awal += beda;
                System.out.print(sukuSaatIni+" ");// menampilkan nilai berikutnya dan membuat space diantara angka
            }
            System.out.println("");// untuk mengakhiri baris dan membuat baris baru
        }
    }
    
}
