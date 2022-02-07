package ec.mancompsolutions.dev.app.backend.archi.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "EPRS")
public class Empresa extends BaseEntity{

    @Column(nullable = false, unique = true)
    private String RazonSocial;
    @Column(nullable = false, unique = true)
    private String NombreComercial;

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = false)
    @JoinTable(
            name = "empresa_sucursal",
            joinColumns = @JoinColumn(name = "empresa_id"),
            inverseJoinColumns = @JoinColumn(name = "sucursal_id")
    )
    private List<Sucursal> sucursales = new ArrayList<Sucursal>();

}
