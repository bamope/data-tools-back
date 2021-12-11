package com.trasnporte.company.demo.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.trasnporte.company.demo.datajpa.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}