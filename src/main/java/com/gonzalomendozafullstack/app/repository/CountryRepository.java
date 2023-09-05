package com.gonzalomendozafullstack.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gonzalomendozafullstack.app.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long>{

}
