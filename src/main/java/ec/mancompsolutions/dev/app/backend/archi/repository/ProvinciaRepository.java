package ec.mancompsolutions.dev.app.backend.archi.repository;


import ec.mancompsolutions.dev.app.backend.archi.entity.Provincia;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvinciaRepository extends BaseRepository <Provincia,Long> {
    @Query(value = "SELECT count(*) FROM provincia T0 where T0.id_edfo = ?1",nativeQuery = true)
    long countByEstadoFuncionamiento(Long a);
}
