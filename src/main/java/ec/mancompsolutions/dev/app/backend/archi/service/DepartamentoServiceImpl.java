package ec.mancompsolutions.dev.app.backend.archi.service;

import ec.mancompsolutions.dev.app.backend.archi.entity.Departamento;
import ec.mancompsolutions.dev.app.backend.archi.repository.BaseRepository;
import ec.mancompsolutions.dev.app.backend.archi.repository.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartamentoServiceImpl extends BaseServiceImpl<Departamento,Long> implements DepartamentoService{
    @Autowired
    private DepartamentoRepository areaRepository;


    public DepartamentoServiceImpl(BaseRepository<Departamento, Long> baseRepository) {
        super(baseRepository);
    }
}
