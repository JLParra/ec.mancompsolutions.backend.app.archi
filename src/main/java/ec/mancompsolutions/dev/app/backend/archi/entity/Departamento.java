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
@Table(name = "EPTS")
public class Departamento extends BaseEntity{
    @Column(nullable = false, unique = true)
    private String nombre;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_edfo")
    private EstadoFuncionamiento estadoFuncionamiento;
}
