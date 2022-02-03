package ec.mancompsolutions.dev.app.backend.archi.controllers;

import ec.mancompsolutions.dev.app.backend.archi.models.entity.EstadoFuncionamiento;
import ec.mancompsolutions.dev.app.backend.archi.models.entity.EstadoInventario;
import ec.mancompsolutions.dev.app.backend.archi.models.services.EstadoInventarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("api/admin/estado-inventario")
public class EstadoInventarioController {
    @Autowired
    private EstadoInventarioService estadoInventarioService;

    @GetMapping("")
    private List<EstadoInventario> index() {
        return estadoInventarioService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> obtener(@PathVariable Long id) {
        EstadoInventario estadoinventario = null;
        Map<String, Object> response = new HashMap<>();
        try {
            estadoinventario = estadoInventarioService.findById(id);
        } catch (DataAccessException e) {
            response.put("mensaje", "Error al consultar la consulta en la base de datos");
            response.put("error", Objects.requireNonNull(e.getMessage()).concat(": ").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        if (estadoinventario == null) {
            response.put("mensaje", "el estado: ".concat(id.toString().concat(" no existe")));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<EstadoInventario>(estadoinventario, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<?> guardar(@RequestBody EstadoInventario estadoInventario) {
        EstadoInventario estadoInventarioNew = null;
        Map<String, Object> response = new HashMap<>();
        try {
            estadoInventarioNew = estadoInventarioService.save(estadoInventario);
        } catch (DataAccessException e) {
            response.put("mensaje", "Error al realizar el ingreso en la base de datos");
            response.put("error", Objects.requireNonNull(e.getMessage()).concat(": ").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        response.put("mensaje", "el estado ha sido creado con exito");
        response.put("estado", estadoInventarioNew);
        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> actualizar(@RequestBody EstadoInventario estadoInventario, @PathVariable Long id) {

        EstadoInventario estadoInventarioActual =  estadoInventarioActual = estadoInventarioService.findById(id);
        EstadoInventario estadoInventarioNew = null;
        Map<String, Object> response = new HashMap<>();

        if (estadoInventarioActual == null) {
            response.put("mensaje", "Error: no se pudo editar el estado: ".concat(id.toString().concat(" no existe")));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
        }

        try {
            estadoInventarioActual.setNombre(estadoInventario.getNombre());
            estadoInventarioActual.setDescripcion(estadoInventario.getDescripcion());
            estadoInventarioNew = estadoInventarioService.save(estadoInventarioActual);
        }catch (DataAccessException e) {
            response.put("mensaje", "Error al actualizar el estado en la base de datos");
            response.put("error", Objects.requireNonNull(e.getMessage()).concat(": ").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        response.put("mensaje", "el estado ha sido actualizado con exito");
        response.put("estado", estadoInventarioNew);
        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);



    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id) {
        Map<String, Object> response = new HashMap<>();

        try {
            estadoInventarioService.delete(id);
        } catch (DataAccessException e) {
            response.put("mensaje", "Error al realizar la eliminacion en la base de datos");
            response.put("error", Objects.requireNonNull(e.getMessage()).concat(": ").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        response.put("mensaje", "el estado ha sido eliminado con exito");
        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
    }

}
