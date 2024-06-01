package bancoAlkeWalet;

public class cliente {
	private String nombre;
	private String apellido;
	private String rut;
	private String celular;
	private String direccion;
	private String email;
	
	public cliente (String nombre, String apellido,String rut, String celular, String direccion,String email) {
		  this.nombre= nombre;
		  this.apellido= apellido;
		  this.rut= rut;
		  this.celular= celular;
		  this.direccion= direccion;
		  this.email= email;
	}
    public String getNombre() {
    	return nombre;
    }
   public void setnombre(String nombre) {
	    this.nombre=nombre;   }
   
    public String getApellido() {
    	return apellido;
   }
    
    public void setApellido(String apellido) {
	   this.apellido= apellido;
   }
   
    public String getRut() {
    	return rut;
    }
    
    public void setRut(String rut) {
    	this.rut= rut;
    }
   
   public String getCelular() {
	   return celular;
	   
   }
   
   public void setCelular(String celular) {
	   this.celular = celular;
	   
   }
   
   public String getDireccion() {
	   return direccion;
   }
   
   public void setDireccion(String direccion) {
	   this.direccion = direccion;
   }
	public String getEmail () {
		return email;	
   }
   public void setEmail(String email) {
	   this.email = email;
   }
   
   public void consultar() {
	   System.out.println("El propietario: " + nombre +" "+ apellido);
   }

}
   