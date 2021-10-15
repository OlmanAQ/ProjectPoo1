
import java.util.*;


/**
 * Class ordenSanitaria
 */
public class OrdenSanitaria {

  //
  // Fields
  //

  /**
   * La fecha de emision de la orden
   */
  private String fechaDeEmision;
  /**Fecha de finalizacion de la orden*/
  private String fechaDeFinalizacion;
  /**Motivo de la orden*/
  private String motivo;
  /**Nombre del funcionario*/
  private String nombreDelFuncionario;
  /**Contactos del paciente*/
  private Contactos contacto;
  /**El paciente positivo de la orden */
  private PacientePositivo pacientePositivo;
  /**Vector para la amplicion de la orden sanitaria */
  public Vector<AmpliacionDeOrdenSanitaria> AmpliacionVector = new Vector<AmpliacionDeOrdenSanitaria>();
  
  //
  // Constructors
  //
  /**
   * Contructor de orden sanitaria
   * @param fechaDeEmision
   * @param fechaDeFinalizacion
   * @param motivo
   * @param nombreDelFuncionario
   * @param contacto
   * @param pacientePositivo
   */
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
   * Set de la fechaDeEmision
   * @param newVar (String) fechaDeEmision
   */
  public void setFechaDeEmision (String newVar) {
    fechaDeEmision = newVar;
  }

  /**
   * Get de la fechaDeEmision
   * @return (String) la fechaDeEmision
   */
  public String getFechaDeEmision () {
    return fechaDeEmision;
  }

  /**
   * Set de la fechaDeFinalizacion
   * @param newVar (String) fechaDeFinalizacion de la orden
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
   * Set asinga el motivo de Orden
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
   * Reporte de Cantidad Ordenes por area
   * @return int
   */
  public int cantidadOrdenesArea()
  {
    return 1;
  }


}
