
import java.util.*;


/**
 * Class Paciente
 */
public class Paciente extends Personas {

  //
  // Fields
  //

  private String [] padecimientosCronicos;
  private String horaDeaplicacion;

  public ArrayList<PruebasCOVID19> prueba = new ArrayList<>();
  
  //
  // Constructors
  //
  
  public Paciente(String nombre, String cedula,int edad,String correoElectronico,String lugarDeResidencia, String horaDeaplicacion) {
    this.nombre=nombre;
    this.cedula=cedula;
    this.edad=edad;
    this.correoElectronico=correoElectronico;
    this.lugarDeResidencia=lugarDeResidencia;
    
 };
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of padecimientosCronicos_
   * @param newVar the new value of padecimientosCronicos_
   */
public void setPadecimientosCronicos(String[] padecimientosCronicos) {
       this.padecimientosCronicos = padecimientosCronicos;
}

  /**
   * Get the value of padecimientosCronicos_
   * @return the value of padecimientosCronicos_
   */
public String[] getPadecimientosCronicos() {
       return padecimientosCronicos;
}

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

}
