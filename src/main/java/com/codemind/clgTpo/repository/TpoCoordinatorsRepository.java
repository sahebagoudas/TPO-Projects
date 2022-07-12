package com.codemind.clgTpo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codemind.clgTpo.model.TpoCoordinators;

@Repository
public interface TpoCoordinatorsRepository extends JpaRepository<TpoCoordinators, Long>{

}
