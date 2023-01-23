package latihanuas;
import java.util.Scanner;
import java.time.LocalDate;
public class Tokokue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] namapegawai = { "Ayu", "Bayu", "Elysia" };
        String pelanggan="",kodepegawai ="", pegawai = "Tidak ditemukan/Salah input kode";
        String ulang = "Y", pesanlagi="Y";
        String menu[][] = new String[2][3];
        
        menu[0][0] = "1. Short Cake   20k |";
        menu[0][1] = "2. Donat        10k |";
        menu[0][2] = "3. Kue Tart     30k |";
        menu[1][0] = "4. Waffle       15k |";
        menu[1][1] = "5. Kue Roll     25k |";
        menu[1][2] = "6. Birtday Cake 50k |";
        
        
        
        
        while (ulang.toUpperCase().trim().equals("Y")){
            System.out.println("------------------------------------");
            System.out.println("       Toko Kue 'Bonbon Bakery'     ");
            System.out.println("------------------------------------");
            
            while (pegawai.equals("Tidak ditemukan/Salah input kode")) {
                        System.out.print("Kode Pegawai : ");
                        kodepegawai = in.nextLine();

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
            pelanggan = in.nextLine();
            
            System.out.println("------------------------------------");
            System.out.println("      Jenis Kue 'Bonbon Bakery'     ");
            System.out.println("------------------------------------");
            for(int i=0; i<menu.length; i++){
                for(int j=0; j<menu[0].length; j++){
                    System.out.print(menu[i][j]+" ");
                    
                }
                System.out.println("");
            }
            
            int kue = 0, harga=0, jumlah=0, total=0, total_1 = 0, total_2 = 0, total_3 = 0, total_4 = 0, total_5 = 0, total_6 = 0;
            
            while(pesanlagi.toUpperCase().equals("Y")){
            System.out.print("Pilih Jenis Kue : ");
            kue = in.nextInt();
            switch(kue){
                case 1:
                    int harga_1 = 20000;
                    System.out.println("Short Cake Rp."+harga_1);
                    System.out.print("Jumlah = ");
                    int jumlah_1 = in.nextInt();
                    total_1 =jumlah_1*harga_1;
                    System.out.println("Harga = Rp."+total_1);
                break;
                case 2:
                    int harga_2 = 10000;
                    System.out.println("Donat Rp."+harga_2);
                    System.out.print("Jumlah = ");
                    int jumlah_2 = in.nextInt();
                    total_2 =jumlah_2*harga_2;
                    System.out.println("Harga = Rp."+total_2);
                break;
                case 3:
                    int harga_3 = 30000;
                    System.out.println("Kue Tart Rp."+harga_3);
                    System.out.print("Jumlah = ");
                    int jumlah_3 = in.nextInt();
                    total_3 =jumlah_3*harga_3;
                    System.out.println("Harga = Rp."+total_3);
                break;
                case 4:
                    int harga_4 = 15000;
                    System.out.println("Waffle Rp."+harga_4);
                    System.out.print("Jumlah = ");
                    int jumlah_4 = in.nextInt();
                    total_4 =jumlah_4*harga_4;
                    System.out.println("Harga = Rp."+total_4);
                break;
                case 5:
                    int harga_5 = 25000;
                    System.out.println("Kue RollRp."+harga_5);
                    System.out.print("Jumlah = ");
                    int jumlah_5 = in.nextInt();
                    total_5 =jumlah_5*harga_5;
                    System.out.println("Harga = Rp."+total_5);
                break;
                case 6:
                    int harga_6 = 50000;
                    System.out.println("Birtday Cake Rp."+harga_6);
                    System.out.print("Jumlah = ");
                    int jumlah_6 = in.nextInt();
                    total_6 =jumlah_6*harga_6;
                    System.out.println("Harga = Rp."+total_6);
                break;
                default: break;
                
            }
            
            System.out.print("Pesan lagi? Y/T : ");
            pesanlagi = in.next();
            }
            total = total_1 + total_2 + total_3 + total_4 + total_5 +total_6;
            System.out.println("Total = Rp."+total);
            
            

          
            
            
            System.out.print("Apakah ada pesanan berikutnya? Y/T : ");
            ulang = in.next();
        }    
        
    }
}
