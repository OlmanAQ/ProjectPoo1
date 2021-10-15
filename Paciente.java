/** 
 * Describe las características y metodos de un objeto paciente
 * @author Kevelyn Yuliana Gonzales Paizano 
 * @author Olman Alonso Acuña Quesada 
 * @author Deyanira Maradiaga Villagra 
 * 
*/

import java.util.*;


/**
 * Class Paciente
 */
public class Paciente extends Personas {

  //Espacio para definicion de atributos 

  /**Hora de aplicación de la prueba */
  private String horaDeaplicacion;
  /**Lista de arreglos que almacena las pruebas */
  public ArrayList<PruebasCOVID19> prueba = new ArrayList<>();
  
  //
  // Constructors
  //
  /**
   * Constructor de Paciente
   * @param nombre
   * @param cedula
   * @param edad
   * @param correoElectronico
   * @param lugarDeResidencia
   * @param horaDeaplicacion
   * @param numeroTelefonico
   * @param padecimientosCronicos
   */
  public Paciente(String nombre, String cedula,int edad,String correoElectronico,String lugarDeResidencia, String horaDeaplicacion, ArrayList<String> numeroTelefonico,ArrayList<String>padecimientosCronicos) {
    this.nombre=nombre;
    this.cedula=cedula;
    this.edad=edad;
    this.correoElectronico=correoElectronico;
    this.lugarDeResidencia=lugarDeResidencia;
    this.numeroTelefonico=numeroTelefonico;
    this.horaDeaplicacion=horaDeaplicacion;
    this.padecimientosCronicos=padecimientosCronicos;
    
 };
  //Espacio de metodos

    //*************************Getter's********************************
    
    /**
     * Getter  de la hora de la prueba 
     * @return ()   */ 
  
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
  //*************************Setter's********************************

    /**
     * Setter Asigna el area de salud
     * @param newVar nueva area 
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
   * Saca lista de telefonos
   */
  public ArrayList<String> getNumeroTelefonico() {
    
    return getNumeroTelefonico();
  }
  /**
   *Saca padecimientos del paciente
   */
  public ArrayList<String> getPadecimientosCronicos() {
         return padecimientosCronicos;
  }
  /**Imprime los atributos de la clase */
  public String toString()
	{
		return(String.format("Nombre: %s\nCedula: %s\nEdad: %s\nCorreo electronico: %s\nLugar de residencia: %s\nNumeros Telefonicos: %s\nPadecimientos cronicos: %s\nHora de aplicacion de la vacuna: %s", 
			this.nombre,this.cedula,this.edad,this.correoElectronico,this.lugarDeResidencia,this.numeroTelefonico, this.padecimientosCronicos, this.horaDeaplicacion));

	}

}
