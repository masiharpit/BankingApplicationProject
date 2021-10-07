package com.techment.bank.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techment.bank.entity.Beneficiary;

@Repository
public interface BeneficiaryDao  extends JpaRepository<Beneficiary, Integer>{


}
