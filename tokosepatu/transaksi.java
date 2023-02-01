package tokosepatu;

//import java.sql.DriverManager;
//import static tokosepatu.ConnectMysql.JDBC;
//import static tokosepatu.ConnectMysql.PASS;
//import static tokosepatu.ConnectMysql.URL;
//import static tokosepatu.ConnectMysql.USER;
//import static tokosepatu.ConnectMysql.con;
//import static tokosepatu.ConnectMysql.ps;
//import static tokosepatu.ConnectMysql.rs;

import static tokosepatu.Daftar.daftar;


public class transaksi extends Daftar {
    
   String kodeT = nm.Daftar;
    
    
    public static void transaksiEiger(){
        
        try{
            ConnectMysql.insertTransaksi();
           
        }
        catch(Exception e){
            System.out.println("Error: " +e.getMessage());
            
        }
    
    }
    
    
}
