package com.qa.account.accountapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.account.accountapi.persistence.domain.Cohort;
import com.qa.account.accountapi.persistence.repository.PrizeRepository;
import com.qa.account.accountapi.util.exceptions.AccountNotFoundException;


@Service
public class CohortAccountServiceImpl implements CohortService {

    @Autowired
    private PrizeRepository repo;

    @Override
    public List<Cohort> getAccounts() {
        return repo.findAll();
    }

    @Override
    public Cohort getAccount(Long id) {
        Optional<Cohort> account = repo.findById(id);
        return account.orElseThrow(() -> new AccountNotFoundException(id.toString()));
    }

    @Override
    public Cohort createAccount(String accountNum,String name) {
        return new Cohort(name);
    }


//    @Override
//    public int getCohort(String accountNum) {
//        return ;
//    }

}