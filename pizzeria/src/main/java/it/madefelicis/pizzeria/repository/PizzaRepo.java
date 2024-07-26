package it.madefelicis.pizzeria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import it.madefelicis.pizzeria.model.PizzaMod;

public interface PizzaRepo extends JpaRepository<PizzaMod, Integer> {

    List<PizzaMod> findByNome(String nome);
}
