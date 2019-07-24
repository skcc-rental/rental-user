package com.skcc.mc.rentalaccount.domain.repository;

import com.skcc.mc.rentalaccount.domain.model.User;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface UserRepository extends PagingAndSortingRepository<User,Long>,
        QueryDslPredicateExecutor<User> {

    //Query Method
    List<User> findByPhoneNumber(@Param("phoneNumber") String phoneNumber);
}
