package com.skcc.mc.rentalaccount.domain.repository;

import com.skcc.mc.rentalaccount.domain.model.Account;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface AccountRepository extends PagingAndSortingRepository<Account,Long>,
        QueryDslPredicateExecutor<Account> {

    //Query Method
    List<Account> findByPhoneNumber(@Param("phoneNumber") String phoneNumber);
}
