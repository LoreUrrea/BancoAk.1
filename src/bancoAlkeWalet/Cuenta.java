package bancoAlkeWalet;

public class Cuenta {


	private int numeroDeCuenta;
	private double saldo =0;
	
	
	String tipoTransacciones;
	
	public Cuenta (int numeroDeCuenta, double saldo) {
		this.numeroDeCuenta= numeroDeCuenta;
		this.saldo= saldo;
	}
	
    public void transaccion(double cantidad, int tipoTransaccion) {
    	

    if (tipoTransaccion == 1) {
    	this.saldo += cantidad;
    	
    	tipoTransacciones="Deposito";
    }
    
    //Retiro//
    if(tipoTransaccion == 2) {
    	if (this.saldo < cantidad ) {    
    		System.out.println("Error; NO tiene Fondos");
    			
    	}else {
    		this.saldo -= cantidad;
    		tipoTransacciones ="Retiro";
    		
    	}
}
    
  if(tipoTransaccion == 0) {
	  System.out.println("ERROR");
  }
}
  public void consultaTrasacc() {
	  System.out.println("El tipo de transaccion fue:"+tipoTransacciones+ "Con el nuevo saldo: Pesos."+ saldo);
  }
  public void Consultar() {
	  System.out.println("con el numero de Cuenta: " + numeroDeCuenta + " con un saldo de: pesos" + saldo);

	
}
  }