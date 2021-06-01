package com.MyBank.AccountService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.MyBank.AccountService.Model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer>{
	
	
//		Account getAccountDetails(Account account)

}
