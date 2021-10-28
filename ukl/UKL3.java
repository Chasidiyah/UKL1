
package ukl;
import java.util.Scanner;
public class UKL3 {
 
    public static void main(String[] args) {
        int i, j , k, l, N;
        System.out.println("Masukan nilai N : ");
        Scanner inputan = new Scanner(System.in);
        N = inputan.nextInt();
     
        System.out.println("------bentuk pertama----------------------");
        for (i=N; i>0; i--) {
            for (j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
     
        for (i=0; i<=N; i++) {
            for (j=0; j<i; j++){
                  System.out.print("*");
            }
            System.out.println();
        }
     
        
         }
}

            
        
    
    

