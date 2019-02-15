package com.qa.account.accountapi.persistence.repository;

import com.qa.account.accountapi.persistence.domain.Cohort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrizeRepository extends JpaRepository<Cohort, Long> {
}
