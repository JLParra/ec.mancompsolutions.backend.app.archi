package ec.mancompsolutions.dev.app.backend.archi.service;

import ec.mancompsolutions.dev.app.backend.archi.entity.Empresa;
import ec.mancompsolutions.dev.app.backend.archi.repository.BaseRepository;
import ec.mancompsolutions.dev.app.backend.archi.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaServiceImpl extends BaseServiceImpl<Empresa,Long> implements EmpresaService{
    @Autowired
    private EmpresaRepository empresaRepository;


    public EmpresaServiceImpl(BaseRepository<Empresa, Long> baseRepository) {
        super(baseRepository);
    }
}
