package ec.mancompsolutions.dev.app.backend.archi.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "provincia")
public class Provincia extends BaseEntity {
    @Column(nullable = false, unique = true)
    private String nombre;
    @Column(nullable = false)
    private String capital;

    @OneToOne()
    @JoinColumn(name = "id_pais")
    private Paises pais;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_edfo")
    private EstadoFuncionamiento estadoFuncionamiento;

}
