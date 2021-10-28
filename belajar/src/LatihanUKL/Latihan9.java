
package LatihanUKL;
public class Latihan9 {
    public static void main(String[] args) {
        System.out.println("membuat pertambahan array");
        
        int mA [][] = {{2,4},{4,6}};
        int mB [][] = {{2,3},{6,6}};
        int mC [][] = new int [mA.length] [mB[0].length];
        
        for(int a=0;a<mA.length;a++){
            for(int d=0;d<mB[0].length;d++){
                for(int c=0;c<mB.length;c++){
                    mC[a][d]+=mA[a][c]*mB[c][d];
                    
                    
                }
                System.out.print(mC[a][d]+" ");
                
            }
            System.out.println("");
            
        }
        }
        }
           
       
    
    

