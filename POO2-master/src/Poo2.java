import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import zapfood.ConexaoBanco;

public class Poo2 {
	
	private static Scanner sc;
	private static int cod;

	public 	static 	void 	main(String[] args) throws SQLException {
			PagamentoController a = new PagamentoController ();
			a.efetuarPagamento("Visa", 2, 3, "i34u4");
			ConexaoBanco b = ConexaoBanco.getInstance();
			ResultSet rs = b.stm.executeQuery("Select nome from restaurante where telefone=213");
			
			if(rs!=null)
				System.out.print(rs.getString("nome"));
		}
		
	
}
