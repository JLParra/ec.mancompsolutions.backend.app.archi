package ec.mancompsolutions.dev.app.backend.archi.controllers;

import ec.mancompsolutions.dev.app.backend.archi.entity.EstadoFuncionamiento;
import ec.mancompsolutions.dev.app.backend.archi.entity.EstadoInventario;
import ec.mancompsolutions.dev.app.backend.archi.service.EstadoFuncionamientoServiceImpl;
import ec.mancompsolutions.dev.app.backend.archi.service.EstadoInventarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin/estado-funcionamiento")
public class EstadoFuncionamientoController extends BaseControllerImpl<EstadoFuncionamiento, EstadoFuncionamientoServiceImpl>{

}
