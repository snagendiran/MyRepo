package com.store.cloth.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.store.cloth.model.Sku;

@Repository
public interface SkuRepository extends JpaRepository<Sku, Long>{

	public Optional<Sku> findById(Long id);

}
