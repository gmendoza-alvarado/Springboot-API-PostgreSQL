package com.gonzalomendozafullstack.app.service;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.gonzalomendozafullstack.app.model.Country;
import com.gonzalomendozafullstack.app.model.State;
import com.gonzalomendozafullstack.app.model.User;
import com.gonzalomendozafullstack.app.repository.CountryRepository;
import com.gonzalomendozafullstack.app.repository.StateRepository;
import com.gonzalomendozafullstack.app.repository.UserRepository;

@Service
public class ServiceImpl implements UserService, StateService, CountryService{


	@Autowired
	private UserRepository userRepository;

	@Autowired
	private StateRepository stateRepository;

	@Autowired
	private CountryRepository countryRepository;


	//User Methods

	@Override
	public Iterable<User> findAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public Page<User> findAllUsers(Pageable pageable) {
		return userRepository.findAll(pageable);
	}

	@Override
	public Optional<User> findUserById(Long id) {
		return userRepository.findById(id);
	}

	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public void deleteUserById(Long id) {
		userRepository.deleteById(id);

	}

	//State Methods

	@Override
	public Iterable<State> findAllStates() {
		return stateRepository.findAll();
	}

	@Override
	public Page<State> findAllStates(Pageable pageable) {
		return stateRepository.findAll(pageable);
	}

	@Override
	public Optional<State> findStateById(Long id) {
		return stateRepository.findById(id);
	}

	@Override
	public State saveState(State state) {
		return stateRepository.save(state);
	}

	@Override
	public void deleteStateById(Long id) {
		stateRepository.deleteById(id);
	}


	//Country Methods

	@Override
	public Iterable<Country> findAllCountries() {
		return countryRepository.findAll();
	}

	@Override
	public Page<Country> findAllCountries(Pageable pageable) {
		return countryRepository.findAll(pageable);
	}

	@Override
	public Optional<Country> findCountryById(Long id) {
		return countryRepository.findById(id);
	}

	@Override
	public Country saveCountry(Country country) {
		return countryRepository.save(country);
	}

	@Override
	public void deleteCountryById(Long id) {
		countryRepository.deleteById(id);
	}

}
