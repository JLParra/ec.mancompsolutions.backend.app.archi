package ec.mancompsolutions.dev.app.backend.archi.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "EDFO")
public class EstadoFuncionamiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uid_edfo")
    private Long id;
    @Column(nullable = false, unique = true)
    private String nombre;
    @Column(name = "dsc_edfo")
    private String descripcion;
    @Column(name = "dat_crea")
    private LocalDateTime fechaCreacion;
    @Column(name = "dat_update")
    private LocalDateTime fechaActualizacion;

    @PrePersist
    private void asignarFechaCreacion() {
        fechaCreacion = LocalDateTime.now();
    }
    @PreUpdate
    private void asignarFechaActualizacion() {
        fechaActualizacion = LocalDateTime.now();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        EstadoFuncionamiento that = (EstadoFuncionamiento) o;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
