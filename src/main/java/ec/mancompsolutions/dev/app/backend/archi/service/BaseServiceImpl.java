package ec.mancompsolutions.dev.app.backend.archi.service;

import ec.mancompsolutions.dev.app.backend.archi.entity.BaseEntity;
import ec.mancompsolutions.dev.app.backend.archi.entity.EstadoFuncionamiento;
import ec.mancompsolutions.dev.app.backend.archi.repository.BaseRepository;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;

public abstract class BaseServiceImpl<E extends BaseEntity, ID extends Serializable> implements BaseService<E, ID> {
    protected BaseRepository<E,ID> baseRepository;

    public BaseServiceImpl(BaseRepository<E, ID> baseRepository) {
        this.baseRepository = baseRepository;
    }

    @Override
    @Transactional
    public List<E> findAll() {
        return (List<E>) baseRepository.findAll();
    }

    @Override
    @Transactional
    public E findById(ID id) {
        return baseRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public E save(E entity) {
        return baseRepository.save(entity);
    }

    @Override
    @Transactional
    public void delete(ID id) {
        baseRepository.deleteById(id);
    }
}
