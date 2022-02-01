package ec.mancompsolutions.dev.app.backend.archi.controllers;

import ec.mancompsolutions.dev.app.backend.archi.models.entity.EstadoInventario;
import ec.mancompsolutions.dev.app.backend.archi.models.services.EstadoInventarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/admin")
public class EstadoInventarioController {
    @Autowired
    private EstadoInventarioService estadoInventarioService;

    @GetMapping("/estado-inventario")
    private List<EstadoInventario> index() {
        return estadoInventarioService.findAll();
    }
}
