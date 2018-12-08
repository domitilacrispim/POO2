
public class Elo extends Pagamento{
	public Elo () {
		super(IDPgto.elo);
	}

	@Override
	protected boolean efetuaPagamento() {
		System.out.println("Elo");
		return true;
	}
}
