package latihanuas;
import java.util.Scanner;
public class Array002 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        int baris, kolom;
        int angka=1;
        System.out.print("Masukan jumlah baris array : ");
        baris = in.nextInt();
        System.out.print("Masukan jumlah kolom array : ");
        kolom = in.nextInt();
        
        int array[][] = new int[baris][kolom];
        
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[0].length; j++){
                array[i][j] = angka;
                angka++;
            }
        }
        System.out.println("--------");
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[0].length; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("--------");
    }
    
}
