package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Paciente;
import ec.edu.uce.repositiory.IPacienteRepo;
import ec.edu.uce.repositiory.PacienteRepoImpl;

@Service
public class PacienteServiceImpl implements IPacienteService {
	
//	Desacoplamos con Spring
//	private PacienteRepoImpl paciente = new  PacienteRepoImpl();
//	Declarar la interfaz de la clase que quiero utilizar
	
	
	@Autowired
	private IPacienteRepo paciente;
	@Override
	public void calcularDeuda() {
		//Traer la base de la deuda, logica 
	
		
	}

	@Override
	public void guardarPaciente(Paciente paciente) {
		// TODO Auto-generated method stub
		this.paciente.insertar(paciente);
	}

	@Override
	public void buscarPaciente(String cedula) {
		this.paciente.buscarPorCedula(cedula);
		
	}

	@Override
	public void actualizarPaciente(Paciente paciente) {
		this.paciente.actualizar(paciente);
		
	}

	@Override
	public void borrarPaciente(String cedula) {
		this.paciente.borrar(cedula);
		
	}

}
