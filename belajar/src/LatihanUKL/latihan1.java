
package LatihanUKL;
public class latihan1 {

    public static void main(String[] args) {
        // deklarasi variabel
        int Awal = 5;
        int beda = 5;
        int sukuSaatIni;
        
        for(int a=1;a<=4;a++){// untuk membuat pola angka kebawah
            for(int b=0;b<a;b++){// untuk membuat pola angka kesamping
                sukuSaatIni = Awal;
                Awal += beda;
                System.out.print(sukuSaatIni+" ");// menampilkan nilai berikutnya dan membuat jarak diantara angka
            }
            System.out.println("");// untuk mengakhiri line dan membuat new line 
        }
    }
    }
    

