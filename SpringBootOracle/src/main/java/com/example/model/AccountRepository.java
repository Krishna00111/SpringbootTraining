package com.example.model;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public class AccountRepository extends CrudRepository extends CrudRepositoryAccount, Long>{
	//custom method
	List<Account> findByFname(String fname);
	Account findByEmail(String email);

}
