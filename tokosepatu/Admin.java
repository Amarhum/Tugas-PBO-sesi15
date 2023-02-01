package tokosepatu;

import java.util.Scanner;

public class Admin {
    
   public static void adminApp()throws Exception{
   
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Menu Admin ===");
        System.out.println("1. Lihat Data Pengguna");
        System.out.println("2. Lihat Data Barang");
        System.out.println("3. Lihat Data Transaksi");
        System.out.println("4. Keluar");
        
        System.out.print("Pilih Dengan [1/2/3/4] = ");
        int padmin = sc.nextInt();
        
        if(padmin == 1){
            ConnectMysql.getDataUser();
            
        
        }
        else if(padmin == 2){
            ConnectMysql.getSepatugn();
            ConnectMysql.getSepaturn();
            ConnectMysql.getSepatucsl();
        }
        else if(padmin == 3){
            ConnectMysql.getTransaksi();
        }
        else if(padmin == 4) {
            System.exit(0);
        }
        else{
            System.out.println("Silahkan masukkan input yang benar");
            Admin.adminApp();
            
        }
        System.out.println("--------------------------------------");
        System.out.print("=== Pilih 5 Untuk Kembali: ");
        int pilihs = sc.nextInt();
        
        if(pilihs == 5){
            Admin.adminApp();
            
        }
        else{
            System.out.println("Silahkan masukkan input yang benar");
            System.out.println();
            Admin.adminApp();
        }
    
   }
}
