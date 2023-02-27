package DAO;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.DriverManager;

public class ConexaoDAO {
   
    public Connection ConectaBD(){
        Connection conn = null;
       
        try {
            String url = "jdbc:mysql://localhost:3306/jbooker?user=root&password=";
            conn = DriverManager.getConnection(url);
           
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ConexaoDAO"+erro);
        }
        return conn;
    }
   
}