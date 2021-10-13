
import java.util.*;


/**
 * Class ampliacionDeOrdenSanitaria
 */
public class AmpliacionDeOrdenSanitaria {

  //
  // Fields
  //

  private String nuevafechaInicio;
  private String nuevaFechaFinalizacion;
  private String motivo;

  public OrdenSanitaria m_orden;
  
  //
  // Constructors
  //
  public AmpliacionDeOrdenSanitaria () 
  { 
    
  };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of nuevafechaInicio
   * @param newVar the new value of nuevafechaInicio
   */
  public void setNuevafechaInicio (String newVar) {
    nuevafechaInicio = newVar;
  }

  /**
   * Get the value of nuevafechaInicio
   * @return the value of nuevafechaInicio
   */
  public String getNuevafechaInicio () {
    return nuevafechaInicio;
  }

  /**
   * Set the value of nuevaFechaFinalizacion
   * @param newVar the new value of nuevaFechaFinalizacion
   */
  public void setNuevaFechaFinalizacion (String newVar) {
    nuevaFechaFinalizacion = newVar;
  }

  /**
   * Get the value of nuevaFechaFinalizacion
   * @return the value of nuevaFechaFinalizacion
   */
  public String getNuevaFechaFinalizacion () {
    return nuevaFechaFinalizacion;
  }

  /**
   * Set the value of motivo
   * @param newVar the new value of motivo
   */
  public void setMotivo (String newVar) {
    motivo = newVar;
  }

  /**
   * Get the value of motivo
   * @return the value of motivo
   */
  public String getMotivo () {
    return motivo;
  }

  /**
   * Set the value of m_orden
   * @param newVar the new value of m_orden
   */
  public void setOrden (OrdenSanitaria newVar) {
    m_orden = newVar;
  }

  /**
   * Get the value of m_orden
   * @return the value of m_orden
   */
  public OrdenSanitaria getOrden () {
    return m_orden;
  }

  //
  // Other methods
  //

}
