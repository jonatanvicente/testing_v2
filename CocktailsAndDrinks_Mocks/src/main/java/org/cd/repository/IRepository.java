package org.cd.repository;

import java.util.List;
import java.util.Optional;

import org.cd.bo.Drink;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepository extends CrudRepository<Drink, Integer> {

    @Override
    List<Drink> findAll();

    @Override
    Optional<Drink> findById(Integer integer);


}