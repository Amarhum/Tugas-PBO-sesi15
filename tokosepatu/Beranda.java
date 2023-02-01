
package tokosepatu;

import java.util.Scanner;

public class Beranda {
    
    static void berandaApp() throws Exception{
        Scanner sc = new Scanner(System.in);
        
        System.out.println("==== BERANDA ====");
        System.out.println("1. Sepatu Gunung");
        System.out.println("2. Sepatu Ruuning");
        System.out.println("3. Sepatu Casual");
        System.out.println("4. Keluar");
        System.out.println();
            
        System.out.print("Pilih Dengan [1/2/3/4] = ");
        int pilih = sc.nextInt();
            
        if(pilih == 1){
            ConnectMysql.getSepatugn();
            
        }
        else if(pilih == 2){
            ConnectMysql.getSepaturn(); 
        }
        else if(pilih == 3){
            ConnectMysql.getSepatucsl(); 
            
        }
        else if(pilih == 4){
            System.exit(0);
        }
        else{
            System.out.println("Silahkan masukkan input yang benar");
            System.out.println();
            berandaApp();
        }
        
        System.out.println("=====================");
        System.out.print("Pilih No untuk Beli / Pilih 5 Untuk Kembali: ");
        System.out.println("=====================");
        int pilihs = sc.nextInt();
        
        if(pilihs == 1){
            Eiger.getEiger();
        }
        else{
            System.out.println("Silahkan masukkan input yang benar");
            System.out.println();
            berandaApp();
        }
    }
    
}


// try{
//            berandaApp();
//        }
//        catch(Exception e){
//            System.out.println("Ada Sebuah Kesalahan");
//            System.out.println("Error Message : " +e.getMessage());
//            
//        }