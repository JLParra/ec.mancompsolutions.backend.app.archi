package ec.mancompsolutions.dev.app.backend.archi.service;

import ec.mancompsolutions.dev.app.backend.archi.entity.BaseEntity;

import java.io.Serializable;
import java.util.List;

public interface BaseService <E extends BaseEntity, ID extends Serializable> {
    public List<E> findAll();
    public List<E> findByNombreContaining(String nombre);
    public E findById(ID id);
    public E save(E entity);
    public E update (ID id,E entity);
    public void delete(ID id);
}
