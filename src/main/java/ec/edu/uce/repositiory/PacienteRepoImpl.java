package ec.edu.uce.repositiory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Paciente;

@Repository
public class PacienteRepoImpl implements IPacienteRepo {
	
	private static final Logger LOG = LoggerFactory.getLogger(PacienteRepoImpl.class);
	
	@Override
	public void insertar(Paciente paciente) {
		LOG.info("Se guardo en la base: " + paciente);
		
		
	}

	@Override
	public void buscarPorCedula(String cedula) {
//		System.out.println("Buscando a : " + cedula);
//		LOG.fatal("Se ha producido un error fatal");
		
		
		LOG.info("Se busco en la base: " + cedula);
	}

	@Override
	public void actualizar(Paciente paciente) {
//		System.out.println("Actualizando a : "+  paciente);
		LOG.info("Se actualizo en la base: " + paciente);
	}

	@Override
	public void borrar(String cedula) {
//		System.out.println("Borrando a : " + cedula); no syso
		LOG.info("Se borro en la base: " + cedula);
	}

}
