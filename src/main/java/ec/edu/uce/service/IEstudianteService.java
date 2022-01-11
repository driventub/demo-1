package ec.edu.uce.service;

import ec.edu.uce.modelo.Estudiante;


public interface IEstudianteService {
	void mostrarApellido();
	void guardarEstudiante(Estudiante nombre);
	void buscarEstudiante(String universidad);
	void actualizarEstudiante(Estudiante nombre);
	void borrarEstudiante(String universidad);
}
