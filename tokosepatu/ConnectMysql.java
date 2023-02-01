package tokosepatu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.util.Scanner;
//import java.sql.Exception;
//import java.sql.Statement;


public class ConnectMysql {
    static final String JDBC = "com.mysql.cj.jdbc.Driver";
    static final String URL = "jdbc:mysql://localhost/toko";
    static final String USER = "root";
    static final String PASS = "";
    
    static Connection con;
    static ResultSet rs;
    static PreparedStatement ps;
//    static Statement state;
    
    public static void main(String[] args) {
        try{
        Class.forName(JDBC);
        con = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Berhasil");
        }
        catch(Exception e){
            System.out.println("gagal");
        }
    }
    
    public static String getId(String id_pembeli) throws Exception{
        Class.forName(JDBC);
        con = DriverManager.getConnection(URL, USER, PASS);
        
        String query = "SELECT id_pembeli FROM tbl_pembeli WHERE id_pembeli = (?)";
        ps = con.prepareStatement(query);
        ps.setString(1, id_pembeli);
        rs = ps.executeQuery();
        
        if(!rs.next()){
            return null;
        }
        else{
            return rs.getString(1).toString();
        }
    }
    public static String setkode(int kode) throws Exception{
     Class.forName(JDBC);
        con = DriverManager.getConnection(URL, USER, PASS);
        
        String query = "SELECT merk_sepatu FROM sepatu_gunung WHERE merk_sepatu = (?)";
         ps.setInt(1, kode);
        rs = ps.executeQuery();
        ps = con.prepareStatement(query);
        
                if(!rs.next()){
            return null;
        }
        else{
            return rs.getString(1).toString();
        }
    }
    public static String getPs(String ps_pembeli) throws Exception{
        Class.forName(JDBC);
        con = DriverManager.getConnection(URL, USER, PASS);
        
        String query = "SELECT ps_pembeli FROM tbl_pembeli WHERE ps_pembeli = (?)";
        ps = con.prepareStatement(query);
        ps.setString(1, ps_pembeli);
        rs = ps.executeQuery();
        
        if(!rs.next()){
            return null;
        }
        else{
            return rs.getString(1).toString();
        }
    }
    // Bagian DATA PENGGUNA
    public static void getDataUser()throws Exception{
     
        
        Class.forName(JDBC);
        con = DriverManager.getConnection(URL, USER, PASS);
        
        String query = "SELECT * FROM tbl_pembeli";
        ps = con.prepareStatement(query);
        rs = ps.executeQuery();
        
        int nomor = 0;
        while(rs.next()){
        
            nomor++;
            System.out.println("NO " + nomor);
            System.out.println("ID Pengguna : " + rs.getString("id_pembeli"));
            System.out.println("Password pengguna : " + rs.getString("ps_pembeli"));
            System.out.println("Nama Pengguna : " + rs.getString("nama_pembeli"));
            System.out.println("Jenis Kelamin : " + rs.getString("jenis_kelamin"));
            System.out.println("No Telpon : " + rs.getString("no_telpon"));
            System.out.println("Alamat : " + rs.getString("alamat"));
            System.out.println("---------------------------------------");
            

          }
 }
    
    public static void getSepatugn()throws Exception{
     
        
        Class.forName(JDBC);
        con = DriverManager.getConnection(URL, USER, PASS);
        
        String query = "SELECT * FROM sepatu_gunung";
        ps = con.prepareStatement(query);
        rs = ps.executeQuery();
        
        int nomor = 0;
        while(rs.next()){
        
            nomor++;
            System.out.println("NO " + nomor);
            System.out.println("Kode Sepatu : " + rs.getString("kode_sepatu"));
            System.out.println("Merk Sepatu : " + rs.getString("merk_sepatu"));
            System.out.println("Harga Sepatu : " + rs.getInt("harga_sepatu"));
            System.out.println("Stok Sepatu : " + rs.getString("stok_sepatu"));
            System.out.println("---------------------------------------");
          }
 }
    public static void getSepaturn()throws Exception{
        Class.forName(JDBC);
        con = DriverManager.getConnection(URL, USER, PASS);
        
        String query = "SELECT * FROM sepatu_running";
        ps = con.prepareStatement(query);
        rs = ps.executeQuery();
        
        int nomor = 0;
        while(rs.next()){
        
            nomor++;
            System.out.println("NO " + nomor);
            System.out.println("Kode Sepatu : " + rs.getString("kode_sepatu"));
            System.out.println("Merk Sepatu : " + rs.getString("merk_sepatu"));
            System.out.println("Harga Sepatu : " + rs.getInt("harga_sepatu"));
            System.out.println("Stok Sepatu : " + rs.getString("stok_sepatu"));
            System.out.println("---------------------------------------");
            
            
        } 
    }
    
    /**
     *
     * @throws Exception
     */
    public static void getSepatucsl()throws Exception{
        Class.forName(JDBC);
        con = DriverManager.getConnection(URL, USER, PASS);
        
        String query = "SELECT * FROM sepatu_casual";
        ps = con.prepareStatement(query);
        rs = ps.executeQuery();
        
        int nomor = 0;
        while(rs.next()){
        
            nomor++;
            System.out.println("NO " + nomor);
            System.out.println("Kode Sepatu : " + rs.getString("kode_sepatu"));
            System.out.println("Merk Sepatu : " + rs.getString("merk_sepatu"));
            System.out.println("Harga Sepatu : " + rs.getInt("harga_sepatu"));
            System.out.println("Stok Sepatu : " + rs.getString("stok_sepatu"));
            System.out.println("---------------------------------------");
        
            break;
        } 
    }
    
    public static void getTransaksi()throws Exception{
    
        Class.forName(JDBC);
        con = DriverManager.getConnection(URL, USER, PASS);
        
        String query = "SELECT * FROM tbl_transaksi";
        ps = con.prepareStatement(query);
        rs = ps.executeQuery();
        
        int nomor = 0;
        while(rs.next()){
        
            nomor++;
            System.out.println("kode Transaksi : " + rs.getInt("kode_transaksi"));
            System.out.println("Kode Sepatu : " + rs.getString("kode_sepatu"));
            System.out.println("Nama Sepatu : " + rs.getString("nama_sepatu"));
            System.out.println("Id Pembeli : " + rs.getString("id_pembeli"));
            System.out.println("Tanggal : " + rs.getString("tanggal"));
            System.out.println("---------------------------------------");
        
            break;
        } 
        
    }
    
    public static void insertAkun(String id_pembeli, String ps_pembeli,String nama_pembeli, String jenis_kelamin,String no_telpon, String alamat) throws Exception{
        Class.forName(JDBC);
        con = DriverManager.getConnection(URL, USER, PASS);
        
        String query = "INSERT INTO tbl_pembeli VALUES (?,?,?,?,?,?)";
        ps = con.prepareStatement(query);
        
        ps.setString(1, id_pembeli);
        ps.setString(2, ps_pembeli);
        ps.setString(3, nama_pembeli);
        ps.setString(4, jenis_kelamin);
        ps.setString(5, no_telpon);
        ps.setString(6, alamat);
        
        if(ps.executeUpdate() > 0){
            System.out.println();
            System.out.println("Akun berhasil Dibuat");
        }
        else{
            System.out.println("Akun gagal didaftarkan");
        }
    }
    
    
      public static void insertkd( String kode_Sepatu,String nama_sepatu, String id_pembeli) throws Exception{
        Class.forName(JDBC);
        con = DriverManager.getConnection(URL, USER, PASS);
        
        String query = "INSERT INTO tbl_transaksi VALUES (?,?,?)";
        ps = con.prepareStatement(query);
     
//        ps.setInt(1, kode_transaksi);
        ps.setString(2, kode_Sepatu);
        ps.setString(3, nama_sepatu);
        ps.setString(4, id_pembeli);
//        ps.setString(5, tanggal);
        
        if(ps.executeUpdate() > 0){
            System.out.println();
            System.out.println("berhasil");
        }
        else{
            System.out.println("gagal");
        }
    }
    
    public static String insertTransaksiEiger(int kodetransaksi)throws Exception{
        Class.forName(JDBC);
        con = DriverManager.getConnection(URL, USER, PASS);
        
        String query = "INSERT INTO tbl_transaksi SELECT kode_transaksi FROM sepatu_gunung WHERE kode_transaksi = merk_pembeli ";
        ps = con.prepareStatement(query);
        ps.setInt(1, kodetransaksi);
        rs = ps.executeQuery();
        
        if(!rs.next()){
        }
        else{
            return rs.getString(1);
        }
        return null;
        }
}


//int kode_transaksi, String kode_Sepatu,String nama_sepatu, String id_pembeli, String tanggal
//INSERT INTO tbl_transaksi SELECT Kode_transaksi FROM tbl_pembeli WHERE id=1
//"INSERT INTO tbl_transaksi SELECT kode_transaksi FROM sepatu_gunung WHERE kode_transaksi = merk_pembeli "
//Class.forName(JDBC);
//        con = DriverManager.getConnection(URL, USER, PASS);
//        
//        String query = "SELECT ps_pembeli FROM tbl_pembeli WHERE ps_pembeli = (?)";
//        ps = con.prepareStatement(query);
//        ps.setString(1, ps_pembeli);
//        rs = ps.executeQuery();
//        
//        if(!rs.next()){
//            return null;
//        }
//        else{
//            return rs.getString(1).toString();
//        }