
public class Dinheiro extends Pagamento{
	public Dinheiro () {
		super("Dinheiro");
	}

	@Override
	protected boolean efetuaPagamento() {
		System.out.println("Dinheiro");
		return true;
	}
}
