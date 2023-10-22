package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {
    
    private static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String user = "curso";
    private static final String password = "curso1234";

    private static Connection conn;

    public static Connection gConnection() {
        
        try {
            if (conn == null) {    
                conn = DriverManager.getConnection(url, user, password);
                return conn;
            } 
            else {
                return conn;
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Object getConexao() {
        return null;
    }
}