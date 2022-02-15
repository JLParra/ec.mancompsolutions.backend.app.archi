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
@Table(name = "SCRS")
public class Sucursal extends BaseEntity{


    @Column(nullable = false)
    private String direccion;
    @OneToMany(cascade = CascadeType.MERGE)
    @JoinTable(
            name = "scrs_area",
            joinColumns = @JoinColumn(name = "scrs_id"),
            inverseJoinColumns = @JoinColumn(name = "area_id")
    )
    private List<Area> areas = new ArrayList<>();

    @OneToOne()
    @JoinColumn(name = "id_ciudad")
    private Ciudades ciudad;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_edfo")
    private EstadoFuncionamiento estadoFuncionamiento;

}
