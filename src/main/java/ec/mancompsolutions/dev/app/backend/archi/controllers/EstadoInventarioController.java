package ec.mancompsolutions.dev.app.backend.archi.controllers;

import ec.mancompsolutions.dev.app.backend.archi.entity.EstadoInventario;
import ec.mancompsolutions.dev.app.backend.archi.service.EstadoInventarioServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/admin/estado-inventario")
public class EstadoInventarioController extends BaseControllerImpl<EstadoInventario, EstadoInventarioServiceImpl> {


}
