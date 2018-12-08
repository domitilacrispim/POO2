import java.util.Scanner;

public class Poo2 {
	
	private static Scanner sc;
	private static int cod;

	public 	static 	void 	main(String[] args) {
		Pagamento bancos = 	new 	Master();
		bancos.setNext(	new	Visa());
		bancos.setNext(	new	Dinheiro());	
		bancos.setNext(	new Elo()); 
		sc = new Scanner(System.in);
		String tipo = sc.nextLine();
		cod = sc.nextInt();
		if(tipo=="Mastercard") {
			// consulta no banco
				try	{
					bancos.efetuarPagamento(IDPgto.mastercard);
				} 	
				catch  	(Exception e) {
					e.printStackTrace();
				}
		}
	}
}
