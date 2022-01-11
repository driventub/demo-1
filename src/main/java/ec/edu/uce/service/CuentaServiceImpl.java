
package ec.edu.uce.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Cuenta;
import ec.edu.uce.repositiory.ICuentaRepo;


@Service
public class CuentaServiceImpl implements ICuentaService{
	
	private static final Logger LOG= LogManager.getLogger(CuentaServiceImpl.class);
	
	@Autowired
	@Qualifier("ahorros")
	private ICuentaRepo cuentaRepoA;
	
	@Autowired
	@Qualifier("corriente")
	private ICuentaRepo cuentaRepo;
	
	

	@Override
	public void ingresarCuentaHabiente(Cuenta c) {
		LOG.info("Aqui se guarda el cliente");
		this.cuentaRepo.crearCuenta(c);
		
		if(c.getNumero().contains("12")) {
			this.cuentaRepo.crearCuenta(c);
		}else {
			this.cuentaRepoA.crearCuenta(c);
		}
		
		
	}
	
}
