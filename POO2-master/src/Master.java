
public class Master extends Pagamento {
	public Master() {
		super(IDPgto.mastercard);
	}

	@Override
	protected boolean efetuaPagamento() {
		// TODO Auto-generated method stub
		System.out.println("MasterCard");
		return true;
	}
}
