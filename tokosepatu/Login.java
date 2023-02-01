
package tokosepatu;
import java.util.Scanner;

public class Login {
     public static void Login() {
        String idA = "admin";
        String psA = "admin";
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== LOGIN ===");
        
        System.out.println("Masukan Id : ");
       String idl = sc.nextLine();
        System.out.println("Masukan password : ");
       String psl = sc.nextLine();  
    

         try{
            if(idl.equals(ConnectMysql.getId(idl)) && psl.equals(ConnectMysql.getPs(psl))){
                Beranda.berandaApp();
            }
            else if(idl.equals(idA) && psl.equals(psA)){
            Admin.adminApp();
            }
            else{
                System.out.println("Akun Tidak Ada / Daftar Akun Terlebih Dahulu");
                Menu.MenuApp();
            }
        }
        catch(Exception e){
            System.out.println("Error : " + e.getMessage());
        }
         
         }
}
