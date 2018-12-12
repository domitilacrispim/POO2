

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Edwar Saliba Júnior
 */
public class ConexaoBanco {

    /**
     * @param args the command line arguments
     */
	
	  Connection con;
	 public Statement stm;
    ConexaoBanco() { 
    	try {

            String url = "jdbc:postgresql://localhost:5432/";
            String usuario = "domitila";
            String senha = "presunto";

            Class.forName("org.postgresql.Driver");

            
            con = DriverManager.getConnection(url, usuario, senha);

            System.out.println("Conexão realizada com sucesso.");

            stm = con.createStatement();

           // stm.executeQuery("INSERT INTO teste VALUES (1,'Cynthia')");

           // stm.executeUpdate("INSERT INTO cartao VALUES (45151,895,'Visa');");
            //Editado 21/09/2011 para correção: executeQuery é usado para pesquisa, executeUpdate deve ser usado para inserir
           

        } catch (Exception e) {
             e.printStackTrace();
        }
    	
    }
    public synchronized static  ConexaoBanco getInstance() throws SQLException {
    	return  new ConexaoBanco();
    	
    	
    }
}
