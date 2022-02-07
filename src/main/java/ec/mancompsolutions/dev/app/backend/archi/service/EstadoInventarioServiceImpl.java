package ec.mancompsolutions.dev.app.backend.archi.service;

import ec.mancompsolutions.dev.app.backend.archi.repository.BaseRepository;
import ec.mancompsolutions.dev.app.backend.archi.repository.EstadoInventarioRepository;
import ec.mancompsolutions.dev.app.backend.archi.entity.EstadoInventario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstadoInventarioServiceImpl extends BaseServiceImpl<EstadoInventario,Long> implements EstadoInventarioService{

    @Autowired
    private EstadoInventarioRepository estadoInventarioRepository;


    public EstadoInventarioServiceImpl(BaseRepository<EstadoInventario, Long> baseRepository) {
        super(baseRepository);
    }


}
