package ec.edu.uce.repositiory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Cuenta;


@Repository
@Qualifier("ahorros") 
public class CuentaAhorrosRepoImpl implements ICuentaRepo{
	
	private static final Logger LOG= LogManager.getLogger(CuentaAhorrosRepoImpl.class);
	
	
	
	@Override
	public void crearCuenta(Cuenta c) {
		LOG.info("Se ha ingresado una nueva cuenta en MySQL" + c);
		
	}
	
}
