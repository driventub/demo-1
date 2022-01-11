package ec.edu.uce.modelo;

import java.math.BigDecimal;

public class Cuenta {
	private String numero;
//	private double saldo; //Cuando vamos a manejar valores monetarios NO double
	private BigDecimal saldo;
	
	
	
@Override
	public String toString() {
		return "Cuenta [numero=" + numero + ", saldo=" + saldo + "]";
	}
	//	Metodo SET y GET
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public BigDecimal getSaldo() {
		return saldo;
	}
	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
	
	
	
}
