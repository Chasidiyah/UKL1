
package ukl;

public class UKL {

    public static void main(String[] args) {
        int a = 15;
        int beda = 23;
        int jumlahsuku = 10;
        int sukusaatini = a;
        int jumlahDeretAritmatika = 0;
        
        for(int i = 1; i <= jumlahsuku; i++ ){
            System.out.println("Suku Ke-"+i+" : "+sukusaatini);
            jumlahDeretAritmatika += sukusaatini;
            sukusaatini += beda;
            
        }
        System.out.println("Jumlah Deret Aritmatikanya : "+jumlahDeretAritmatika);
    }
    
}
