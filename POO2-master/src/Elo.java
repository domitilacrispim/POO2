
public class Elo extends Pagamento{
	public Elo () {
		super("Elo");
	}

	@Override
	protected boolean efetuaPagamento() {
		System.out.println("Elo");
		return true;
	}
}
