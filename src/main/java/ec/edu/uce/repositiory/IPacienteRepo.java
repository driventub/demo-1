package ec.edu.uce.repositiory;

import ec.edu.uce.modelo.Paciente;

public interface IPacienteRepo {
	void insertar(Paciente paciente);
	void buscarPorCedula(String cedula);
	void actualizar(Paciente paciente);
	void borrar(String cedula);
}	