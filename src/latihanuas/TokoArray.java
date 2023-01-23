package latihanuas;
import java.util.Scanner;

public class TokoArray {
    public static void main(String[] args) {
        
        // kasir toko kaos
        
        Scanner input = new Scanner(System.in);
        
        String[] NamaProduk = {
            "kaos sutra", "kaos linen", "kaos katun", "kaos PE"
        };
        
        int HargaProduk[] = {
            100000, 60000, 50000, 35000
        };
        
//        System.out.println(NamaProduk.length);
//        System.out.println(NamaProduk[3]);
        
        for(int i = 0; i < NamaProduk.length; i++){
            System.out.println(NamaProduk[i]+" : "+HargaProduk[i]);
        }
        
        System.out.print("Masukkan nama Produk : "); String pesan = input.nextLine();
        
        int harga=0;
        for(int i = 0; i<NamaProduk.length; i++){
            
            if(pesan.equals(NamaProduk[i])){
                harga = HargaProduk[i]; 
            }
        }
        
        System.out.println("harga : "+harga);
        
        String hadiah = "-";
        if(pesan.equals("kaos sutra") || pesan.equals("kaos PE")){
            hadiah = "Stiker";
        }
        
        System.out.println("hadiah : "+hadiah);
        
        System.out.print("Jumlah Produk : "); int jumlah = input.nextInt();
        
        double total = harga * jumlah;
        
        System.out.println("Total : "+total);
        
        int diskon=0;
        if(total > 500000){
            diskon = 10;
        }else if(total > 300000){
            diskon = 5;
        }
        
        double potongan = total * diskon / 100;
        
        double totalBayar = total - potongan;
        
        System.out.println("potongan : " + potongan);
        
        System.out.println("Total Bayar : "+totalBayar);
        
        System.out.print("Masukkan Uang Bayar : "); int bayar = input.nextInt();
        
        double kembalian = bayar - totalBayar;
        
        System.out.println("kembalian : "+kembalian);
    }
}
