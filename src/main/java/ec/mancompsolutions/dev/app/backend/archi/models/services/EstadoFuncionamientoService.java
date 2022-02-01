package ec.mancompsolutions.dev.app.backend.archi.models.services;

import ec.mancompsolutions.dev.app.backend.archi.models.dao.EstadoFuncionamientoDao;
import ec.mancompsolutions.dev.app.backend.archi.models.entity.EstadoFuncionamiento;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface EstadoFuncionamientoService {
    public List<EstadoFuncionamiento> findAll();
}
