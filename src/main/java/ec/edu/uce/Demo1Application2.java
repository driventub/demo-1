package ec.edu.uce;

import java.math.BigDecimal;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.modelo.Cuenta;
import ec.edu.uce.modelo.Estudiante;
import ec.edu.uce.modelo.Paciente;
import ec.edu.uce.service.ICuentaService;
import ec.edu.uce.service.IEstudianteService;
import ec.edu.uce.service.IPacienteService;
import ec.edu.uce.service.scope.IMatriculaPrototypeService;
import ec.edu.uce.service.scope.IMatriculaSingletonService;

@SpringBootApplication
public class Demo1Application2 implements CommandLineRunner{
	
	@Autowired
	private IMatriculaSingletonService objeto1;
	
	@Autowired
	private IMatriculaSingletonService objeto2;
	
	
	//Scope Prototype
	
	private IMatriculaPrototypeService p1;
	private IMatriculaPrototypeService p2;
	
	private static final Logger LOG= LogManager.getLogger(Demo1Application2.class);
	
	public static void main(String[] args) {
		SpringApplication.run(Demo1Application2.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOG.info("Impresion valor del objeto");
		this.objeto1.establecerValor("Valor");
		LOG.info(this.objeto1.getCodigo());
		
		LOG.info(this.objeto2.getCodigo());
		
		
		LOG.info("**********Prototype*************");
		this.p1.establecerNombre("Other");
		LOG.info(this.p1.obtenerNombre());
		this.p2.establecerNombre("Other2");
		LOG.info(this.p2.obtenerNombre());
		LOG.info(this.p1.obtenerNombre());
	
	}

}
