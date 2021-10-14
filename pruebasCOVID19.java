
import java.util.*;


/**
 * Class pruebasCOVID19
 */
public class pruebasCOVID19 {

  //
  // Fields
  //

  private String diaDeAplicacion;
  private String horaDeAplicacion;
  /**
   * nombre del personal de salud que realizo la prueba
   */
  private String nombredelPersonal;

  public tiposPrueba m_tipo;
  
  //
  // Constructors
  //
  public pruebasCOVID19 () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of diaDeAplicacion
   * @param newVar the new value of diaDeAplicacion
   */
  public void setDiaDeAplicacion (String newVar) {
    diaDeAplicacion = newVar;
  }

  /**
   * Get the value of diaDeAplicacion
   * @return the value of diaDeAplicacion
   */
  public String getDiaDeAplicacion () {
    return diaDeAplicacion;
  }

  /**
   * Set the value of horaDeAplicacion
   * @param newVar the new value of horaDeAplicacion
   */
  public void setHoraDeAplicacion (String newVar) {
    horaDeAplicacion = newVar;
  }

  /**
   * Get the value of horaDeAplicacion
   * @return the value of horaDeAplicacion
   */
  public String getHoraDeAplicacion () {
    return horaDeAplicacion;
  }

  /**
   * Set the value of nombredelPersonal
   * nombre del personal de salud que realizo la prueba
   * @param newVar the new value of nombredelPersonal
   */
  public void setNombredelPersonal (String newVar) {
    nombredelPersonal = newVar;
  }

  /**
   * Get the value of nombredelPersonal
   * nombre del personal de salud que realizo la prueba
   * @return the value of nombredelPersonal
   */
  public String getNombredelPersonal () {
    return nombredelPersonal;
  }

  /**
   * Set the value of m_tipo
   * @param newVar the new value of m_tipo
   */
  public void setTipo (tiposPrueba newVar) {
    m_tipo = newVar;
  }

  /**
   * Get the value of m_tipo
   * @return the value of m_tipo
   */
  public tiposPrueba getTipo () {
    return m_tipo;
  }

  //
  // Other methods
  //

}
