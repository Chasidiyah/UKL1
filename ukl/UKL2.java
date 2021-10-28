
package ukl;
public class UKL2 {

    public static void main(String[] args) {
        int awal = 5;
        int beda = 5;
        int sukusaatini = awal;
        int jda = 0;
        
        for(int i=1; i<=4; i++){
            for(int j = 1; j<=4; j++){
                
                System.out.print(sukusaatini+" ");
                jda += sukusaatini;
                sukusaatini += beda;
                
            }
            System.out.println("");
            System.out.println("Jumlah Deret Aritmatikanya : "+ jda);
            
        }
    }
    
}
