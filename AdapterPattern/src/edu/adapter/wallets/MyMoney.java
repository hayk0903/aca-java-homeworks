package edu.adapter.wallets;

public class MyMoney implements HSBCWallet {
	private int balance;

	@Override
	public void extractMoney(int amount) {
		balance -= amount;
		
	}

	@Override
	public void put(int amount) {
		balance += amount;
		
	}

}
