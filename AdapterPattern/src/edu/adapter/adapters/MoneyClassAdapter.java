package edu.adapter.adapters;

import edu.adapter.wallets.Money;
import edu.adapter.wallets.MyMoney;
import edu.adapter.wallets.StoreWallet;

public class MoneyClassAdapter extends Money implements StoreWallet {

private MyMoney myMoney;
	
	public MoneyClassAdapter(MyMoney myMoney){
		this.myMoney = myMoney;
	}
	public void payMoney(int amount) {
		myMoney.extractMoney(amount);
		
	}

	@Override
	public void returnMoney(int amount) {
		myMoney.put(amount);
		
	}

}
