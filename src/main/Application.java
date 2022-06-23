package main;

public class Application {

	public static void main(String[] args) throws Exception {
		BankAccount bank = new BankAccount(5000, "name", "");

		// add 500
		Operations.save(bank, 500);

		// retrieve 1000
		Operations.retrieve(bank, 1000);

		// check history
		System.out.println(Operations.checkHistory(bank));

		// check new balance, 4500 expected*
		System.out.println(bank.getBankAmount());
	}
}
