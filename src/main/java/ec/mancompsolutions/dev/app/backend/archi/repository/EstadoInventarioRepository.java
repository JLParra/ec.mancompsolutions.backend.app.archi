package ec.mancompsolutions.dev.app.backend.archi.repository;

import ec.mancompsolutions.dev.app.backend.archi.entity.EstadoInventario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoInventarioRepository extends BaseRepository<EstadoInventario,Long> {
}
