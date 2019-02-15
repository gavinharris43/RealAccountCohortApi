package com.qa.account.accountapi.rest;

import com.qa.account.accountapi.persistence.domain.Cohort;
import com.qa.account.accountapi.service.CohortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequestMapping("${path.base}")
@RestController
public class CohortAccountRest {

    @Autowired
    private CohortService service;

    @GetMapping("${path.getAccounts}")
    public List<Cohort> getAccounts() {
        return service.getAccounts();
    }

    @GetMapping("${path.getAccountById}")
    public Cohort getAccount(@PathVariable Long id) {
        return service.getAccount(id);
    }

    @GetMapping("${path.addAccount}")
    public Cohort createAccount(@PathVariable String accountNum, String name) {
        return service.createAccount(accountNum, name);
    }


}
