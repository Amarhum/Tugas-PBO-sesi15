
package tokosepatu;
import java.util.Scanner;

public class Menu {
    
    public static void main(String[] args) {      
        
        try{
            MenuApp();
        }
        catch(Exception e){
            System.out.println("Aduh Masih Salah Aja");
            System.out.println("Error Message : " +e.getMessage());
           
        }
        
    }
    static void MenuApp(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("==== TOKO SEPATU PASTI LAKU ====");
        System.out.println("1. Login");
        System.out.println("2. Daftar");
        System.out.println("3. Keluar");
        System.out.println();
            
        System.out.print("Pilih Dengan [1/2/3] = ");
        int pilih = sc.nextInt();
            
        if(pilih == 1){
            Login.Login();
        }
        else if(pilih == 2){
            Daftar.daftar();
        }
        else if(pilih == 3){
            System.exit(0);
        }
        else{
            System.out.println("Silahkan masukkan input yang benar");
            System.out.println();
            MenuApp();
        }
//        try{
//            MenuApp());
//        }
//        catch(Exception e){
//            System.out.println("Ada Sebuah Kesalahan");
//            System.out.println("Error Message : " +e.getMessage());
//            
//        }
    }
}
