package ec.mancompsolutions.dev.app.backend.archi.models.services;

import ec.mancompsolutions.dev.app.backend.archi.models.dao.EstadoInventarioDao;
import ec.mancompsolutions.dev.app.backend.archi.models.entity.EstadoInventario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoInventarioServiceImpl implements EstadoInventarioService{

    @Autowired
    private EstadoInventarioDao estadoInventarioDao;

    @Override
    public List<EstadoInventario> findAll() {
        return (List<EstadoInventario>) estadoInventarioDao.findAll();
    }
}
