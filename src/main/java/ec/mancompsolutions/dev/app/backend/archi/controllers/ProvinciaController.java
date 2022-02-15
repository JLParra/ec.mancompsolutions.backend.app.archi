package ec.mancompsolutions.dev.app.backend.archi.controllers;

import ec.mancompsolutions.dev.app.backend.archi.entity.Area;
import ec.mancompsolutions.dev.app.backend.archi.entity.Provincia;
import ec.mancompsolutions.dev.app.backend.archi.service.AreaServiceImpl;
import ec.mancompsolutions.dev.app.backend.archi.service.ProvinciaServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/mundo/provincias")
public class ProvinciaController extends BaseControllerImpl<Provincia, ProvinciaServiceImpl>{

}
