package ec.mancompsolutions.dev.app.backend.archi.models.services;

import ec.mancompsolutions.dev.app.backend.archi.models.dao.EmpresaDao;
import ec.mancompsolutions.dev.app.backend.archi.models.dao.EstadoFuncionamientoDao;
import ec.mancompsolutions.dev.app.backend.archi.models.entity.Empresa;
import ec.mancompsolutions.dev.app.backend.archi.models.entity.EstadoFuncionamiento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaServiceImpl implements EmpresaService{
    @Autowired
    private EmpresaDao empresaDao;

    @Override
    public List<Empresa> findAll() {
        return (List<Empresa>) empresaDao.findAll();
    }
}
