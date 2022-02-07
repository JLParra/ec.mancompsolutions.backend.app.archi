package ec.mancompsolutions.dev.app.backend.archi.service;

import ec.mancompsolutions.dev.app.backend.archi.repository.EstadoFuncionamientoDao;
import ec.mancompsolutions.dev.app.backend.archi.entity.EstadoFuncionamiento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoFuncionamientoServiceImpl implements EstadoFuncionamientoService{
    @Autowired
    private EstadoFuncionamientoDao estadoFuncionamientoDao;


}
