package ec.mancompsolutions.dev.app.backend.archi.controllers;

import ec.mancompsolutions.dev.app.backend.archi.entity.Provincia;
import ec.mancompsolutions.dev.app.backend.archi.service.ProvinciaServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/mundo/provincias")
public class ProvinciaController extends BaseControllerImpl<Provincia, ProvinciaServiceImpl>{

    @GetMapping("/count/{estado}")
    public long countByEstadoFuncionamiento(@PathVariable long estado) {
        return servicio.countByestadoFuncionamiento(estado);
    }
}
