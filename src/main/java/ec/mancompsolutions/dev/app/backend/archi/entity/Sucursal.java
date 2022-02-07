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

    @Column(nullable = false, unique = true)
    private String nombre;
    @Column(nullable = false)
    private String direccion;
    @OneToMany
    @JoinTable(
            name = "sucursal_area",
            joinColumns = @JoinColumn(name = "sucursal_id"),
            inverseJoinColumns = @JoinColumn(name = "area_id")
    )
    private List<Area> areas = new ArrayList<Area>();

}
