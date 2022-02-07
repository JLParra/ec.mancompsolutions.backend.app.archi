package ec.mancompsolutions.dev.app.backend.archi.controllers;

import ec.mancompsolutions.dev.app.backend.archi.entity.EstadoInventario;
import ec.mancompsolutions.dev.app.backend.archi.service.EstadoInventarioServiceImpl;
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
public class EstadoInventarioController extends BaseControllerImpl<EstadoInventario, EstadoInventarioServiceImpl> {


}
