package com.meenu.restapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meenu.restapp.model.Model1;

@Repository
public interface Model1Repo extends JpaRepository<Model1, Integer> {

}
