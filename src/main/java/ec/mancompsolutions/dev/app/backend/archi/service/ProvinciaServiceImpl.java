package ec.mancompsolutions.dev.app.backend.archi.service;



import ec.mancompsolutions.dev.app.backend.archi.entity.Provincia;
import ec.mancompsolutions.dev.app.backend.archi.repository.BaseRepository;
import ec.mancompsolutions.dev.app.backend.archi.repository.ProvinciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinciaServiceImpl extends BaseServiceImpl<Provincia,Long> implements ProvinciaService{
    @Autowired
    private ProvinciaRepository provinciaRepository;

    public ProvinciaServiceImpl(BaseRepository<Provincia, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public long countByestadoFuncionamiento(Long estado) {
        return provinciaRepository.countByEstadoFuncionamiento(estado);
    }
}
