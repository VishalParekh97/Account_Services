package com.MyBank.AccountService.services;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	
	@Override
	public ResponseEntity<Account> UpdateAccount(int  account_id, Account accountname) throws AccountNotFoundException {
		
		Account account = accountRepository.findById(account_id).orElseThrow(() -> new AccountNotFoundException("Account not found for this account id : " + account_id));
		
		account.setAccountname(accountname.getAccountname());
		final Account updatedaccount = accountRepository.save(account);
		return ResponseEntity.ok().body(updatedaccount);
		
	}
	 
	
}
