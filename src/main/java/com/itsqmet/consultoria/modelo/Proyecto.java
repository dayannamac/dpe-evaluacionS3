package com.itsqmet.consultoria.modelo;

import java.time.*;

import javax.persistence.*;
import javax.validation.constraints.*;

import org.openxava.annotations.*;
import org.openxava.calculators.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Proyecto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Hidden
	private int id;
	
	@Column(length=20) 
	 private String nombre;
	
	@Column(length=45) 
	 private String descripcion;
	
	@Required
	@FutureOrPresent(message = "La fecha de inicio no puede ser en el pasado.")
	@DefaultValueCalculator(CurrentLocalDateCalculator.class)
	private LocalDate fechaInicio;
	
	@Required
	@FutureOrPresent(message = "La fecha de fin no puede ser en el pasado.")
	private LocalDate fechaFin;
	
	@Column(length=10) 
	private String estado;
	
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

	
}
