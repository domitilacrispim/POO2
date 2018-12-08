
public class Visa extends Pagamento{
	public Visa() {
		super(IDPgto.visa);
	}

	@Override
	protected boolean efetuaPagamento() {
		System.out.println("VISA");
		return true;
	}
}
