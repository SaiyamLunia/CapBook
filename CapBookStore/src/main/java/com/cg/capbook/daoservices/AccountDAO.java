package com.cg.capbook.daoservices;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cg.capbook.beans.Account;
public interface AccountDAO extends JpaRepository<Account, String>{

}
