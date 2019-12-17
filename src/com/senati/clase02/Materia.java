package com.senati.clase02;

public class Materia extends Especialidad {
	String nombre_materia;
	String nrohoras;
	
	public Materia(String idEspecialidad, String nombre, String nombre2, String nrohoras) {
		super(idEspecialidad, nombre);
		nombre_materia = nombre2;
		this.nrohoras = nrohoras;
	}
	public Materia(String idEspecialidad, String nombre) {
		super(idEspecialidad, nombre);
	}
	public String getNombre() {
		return nombre_materia;
	}
	public void setNombre(String nombre) {
		this.nombre_materia = nombre;
	}
	public String getNrohoras() {
		return nrohoras;
	}
	public void setNrohoras(String nrohoras) {
		this.nrohoras = nrohoras;
	}
	@Override
	public String toString() {
		return "Materia [nombre=" + nombre_materia + ", nrohoras=" + nrohoras + "]";
	}
	

	
}
