

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
  public Contactos (String nombre, String cedula,int edad,String correoElectronico,String lugarDeResidencia, String gradodeContacto) 
  {
    this.nombre=nombre;
    this.cedula=cedula;
    this.edad=edad;
    this.correoElectronico=correoElectronico;
    this.lugarDeResidencia=lugarDeResidencia;
    this.gradoDeContacto= gradoDeContacto;
  };
  
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
