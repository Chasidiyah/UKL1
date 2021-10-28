
package belajar;

public class Latihan4b {
    public static void main(String[] args) {
        System.out.println("Latihan Soal 4b");
        
        // deklarasi variabel
        int beda = 5;
        int Awal = 5;
        int sukuSaatini;
        
        for(int a=0; a<5;a++){// membuat pola angka ke bawah
            for(int i=a; i<5; i++){// membuat pola angka ke samping
                sukuSaatini = Awal;
                Awal += beda;
                System.out.print(sukuSaatini+" ");// menampilkan nilai berikutnya dan membuat space antara angka        
            }
            System.out.println("");// untuk mengakhiri baris dan membuat baris baru 
                    
         }
     }
}
               