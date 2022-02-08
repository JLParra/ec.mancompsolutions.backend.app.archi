package ec.mancompsolutions.dev.app.backend.archi.service;


import ec.mancompsolutions.dev.app.backend.archi.entity.Sucursal;
import ec.mancompsolutions.dev.app.backend.archi.repository.BaseRepository;
import ec.mancompsolutions.dev.app.backend.archi.repository.SucursalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SucursalServiceImpl extends BaseServiceImpl<Sucursal,Long> implements SucursalService{
    @Autowired
    private SucursalRepository sucursalRepository;

    public SucursalServiceImpl(BaseRepository<Sucursal, Long> baseRepository) {
        super(baseRepository);
    }
}
