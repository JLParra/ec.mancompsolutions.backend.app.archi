package ec.mancompsolutions.dev.app.backend.archi.service;

import ec.mancompsolutions.dev.app.backend.archi.entity.EstadoFuncionamiento;

import java.util.List;

public interface EstadoFuncionamientoService {
    public List<EstadoFuncionamiento> findAll();
    public EstadoFuncionamiento findById(Long id);
    public EstadoFuncionamiento save(EstadoFuncionamiento estadoFuncionamiento);
    public void delete(Long id);
}
