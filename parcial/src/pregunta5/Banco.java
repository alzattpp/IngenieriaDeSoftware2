package pregunta5;

public class Banco {
	List<Cuenta> cuentas;
	public Banco(List<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}
	public Banco(){}
	public List<Cuenta> getCuentas(){
		return cuentas;
	}
	public void setCuentas()List<Cuenta> cuentas){
		this.cuentas = cuentas;
	}
	public void depositar(String numeroCuenta, double cantidad) {
		if (cantidad <= 0) {
			throw new IllegalArgumentEcxeption("LA CANTIDAD DEBE SER MAYOR QUE 0");
		}
		for(Cuenta cuenta: cuentas) {
			if(cuenta.getNumeroCuenta.equals(numeroCuenta)) {
				double saldo = cuenta.getSaldo()+cantidad;
				cuenta.setSaldo(saldo);
				return;
			}
		}
		throw new IllegalArgumentException("NO EXISTE EL NUMERO DE CUENTA");
	}
	public void retirar(String numeroCuenta, double cantidad) {
		if (cantidad <=0) {
			throw new IllegalArgumentException("LA CANTIDAD DEBE SER MAYOR A 0");
		}
		for(Cuenta cuenta: cuentas) {
			if(cuenta.getNumeroCuenta().equals(numeroCuenta)) {
				if(cantidad > cuenta.getSaldo()) {
					throw new IllegalArgumentsExeption("FONDOS INSUFICIIENTES");
					
				}
			}
		}
	}