
public class PagamentoController {
		String pgto;
		int valor, complemento;
		public PagamentoController ( String pgto, int valor, int complemento ) {
			this.pgto=pgto;
			this.valor=valor;
			this.complemento=complemento;
		}
		public boolean efetuarPagamento() {
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
