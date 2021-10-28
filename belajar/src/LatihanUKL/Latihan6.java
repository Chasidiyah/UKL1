
package LatihanUKL;
public class Latihan6 {

    public static void main(String[] args) {
        int nilaisukupertama = 5;
        int selisih = 10;
        int sukukelima = 5;
        int sukukeduapuluh = 20;
        int nilaisuku;
        
        for(int i =sukukelima; i<=sukukeduapuluh; i++){
            nilaisuku = nilaisukupertama + ((i-1)*selisih);
       
        System.out.println("suku ke - "+i+" = "+nilaisuku);
    }
    
}
 }