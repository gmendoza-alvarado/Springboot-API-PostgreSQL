package com.gonzalomendozafullstack.app.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.gonzalomendozafullstack.app.model.Country;

public interface CountryService {


	public Iterable<Country> findAllCountries();

	public Page<Country> findAllCountries(Pageable pageable);

	public Optional<Country> findCountryById(Long id);

	public Country saveCountry(Country country);

	public void deleteCountryById(Long id);

}
