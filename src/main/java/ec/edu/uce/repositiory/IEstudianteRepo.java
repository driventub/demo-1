package ec.edu.uce.repositiory;

import ec.edu.uce.modelo.Estudiante;
import ec.edu.uce.modelo.Paciente;

public interface IEstudianteRepo {
	void insertar(Estudiante nombre);
	void buscarPorUni(String universidad);
	void actualizar(Estudiante nombre);
	void borrar(String universidad);

}
