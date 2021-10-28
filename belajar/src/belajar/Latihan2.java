
package belajar;

public class Latihan2{
    public static void main(String[] args) {
            for(int a = 0; a < 5; a++){ // membuat bintang kebawah
                for(int i=0; i<a; i++){ // membuat bintang kesamping
                    System.out.print("*");//digunakan untuk menampilkan bintang
                }
                System.out.println(" "); // untuk mengakhiri baris
                
            }
            System.out.println("---------");//menampilkan garis pembatas antara segitiga a dan b
            
                for(int a = 0; a < 5; a++){ // membuat bintang kebawah
                for(int i=a; i<5; i++){ // membuat bintang kesamping
                    System.out.print("*");//digunakan untuk menampilkan bintang
                }
                System.out.println(" ");//untuk mengakhiri baris
            }
            
        }
    }
    

