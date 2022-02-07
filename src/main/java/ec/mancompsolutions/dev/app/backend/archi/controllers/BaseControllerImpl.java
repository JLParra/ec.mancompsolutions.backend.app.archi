package ec.mancompsolutions.dev.app.backend.archi.controllers;

import ec.mancompsolutions.dev.app.backend.archi.entity.BaseEntity;
import ec.mancompsolutions.dev.app.backend.archi.entity.EstadoInventario;
import ec.mancompsolutions.dev.app.backend.archi.service.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public abstract class BaseControllerImpl<E extends BaseEntity, S extends BaseServiceImpl<E, Long>> implements BaseController<E, Long> {

    @Autowired
    protected  S servicio;

    @GetMapping("")
    public List<E> getAll() {
        return servicio.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id) {
        E entity = null;
        Map<String, Object> response = new HashMap<>();
        try {
            entity = servicio.findById(id);
        } catch (DataAccessException e) {
            response.put("mensaje", "Error al consultar en la base de datos");
            response.put("error", Objects.requireNonNull(e.getMessage()).concat(": ").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        if (entity == null) {
            response.put("mensaje", "el ID: ".concat(id.toString().concat(" no existe")));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<E>(entity, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<?> save(@RequestBody E e) {
        E eNew = null;
        Map<String, Object> response = new HashMap<>();
        try {
            eNew = servicio.save(e);
        } catch (DataAccessException ex) {
            response.put("mensaje", "Error al realizar el ingreso en la base de datos");
            response.put("error", Objects.requireNonNull(ex.getMessage()).concat(": ").concat(ex.getMostSpecificCause().getMessage()));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        response.put("mensaje", "el estado ha sido creado con exito");
        response.put("Data:", eNew);
        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody E e, @PathVariable Long id) {

       return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        Map<String, Object> response = new HashMap<>();
        try {
            servicio.delete(id);
        } catch (DataAccessException e) {
            response.put("mensaje", "Error al realizar la eliminacion en la base de datos");
            response.put("error", Objects.requireNonNull(e.getMessage()).concat(": ").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        response.put("mensaje", "la informacion ha sido eliminada con exito");
        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
    }
}
