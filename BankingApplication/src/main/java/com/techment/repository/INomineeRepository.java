package com.techment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techment.entity.Nominee;

public interface INomineeRepository extends JpaRepository<Nominee, Integer>{

	Nominee save(Nominee nominee);

}
