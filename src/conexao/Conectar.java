package conexao;
import java.sql.*;
/**
 *
 * @author user
 */
public class Conectar {

    public static Connection conector() {    
        java.sql.Connection conexao = null;
        String driver = "com.mysql.jdbc.Driver";   //chama o driver instalado na biblioteca
        String url = "jdbc:mysql://localhost:3306/bancoteste"; //caminho e nome do banco
        String user = "root";  
        String password = "";   
        //estabelece a conexao com o banco
        try {
            Class.forName(driver);  //executa o driver
            conexao = DriverManager.getConnection(url,user,password);  //o driver obtem a conexao
            return conexao;                                               
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
