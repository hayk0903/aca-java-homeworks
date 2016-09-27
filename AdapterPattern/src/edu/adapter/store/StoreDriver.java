package edu.adapter.store;

import edu.adapter.adapters.MoneyClassAdapter;
import edu.adapter.adapters.MoneyObjectAdapter;
import edu.adapter.wallets.Money;
import edu.adapter.wallets.MyMoney;

public class StoreDriver {
	
	public static void main (String[] args){
		Store store = new Store();
		Money storeMoney = new Money();
		MyMoney myMoney = new MyMoney();
		MoneyObjectAdapter adaptedMoney = new MoneyObjectAdapter(myMoney);
		MoneyClassAdapter adaptedMoney2 = new MoneyClassAdapter(myMoney);
		
		store.sell(storeMoney, 50);
		System.out.println(store.getBalance());
		
		store.sell(adaptedMoney, 100);
		System.out.println(store.getBalance());
		
		store.sell(adaptedMoney2, 120);
		System.out.println(store.getBalance());
	}

}
