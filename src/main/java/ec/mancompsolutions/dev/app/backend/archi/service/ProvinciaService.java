package ec.mancompsolutions.dev.app.backend.archi.service;

import ec.mancompsolutions.dev.app.backend.archi.entity.Area;
import ec.mancompsolutions.dev.app.backend.archi.entity.Provincia;

import java.util.List;


public interface ProvinciaService extends BaseService<Provincia,Long> {
    long countByestadoFuncionamiento(Long estado);
}
