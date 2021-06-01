package com.MyBank.AccountService.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MyBank.AccountService.Model.Account;
import com.MyBank.AccountService.Repository.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService{

	@Autowired
	AccountRepository accountRepository;

	@Override
	public Account GetAccountDetails(Account account) {
		// TODO Auto-generated method stub
		return null;
	}
	
//	@Override
//	public Account GetAccountDetails(Account account) {
//		// TODO Auto-generated method stub
//		
//		return accountRepository.getAccountDetails(account);
//	}

}
