package com.itsqmet.consultoria.modelo;

import java.time.*;

import javax.persistence.*;
import javax.validation.constraints.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Tarea {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Hidden
	private int id;
	
	@Column(length=45) 
	private String titulo;
	
	@Column(length=45) 
	private String descripcion;
	
	@Required
	@FutureOrPresent(message = "La fecha de vencimiento no puede ser en el pasado.")
	private LocalDate fechaVencimiento;
	
	private int prioridad;
	
	@Column(length=10) 
	private String estado;
	
	@Embedded
	TiempoInvertido tiempoInvertido;
	
    @ManyToOne
    @JoinColumn(name = "proyecto_id")
    private Proyecto proyecto;

}
