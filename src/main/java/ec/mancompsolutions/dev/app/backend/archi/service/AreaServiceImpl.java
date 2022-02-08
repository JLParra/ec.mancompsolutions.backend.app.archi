package ec.mancompsolutions.dev.app.backend.archi.service;

import ec.mancompsolutions.dev.app.backend.archi.entity.Area;
import ec.mancompsolutions.dev.app.backend.archi.repository.AreaRepository;
import ec.mancompsolutions.dev.app.backend.archi.repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AreaServiceImpl extends BaseServiceImpl<Area,Long> implements AreaService{
    @Autowired
    private AreaRepository areaRepository;


    public AreaServiceImpl(BaseRepository<Area, Long> baseRepository) {
        super(baseRepository);
    }
}
