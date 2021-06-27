package com.MyBank.AccountService.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.MyBank.AccountService.Exception.AccountNotFoundException;
import com.MyBank.AccountService.Exception.CustomerNotFoundException;
import com.MyBank.AccountService.Model.Account;
import com.MyBank.AccountService.Repository.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService{

	@Autowired
	AccountRepository accountRepository;

	@Override
	public ResponseEntity<Account> GetAccountDetails(int account_id) throws CustomerNotFoundException {
		// TODO Auto-generated method stub
		
		Account accounts = accountRepository.findById(account_id)
				.orElseThrow(() -> new CustomerNotFoundException("Customer Not Found For this customer number :" + account_id));
		
		return ResponseEntity.ok().body(accounts); 
	}
	
	//pending
	@Override
	public ResponseEntity<Account> UpdateAccount(String  account_name) throws AccountNotFoundException {
		
		
		return null;
		
	}
	 
	
}
