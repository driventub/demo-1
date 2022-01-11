package ec.edu.uce.service.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author Cesarines
 *
 */

@Service
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class MatriculaSingletonServiceImpl implements IMatriculaSingletonService {
	private String codigo;
	
	@Override
	public String establecerValor(String valor) {
		this.codigo = valor;
		return this.codigo;
	}
	
	
	//Setters y Getters
	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
	
}
