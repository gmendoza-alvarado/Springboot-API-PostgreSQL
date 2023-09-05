package com.gonzalomendozafullstack.app.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.gonzalomendozafullstack.app.model.State;

public interface StateService {


	public Iterable<State> findAllStates();

	public Page<State> findAllStates(Pageable pageable);

	public Optional<State> findStateById(Long id);

	public State saveState(State state);

	public void deleteStateById(Long id);
}
