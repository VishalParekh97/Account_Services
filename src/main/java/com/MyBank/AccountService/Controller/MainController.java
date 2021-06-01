package com.MyBank.AccountService.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.MyBank.AccountService.Repository.AccountRepository;
import com.MyBank.AccountService.Exception.CustomerNotFoundException;
import com.MyBank.AccountService.Model.Account;
import com.MyBank.AccountService.services.AccountService;

@RestController
@RequestMapping(value = "/api/v1")
public class MainController {

	
	@Autowired
	private AccountRepository accountRepository;
	
	@GetMapping(value="/accounts/{id}")
	public ResponseEntity<Account> GetAccountByCustomerNumber(@PathVariable(value = "id") int account_id) 
	throws CustomerNotFoundException{
		
		Account accounts = accountRepository.findById(account_id)
				.orElseThrow(() -> new CustomerNotFoundException("Customer Not Found For this customer number :" + account_id));
	
				
		return ResponseEntity.ok().body(accounts);
		
	}
	
	
}
