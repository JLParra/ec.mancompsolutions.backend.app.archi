package ec.mancompsolutions.dev.app.backend.archi.controllers;


import ec.mancompsolutions.dev.app.backend.archi.entity.Departamento;
import ec.mancompsolutions.dev.app.backend.archi.service.DepartamentoServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/departamentos")
public class DepartamentoController extends BaseControllerImpl<Departamento, DepartamentoServiceImpl>{

}
