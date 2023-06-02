package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Estudiante;

public interface EstudianteService {
	
	public void guardar(Estudiante estudiante);
	public void actualizar(Estudiante estudiante);
	//buscamos por identificador cedula
	public Estudiante buscarPorCedula(String cedula);
	//eliminar por cedula identificador
	public void borrar(String cedula);

	
	public List<Estudiante> reporteDeTodos();

}
