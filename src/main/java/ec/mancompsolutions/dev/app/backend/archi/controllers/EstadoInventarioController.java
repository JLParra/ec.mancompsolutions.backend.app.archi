package ec.mancompsolutions.dev.app.backend.archi.controllers;

import ec.mancompsolutions.dev.app.backend.archi.models.entity.EstadoFuncionamiento;
import ec.mancompsolutions.dev.app.backend.archi.models.entity.EstadoInventario;
import ec.mancompsolutions.dev.app.backend.archi.models.services.EstadoInventarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/admin/estado-inventario")
public class EstadoInventarioController {
    @Autowired
    private EstadoInventarioService estadoInventarioService;

    @GetMapping("")
    private List<EstadoInventario> index() {
        return estadoInventarioService.findAll();
    }
    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public EstadoInventario guardar(@RequestBody EstadoInventario estadoInventario) {
        return estadoInventarioService.save(estadoInventario);
    }

    @PutMapping("/{id}")
    public EstadoInventario actualizar(@RequestBody EstadoInventario estadoInventario, @PathVariable Long id) {
        EstadoInventario estadoInventarioActual = estadoInventarioService.findById(id);
        estadoInventarioActual.setNombre(estadoInventario.getNombre());
        estadoInventarioActual.setDescripcion(estadoInventario.getDescripcion());
        return  estadoInventarioService.save(estadoInventarioActual);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminar(@PathVariable Long id){
        estadoInventarioService.delete(id);
    }

}
