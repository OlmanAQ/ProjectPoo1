

/**
 * Class SintomasCovid
 */
public class SintomasCovid {

  //
  // Fields
  //

  private String sintoma;
  private Infecciones infeccion;
  
  //
  // Constructors
  //
  public SintomasCovid (String sintoma) {
    this.sintoma=sintoma;
   };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of sintoma
   * @param newVar the new value of sintoma
   */
  public void setSintoma (String newVar) {
    sintoma = newVar;
  }

  /**
   * Get the value of sintoma
   * @return the value of sintoma
   */
  public String getSintoma () {
    return sintoma;
  }

  /**
   * Set the value of infeccion
   * @param newVar the new value of infeccion
   */
  public void setInfeccion (Infecciones newVar) {
    infeccion = newVar;
  }

  /**
   * Get the value of infeccion
   * @return the value of infeccion
   */
  public Infecciones getInfeccion () {
    return infeccion;
  }

  //
  // Other methods
  //

}
