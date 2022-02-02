package ec.mancompsolutions.dev.app.backend.archi.models.services;

import ec.mancompsolutions.dev.app.backend.archi.models.dao.EstadoFuncionamientoDao;
import ec.mancompsolutions.dev.app.backend.archi.models.entity.EstadoFuncionamiento;
import ec.mancompsolutions.dev.app.backend.archi.models.entity.EstadoInventario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class EstadoFuncionamientoServiceImpl implements EstadoFuncionamientoService{
    @Autowired
    private EstadoFuncionamientoDao estadoFuncionamientoDao;

    @Override
    public List<EstadoFuncionamiento> findAll() {
        return (List<EstadoFuncionamiento>) estadoFuncionamientoDao.findAll();
    }

    @Override
    public EstadoFuncionamiento findById(Long id) {
        return estadoFuncionamientoDao.findById(id).orElse(null);
    }

    @Override
    public EstadoFuncionamiento save(EstadoFuncionamiento estadoFuncionamiento) {
        return estadoFuncionamientoDao.save(estadoFuncionamiento);
    }

    @Override
    public void delete(Long id) {
        estadoFuncionamientoDao.deleteById(id);
    }
}
