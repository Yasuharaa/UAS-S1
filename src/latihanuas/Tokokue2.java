package latihanuas;
import java.util.Scanner;
import java.time.LocalDate;
public class Tokokue2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int pilihan, harga, jumlah, kembalian, bayar;
        double total, totalbayar, potongan;
        String namakue, diskon, hadiah = "Tidak ada";
  
        //Menu
        String menu[][] = new String[2][3];
        menu[0][0] = "1. Short Cake   20k |";
        menu[0][1] = "2. Donat        10k |";
        menu[0][2] = "3. Kue Tart     30k |";
        menu[1][0] = "4. Waffle       15k |";
        menu[1][1] = "5. Kue Roll     25k |";
        menu[1][2] = "6. Birtday Cake 50k |";
        
        //Data kue 
        String[] kue = {
            "Short Cake", "Donat", "Kue Tart", "Waffle", "Kue Roll", "Birthday Cake"
        };
        int[] hargakue = {
            20000, 10000, 30000, 15000, 25000, 50000
        };
        
        //Data Pegawai/Kasir
        String[] namapegawai = { "Ayu", "Bayu", "Elysia" };
        String pelanggan="",kodepegawai ="", pegawai = "Tidak ditemukan/Salah input kode";
        String ulang = "Y";
        while (ulang.toUpperCase().trim().equals("Y")){
            System.out.println("------------------------------------");
            System.out.println("       Toko Kue 'Bonbon Bakery'     ");
            System.out.println("------------------------------------");
            
            while (pegawai.equals("Tidak ditemukan/Salah input kode")) {
                        System.out.print("Kode Pegawai : ");
                        kodepegawai = in.next();

                        if (kodepegawai.equals("101")) {
                            pegawai = namapegawai[0];
                        } else if (kodepegawai.equals("102")) {
                            pegawai = namapegawai[1];
                        } else if (kodepegawai.equals("103")) {
                            pegawai = namapegawai[2];
                        } else {
                            pegawai = "Tidak ditemukan/Salah input kode";
                            System.out.println(pegawai);
                        }
                        
            }
            System.out.println("Nama Pegawai   : " + pegawai);
            System.out.print("Nama Pelanggan : ");
            pelanggan = in.next();
            
            System.out.println("------------------------------------");
            System.out.println("      Jenis Kue 'Bonbon Bakery'     ");
            System.out.println("------------------------------------");
            for(int i=0; i<menu.length; i++){
                for(int j=0; j<menu[0].length; j++){
                    System.out.print(menu[i][j]+" ");
                    
                }
                System.out.println("");
            }
            
            //Pilihan
            System.out.print("Pilih Kue : ");
            pilihan = in.nextInt();
            
            switch(pilihan){
                case 1:
                    namakue=kue[0];
                    harga = hargakue[0];
                break;
                case 2:
                    namakue=kue[1];
                    harga = hargakue[1];
                break;
                case 3:
                    namakue=kue[2];
                    harga = hargakue[2];
                break;
                case 4:
                    namakue=kue[3];
                    harga = hargakue[3];
                break;
                case 5:
                    namakue=kue[4];
                    harga = hargakue[4];
                break;
                case 6:
                    namakue=kue[5];
                    harga = hargakue[5];
                    hadiah = "kotak hadiah special dari Bonbon Bakery";
                break;
                default:
                    namakue=null;
                    harga = 0;
                break;
                    
            }
            System.out.println("Nama Kue  : "+namakue);
            System.out.println("Harga Kue : Rp."+harga);
            System.out.print("Jumlah    :");
            jumlah = in.nextInt();
            total = jumlah*harga;
            if(total>=100000){
                diskon = "10%";
                potongan = 0.1;
            }else if(total>=50000){
                diskon = "5%";
                potongan = 0.05;
            }else if(total>=30000){
                diskon = "3%";
                potongan = 0.03;
            }else{
                diskon = "-";
                potongan = 0;
            }
            double potong = total*potongan;
            totalbayar = total-potong;
            System.out.println("Total : Rp."+total);
            System.out.println("Diskon : "+diskon);
            
            System.out.println("Total Bayar : Rp."+totalbayar);
            
            
            //Nota
            System.out.println("------------------------------------");
            System.out.println("       Toko Kue 'Bonbon Bakery'     ");
            System.out.println("------------------------------------");
            System.out.println("Nama Kasir     : "+pegawai);
            System.out.println("Nama Pelanggan : "+pelanggan);
            System.out.println("-------------Pesanan----------------");
            System.out.println("Nama Kue : "+namakue);
            System.out.println("Harga Kue : Rp."+harga);
            System.out.println("Jumlah Kue : "+jumlah);
            System.out.println("Total : Rp."+(int) total);
            System.out.println("-------------------------------------");
            System.out.println("Hadiah : "+hadiah);
            System.out.println("Diskon : "+diskon);
            System.out.println("-------------------------------------");
            System.out.println("TotalBayar : Rp."+(int) totalbayar);
            System.out.print("Bayar : Rp.");
            bayar = in.nextInt();
            kembalian = (int) (bayar-totalbayar);
            System.out.println("Kembalian Rp."+kembalian);

          
            
            
            System.out.print("Apakah ada pesanan berikutnya? Y/T : ");
            ulang = in.next();
        }    
        
    }
}
