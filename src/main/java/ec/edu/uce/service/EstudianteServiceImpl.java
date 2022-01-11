package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Estudiante;
import ec.edu.uce.repositiory.IEstudianteRepo;


@Service
public class EstudianteServiceImpl implements IEstudianteService{
	
	@Autowired
	private IEstudianteRepo estudiante;
	@Override
	public void mostrarApellido() {
		
		
	}

	@Override
	public void guardarEstudiante(Estudiante nombre) {
		this.estudiante.insertar(nombre);
		
	}

	@Override
	public void buscarEstudiante(String universidad) {
		this.estudiante.buscarPorUni(universidad);
		
	}

	@Override
	public void actualizarEstudiante(Estudiante nombre) {
		this.estudiante.actualizar(nombre);
		
	}

	@Override
	public void borrarEstudiante(String universidad) {
		this.estudiante.borrar(universidad);
		
	}

}
