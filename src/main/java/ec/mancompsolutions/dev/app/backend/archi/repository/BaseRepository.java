package ec.mancompsolutions.dev.app.backend.archi.repository;

import ec.mancompsolutions.dev.app.backend.archi.entity.BaseEntity;
import ec.mancompsolutions.dev.app.backend.archi.entity.Paises;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;
import java.util.List;

@NoRepositoryBean /* permite que de esta interface no se creen instancias */
public interface BaseRepository <E extends BaseEntity, ID extends Serializable> extends JpaRepository<E,ID> {
    List<E> findByNombreContaining(String nombre);
}
