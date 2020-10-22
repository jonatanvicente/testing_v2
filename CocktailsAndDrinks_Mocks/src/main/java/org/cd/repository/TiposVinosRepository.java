package org.cd.repository;

import org.cd.bo.TiposVinos;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository ("TiposVinosRepository")
public class TiposVinosRepository<T> implements IRepository{


/*    @Override
    public List<TiposVinos> findAllById_Vino(int id) {
        return findAllById_Vino(id);
    }*/

/*    @Override
    public List<TiposVinos> getAll() {
        return (List<TiposVinos>) findAll();
    }*/


    @Override
    public Object save(Object entity) {
        return null;
    }

    @Override
    public Iterable saveAll(Iterable entities) {
        return null;
    }

    @Override
    public Optional findById(Object o) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Object o) {
        return false;
    }

    @Override
    public Iterable findAll() {
        return null;
    }

    @Override
    public Iterable findAllById(Iterable iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Object o) {

    }

    @Override
    public void delete(Object entity) {

    }

    @Override
    public void deleteAll(Iterable entities) {

    }

    @Override
    public void deleteAll() {

    }
}
