package edu.kalum.notas.core.models.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "asignacion_alumno")
public class AsignacionAlumno {
    @Id
    @Column(name="asignacion_id")
    private String asignacionId;
    @Column(name = "fecha_asignacion")
    @NotNull(message = "El campo fecha no es valido")
    private Date fechaAsignacion;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "carne", referencedColumnName = "carne")
    @NotNull(message = "El campo carné no es valido")
    private Alumno alumno;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "clase_id",referencedColumnName = "clase_id")
    @NotNull(message = "El campo clase no es valido")
    private Clase clase;
}
