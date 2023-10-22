import java.sql.*;

public class TesteOracle {

    public static void main(String[] args) {
        String sql;
        
        /*
         *	O driver JDBC do Oracle está disponível no seguinte endereço:
         *	http://www.oracle.com/technetwork/database/features/jdbc/index-091264.html
         */

        // Configuração dos parâmetros de conexão
        String server = "localhost";
        String port = "1521";               // Porta TCP padrão do Oracle
        String database = "xe";

        // Configuração dos parâmetros de autenticação
        String user = "curso";
        String passwd = "curso1234";

        try {
            String url = "jdbc:oracle:thin:@" + server + ":" + port + ":" + database;

            // Abre-se a conexão com o Banco de Dados
            Connection con = DriverManager.getConnection(url, user, passwd);

            // Cria-se Statement com base na conexão con
            Statement stmt = con.createStatement();

            //sql = "SELECT * FROM PESSOA";

            // Exemplo: navegando e exibindo os dados dos filmes
            sql = "SELECT * FROM PESSOA";

            // Executa-se a consulta dos campos titulo,ano da tabela de filmes
            ResultSet res = stmt.executeQuery(sql);
            
            String name;
            String sexo;
            String email;

            while (res.next()) {
                name = res.getString("NAME");
                sexo = res.getString("SEXO");
                email = res.getString("EMAIL");

                System.out.println(name + '\t'+'\t' + sexo + '\t' + '\t' + email);
            }
            con.close();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}       