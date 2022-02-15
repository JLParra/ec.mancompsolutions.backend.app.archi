package ec.mancompsolutions.dev.app.backend.archi.controllers;

import ec.mancompsolutions.dev.app.backend.archi.entity.BaseEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.io.Serializable;
import java.util.List;


public interface BaseController <E extends BaseEntity, ID extends Serializable>{
    public List<E> getAll() ;

    public List<E> findByNombreContaining(@PathVariable String nombre);

    public ResponseEntity<?> getOne(@PathVariable ID id);

    public ResponseEntity<?> save(@RequestBody E entity);

    public ResponseEntity<?> update(@RequestBody E entity, @PathVariable ID id);

    public ResponseEntity<?> delete(@PathVariable ID id);
}
