package net.claims.express.next2.common.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import net.claims.express.next2.common.repositories.BaseRepository;

public abstract class BaseService<T> {	

	@Autowired
	BaseRepository<T, String> baseRepository;

	public Optional<T> findById(String id) {
		return baseRepository.findById(id);
	}

	public void deleteById(String id) {
		baseRepository.deleteById(id);
	}

	public T save(T entity) {
		return baseRepository.save(entity);
	}

	public <T> List<T> findAll() {
		return (List<T>) baseRepository.findAll();
	}
}
