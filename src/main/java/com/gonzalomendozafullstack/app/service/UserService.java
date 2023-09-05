package com.gonzalomendozafullstack.app.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.gonzalomendozafullstack.app.model.User;


public interface UserService {


	public Iterable<User> findAllUsers();

	public Page<User> findAllUsers(Pageable pageable);

	public Optional<User> findUserById(Long id);

	public User saveUser(User user);

	public void deleteUserById(Long id);
}
