package bancoAlkeWalet;
import java.util.Scanner;
public class Entrada {

	public static void main (String []args) {
		
		String nombre;
		String apellido;
		String rut;
		String celular;
		String direccion;
		String email;
		
		int tipoDeTransaccion;
		double cantidad = 0;
		
		int numeroDeCuenta;
		double saldo;
		
		int respuesta;
		
		try (Scanner Entrada = new Scanner(System.in);
				Scanner sc = new Scanner(System.in)) {
			System.out.println("*******************************************************");
			System.out.println("|**********-BIENVENIDO CLIENTE ALKE WALLET-************");
			System.out.println("-------------------------------------------------------");
			
			System.out.println("***- iNGRESO DE DATOS DEL CLIENTE N°1 -***");
			
			System.out.println("Ingrese el nombre: ");
			nombre= Entrada.next();
			
			System.out.println("Ingrese el apellido: ");
			apellido= Entrada.next();
			
			System.out.println("Ingrese el Rut: ");
			rut= Entrada.next();
			
			System.out.println("Ingrese el celular: ");
			celular= Entrada.next();
					
			System.out.println("Ingrese la direccion: ");
			direccion= Entrada.next();
			
			System.out.println("Ingrese el email: ");
			email= Entrada.next();
			
			
			
			System.out.println("********************************************************");
			System.out.println("Ingrese el saldo del cliente N°.1: ");
			saldo= Entrada.nextDouble();
			
			System.out.println("Ingrese el numero de cuenta del cliente N°.1: ");
			numeroDeCuenta= Entrada.nextInt();
			
			
			cliente C1 = new cliente (nombre, apellido,rut ,celular ,direccion, email);
			Cuenta  c1 = new Cuenta (numeroDeCuenta, saldo);
			
			System.out.println("\n");
			
			
			System.out.println("*******************************************************");
			
			System.out.println("--- Registro de datos del cliente N°.2 -----");
			System.out.println("Ingrese el nombre:");
			nombre= Entrada.next();
					
			System.out.println("Ingrese el apellido: ");
			apellido= Entrada.next();
			
			System.out.println("Ingrese el rut: ");
			rut= Entrada.next();
			
			System.out.println("Ingrese el celular: ");
			celular= Entrada.next();
			
			System.out.println("Ingrese la direccion: ");
			direccion= Entrada.next();
			
			System.out.println("Ingrese el email: ");
			email= Entrada.next();
			
			
			System.out.println("*****************************************************");
			System.out.println("Ingrese el saldo inicial del cliente N°.2: ");
			saldo= Entrada.nextDouble();
			
			System.out.println("Ingrese el numero de cuenta del cliente N°.2: ");
			numeroDeCuenta =Entrada.nextInt();
			
			//CONSTRUCTORESS//
			cliente C2 = new cliente (nombre, apellido,rut, celular, direccion, email);
			Cuenta  c2 = new Cuenta (numeroDeCuenta, saldo);
			
			System.out.println("\n");
			
			System.out.println("*******************************************************");
			System.out.println("--------------------TRANSACCIONES----------------------");
			System.out.println("*******************************************************");
			
			//ClIENTE 1 //
			respuesta = 1;
			while(respuesta != 2) {
				
			System.out.println("**********- CLIENTE N°.1-*************");
			
			System.out.println("Tipo de transaccion del cliente N°.1:  [1-Deposito -o- 2-Retirar]: ");
			tipoDeTransaccion=sc.nextInt();
			
			System.out.println("Monto de la transaccion del cliente N°.1: ");
			cantidad = sc.nextDouble();
			
			c1.transaccion(cantidad, tipoDeTransaccion);
			
			
			System.out.println("*******************************************************");
			c1.consultaTrasacc();
			System.out.println("*******************************************************");
			
			
			System.out.println("Desea resgistrar otra transaccion para el cliente N°. 1? [1-SI -O- 2-NO]: ");
			respuesta = sc.nextInt();
			
			}
			
			System.out.println("\n");
			
			System.out.println("********** -CLIENTE N°. 2- ***********");
			respuesta =1;
			while(respuesta != 2 ) {
				
			System.out.println("Tipo de transaccion del cliente N°2: [1-Depósito -o- 2-Retirar]: ");
			tipoDeTransaccion=sc.nextInt();
			
			System.out.println("Monto de transaccion del cliente N°.2: ");
			cantidad = sc.nextDouble();
			
			c2.transaccion(cantidad, tipoDeTransaccion);
			
			System.out.println("*************************************************************************");
			c2.consultaTrasacc();
			System.out.println("*************************************************************************");
			System.out.println("Necesita registrar otra transaccion para el cliente N°2 [1-SI -0-  2-NO]:");
			respuesta=sc.nextInt();
			}
			
			System.out.println("\n");
			
			System.out.println("**************************************************************************");
			
			C1.consultar();
			c1.Consultar();
			
			C2.consultar();
			c2.Consultar();

	}
	}
}
	
