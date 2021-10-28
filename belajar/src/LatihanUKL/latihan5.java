
package LatihanUKL;
public class latihan5 {

    public static void main(String[] args) {
        // deklarasi matrix A dan matrix B
        int mA [][] = {{1},{3},{6}};
        int mB [][] = {{2,4,6}};
        // deklarasi matriks c
        int mC [][] = new int [mA.length][mB[0].length];
        // matriksA.length mengambil panjang matriksA (baris)
        // matriksB[0].length untuk mengambil panjang indeks ke 0 (kolom)
        // matriksA[ba][ka] * matriksB[bb][kb] = matriksC[ba][kb]
        
        // perulangan matriks
        for(int i=0;i<mA.length;i++){// baris matriks A
            for(int j=0;j<mB[0].length;j++){// kolom matriks B
                for(int k=0;k<mB.length;k++){// mencari perhitungan antara baris matriks A dan kolom matriks B
                    
                    // hasil dari perhitungan matriks
                    mC[i][j] += mA[i][k]* mB[k][j];
                
            }
            //menampilkan hasil matriks
           System.out.print(mC[i][j]+" ");
        }
        System.out.println(" ");
    }
    
}
}
