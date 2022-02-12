package ec.mancompsolutions.dev.app.backend.archi.service;


import ec.mancompsolutions.dev.app.backend.archi.entity.Paises;
import ec.mancompsolutions.dev.app.backend.archi.repository.BaseRepository;
import ec.mancompsolutions.dev.app.backend.archi.repository.PaisesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaisesServiceImpl extends BaseServiceImpl<Paises, Long> implements PaisesService {
    @Autowired
    private PaisesRepository paisesRepository;

    public PaisesServiceImpl(BaseRepository<Paises, Long> baseRepository) {
        super(baseRepository);
    }

}
