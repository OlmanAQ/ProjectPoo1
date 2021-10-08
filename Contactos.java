

/**
 * Class Contactos
 */
public class Contactos extends Personas {

  //
  // Fields
  //

  /**
   * Si es parte de la familia contagiada,etc.
   */
  private String gradoDeContacto;
  
  //
  // Constructors
  //
  public Contactos () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of gradoDeContacto
   * Si es parte de la familia contagiada,etc.
   * @param newVar the new value of gradoDeContacto
   */
  public void setGradoDeContacto (String newVar) {
    gradoDeContacto = newVar;
  }

  /**
   * Get the value of gradoDeContacto
   * Si es parte de la familia contagiada,etc.
   * @return the value of gradoDeContacto
   */
  public String getGradoDeContacto () {
    return gradoDeContacto;
  }

  //
  // Other methods
  //

}
