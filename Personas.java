import java.util.ArrayList;

/**
 * Class Personas
 */
abstract public class Personas {
  //
  // Fields
  //
  //nombre de la persona
  protected String nombre;
  protected String cedula;
  protected int edad;
  protected ArrayList<String> numeroTelefonico;
  protected ArrayList<String> padecimientosCronicos;
  protected String correoElectronico;
  protected String lugarDeResidencia;
  protected ArrayList<SintomasCovid> sintoma;

  public AreaDeSalud m_areaSalud;
  
  //
  // Constructors
  // NO SE HA AGREGADO NUMEROS TELEFONICOS NI SINTOMAS AL CONSTRUCTOR 
  public Personas ( ) { 
  };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of nombre
   * @param newVar the new value of nombre
   */
  public void setNombre (String newVar) {
    nombre = newVar;
  }

  /**
   * Get the value of nombre
   * @return the value of nombre
   */
  public String getNombre () {
    return nombre;
  }

  /**
   * Set the value of cedula
   * @param newVar the new value of cedula
   */
  public void setCedula (String newVar) {
    cedula = newVar;
  }

  /**
   * Get the value of cedula
   * @return the value of cedula
   */
  public String getCedula () {
    return cedula;
  }

  /**
   * Set the value of edad
   * @param newVar the new value of edad
   */
  public void setEdad (int newVar) {
    edad = newVar;
  }

  /**
   * Get the value of edad
   * @return the value of edad
   */
  public int getEdad () {
    return edad;
  }

  /**
   * Set the value of correoElectronico
   * @param newVar the new value of correoElectronico
   */
  public void setCorreoElectronico (String newVar) {
    correoElectronico = newVar;
  }

  /**
   * Get the value of correoElectronico
   * @return the value of correoElectronico
   */
  public String getCorreoElectronico () {
    return correoElectronico;
  }

  /**
   * Set the value of lugarDeResidencia
   * @param newVar the new value of lugarDeResidencia
   */
  public void setLugarDeResidencia (String newVar) {
    lugarDeResidencia = newVar;
  }

  /**
   * Get the value of lugarDeResidencia
   * @return the value of lugarDeResidencia
   */
  public String getLugarDeResidencia () {
    return lugarDeResidencia;
  }

  public ArrayList<SintomasCovid> getSintoma() {
         return sintoma;
  }

  public void setSintoma(ArrayList<SintomasCovid> sintoma) {
         this.sintoma = sintoma;
  }

  

  //
  // Other methods
  //

  /**
   * @return       String
   */
  public String modificar()
  {
    return "";
  }


  /**
   * @return       int
   */
  public int addtelefonos()
  {
    return 1;
  }


  /**
   * @return       String
   */
  public String addSintoma()
  {
    return "";
  }


  /**
   * @return       String
   */
  public String historialPaciente()
  {
    return "";
  }


  /**
   * @return       int
   */
  public int registroCantPersona()
  {
    return 1;
  }


  /**
   * @return       String
   */
  public String listadoSintomas()
  {
    return "";
  }

  	/**
	 * @return       String
	 */
	public String obtenerEstado()
	{
		return this.getClass().getName();
	}

  public ArrayList<String> getNumeroTelefonico() {
         return numeroTelefonico;
  }
  public ArrayList<String> getPadecimientosCronicos() {
         return padecimientosCronicos;
  }

  public void agregar(SintomasCovid sintomas){
       
    sintoma.add(sintomas);
    
  }

}
