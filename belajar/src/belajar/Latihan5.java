
package belajar;

public class Latihan5 {
    public static void main(String[] args) {
        System.out.println("Latihan 5");
        
        int MatriksA[][] = new int[2][2];
            MatriksA[0][0] = -5;
            MatriksA[0][1] = 3;
            MatriksA[1][0] = 7;
            MatriksA[1][1] = 2;
            
        int MatriksB[][] = new int[2][2];
            MatriksB[0][0] = 3;
            MatriksB[0][1] = 1;
            MatriksB[1][0] = 5;
            MatriksB[1][1] = -2;
            
            System.out.println("Matriks A = ");
        for(int a=0;a<MatriksA.length;a++){
            for(int b=0;b<MatriksA[0].length;b++){
                    System.out.print(MatriksA[a][b] + " ");
                    
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Matriks B = ");
        for(int m=0;m<MatriksB.length;m++){
            for(int n=0;n<MatriksB[0].length;n++){
                    System.out.print(MatriksB[m][n] + " ");
            }
            System.out.println();
        }
            
            System.out.println("Hasil Dari Matriks A-B :");
            for(int a=0;a<MatriksA.length;a++){
                for(int i=0;i<MatriksA[0].length;i++){
                    int hasilElemenMatriks = MatriksA[a][i]-MatriksB[a][i];
                    System.out.print(hasilElemenMatriks+" ");
                    
                }
                System.out.println();
            }     
            }
              
                }
                
  

  
