package ec.mancompsolutions.dev.app.backend.archi.models.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "EPRS")
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uid_eprs")
    private Long id;
    private String RazonSocial;
    private String NombreComercial;
    @ManyToOne
    @JoinColumn(name = "uid_edfo", referencedColumnName = "uid_edfo")
    private EstadoFuncionamiento estadoFuncionamiento;

    @Column(name = "dat_cret")
    private LocalDateTime fechaCreacion;
    @Column(name = "dat_updt")
    private LocalDateTime fechaActualizacion;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Empresa that = (Empresa) o;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
