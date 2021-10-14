

/**
 * Class infecciones
 */
public class Infecciones {

  //
  // Fields
  //

  private String fechaDeContagio;
  private String fechaDeAlta;
  private String descripcionGeneral;
  private OrdenSanitaria orden;
  
  //
  // Constructors
  //
  public Infecciones (String fechaDeContagio, String fechaDeAlta, String descripcionGeneral, OrdenSanitaria orden) 
  { 
    this.fechaDeContagio=fechaDeContagio;
    this.descripcionGeneral=descripcionGeneral;
    this.orden=orden;
  };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of fechaDeContagio
   * @param newVar the new value of fechaDeContagio
   */
  public void setFechaDeContagio (String newVar) {
    fechaDeContagio = newVar;
  }

  /**
   * Get the value of fechaDeContagio
   * @return the value of fechaDeContagio
   */
  public String getFechaDeContagio () {
    return fechaDeContagio;
  }

  /**
   * Set the value of fechaDeAlta
   * @param newVar the new value of fechaDeAlta
   */
  public void setFechaDeAlta (String newVar) {
    fechaDeAlta = newVar;
  }

  /**
   * Get the value of fechaDeAlta
   * @return the value of fechaDeAlta
   */
  public String getFechaDeAlta () {
    return fechaDeAlta;
  }

  /**
   * Set the value of descripcionGeneral
   * @param newVar the new value of descripcionGeneral
   */
  public void setDescripcionGeneral (String newVar) {
    descripcionGeneral = newVar;
  }

  /**
   * Get the value of descripcionGeneral
   * @return the value of descripcionGeneral
   */
  public String getDescripcionGeneral () {
    return descripcionGeneral;
  }

  /**
   * Set the value of orden
   * @param newVar the new value of orden
   */
  public void setOrden (OrdenSanitaria newVar) {
    orden = newVar;
  }

  /**
   * Get the value of orden
   * @return the value of orden
   */
  public OrdenSanitaria getOrden () {
    return orden;
  }

  //
  // Other methods
  //

}
