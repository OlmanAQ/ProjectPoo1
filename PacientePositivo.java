
import java.util.*;


/**
 * Class PacientePositivo
 */
public class PacientePositivo extends Personas {

  //
  // Fields
  //

  /**
   * fecha de aparicion de sintomas
   */
  private String fechaAparicionSintomas;
  private String modoDeContacto;

  public Vector infeccionVector = new Vector();

  public Vector contactoVector = new Vector();
  
  //
  // Constructors
  //
  public PacientePositivo () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of fechaAparicionSintomas
   * fecha de aparicion de sintomas
   * @param newVar the new value of fechaAparicionSintomas
   */
  public void setFechaAparicionSintomas (String newVar) {
    fechaAparicionSintomas = newVar;
  }

  /**
   * Get the value of fechaAparicionSintomas
   * fecha de aparicion de sintomas
   * @return the value of fechaAparicionSintomas
   */
  public String getFechaAparicionSintomas () {
    return fechaAparicionSintomas;
  }

  /**
   * Set the value of modoDeContacto
   * @param newVar the new value of modoDeContacto
   */
  public void setModoDeContacto (String newVar) {
    modoDeContacto = newVar;
  }

  /**
   * Get the value of modoDeContacto
   * @return the value of modoDeContacto
   */
  public String getModoDeContacto () {
    return modoDeContacto;
  }

  /**
   * Add a Infeccion object to the infeccionVector List
   */
  public void addInfeccion (infecciones new_object) {
    infeccionVector.add(new_object);
  }

  /**
   * Remove a Infeccion object from infeccionVector List
   */
  public void removeInfeccion (infecciones new_object)
  {
    infeccionVector.remove(new_object);
  }

  /**
   * Get the List of Infeccion objects held by infeccionVector
   * @return List of Infeccion objects held by infeccionVector
   */
  public List getInfeccionList () {
    return (List) infeccionVector;
  }


  /**
   * Add a Contacto object to the contactoVector List
   */
  public void addContacto (Contactos new_object) {
    contactoVector.add(new_object);
  }

  /**
   * Remove a Contacto object from contactoVector List
   */
  public void removeContacto (Contactos new_object)
  {
    contactoVector.remove(new_object);
  }

  /**
   * Get the List of Contacto objects held by contactoVector
   * @return List of Contacto objects held by contactoVector
   */
  public List getContactoList () {
    return (List) contactoVector;
  }


  //
  // Other methods
  //

}
