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
    private String NombreComercial;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "eprs_scrs",
            joinColumns = @JoinColumn(name = "eprs_id"),
            inverseJoinColumns = @JoinColumn(name = "scrs_id")
    )
    private List<Sucursal> sucursales = new ArrayList<>();

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_edfo")
    private EstadoFuncionamiento estadoFuncionamiento;





}
