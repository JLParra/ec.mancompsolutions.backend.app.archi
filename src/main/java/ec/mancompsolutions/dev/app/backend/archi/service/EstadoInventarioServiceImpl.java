package ec.mancompsolutions.dev.app.backend.archi.service;

import ec.mancompsolutions.dev.app.backend.archi.repository.EstadoInventarioDao;
import ec.mancompsolutions.dev.app.backend.archi.entity.EstadoInventario;
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

    @Override
    public EstadoInventario findById(Long id) {
        return estadoInventarioDao.findById(id).orElse(null);
    }

    @Override
    public EstadoInventario save(EstadoInventario estadoInventario) {
        return estadoInventarioDao.save(estadoInventario) ;
    }

    @Override
    public void delete(Long id) {
        estadoInventarioDao.deleteById(id);
    }


}
