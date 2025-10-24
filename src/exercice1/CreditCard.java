package exercice1;

public class CreditCard implements IPaymentMethod {

	private String number;
	private String holder;
	private double balence;

	public CreditCard(String number, String holder, double balence) {
		super();
		this.number = number;
		this.holder = holder;
		this.balence = balence;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalence() {
		return balence;
	}

	public void setBalence(double balence) {
		this.balence = balence;
	}

	// implements methodes

	@Override
	public boolean pay(double amount) {
		if (amount <= balence) {
			balence -= amount;
			System.out.printf("CreditCard (%s) : payé %.2f, reste %.2f%n", holder, amount, balence);
			return true;
		}
		System.out.printf("CreditCard (%s) : fond insuffisant (%.2f)<%.2f>%n", holder, amount, balence);
		return false;
	}

	@Override
	public boolean refund(double amount) {
		balence += amount;
		System.out.printf("CreditCard (%s) : remboursé %.2f, solde %.2f%n", holder, amount, balence);
		return true;
	}

	@Override
	public String getName() {
		return "CreditCard[" + holder + "]";
	}

}
