package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conecxao {
      
    public Connection conectaBd(){
      Connection conn = null;
      
        try {
            String url = "jdbc:mysql://localhost/banco?user=root&password";
            conn = DriverManager.getConnection(url);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return conn;
        
    }
}
