package belajar;


public class Latihan6 {

    public static void main(String[] args) {
        System.out.println("Latihan 6 array ");
        
        int matriksA [][] = {{1,3},{2,4}};
        int matriksB [][] = {{4,2},{3,1}};
        int matriksC [][] = new int [2][2];
        
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                matriksC[i][j]=matriksA[i][j]+matriksB[i][j];
                System.out.print(matriksC[i][j]+" ");
            }
            System.out.println("");
            
        }
    }
    
}
