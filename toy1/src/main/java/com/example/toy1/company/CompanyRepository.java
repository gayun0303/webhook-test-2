package com.example.toy1.company;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CompanyRepository extends JpaRepository<CompanyEntity, Long> {

	Optional<CompanyEntity> findById(Long companyId);

	Boolean existsByCompanyName(String companyName);

}
