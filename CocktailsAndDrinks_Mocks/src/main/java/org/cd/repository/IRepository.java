package org.cd.repository;

import java.util.List;
import java.util.Optional;

import org.cd.bo.Drink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface IRepository extends JpaRepository<Drink, Integer> {

    List<Drink> findAll();

    Optional<Drink> findById(Integer integer);

    <S extends Drink> S saveAndFlush(S entity);

    Optional<Drink> findByCategoria(String categoria);
}