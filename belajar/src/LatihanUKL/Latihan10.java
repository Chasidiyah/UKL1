
package LatihanUKL;
import java.util.Scanner;
public class Latihan10 {

    public static void main(String[] args) {
        System.out.println("Seleksi kondisi");
        Scanner input = new Scanner(System.in);
        
        String[] Pelanggan = {"Ali","Budi","Dani","Edi","Umar"};
        
        System.out.println("Daftar Nama Pelanggan");
        for(int i=0;i<Pelanggan.length;i++){
            System.out.println((i+1)+" "+Pelanggan[i]);
        }
        
        System.out.print("Silahkan Masukkan ID : ");
        int idPelanggan = input.nextInt();
                
        System.out.print("Silahkan Masukkan Pemakaian (m3) : ");
        int totalPemakaian =input.nextInt();
        
        int tarifPerm3 = 2000;
        int pemakaian = totalPemakaian;
        
        int totalPembayaran = 10*tarifPerm3;
        pemakaian -= 10;
        tarifPerm3 = 3000;
        
        if(pemakaian >= 10){
            totalPembayaran += 10*tarifPerm3;
            pemakaian -= 10;
            tarifPerm3 = 4000;
        }
        
        if(pemakaian >= 10){
            totalPembayaran += 10*tarifPerm3;
            pemakaian -= 10;
            tarifPerm3 = 5000;
        }
        if(pemakaian < 0){
            pemakaian = 0;
        }
        
        totalPembayaran += pemakaian*tarifPerm3;
        totalPembayaran += 10000;
        
        System.out.println("");
        System.out.println("Resi Pembayaran");
        System.out.println("ID : "+idPelanggan);
        System.out.println("Nama : "+Pelanggan[idPelanggan-1]);
        System.out.println("Pemakaian : "+totalPemakaian);
        System.out.println("Pembayaran : "+totalPembayaran);
        
        input.close();
    }
    
}
