package ec.mancompsolutions.dev.app.backend.archi.models.services;

import ec.mancompsolutions.dev.app.backend.archi.models.entity.Empresa;
import ec.mancompsolutions.dev.app.backend.archi.models.entity.EstadoFuncionamiento;

import java.util.List;

public interface EmpresaService {
    public List<Empresa> findAll();
}
