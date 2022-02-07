package ec.mancompsolutions.dev.app.backend.archi.controllers;

import ec.mancompsolutions.dev.app.backend.archi.entity.EstadoFuncionamiento;
import ec.mancompsolutions.dev.app.backend.archi.service.EstadoFuncionamientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin/estado-funcionamiento")
public class EstadoFuncionamientoController {
    @Autowired
    private EstadoFuncionamientoService estadoFuncionamientoService;

    @GetMapping()
    public List<EstadoFuncionamiento> index() {
        return estadoFuncionamientoService.findAll();
    }

    @GetMapping("/{id}")
    public EstadoFuncionamiento obtener(@PathVariable Long id) {
        return estadoFuncionamientoService.findById(id);
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public EstadoFuncionamiento guardar(@RequestBody EstadoFuncionamiento estadoFuncionamiento) {
        return estadoFuncionamientoService.save(estadoFuncionamiento);
    }

    @PutMapping("/{id}")
    public EstadoFuncionamiento actualizar(@RequestBody EstadoFuncionamiento estadoFuncionamiento, @PathVariable Long id) {
        EstadoFuncionamiento estadoFuncionamientoActual = estadoFuncionamientoService.findById(id);
        estadoFuncionamientoActual.setNombre(estadoFuncionamiento.getNombre());
        estadoFuncionamientoActual.setDescripcion(estadoFuncionamiento.getDescripcion());
        return  estadoFuncionamientoService.save(estadoFuncionamientoActual);
    }

}
