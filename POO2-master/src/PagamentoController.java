
public class PagamentoController {
		String pgto;
		int valor, complemento;
		
		public boolean efetuarPagamento( String pgto, int valor, int complemento) {
			// consultar no banco
			Pagamento bancos = 	new 	Master();
			bancos.setNext(	new	Visa());
			bancos.setNext(	new	Dinheiro());	
			bancos.setNext(	new Elo());
			try	{
					bancos.efetuarPagamento(pgto);
			} 	
			catch  	(Exception e) {
					e.printStackTrace();
			}
			
			return true;
		}
}
