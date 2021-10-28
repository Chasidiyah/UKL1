
package LatihanUKL;
public class latihan3 {

    public static void main(String[] args) {
        // deklarasi matrix A dan matrix B
        int matriksA [][] = {{1,6},{5,3}};
        int matriksB [][] = {{2},{3}};
        // deklarasi matriks c 
        int matriksC [][] = new int [matriksA.length][matriksB[0].length];
        // matriksA.length mengambil panjang matriksA (baris)
        // matriksB[0].length untuk mengambil panjang indeks ke 0 (kolom)
        // matriksA[ba][ka] * matriksB[bb][kb] = matriksC[ba][kb]
        
        // perulangan matriks
        for(int i=0;i<matriksA.length;i++){ // baris matriks A
            for(int j=0;j<matriksB[0].length;j++){ // kolom matriks B
                for(int k=0;k<matriksB.length;k++){ // mencari perhitungan antara baris matriks A dan kolom matriks B
                    
                    // hasil dari perhitungan matriks
                    matriksC[i][j]+=matriksA[i][k]*matriksB[k][j]; 
                    
                }
                //menampilkan hasil matriks
                System.out.print(matriksC[i][j]+" ");
            }
            System.out.println(" ");
            
        }
    }
    
}
