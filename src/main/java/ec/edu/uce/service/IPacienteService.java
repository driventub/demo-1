package ec.edu.uce.service;

import ec.edu.uce.modelo.Paciente;

public interface IPacienteService {
	void calcularDeuda();
	void guardarPaciente(Paciente paciente);
	void buscarPaciente(String cedula);
	void actualizarPaciente(Paciente paciente);
	void borrarPaciente(String cedula);
}
