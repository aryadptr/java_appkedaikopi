package method;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class koneksi {
    Connection koneksi=null;
    public static Connection koneksi(){
        String driver = "com.mysql.jdbc.Driver";
        String host = "jdbc:mysql://localhost/uas_kedai";
        String user = "root";
        String password = "";
        try {
            Class.forName(driver);
            Connection conn = (Connection) DriverManager.getConnection(host,user,password);
            return conn;
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
}
