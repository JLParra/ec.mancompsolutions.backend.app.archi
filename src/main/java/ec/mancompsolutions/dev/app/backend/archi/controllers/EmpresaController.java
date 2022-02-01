package ec.mancompsolutions.dev.app.backend.archi.controllers;

import ec.mancompsolutions.dev.app.backend.archi.models.entity.Empresa;
import ec.mancompsolutions.dev.app.backend.archi.models.entity.EstadoInventario;
import ec.mancompsolutions.dev.app.backend.archi.models.services.EmpresaService;
import ec.mancompsolutions.dev.app.backend.archi.models.services.EstadoInventarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/")
public class EmpresaController {
    @Autowired
    private EmpresaService empresaService;

    @GetMapping("/empresa")
    private List<Empresa> index() {
        return empresaService.findAll();
    }
}
