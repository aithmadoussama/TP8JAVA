package exercice1;

public class Betcoin implements IPaymentMethod {

	private String walletAddress;
	private double balance;

	public Betcoin(String walletAddress, double balance) {
		super();
		this.walletAddress = walletAddress;
		this.balance = balance;
	}

	public String getWalletAddress() {
		return walletAddress;
	}

	public void setWalletAddress(String walletAddress) {
		this.walletAddress = walletAddress;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	// implements methodes
	@Override
	public boolean pay(double amount) {
		if (amount <= balance) {
			balance -= amount;
			System.out.printf("Bitcoin (%s) : payé %.4f BTC, reste %.4f%n", walletAddress, amount, balance);
			return true;
		}
		System.out.printf("Bitcoin (%s) : fond insuffisant (%.4f)<%.4f>%n", walletAddress, amount, balance);
		return false;
	}

	@Override
	public boolean refund(double amount) {
		balance += amount;
		System.out.printf("Bitcoin (%s) : remboursé %.4f BTC, solde %.4f%n", walletAddress, amount, balance);
		return true;
	}

	@Override
	public String getName() {
		return "Bitcoin[" + walletAddress + "]";
	}

}
