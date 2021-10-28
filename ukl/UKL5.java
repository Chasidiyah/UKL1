
package ukl;
public class UKL5 {

    public static void main(String[] args) {
        int mA[][] = {{1,2},{2,3},{3,4},{4,5},{5,4}};
        int mA2 [][] = {{1},{2},{3},{4}};
        int mB[][] = {{3,4},{4,5},{5,6},{6,7}};
        int mB2[][] = {{1},{2},{3},{4},{5}};
        int mC[][] = new int [mA.length][mB[0].length];
        int mD[][] = new int [mA2.length][mB2[0].length];
        
        
        for(int i=0;i<mA.length;i++){
            for(int j=0;j<mB[0].length;j++){
                for(int k=0;k<mB.length;k++){
                    for(int a=0;a<mA2.length;a++){
                        for(int b=0;b<mB2[0].length;b++){
                            for(int c=0;c<mB2.length;c++){
                                mC[i][j] += mA[i][k]*mA2[a][c];
                                mD[a][b] += mB[k][j]*mB2[c][b];
                            }
                        }
                        
                    }
                   
                   
                    
                }System.out.print(mC[i][j]+" ");
                System.out.println(mD[a][b]+"");
                
                
            }
            System.out.println("");
            
        }
    }
    
}
