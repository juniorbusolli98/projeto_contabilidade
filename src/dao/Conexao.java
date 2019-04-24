package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;



public class Conexao {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/funcionarios?zeroDateTimeBehavior=convertToNull";
    private static final String USER = "root";
    private static final String PASSWORD = "";

 public static boolean executar(String sql){
        try{
            Class.forName( DRIVER );
            Connection conn = 
                    DriverManager.getConnection(URL, USER, PASSWORD);
            Statement st = conn.createStatement();
            st.execute(sql);
            return true;
        }catch(ClassNotFoundException | SQLException e ){
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
public static ResultSet consultar(String sql){
        ResultSet rs = null;
        try{
            Class.forName( DRIVER );
            Connection conn = 
                    DriverManager.getConnection(URL, USER, PASSWORD);
            Statement st = conn.createStatement();
            rs = st.executeQuery(sql);
            
        }catch(ClassNotFoundException | SQLException e ){
            JOptionPane.showMessageDialog(null, e.toString()); 
        }
        return rs;
    }
}


 


    

    

