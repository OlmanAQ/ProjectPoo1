
import java.util.*;


/**
 * Class ordenSanitaria
 */
public class OrdenSanitaria {

  //
  // Fields
  //

  private String fechaDeEmision;
  private String fechaDeFinalizacion;
  private String motivo;
  private String nombreDelFuncionario;
  private Contactos contacto;
  private PacientePositivo pacientePositivo;

  public Vector AmpliacionVector = new Vector();
  
  //
  // Constructors
  //
  public OrdenSanitaria (String fechaDeEmision, String fechaDeFinalizacion, String motivo, String nombreDelFuncionario, Contactos contacto, PacientePositivo pacientePositivo) 
  {
    this.fechaDeEmision= fechaDeEmision;
    this.fechaDeFinalizacion=fechaDeFinalizacion;
    this.motivo=motivo;
    this.nombreDelFuncionario=nombreDelFuncionario;
    this.contacto=contacto;
    this.pacientePositivo=pacientePositivo;


  };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of fechaDeEmision
   * @param newVar the new value of fechaDeEmision
   */
  public void setFechaDeEmision (String newVar) {
    fechaDeEmision = newVar;
  }

  /**
   * Get the value of fechaDeEmision
   * @return the value of fechaDeEmision
   */
  public String getFechaDeEmision () {
    return fechaDeEmision;
  }

  /**
   * Set the value of fechaDeFinalizacion
   * @param newVar the new value of fechaDeFinalizacion
   */
  public void setFechaDeFinalizacion (String newVar) {
    fechaDeFinalizacion = newVar;
  }

  /**
   * Get the value of fechaDeFinalizacion
   * @return the value of fechaDeFinalizacion
   */
  public String getFechaDeFinalizacion () {
    return fechaDeFinalizacion;
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
   * Set the value of nombreDelFuncionario
   * @param newVar the new value of nombreDelFuncionario
   */
  public void setNombreDelFuncionario (String newVar) {
    nombreDelFuncionario = newVar;
  }

  /**
   * Get the value of nombreDelFuncionario
   * @return the value of nombreDelFuncionario
   */
  public String getNombreDelFuncionario () {
    return nombreDelFuncionario;
  }

  /**
   * Set the value of contacto
   * @param newVar the new value of contacto
   */
  public void setContacto (Contactos newVar) {
    contacto = newVar;
  }

  /**
   * Get the value of contacto
   * @return the value of contacto
   */
  public Contactos getContacto () {
    return contacto;
  }

  /**
   * Set the value of pacientePositivo
   * @param newVar the new value of pacientePositivo
   */
  public void setPacientePositivo (PacientePositivo newVar) {
    pacientePositivo = newVar;
  }

  /**
   * Get the value of pacientePositivo
   * @return the value of pacientePositivo
   */
  public PacientePositivo getPacientePositivo () {
    return pacientePositivo;
  }

  /**
   * Add a Ampliacion object to the ampliacionVector List
   */
  public void addAmpliacion (AmpliacionDeOrdenSanitaria new_object) {
    AmpliacionVector.add(new_object);
  }

  /**
   * Remove a Ampliacion object from ampliacionVector List
   */
  public void removeAmpliacion (AmpliacionDeOrdenSanitaria new_object)
  {
    AmpliacionVector.remove(new_object);
  }

  /**
   * Get the List of Ampliacion objects held by ampliacionVector
   * @return List of Ampliacion objects held by ampliacionVector
   */
  public List getAmpliacionList () {
    return (List) AmpliacionVector;
  }


  //
  // Other methods
  //

  /**
   * @return       int
   */
  public int cantidadOrdenesArea()
  {
    return 1;
  }


}
