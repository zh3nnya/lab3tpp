package com.tpp.tpplab3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tpp.tpplab3.models.Resident;

@Repository
public interface ResidentRepository extends JpaRepository<Resident, Integer> {
}
