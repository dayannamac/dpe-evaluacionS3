package com.itsqmet.consultoria.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Hidden
	private int id; 
	
	 @Column(length=20) 
	 private String nombre;
	 
	 @Column(length=20)
	 private String apellido; 
	 
	 @Column(length=45)
	 private String email; 
	 
	 @Column(length=45)
	 private String direccion;

}
