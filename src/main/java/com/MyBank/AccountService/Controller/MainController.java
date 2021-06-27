package com.MyBank.AccountService.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MyBank.AccountService.Exception.AccountNotFoundException;
import com.MyBank.AccountService.Exception.CustomerNotFoundException;
import com.MyBank.AccountService.Model.Account;
import com.MyBank.AccountService.services.AccountServiceImpl;

@RestController
@RequestMapping(value = "/api")
public class MainController {

	
	@Autowired
	private AccountServiceImpl service;
	
	@GetMapping(value="/v1/accounts/{id}")
	public ResponseEntity<Account> GetAccountByCustomerNumber(@PathVariable(value = "id") int account_id) 
	throws CustomerNotFoundException{
		
		return service.GetAccountDetails(account_id);
	}
	
	@PutMapping(value ="/v1/accounts/{id}/changename")
	public ResponseEntity<Account> UpdateAccount(@RequestBody String accountname)
	throws AccountNotFoundException{
		
		return null;
		
	}
	
	
}
