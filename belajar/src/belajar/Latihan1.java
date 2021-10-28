
package belajar;

public class Latihan1 {
    public static void main(String[] args) {
        System.out.println("Latihan Soal 1");
   
       int sukuPertama = 3; //nilai suku pertama
       int selisih = 5; // nilai selisih suku
       int jumlahSuku = 10; //nilai jumlah suku
       int sukuSaatIni = sukuPertama; // perhitungan dari suku pertama
       int jumlahDeretAritmatika = 0; // variabel untuk menghitung jumlah deret aritmatika
       
       for(int i = 1; i <= jumlahSuku; i++){ //melakukan perulangan suku

           jumlahDeretAritmatika += sukuSaatIni;  //Menghitung jumlah setiap suku
           sukuSaatIni += selisih; // membuat selisih antar suku
           
           System.out.println("Suku ke - "+i+" : "+sukuSaatIni); //menampilkan Deret Aritmatika
       }
       
        System.out.println("Jumlah Deret Aritmatika : " + jumlahDeretAritmatika);// menampilkan Jumlah Deret Aritmatika
    }
    
}
