
package LatihanUKL;
public class Latihan7 {

    public static void main(String[] args) {
        System.out.println("Deret Aritmatikanya adalah");
        
        int awal =5;
        int beda =3;
        int update=awal;
        int saatIni=awal;
            
        for(int i=0;i<4;i++){ 
            for(int j=0;j<i;j++){
                System.out.print(update+"\t");
                update=update+beda;
                saatIni=saatIni+update; 
            }
            System.out.println();
            }
        for(int i=0;i<2;i++){ 
            for(int j=0;j<2-i;j++){
                System.out.print(update+"\t");
                update=update+beda;
                saatIni=saatIni+update; 
            }
                System.out.println();
            }
                saatIni=saatIni-update;
                
            System.out.println("Jumlah Deret Aritmatikanya adalah "+saatIni);
        }

    }
    
