//nabila asshafa putri
package uts;

public class nomor1_a_sorting {
    public static void selectionSort(int[] A) {
        int smallindex;
        int pass, j, n = A.length;
        int temp;

        for (pass = 0; pass < n - 1; pass++) { 

            smallindex = pass;
            for (j = pass + 1; j < n; j++) {
                if (A[j] < A[smallindex]) {
                    smallindex = j; 
                }
            }
            temp = A[pass]; //digunakan untuk solusi pada pertukaran data sementara
            A[pass] = A[smallindex];
            A[smallindex] = temp;
        }
    }
    public static void tampil(int data[]) { //cara menampilkan data pada array
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void main(String[] args) {
        int A[]= {3,10,4,2,8,13};
        System.out.println("Sebelum dilakukan Sorting :");
        nomor1_a_sorting.tampil (A);
        System.out.println("Sesudah dilakukan Sorting :");
        nomor1_a_sorting.selectionSort (A);
        nomor1_a_sorting.tampil (A);
        
}}
