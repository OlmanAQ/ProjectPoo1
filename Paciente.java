
import java.util.*;


/**
 * Class Paciente
 */
public class Paciente extends Personas {

  //
  // Fields
  //
  
  private String horaDeaplicacion;

  public ArrayList<PruebasCOVID19> prueba = new ArrayList<>();
  
  //
  // Constructors
  //
  
  public Paciente(String nombre, String cedula,int edad,String correoElectronico,String lugarDeResidencia, String horaDeaplicacion,ArrayList<String> numeroTelefonico,ArrayList<String>padecimientosCronicos) {
    this.nombre=nombre;
    this.cedula=cedula;
    this.edad=edad;
    this.correoElectronico=correoElectronico;
    this.lugarDeResidencia=lugarDeResidencia;
    this.numeroTelefonico=numeroTelefonico;
    this.horaDeaplicacion=horaDeaplicacion;
    this.padecimientosCronicos=padecimientosCronicos;
    
 };
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of horaDeaplicacion
   * @param newVar the new value of horaDeaplicacion
   */
  public void setHoraDeaplicacion (String newVar) {
    horaDeaplicacion = newVar;
  }

  /**
   * Get the value of horaDeaplicacion
   * @return the value of horaDeaplicacion
   */
  public String getHoraDeaplicacion () {
    return horaDeaplicacion;
  }

  /**
   * Add a Prueba object to the prueba List
   */
  public void addPrueba (PruebasCOVID19 pruebas) {
    prueba.add(pruebas);
  }

  /**
   * Remove a Prueba object from pruebaVector List
   */
  public void removePrueba (PruebasCOVID19 new_object)
  {
    prueba.remove(new_object);
  }

public ArrayList<PruebasCOVID19> getPrueba() {
       return prueba;
}


  //
  // Other methods
  //

  /**
   * @return       String
   * @param        padecimiento
   */
  public String addPadecimientosCronicos(String padecimiento)
  {
    return "";
  }
  
	public void setAreaSalud (AreaDeSalud newVar) {
		m_areaSalud = newVar;
	}

	/**
	 * Get the value of m_areaSalud
	 * @return the value of m_areaSalud
	 */
	public AreaDeSalud getAreaSalud () {
		return m_areaSalud;
	}
  public ArrayList<String> getNumeroTelefonico() {
    
    return getNumeroTelefonico();
  }

  public ArrayList<String> getPadecimientosCronicos() {
         return padecimientosCronicos;
  }

  public String toString()
	{
		return(String.format("Nombre: %s\nCedula: %s\nEdad: %s\nCorreo electronico: %s\nLugar de residencia: %s\nNumeros Telefonicos: %s\nPadecimientos cronicos: %s\nHora de aplicacion de la vacuna: %s", 
			this.nombre,this.cedula,this.edad,this.correoElectronico,this.lugarDeResidencia,this.numeroTelefonico, this.padecimientosCronicos, this.horaDeaplicacion));

	}

}
