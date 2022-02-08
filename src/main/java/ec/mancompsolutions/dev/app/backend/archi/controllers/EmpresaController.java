package ec.mancompsolutions.dev.app.backend.archi.controllers;

import ec.mancompsolutions.dev.app.backend.archi.entity.Empresa;
import ec.mancompsolutions.dev.app.backend.archi.service.EmpresaServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin/empresas")
public class EmpresaController extends BaseControllerImpl<Empresa, EmpresaServiceImpl>{

}
