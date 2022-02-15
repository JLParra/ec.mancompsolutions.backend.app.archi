package ec.mancompsolutions.dev.app.backend.archi.controllers;

import ec.mancompsolutions.dev.app.backend.archi.entity.Area;
import ec.mancompsolutions.dev.app.backend.archi.entity.Ciudades;
import ec.mancompsolutions.dev.app.backend.archi.service.AreaServiceImpl;
import ec.mancompsolutions.dev.app.backend.archi.service.CiudadesServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/mundo/ciudades")
public class CiudadesController extends BaseControllerImpl<Ciudades, CiudadesServiceImpl>{
    @GetMapping("/count/{estado}")
    public long countByEstadoFuncionamiento(@PathVariable long estado) {
        return servicio.countByestadoFuncionamiento(estado);
    }
}
