
package belajar;

public class Latihan3 {
    public static void main(String[] args) {
        System.out.println("Latihan Soal 3");
        System.out.println("Deret Aritmatikanya adalah : "); // menapilkan tulisan deret aritmatika adalah
        
        int awal = 10;
        int beda = 5;
        int sukuSaatIni = awal;      
        int jumlahDeret = 0;
        int nilaiterakhir = 80;
        int updatenilai;
        //deklarasi variabel

        for(int i = 0; i<5;i++){ //untuk membentuk pola baris kebawah
            for(int a =0; a<5;a++){ // untuk membentuk pola kolom kesamping
                //operator elemen matriks
                updatenilai = awal;
                awal += beda;
                jumlahDeret += updatenilai;
                System.out.print("  " +updatenilai);//menampilan nilai berikutnya 
               
            }
            System.out.println("  ");//untuk mengakhiri baris
        }
        System.out.println(" Total Jumlah Deret Aritmatika : "+jumlahDeret);// menampilkan total jumlah deret aritmatika
}   
}

