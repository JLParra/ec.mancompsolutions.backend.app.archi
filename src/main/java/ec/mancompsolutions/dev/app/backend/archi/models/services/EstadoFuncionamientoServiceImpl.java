package ec.mancompsolutions.dev.app.backend.archi.models.services;

import ec.mancompsolutions.dev.app.backend.archi.models.dao.EstadoFuncionamientoDao;
import ec.mancompsolutions.dev.app.backend.archi.models.entity.EstadoFuncionamiento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoFuncionamientoServiceImpl implements EstadoFuncionamientoService{
    @Autowired
    private EstadoFuncionamientoDao estadoFuncionamientoDao;

    @Override
    public List<EstadoFuncionamiento> findAll() {
        return (List<EstadoFuncionamiento>) estadoFuncionamientoDao.findAll();
    }
}
