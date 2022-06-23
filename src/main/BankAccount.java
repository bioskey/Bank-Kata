package main;

public class BankAccount {
	public int bankAmount;
    public String name;
    public String history;
    
	public BankAccount(int bankAmount, String name, String history) {
		super();
		this.bankAmount = bankAmount;
		this.name = name;
		this.history = history;
	}

	public int getBankAmount() {
		return bankAmount;
	}

	public void setBankAmount(int bankAmount) {
		this.bankAmount = bankAmount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHistory() {
		return history;
	}

	public void setHistory(String history) {
		this.history = history;
	}

}
