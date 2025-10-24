package exercice1;

public interface IPaymentMethod {
	
	abstract boolean pay(double amount);
	abstract boolean refund(double amount);
	
	abstract String getName();

}
