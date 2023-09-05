package com.gonzalomendozafullstack.app.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gonzalomendozafullstack.app.model.Country;
import com.gonzalomendozafullstack.app.service.CountryService;

@RestController
@RequestMapping("/api/country")
public class CountryController {

	@Autowired
	CountryService countryService;
	
	@GetMapping
	public List<Country> readAll(){

		List<Country> countries = StreamSupport
				.stream(countryService.findAllCountries().spliterator(),false)
				.collect(Collectors.toList());
		return countries;

	}
}
