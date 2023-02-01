
package tokosepatu;

import java.util.Scanner;

public class Daftar {
    public static void daftar() {
        

         Scanner sc = new Scanner(System.in);
        
         // menu akun
        System.out.println("=== DAFTAR AKUN ===");
        System.out.println("Buat Id : ");
        String id = sc.nextLine();
        System.out.println("Buat Password : ");
        String ps = sc.nextLine();
        System.out.println("Nama : ");
        String nm = sc.nextLine();
        System.out.println("Jenis Kelamin : ");
        String jk = sc.nextLine();
        System.out.println("No Telpon : ");
        String no = sc.nextLine();
        System.out.println("Alamat : ");
        String almt = sc.nextLine();
        
        try{
            ConnectMysql.insertAkun(id, ps,nm, jk,no, almt);
            System.out.println("ID Anda :"+ id);
            System.out.println("Password anda: " + ps);
            Login.Login();
        }
        catch(Exception e){
            System.out.println("Error: " +e.getMessage());
            
        }
    }
    
}
