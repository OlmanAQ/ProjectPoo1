import java.util.LinkedList;
import java.util.List;

/**
 * Class AreaDeSalud
 */
public class AreaDeSalud {

  //
  // Fields
  //

  /**
   * nombre del area de salud
   */
  private String nombre;
  private String personaDirectora;
  private int[] numerostelefonicos;
  private String direccion;
  private String areaDeAtraccion;
  private Personas pacientes;
  
  //
  // Constructors
  //
  public AreaDeSalud (String nombre, String personaDirectora, int numerotelefonico, String direccion, String areaDeAtraccion, Personas pacientes,int[] numerostelefonicos) 
  { 
    this.areaDeAtraccion=areaDeAtraccion; 
    this.numerostelefonicos = numerostelefonicos;

    
  };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of nombre
   * nombre del area de salud
   * @param newVar the new value of nombre
   */
  public void setNombre (String newVar) {
    nombre = newVar;
  }

  /**
   * Get the value of nombre
   * nombre del area de salud
   * @return the value of nombre
   */
  public String getNombre () {
    return nombre;
  }

  /**
   * Set the value of personaDirectora
   * @param newVar the new value of personaDirectora
   */
  public void setPersonaDirectora (String newVar) {
    personaDirectora = newVar;
  }

  /**
   * Get the value of personaDirectora
   * @return the value of personaDirectora
   */
  public String getPersonaDirectora () {
    return personaDirectora;
  }

  /**
   * Set the value of numerotelefonico_
   * @param newVar the new value of numerotelefonico_
   */
  public void setNumerostelefonicos(int[] numerostelefonicos) {
      this.numerostelefonicos = numerostelefonicos;
  }


  /**
   * Get the value of numerotelefonico_
   * @return the value of numerotelefonico_
   */
 public int[] getNumerostelefonicos() {
     return numerostelefonicos;
 }

  /**
   * Set the value of direccion
   * @param newVar the new value of direccion
   */
  public void setDireccion (String newVar) {
    direccion = newVar;
  }

  /**
   * Get the value of direccion
   * @return the value of direccion
   */
  public String getDireccion () {
    return direccion;
  }

  /**
   * Set the value of areaDeAtraccion
   * @param newVar the new value of areaDeAtraccion
   */
  public void setAreaDeAtraccion (String newVar) {
    areaDeAtraccion = newVar;
  }

  /**
   * Get the value of areaDeAtraccion
   * @return the value of areaDeAtraccion
   */
  public String getAreaDeAtraccion () {
    return areaDeAtraccion;
  }

  /**
   * Set the value of pacientes
   * @param newVar the new value of pacientes
   */
  public void setPacientes (Personas newVar) {
    pacientes = newVar;
  }

  /**
   * Get the value of pacientes
   * @return the value of pacientes
   */
  public Personas getPacientes () {
    return pacientes;
  }

  //
  // Other methods
  //

  /**
   * @return       String
   */
  public String calcularEstadistica(){
    
    return "";
  }


}
