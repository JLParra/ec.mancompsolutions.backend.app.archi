package ec.mancompsolutions.dev.app.backend.archi.service;

import ec.mancompsolutions.dev.app.backend.archi.entity.EstadoFuncionamiento;
import ec.mancompsolutions.dev.app.backend.archi.repository.BaseRepository;
import ec.mancompsolutions.dev.app.backend.archi.repository.EstadoFuncionamientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstadoFuncionamientoServiceImpl extends BaseServiceImpl<EstadoFuncionamiento,Long> implements EstadoFuncionamientoService{
    @Autowired
    private EstadoFuncionamientoRepository estadoFuncionamientoRepository;


    public EstadoFuncionamientoServiceImpl(BaseRepository<EstadoFuncionamiento, Long> baseRepository) {
        super(baseRepository);
    }
}
