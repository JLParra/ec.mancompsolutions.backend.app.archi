package ec.mancompsolutions.dev.app.backend.archi.entity;

import com.fasterxml.jackson.databind.ser.Serializers;
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
@Table(name = "EDFO")
public class EstadoFuncionamiento extends BaseEntity {

    @Column(nullable = false, unique = true)
    private String nombre;
    @Column(name = "dsc_edfo")
    private String descripcion;
}
