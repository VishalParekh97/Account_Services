package com.MyBank.AccountService.services;

import org.springframework.http.ResponseEntity;

import com.MyBank.AccountService.Exception.AccountNotFoundException;
import com.MyBank.AccountService.Exception.CustomerNotFoundException;
import com.MyBank.AccountService.Model.Account;

public interface AccountService {

	ResponseEntity<Account> GetAccountDetails(int account_id) throws CustomerNotFoundException;
	
	ResponseEntity<Account> UpdateAccount(int account_id, Account  accountname) throws AccountNotFoundException;
}
