package com.qa.account.accountapi.service;

import com.qa.account.accountapi.persistence.domain.Cohort;
import java.util.List;

public interface CohortService {

    List<Cohort> getAccounts();

    Cohort getAccount(Long id);

	Cohort createAccount(String accountNum, String name);
}
