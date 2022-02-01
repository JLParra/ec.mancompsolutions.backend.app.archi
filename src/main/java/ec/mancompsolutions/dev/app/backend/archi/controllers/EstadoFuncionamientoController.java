package ec.mancompsolutions.dev.app.backend.archi.controllers;

import ec.mancompsolutions.dev.app.backend.archi.models.entity.EstadoFuncionamiento;
import ec.mancompsolutions.dev.app.backend.archi.models.services.EstadoFuncionamientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
public class EstadoFuncionamientoController {
    @Autowired
    private EstadoFuncionamientoService estadoFuncionamientoService;

    @GetMapping("/estado-funcionamiento")
    public List<EstadoFuncionamiento> index(){
        return estadoFuncionamientoService.findAll();
    }
}
