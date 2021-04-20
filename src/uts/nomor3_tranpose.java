
package uts;
import java.util.Scanner;
public class nomor3_tranpose {
    public static void main(String [] args){
        
        int i, j, m, n ;
        int matriks [][]= new int [10][10];
        int transpose[][] = new int [10][10];
        
        Scanner scan = new Scanner (System.in);
        
        System.out.println ("Masukkan jumlah baris matriks A :");
        m = scan.nextInt();
        System.out.println ("Masukkan jumlah kolom matriks A: ");
        n = scan.nextInt();
        System.out.println ("Masukkan elemen matriks A : " );
        
        for (i=0 ; i<m ; i++){
                    for (j=0 ; j<n ; j++){
                        matriks[i][j] = scan.nextInt();
                    }
                }
System.out.println ("Hasil matriks A : ");
for (i= 0; i< m ; i++){
    for(j=0 ; j<n ; j++){
        System.out.print(matriks[i][j] + "\t");}
    System.out.println();
}

for (i= 0; i< m ; i++){
    for(j=0 ; j<n ; j++){
        transpose [j][i]= matriks[i][j];
    }}
System.out.println("Hasil transpose matriks A: ");

for (i= 0; i< n ; i++){
    for(j=0 ; j< m ; j++){
        System.out.print (transpose [i][j] + "\t");
    }

    System.out.println();
    }
    }
}
