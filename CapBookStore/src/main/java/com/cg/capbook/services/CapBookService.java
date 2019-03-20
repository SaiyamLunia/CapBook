package com.cg.capbook.services;

import com.cg.capbook.beans.Account;

public interface CapBookService {
	Account acceptAccountDetails(Account account);
	Account findAccountDetails(String emailID);
	public String encryptPassword(String password);
}
