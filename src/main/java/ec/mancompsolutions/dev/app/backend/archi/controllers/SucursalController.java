package ec.mancompsolutions.dev.app.backend.archi.controllers;


import ec.mancompsolutions.dev.app.backend.archi.entity.Sucursal;
import ec.mancompsolutions.dev.app.backend.archi.service.SucursalServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sucursales")
public class SucursalController extends BaseControllerImpl<Sucursal, SucursalServiceImpl>{

}
