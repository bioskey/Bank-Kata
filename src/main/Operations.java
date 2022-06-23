package main;

public class Operations {

	static String newLine = System.getProperty("line.separator");

	public static void save(BankAccount bankAccount, int amount) {
		bankAccount.setBankAmount(bankAccount.getBankAmount() + amount);
		bankAccount.setHistory(bankAccount.getHistory() + "save succeed! you add " + amount + " on your account : "
				+ bankAccount.getBankAmount() + newLine);
	}

	public static void retrieve(BankAccount bankAccount, int amount) throws Exception {
		if (bankAccount.getBankAmount() >= amount) {
			bankAccount.setBankAmount(bankAccount.getBankAmount() - amount);
			bankAccount.setHistory(bankAccount.getHistory() + "retreive succeed! you retreive " + amount
					+ " on your account : " + bankAccount.getBankAmount() + newLine);
		} else {
			throw new Exception("retreive failed : You don't have much money");
		}
	}

	public static String checkHistory(BankAccount bankAccount) {
		return bankAccount.getHistory();
	}
}
