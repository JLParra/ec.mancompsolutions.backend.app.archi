package ec.mancompsolutions.dev.app.backend.archi.controllers;

import ec.mancompsolutions.dev.app.backend.archi.entity.EstadoFuncionamiento;
import ec.mancompsolutions.dev.app.backend.archi.service.EstadoFuncionamientoServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin/estado-funcionamiento")
public class EstadoFuncionamientoController extends BaseControllerImpl<EstadoFuncionamiento, EstadoFuncionamientoServiceImpl>{

}
