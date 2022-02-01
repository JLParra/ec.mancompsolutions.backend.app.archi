package ec.mancompsolutions.dev.app.backend.archi.models.dao;

import ec.mancompsolutions.dev.app.backend.archi.models.entity.EstadoInventario;
import org.springframework.data.repository.CrudRepository;

public interface EstadoInventarioDao extends CrudRepository<EstadoInventario,Long> {
}
