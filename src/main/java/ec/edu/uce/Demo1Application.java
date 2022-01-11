package ec.edu.uce;

import java.math.BigDecimal;

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

@SpringBootApplication
public class Demo1Application implements CommandLineRunner{
	//debo marcarla con metadatos (Estereotipo), la cals que deseo que me inyecte el contenedor 
//	private IPacienteService pacienteService = new PacienteServiceImpl(); no se debe
	@Autowired
	private IPacienteService pacienteService;
	
	@Autowired
	private IEstudianteService estudianteService;
	
	@Autowired
	private ICuentaService cuentaService;
	
	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Paciente miPaciente = new Paciente();
//		miPaciente.setNombre("Paulo");//Lo tome de mi pagina web
//		miPaciente.setApellido("Aldaz");
//		miPaciente.setEdad(32);
//		this.pacienteService.guardarPaciente(miPaciente);
//		miPaciente.setEdad(33);
//		this.pacienteService.actualizarPaciente(miPaciente);
//		this.pacienteService.borrarPaciente("1234567890");
//		
//		Estudiante miEstudiante = new Estudiante();
//		miEstudiante.setNombre("Paulo");
//		miEstudiante.setApellido("Apellido");
//		miEstudiante.setUniversidad("UCE");
//		this.estudianteService.guardarEstudiante(miEstudiante);
//		miEstudiante.setUniversidad("PUCE");
//		this.estudianteService.actualizarEstudiante(miEstudiante);
//		this.estudianteService.borrarEstudiante("Paulo");
		
		Cuenta cuenta = new Cuenta();
		cuenta.setNumero("1234566");
		cuenta.setSaldo(new BigDecimal("10.82"));
		
		this.cuentaService.ingresarCuentaHabiente(cuenta);
	}

}
