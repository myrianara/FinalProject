package com.portfolio.myar.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.myar.Entity.Persona;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long> {

}
