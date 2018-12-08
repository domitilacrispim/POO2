
public abstract class Pagamento {
	protected	Pagamento next ;
	protected 	String idepgto;
	
	public Pagamento ( 	String 	id) {
		next = null	;
		idepgto = id;
	}
	public	void 	setNext 	( 	Pagamento	forma) {
		if 	( 	next 	==  	null 	) { 
			next 	= forma;
		} 
		else	{
			next.setNext(forma);
		}
	}
	public 	void efetuarPagamento(String id) throws	Exception {
		if 	(podeEfetuarPagamento(id)) {	efetuaPagamento();
		}
		else 	{
			if(next ==	null) {
				throw 	new 	Exception( 	"banco não cadastrado"	);
			}
			next.efetuarPagamento(id);
		}
	}
	
	private 	boolean 	podeEfetuarPagamento(String id) {
		 if (idepgto == id) {
			 return	true	;
		 }
		 	return	false;
	}
	protected 	abstract 	boolean 	efetuaPagamento();
}
