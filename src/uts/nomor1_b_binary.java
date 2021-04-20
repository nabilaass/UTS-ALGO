

package uts;
  import java.util.Scanner;
public class  nomor1_b_binary {
    public static void data(int[] data){
        for (int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
    }
    public static void binarySearch(int[] data, int key){
        int indexAwal = 0;
        int indexAkhir = data.length-1;
        int middle = 0;
        int found = 0;
        while((indexAwal<=indexAkhir) && (found == 0)){
            middle = (indexAwal+indexAkhir)/2;
            System.out.println("nilai tengah = "+middle);
            if (key == data[middle]){
                System.out.println("Data "+key+", telah ditemukan pada indeks ke-"+middle);
                found = 1;
            }
            else{
                if (key < data[middle]){
                    System.out.println("<- kiri");
                    indexAkhir = middle-1;
                }
                else{
                    System.out.println("kanan ->");
                    indexAwal = middle+1;
                }
            }
        }
        if (found == 1){
            System.out.println("Kesimpulan : data ditemukan");
        }
        else{
            System.out.println("Kesimpulan : data tidak ditemukan");
        }
    }
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int[] nilai = {3,10,4,2,8,13};
        data(nilai);
        
        System.out.println("\nMasukan Data Yang Ingin di Cari:");
        int key = input.nextInt();
        
        binarySearch(nilai, key);
    }
}

