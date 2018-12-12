import java.sql.SQLException;

public class Dinheiro extends Pagamento{
	public Dinheiro () {
		super("Dinheiro");
	}

	@Override
	protected boolean efetuaPagamento() throws SQLException {
		System.out.println("Dinheiro");
		ConexaoBanco b = ConexaoBanco.getInstance();
		b.stm.executeQuery("Select * from cartao;");
		return true;
	}
}
