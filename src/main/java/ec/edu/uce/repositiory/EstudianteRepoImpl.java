package ec.edu.uce.repositiory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Estudiante;

@Repository
public class EstudianteRepoImpl implements IEstudianteRepo{

	private static final Logger LOG = LoggerFactory.getLogger(PacienteRepoImpl.class);
		
	@Override
	public void insertar(Estudiante nombre) {
		LOG.info("Se guardo en la base: " + nombre);
		
	}

	@Override
	public void buscarPorUni(String universidad) {
		LOG.info("Se guardo en la base: " + universidad);
		
	}

	@Override
	public void actualizar(Estudiante nombre) {
		LOG.info("Se guardo en la base: " + nombre);
		
	}

	@Override
	public void borrar(String universidad) {
		LOG.info("Se guardo en la base: " + universidad);
		
	}

}
