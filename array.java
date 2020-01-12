/*
*Tugas UAS 
*Tutorial Membuat program Perkalian Matrix
 */
package UAS;
import java.util.Scanner;
public class array {
    public static void main(String[] args){
        int row1,col1,row2,col2;
        int [][]A;
        int [][]B;
        int [][]J;
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan Ordo baris matrix pertama = ");row1=in.nextInt();
        System.out.print("Masukan Ordo kolom matrix pertama = ");col1=in.nextInt();
        System.out.print("Masukan Ordo baris matrix kedua = ");row2=in.nextInt();
        System.out.print("Masukan Ordo kolom matrix kedua = ");col2=in.nextInt();
        
        if(col1==row2){
           A = new int [row1][col1];
           B = new int [row2][col2];
           J = new int [row1][col2];
           
           System.out.println("Masukan nilai matrix A = ");
           for(int i=0;i<row1;i++){
               for(int j=0;j<col1;j++){
                   System.out.print("A("+i+","+j+")= ");
                   A[i][j]=in.nextInt();
               }
           }
           System.out.println("Masukan nilai matrix B = ");
           for(int i=0;i<row2;i++){
               for(int j=0;j<col2;j++){
                   System.out.print("B("+i+","+j+")= ");
                   B[i][j]=in.nextInt();
               }
           }
           System.out.println("Matriks J= Matrix A * B");
           for(int i=0;i<row1;i++){
               for(int j=0;j<col2;j++){
                   J[i][j]=0;
                   for(int k=0;k<col1;k++){
                       J[i][j]+=A[i][k]*B[k][j];
                   }
               }
           }
           System.out.println("Matrix A: ");
           for(int i=0;i<row1;i++){
               for(int j=0;j<col1;j++){
                   System.out.print(A[i][j]+" ");
               }
               System.out.println(" ");
           }
           System.out.println("\nMatrix B: ");
           for(int i=0;i<row2;i++){
               for(int j=0;j<col2;j++){
                   System.out.print(B[i][j]+" ");
               }
               
               System.out.println(" ");
           }
           System.out.println("\nMatrix J: ");
           for(int i=0;i<row1;i++){
               for(int j=0;j<col2;j++){
                   System.out.print(J[i][j]+" ");
               }
               System.out.println(" ");
           }
        }
        else
            System.out.println("Ordo kolom matrix pertama tidak sama dengan Ordo baris kedua ");
    }
}
