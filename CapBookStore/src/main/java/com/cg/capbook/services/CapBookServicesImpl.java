package com.cg.capbook.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import com.cg.capbook.beans.Account;
import com.cg.capbook.daoservices.AccountDAO;
import com.cg.capbook.exceptions.AccountDetailsNotFoundException;
@Component("capBookServices")
public class CapBookServicesImpl implements CapBookService {
	
	@Autowired
	private AccountDAO accountDAO;
	@Override
	public Account acceptAccountDetails(Account account) {
		//BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(16);
		String password=encryptPassword(account.getPassword());
		account.setPassword(password);
		return accountDAO.save(account);
	}
	@Override
	public Account findAccountDetails(String emailID) {
		Account account=accountDAO.findById(emailID).orElseThrow(()->new AccountDetailsNotFoundException("error"));
		return account;
	}
	
	@Override
	public String encryptPassword(String password) {
		String str=null;
		for(int i=0;i<password.length();i++) {
			char c=password.charAt(i);
			str+=(int)c;
		}
		return str;
	}
}
