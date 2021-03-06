/** 
 * Describe las características y metodos de un objeto paciente
 * @author Kevelyn Yuliana Gonzales Paizano 
 * @author Olman Alonso Acuña Quesada 
 * @author Deyanira Maradiaga Villagra 
 * 
*/
import java.util.ArrayList;

//import java.util.*;


/**
 * Class PacientePositivo
 */
public class PacientePositivo extends Personas {

 

  /**
   * fecha de aparicion de sintomas
   */
  private String fechaAparicionSintomas;
  private String modoDeContacto;
 // public Vector infeccionVector = new Vector();

 // public Vector contactoVector = new Vector();
  
  //
  // Constructors
  //
  /**
   * 
   * @param nombre
   * @param cedula
   * @param edad
   * @param correoElectronico
   * @param lugarDeResidencia
   * @param fechaAparicionSintomas
   * @param modoDeContacto
   * @param numeroTelefonico
   * @param padecimientosCronicos
   */
  public PacientePositivo(String nombre, String cedula,int edad,String correoElectronico,String lugarDeResidencia,String fechaAparicionSintomas,String modoDeContacto,ArrayList<String> numeroTelefonico,ArrayList<String>padecimientosCronicos) {
      this.nombre=nombre;
      this.cedula=cedula;
      this.edad=edad;
      this.correoElectronico=correoElectronico;
      this.lugarDeResidencia=lugarDeResidencia;
      this.modoDeContacto=modoDeContacto;
      this.numeroTelefonico=numeroTelefonico;
      this.padecimientosCronicos=padecimientosCronicos;
   };
  
  //
  // Methods
  //

  /**
   * Set the value of fechaAparicionSintomas
   * fecha de aparicion de sintomas
   * @param newVar the new value of fechaAparicionSintomas
   */
  public void setFechaAparicionSintomas (String newVar) {
    fechaAparicionSintomas = newVar;
  }

 //*************************Getter's********************************
    
  /**
   * Get the value of fechaAparicionSintomas
   * fecha de aparicion de sintomas
   * @return the value of fechaAparicionSintomas
   */
  public String getFechaAparicionSintomas () {
    return fechaAparicionSintomas;
  }
   /**
   * Get the value of modoDeContacto
   * @return the value of modoDeContacto
   */
  public String getModoDeContacto () {
    return modoDeContacto;
  }
 //*************************Setter's********************************
    
  /**
   * Set the value of modoDeContacto
   * @param newVar the new value of modoDeContacto
   */
  public void setModoDeContacto (String newVar) {
    modoDeContacto = newVar;
  }

 

  /**
   * Add a Infeccion object to the infeccionVector List
   
  public void addInfeccion (infecciones new_object) {
    infeccionVector.add(new_object);
  }
*/
  /**
   * Remove a Infeccion object from infeccionVector List
  
  public void removeInfeccion (infecciones new_object)
  {
    infeccionVector.remove(new_object);
  }
 */
  /**
   * Get the List of Infeccion objects held by infeccionVector
   * @return List of Infeccion objects held by infeccionVector
  
  public List getInfeccionList () {
    return (List) infeccionVector;
  }
 */

  /**
   * Add a Contacto object to the contactoVector List
  
  public void addContacto (Contactos new_object) {
    contactoVector.add(new_object);
  }
 */
  /**
   * Remove a Contacto object from contactoVector List
  
  public void removeContacto (Contactos new_object)
  {
    contactoVector.remove(new_object);
  }
 */
  /**
   * Get the List of Contacto objects held by contactoVector
   * @return List of Contacto objects held by contactoVector

  public List getContactoList () {
    return (List) contactoVector;
  }
   */
  	/**
	 * Set the value of m_areaSalud
	 * @param newVar the new value of m_areaSalud
	 */
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

/**
 * Saca la lista de numeros de telefonicos
 */
public ArrayList<String> getNumeroTelefonico() {
 
  return getNumeroTelefonico();
}

  //
  // Other methods
  //
  /**
   * Imprime los atributos de paciente
   */
  public String toString()
	{
		return(String.format("Nombre: %s\nCedula: %s\nEdad: %s\nCorreo electronico: %s\nLugar de residencia: %s\nNumeros Telefonicos: %s\nPadecimientos cronicos: %s", 
			this.nombre,this.cedula,this.edad,this.correoElectronico,this.lugarDeResidencia,this.numeroTelefonico, this.padecimientosCronicos));

	}

}
