
import java.util.*;


/**
 * Class Paciente
 */
public class Paciente extends Personas {

  //
  // Fields
  //

  private String padecimientosCronicos_;
  private String horaDeaplicacion;

  public Vector pruebaVector = new Vector();
  
  //
  // Constructors
  //
  public Paciente () { };
  
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
  public void setPadecimientosCronicos_ (String newVar) {
    padecimientosCronicos_ = newVar;
  }

  /**
   * Get the value of padecimientosCronicos_
   * @return the value of padecimientosCronicos_
   */
  public String getPadecimientosCronicos_ () {
    return padecimientosCronicos_;
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
   * Add a Prueba object to the pruebaVector List
   */
  public void addPrueba (pruebasCOVID19 new_object) {
    pruebaVector.add(new_object);
  }

  /**
   * Remove a Prueba object from pruebaVector List
   */
  public void removePrueba (pruebasCOVID19 new_object)
  {
    pruebaVector.remove(new_object);
  }

  /**
   * Get the List of Prueba objects held by pruebaVector
   * @return List of Prueba objects held by pruebaVector
   */
  public List getPruebaList () {
    return (List) pruebaVector;
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


}
