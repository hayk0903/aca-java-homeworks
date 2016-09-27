package edu.adapter.store;

import edu.adapter.wallets.StoreWallet;

public class Store  {
	int storeBalance;
	
	public void sell(StoreWallet money, int amount){
		money.payMoney(amount);
		storeBalance += amount;
	}

	public int getBalance(){
		return storeBalance;
	}
}
