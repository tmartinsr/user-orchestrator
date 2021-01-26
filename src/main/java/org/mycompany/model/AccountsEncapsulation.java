package org.mycompany.model;

import java.util.ArrayList;
import java.util.List;

import io.endpoints.client.accounts.model.Account;

public class AccountsEncapsulation {

	private List<Account> accounts = new ArrayList<Account>();

	public AccountsEncapsulation(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	public AccountsEncapsulation accounts(List<Account> accounts) {
		this.accounts = accounts;
		return this;
	}

	public AccountsEncapsulation addAccountsItem(Account accountsItem) {
		this.accounts.add(accountsItem);
		return this;
	}

}
