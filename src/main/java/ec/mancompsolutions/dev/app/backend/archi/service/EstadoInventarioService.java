package ec.mancompsolutions.dev.app.backend.archi.service;

import ec.mancompsolutions.dev.app.backend.archi.entity.EstadoInventario;
import java.util.List;

public interface EstadoInventarioService {

   public List<EstadoInventario>findAll();
   public EstadoInventario findById(Long id);
   public EstadoInventario save(EstadoInventario estadoInventario);
   public void delete(Long id);
}
