package ec.mancompsolutions.dev.app.backend.archi.controllers;

import ec.mancompsolutions.dev.app.backend.archi.entity.BaseEntity;
import ec.mancompsolutions.dev.app.backend.archi.service.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.*;

public abstract class BaseControllerImpl<E extends BaseEntity, S extends BaseServiceImpl<E, Long>> implements BaseController<E, Long> {

    @Autowired
    protected  S servicio;

    @GetMapping("")
    public List<E> getAll() {
        return servicio.findAll();
    }

    @GetMapping("/buscarpornombre/{nombre}")
    public List<E> findbyName(@PathVariable String nombre) {
        return servicio.findByNombre("Ecuador");
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id) {
        E entity;
        Map<String, Object> response = new HashMap<>();
        try {
            entity = servicio.findById(id);
        } catch (DataAccessException e) {
            response.put("mensaje", "Error al consultar en la base de datos");
            response.put("error", Objects.requireNonNull(e.getMessage()).concat(": ").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        if (entity == null) {
            response.put("mensaje", "el ID: ".concat(id.toString().concat(" no existe")));
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(entity, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<?> save(@RequestBody E e) {
        E eNew;
        Map<String, Object> response = new HashMap<>();
        try {
            eNew = servicio.save(e);
        } catch (DataAccessException ex) {
            response.put("mensaje", "Error al realizar el ingreso en la base de datos");
            response.put("error", Objects.requireNonNull(ex.getMessage()).concat(": ").concat(ex.getMostSpecificCause().getMessage()));
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        response.put("mensaje", "Se ha realizado el ingreso con exito");
        response.put("Data:", eNew);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody E e, @PathVariable Long id) {
        Map<String, Object> response = new HashMap<>();
        try{
            E eNew = servicio.update(id,e);
            if (eNew == null) {
                response.put("mensaje", "Error: no se pudo llevar acabo la actualizacion porque el ID: ".concat(id.toString().concat(" no existe")));
                return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
            }

        }catch (DataAccessException ex) {
            response.put("mensaje", "Error al realizar el ingreso en la base de datos");
            response.put("error", Objects.requireNonNull(ex.getMessage()).concat(": ").concat(ex.getMostSpecificCause().getMessage()));
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        response.put("mensaje", "Se ha realizado la actualizacion con exito");
        return new ResponseEntity<>(response, HttpStatus.CREATED);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        Map<String, Object> response = new HashMap<>();
        try {
            servicio.delete(id);
        } catch (DataAccessException e) {
            response.put("mensaje", "Error al realizar la eliminacion en la base de datos");
            response.put("error", Objects.requireNonNull(e.getMessage()).concat(": ").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        response.put("mensaje", "la informacion ha sido eliminada con exito");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
