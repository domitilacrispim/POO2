
public class PagamentoController {
		String pgto;
		int valor, complemento;
	//	@RequestMapping("get_pagamento")
		public boolean efetuarPagamento( String pgto, int valor, int complemento, String cpf) {
			
			Pagamento bancos = 	new 	Master();
			bancos.setNext(	new	Visa());
			bancos.setNext(	new	Dinheiro());	
			bancos.setNext(	new Elo());
			try	{
					bancos.efetuarPagamento(pgto);
					return true;
			} 	
			catch  	(Exception e) {
					e.printStackTrace();
					return false;
			}
			
		}
}
