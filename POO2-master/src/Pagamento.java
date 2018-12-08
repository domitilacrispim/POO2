
public abstract class Pagamento {
	protected	Pagamento next ;
	protected 	IDPgto idepgto;
	
	public Pagamento ( 	IDPgto 	id) {
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
	public 	void efetuarPagamento(IDPgto id) throws	Exception {
		if 	(podeEfetuarPagamento(id)) {	efetuaPagamento();
		}
		else 	{
			if(next ==	null) {
				throw 	new 	Exception( 	"banco não cadastrado"	);
			}
			next.efetuarPagamento(id);
		}
	}
	
	private 	boolean 	podeEfetuarPagamento(IDPgto id) {
		 if (idepgto == id) {
			 return	true	;
		 }
		 	return	false;
	}
	protected 	abstract 	boolean 	efetuaPagamento();
}
