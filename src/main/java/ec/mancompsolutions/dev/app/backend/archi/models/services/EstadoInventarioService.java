package ec.mancompsolutions.dev.app.backend.archi.models.services;

import ec.mancompsolutions.dev.app.backend.archi.models.entity.EstadoInventario;
import java.util.List;

public interface EstadoInventarioService {

   public List<EstadoInventario>findAll();
   public EstadoInventario findById(Long id);
   public EstadoInventario save(EstadoInventario estadoInventario);
   public void delete(Long id);
}
