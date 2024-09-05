package com.itsqmet.consultoria.modelo;

import java.time.*;

import javax.persistence.*;
import javax.validation.constraints.*;

import org.openxava.annotations.*;
import org.openxava.calculators.*;

import lombok.*;

@Embeddable
@Getter
@Setter
public class TiempoInvertido {

	@Required
	@FutureOrPresent(message = "La fecha no puede ser en el pasado.")
	@DefaultValueCalculator(CurrentLocalDateCalculator.class)
	private LocalDate fecha;
	
	private int horasTrabajas;
	
}
