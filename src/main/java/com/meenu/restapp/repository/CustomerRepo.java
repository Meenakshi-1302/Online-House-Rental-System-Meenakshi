package com.meenu.restapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.meenu.restapp.model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
