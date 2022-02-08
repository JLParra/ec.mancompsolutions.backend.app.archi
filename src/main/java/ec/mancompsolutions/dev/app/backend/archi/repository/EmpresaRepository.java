package ec.mancompsolutions.dev.app.backend.archi.repository;


import ec.mancompsolutions.dev.app.backend.archi.entity.Empresa;
import ec.mancompsolutions.dev.app.backend.archi.entity.EstadoFuncionamiento;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends BaseRepository <Empresa,Long> {
}
