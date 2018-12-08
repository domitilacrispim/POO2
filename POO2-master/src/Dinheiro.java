
public class Dinheiro extends Pagamento{
	public Dinheiro () {
		super(IDPgto.dinheiro);
	}

	@Override
	protected boolean efetuaPagamento() {
		System.out.println("Dinheiro");
		return true;
	}
}
