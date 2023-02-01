
package tokosepatu;
import java.util.Scanner;

public class Login {
     public static void Login() {
        
        
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
            else{
                System.out.println("Username Atau Password Salah");
                System.out.println("");
                Login();
            }
        }
        catch(Exception e){
            System.out.println("Error : " + e.getMessage());
        }
         
         }
}
