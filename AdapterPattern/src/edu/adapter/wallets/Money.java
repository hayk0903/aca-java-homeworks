package edu.adapter.wallets;

public class Money implements StoreWallet {
	private int balance;

	@Override
	public void payMoney(int amount) {
		balance -= amount;
		
	}

	@Override
	public void returnMoney(int amount) {
		balance += amount;
		
	}

}
