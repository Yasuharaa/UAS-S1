import java.util.Scanner;

public class PerulanganDeret {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Baris : "); int baris = input.nextInt();
        System.out.print("Masukkan Kolom : "); int kolom = input.nextInt();

//        1 2 3 4 
//        5 6 7 8 
        int angka = 1;
        for(int i = 0; i< baris; i++){
            
            for(int j = 0; j < kolom; j++){
                
                System.out.print(angka+" ");
                angka++;  // angka += 1
            }
            
            System.out.println();
        }
    }
}
