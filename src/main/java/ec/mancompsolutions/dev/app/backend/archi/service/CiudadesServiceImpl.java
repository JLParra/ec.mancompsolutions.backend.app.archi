package ec.mancompsolutions.dev.app.backend.archi.service;

import ec.mancompsolutions.dev.app.backend.archi.entity.Ciudades;
import ec.mancompsolutions.dev.app.backend.archi.repository.BaseRepository;
import ec.mancompsolutions.dev.app.backend.archi.repository.CiudadesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CiudadesServiceImpl extends BaseServiceImpl<Ciudades,Long> implements CiudadesService{
    @Autowired
    private CiudadesRepository ciudadesRepository;


    public CiudadesServiceImpl(BaseRepository<Ciudades, Long> baseRepository) {
        super(baseRepository);
    }
}
