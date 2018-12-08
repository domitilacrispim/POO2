
public class Visa extends Pagamento{
	public Visa() {
		super("Visa");
	}

	@Override
	protected boolean efetuaPagamento() {
		System.out.println("VISA");
		return true;
	}
}
