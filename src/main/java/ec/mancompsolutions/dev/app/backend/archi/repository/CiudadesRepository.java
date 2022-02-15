package ec.mancompsolutions.dev.app.backend.archi.repository;


import ec.mancompsolutions.dev.app.backend.archi.entity.Area;
import ec.mancompsolutions.dev.app.backend.archi.entity.Ciudades;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CiudadesRepository extends BaseRepository <Ciudades,Long> {
    @Query(value = "SELECT count(*) FROM ciudades T0 where T0.id_edfo = ?1",nativeQuery = true)
    long countByEstadoFuncionamiento(Long a);
}
