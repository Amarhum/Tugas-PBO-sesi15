
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
        
        System.out.println("--------------------------------------");
        System.out.print("=== masukan kode sepatu untuk Beli / Pilih 5 Untuk Kembali: ");
        String pilihs = sc.next();
        
        if(null == pilihs){
            System.out.println("Silahkan masukkan input yang benar");
            berandaApp();
        }
        else switch (pilihs) {
            case "001BGS":
                transaksi.getEiger();
                break;
            case "002BGS":
                transaksi.getArai();
                break;
            case "003LMY":
                transaksi.getLowa();
                break;
            case "004LMY":
                transaksi.getConsina();
                break;
            case "001RN":
                transaksi.getLeague();
                break;
            case "002RN":
                transaksi.getPiero();
                break;
            case "003RN":
                transaksi.getSpecs();
                break;
            case "004RN":
                transaksi.getEagle();
                break;
            case "001CSL":
                transaksi.getConverse();
                break;
            case "002CSL":
                transaksi.getVans();
                break;
            case "003CSL":
                transaksi.getCompas();
                break;
            case "004CSL":
                transaksi.getDiadora();
                break;
            case "5":
                berandaApp();
                break;
            default:
                System.out.println("Silahkan masukkan input yang benar");
                berandaApp();
                break;
        }
        System.out.println("masukan Kode Transaksi Untuk Konfirmasi Pembelian : ");
        String beli = sc.next();
        
        if(null == beli){
            System.out.println("Silahkan masukkan input yang benar");
            berandaApp();
        }
        else switch (beli) {
            case "1011":
                Pembayaran.bayarEiger();
                break;
            case "1022":
                Pembayaran.bayarArai();
                break;
            case "1033":
               Pembayaran.bayarLowa();
                break;
            case "1044":
                Pembayaran.bayarConsina();
                break;
            case "1055":
                Pembayaran.bayarLeague();
                break;
            case "1066":
                Pembayaran.bayarPiero();
                break;
            case "1077":
                Pembayaran.bayarSpecs();
                break;
            case "1088":
                Pembayaran.bayarEagle();
                break;
            case "1099":
                Pembayaran.bayarConverse();
                break;
            case "1010":
                Pembayaran.bayarVans();
                break;
            case "1111":
                Pembayaran.bayarCompas();
                break;
            case "1012":
                Pembayaran.bayarDiadora();
                break;
            case "5":
                berandaApp();
                break;
            default:
                System.out.println("Silahkan masukkan input yang benar");
                berandaApp();
                break;
        }
        
        System.out.println("=== SUKSES MEMBELI ===");
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