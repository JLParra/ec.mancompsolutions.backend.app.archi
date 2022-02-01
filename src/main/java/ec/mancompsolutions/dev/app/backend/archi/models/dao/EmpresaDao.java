package ec.mancompsolutions.dev.app.backend.archi.models.dao;

import ec.mancompsolutions.dev.app.backend.archi.models.entity.Empresa;
import ec.mancompsolutions.dev.app.backend.archi.models.entity.EstadoInventario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface EmpresaDao extends JpaRepository<Empresa,Long> {
}
