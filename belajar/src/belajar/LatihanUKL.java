
package belajar;
public class LatihanUKL {

    public static void main(String[] args) {
      
        System.out.println("Latihan Soal 3");
        System.out.println("Deret Aritmatikanya adalah : "); 
        
        int awal = 8;
        int beda = 10;
        int jumlahDeret = 0;
        int updatenilai;
        int n= 5;
        int sukuSaatIni = awal; 
        //deklarasi variabel

        for(int i = 0; i<4;i++){ //untuk membentuk pola baris kebawah
            for(int a =0; a<5;a++){ // untuk membentuk pola kolom kesamping
                //operator elemen matriks
                updatenilai = n;
                n=awal+(n-1)*beda;
                jumlahDeret += updatenilai;
                System.out.print("  " +updatenilai);//menampilan nilai berikutnya 
               
            }
            System.out.println("  ");//untuk mengakhiri baris
        }
        System.out.println(" Total Jumlah Deret Aritmatika : "+jumlahDeret);// menampilkan total jumlah deret aritmatika
}   
}
       
    
    

//Nilai dari suku pertama adalah 8, selisih antara nilai suku-suku yang berdekatan adalah 10.
//Tampilkan deret aritmatika mulai suku pertama sampai suku ke 20, serta tampilkan jumlah deret tersebut