
package tokosepatu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;


public class Eiger {
    
    static final String JDBC = "com.mysql.cj.jdbc.Driver";
    static final String URL = "jdbc:mysql://localhost/toko";
    static final String USER = "root";
    static final String PASS = "";
    
    static Connection con;
    static ResultSet rs;
    static PreparedStatement ps;
//    static Statement state;
    
     public static String getEiger() throws Exception{
        Class.forName(JDBC);
        con = DriverManager.getConnection(URL, USER, PASS);
        
        String query = "SELECT kode_sepatu,merk_sepatu,harga_sepatu,stok_sepatu FROM sepatu_gunung WHERE kode_sepatu ='001 BGS'";
        ps = con.prepareStatement(query);
        
        
        rs = ps.executeQuery();
        
        while(rs.next()){
        
            System.out.println("Kode Sepatu : " + rs.getString("kode_sepatu"));
            System.out.println("Merk Sepatu : " + rs.getString("merk_sepatu"));
            System.out.println("Harga Sepatu : " + rs.getInt("harga_sepatu"));
            System.out.println("Stok Sepatu : " + rs.getString("stok_sepatu"));
            System.out.println("---------------------------------------");
            break;
        }
        Scanner sc = new Scanner(System.in);
         System.out.println("Pilih 1 Jika Yakin Membeli / 2 Kembali ");
        
         
         
//        if(!rs.next()){
//            return null;
//        }
//        else{
//            return rs.getString(1);
//        }
        return null;
    }
     
}

