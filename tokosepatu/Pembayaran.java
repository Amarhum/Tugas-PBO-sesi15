package tokosepatu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Pembayaran {
    
    static final String JDBC = "com.mysql.cj.jdbc.Driver";
    static final String URL = "jdbc:mysql://localhost/toko";
    static final String USER = "root";
    static final String PASS = "";
    
    static Connection con;
    static ResultSet rs;
    static PreparedStatement ps;
//    static Statement state;
    
     public static String bayarEiger() throws Exception{
        Class.forName(JDBC);
        con = DriverManager.getConnection(URL, USER, PASS);
        
        String query = "SELECT kode_pembayaran,tgl_bayar,total_bayar,kode_transaksi FROM tbl_pembayaran WHERE kode_transaksi ='1011'";
        ps = con.prepareStatement(query);
        
        
        rs = ps.executeQuery();
        
        while(rs.next()){
        
            System.out.println("Kode Pembayaran : " + rs.getString("kode_pembayaran"));
            System.out.println("Tanggal Bayar : " + rs.getDate("tgl_bayar"));
            System.out.println("Total Bayar : " + rs.getString("total_bayar"));
            System.out.println("Kode Transaksi : " + rs.getString("kode_transaksi"));
            System.out.println("---------------------------------------");
            break;
        }
        return null;
    }
     
     public static String bayarArai() throws Exception{
        Class.forName(JDBC);
        con = DriverManager.getConnection(URL, USER, PASS);
        
        String query = "SELECT kode_pembayaran,tgl_bayar,total_bayar,kode_transaksi FROM tbl_pembayaran WHERE kode_transaksi ='1022'";
        ps = con.prepareStatement(query);
        
        
        rs = ps.executeQuery();
        
        while(rs.next()){
        
            System.out.println("Kode Pembayaran : " + rs.getString("kode_pembayaran"));
            System.out.println("Tanggal Bayar : " + rs.getDate("tgl_bayar"));
            System.out.println("Total Bayar : " + rs.getString("total_bayar"));
            System.out.println("Kode Transaksi : " + rs.getString("kode_transaksi"));
            System.out.println("---------------------------------------");
            break;
        }
        return null;
    }
     
     public static String bayarLowa() throws Exception{
        Class.forName(JDBC);
        con = DriverManager.getConnection(URL, USER, PASS);
        
        String query = "SELECT kode_pembayaran,tgl_bayar,total_bayar,kode_transaksi FROM tbl_pembayaran WHERE kode_transaksi ='1033'";
        ps = con.prepareStatement(query);
        
        
        rs = ps.executeQuery();
        
        while(rs.next()){
        
            System.out.println("Kode Pembayaran : " + rs.getString("kode_pembayaran"));
            System.out.println("Tanggal Bayar : " + rs.getDate("tgl_bayar"));
            System.out.println("Total Bayar : " + rs.getString("total_bayar"));
            System.out.println("Kode Transaksi : " + rs.getString("kode_transaksi"));
            System.out.println("---------------------------------------");
            break;
        }
        return null;
    }
     
     public static String bayarConsina() throws Exception{
        Class.forName(JDBC);
        con = DriverManager.getConnection(URL, USER, PASS);
        
        String query = "SELECT kode_pembayaran,tgl_bayar,total_bayar,kode_transaksi FROM tbl_pembayaran WHERE kode_transaksi ='1044'";
        ps = con.prepareStatement(query);
        
        
        rs = ps.executeQuery();
        
        while(rs.next()){
        
            System.out.println("Kode Pembayaran : " + rs.getString("kode_pembayaran"));
            System.out.println("Tanggal Bayar : " + rs.getDate("tgl_bayar"));
            System.out.println("Total Bayar : " + rs.getString("total_bayar"));
            System.out.println("Kode Transaksi : " + rs.getString("kode_transaksi"));
            System.out.println("---------------------------------------");
            break;
        }
        return null;
    }
     
     public static String bayarLeague() throws Exception{
        Class.forName(JDBC);
        con = DriverManager.getConnection(URL, USER, PASS);
        
        String query = "SELECT kode_pembayaran,tgl_bayar,total_bayar,kode_transaksi FROM tbl_pembayaran WHERE kode_transaksi ='1055'";
        ps = con.prepareStatement(query);
        
        
        rs = ps.executeQuery();
        
        while(rs.next()){
        
            System.out.println("Kode Pembayaran : " + rs.getString("kode_pembayaran"));
            System.out.println("Tanggal Bayar : " + rs.getDate("tgl_bayar"));
            System.out.println("Total Bayar : " + rs.getString("total_bayar"));
            System.out.println("Kode Transaksi : " + rs.getString("kode_transaksi"));
            System.out.println("---------------------------------------");
            break;
        }
        return null;
    }
     
     public static String bayarPiero() throws Exception{
        Class.forName(JDBC);
        con = DriverManager.getConnection(URL, USER, PASS);
        
        String query = "SELECT kode_pembayaran,tgl_bayar,total_bayar,kode_transaksi FROM tbl_pembayaran WHERE kode_transaksi ='1066'";
        ps = con.prepareStatement(query);
        
        
        rs = ps.executeQuery();
        
        while(rs.next()){
        
            System.out.println("Kode Pembayaran : " + rs.getString("kode_pembayaran"));
            System.out.println("Tanggal Bayar : " + rs.getDate("tgl_bayar"));
            System.out.println("Total Bayar : " + rs.getString("total_bayar"));
            System.out.println("Kode Transaksi : " + rs.getString("kode_transaksi"));
            System.out.println("---------------------------------------");
            break;
        }
        return null;
    }
     
     public static String bayarSpecs() throws Exception{
        Class.forName(JDBC);
        con = DriverManager.getConnection(URL, USER, PASS);
        
        String query = "SELECT kode_pembayaran,tgl_bayar,total_bayar,kode_transaksi FROM tbl_pembayaran WHERE kode_transaksi ='1077'";
        ps = con.prepareStatement(query);
        
        
        rs = ps.executeQuery();
        
        while(rs.next()){
        
            System.out.println("Kode Pembayaran : " + rs.getString("kode_pembayaran"));
            System.out.println("Tanggal Bayar : " + rs.getDate("tgl_bayar"));
            System.out.println("Total Bayar : " + rs.getString("total_bayar"));
            System.out.println("Kode Transaksi : " + rs.getString("kode_transaksi"));
            System.out.println("---------------------------------------");
            break;
        }
        return null;
    }
     
     public static String bayarEagle() throws Exception{
        Class.forName(JDBC);
        con = DriverManager.getConnection(URL, USER, PASS);
        
        String query = "SELECT kode_pembayaran,tgl_bayar,total_bayar,kode_transaksi FROM tbl_pembayaran WHERE kode_transaksi ='1088'";
        ps = con.prepareStatement(query);
        
        
        rs = ps.executeQuery();
        
        while(rs.next()){
        
            System.out.println("Kode Pembayaran : " + rs.getString("kode_pembayaran"));
            System.out.println("Tanggal Bayar : " + rs.getDate("tgl_bayar"));
            System.out.println("Total Bayar : " + rs.getString("total_bayar"));
            System.out.println("Kode Transaksi : " + rs.getString("kode_transaksi"));
            System.out.println("---------------------------------------");
            break;
        }
        return null;
    }
     
     public static String bayarConverse() throws Exception{
        Class.forName(JDBC);
        con = DriverManager.getConnection(URL, USER, PASS);
        
        String query = "SELECT kode_pembayaran,tgl_bayar,total_bayar,kode_transaksi FROM tbl_pembayaran WHERE kode_transaksi ='1099'";
        ps = con.prepareStatement(query);
        
        
        rs = ps.executeQuery();
        
        while(rs.next()){
        
            System.out.println("Kode Pembayaran : " + rs.getString("kode_pembayaran"));
            System.out.println("Tanggal Bayar : " + rs.getDate("tgl_bayar"));
            System.out.println("Total Bayar : " + rs.getString("total_bayar"));
            System.out.println("Kode Transaksi : " + rs.getString("kode_transaksi"));
            System.out.println("---------------------------------------");
            break;
        }
        return null;
    }
     
     public static String bayarVans() throws Exception{
        Class.forName(JDBC);
        con = DriverManager.getConnection(URL, USER, PASS);
        
        String query = "SELECT kode_pembayaran,tgl_bayar,total_bayar,kode_transaksi FROM tbl_pembayaran WHERE kode_transaksi ='1010'";
        ps = con.prepareStatement(query);
        
        
        rs = ps.executeQuery();
        
        while(rs.next()){
        
            System.out.println("Kode Pembayaran : " + rs.getString("kode_pembayaran"));
            System.out.println("Tanggal Bayar : " + rs.getDate("tgl_bayar"));
            System.out.println("Total Bayar : " + rs.getString("total_bayar"));
            System.out.println("Kode Transaksi : " + rs.getString("kode_transaksi"));
            System.out.println("---------------------------------------");
            break;
        }
        return null;
    }
     
     public static String bayarCompas() throws Exception{
        Class.forName(JDBC);
        con = DriverManager.getConnection(URL, USER, PASS);
        
        String query = "SELECT kode_pembayaran,tgl_bayar,total_bayar,kode_transaksi FROM tbl_pembayaran WHERE kode_transaksi ='1111'";
        ps = con.prepareStatement(query);
        
        
        rs = ps.executeQuery();
        
        while(rs.next()){
        
            System.out.println("Kode Pembayaran : " + rs.getString("kode_pembayaran"));
            System.out.println("Tanggal Bayar : " + rs.getDate("tgl_bayar"));
            System.out.println("Total Bayar : " + rs.getString("total_bayar"));
            System.out.println("Kode Transaksi : " + rs.getString("kode_transaksi"));
            System.out.println("---------------------------------------");
            break;
        }
        return null;
    }
     
     public static String bayarDiadora() throws Exception{
        Class.forName(JDBC);
        con = DriverManager.getConnection(URL, USER, PASS);
        
        String query = "SELECT kode_pembayaran,tgl_bayar,total_bayar,kode_transaksi FROM tbl_pembayaran WHERE kode_transaksi ='1012'";
        ps = con.prepareStatement(query);
        
        
        rs = ps.executeQuery();
        
        while(rs.next()){
        
            System.out.println("Kode Pembayaran : " + rs.getString("kode_pembayaran"));
            System.out.println("Tanggal Bayar : " + rs.getDate("tgl_bayar"));
            System.out.println("Total Bayar : " + rs.getString("total_bayar"));
            System.out.println("Kode Transaksi : " + rs.getString("kode_transaksi"));
            System.out.println("---------------------------------------");
            break;
        }
        return null;
    }
    
}
