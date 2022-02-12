package ec.mancompsolutions.dev.app.backend.archi.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "EDII")
public class EstadoInventario extends BaseEntity {

    @Column(name = "dsc_edfo")
    private String descripcion;

}
