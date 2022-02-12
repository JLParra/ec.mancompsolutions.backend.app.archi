package ec.mancompsolutions.dev.app.backend.archi.controllers;

import ec.mancompsolutions.dev.app.backend.archi.entity.Paises;

import ec.mancompsolutions.dev.app.backend.archi.service.PaisesServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/paises")
public class PaisesController extends BaseControllerImpl<Paises, PaisesServiceImpl>{
}
