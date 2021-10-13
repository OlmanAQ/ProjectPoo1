
import java.util.*;
/**
 * Class AreaDeSalud
 */
public class AreaDeSalud {

  //
  // Fields
  //

  /**
   * nombre del area de salud
   */
  private String nombre;
  private String personaDirectora;
  private String direccion;
  private ArrayList<String> numeroTelefonico;
  private String areaDeAtraccion;
  public Vector<Personas> pacientes = new Vector<Personas>();
  
  //
  // Constructors
  //
  public AreaDeSalud(String nombre, String personaDirectora,String direccion, String areaDeAtraccion,ArrayList<String> numeroTelefonico) {
    this.nombre= nombre;
    this.personaDirectora=personaDirectora;
    this.direccion=direccion;
    this.areaDeAtraccion=areaDeAtraccion;
    this.numeroTelefonico=numeroTelefonico;
  
  };
  //
  // Methods
  //


  //
  // Accessor methods
  //




  /**
   * Set the value of nombre
   * nombre del area de salud
   * @param newVar the new value of nombre
   */
  public void setNombre (String newVar) {
    nombre = newVar;
  }

  /**
   * Get the value of nombre
   * nombre del area de salud
   * @return the value of nombre
   */
  public String getNombre () {
    return nombre;
  }

  /**
   * Set the value of personaDirectora
   * @param newVar the new value of personaDirectora
   */
  public void setPersonaDirectora (String newVar) {
    personaDirectora = newVar;
  }

  /**
   * Get the value of personaDirectora
   * @return the value of personaDirectora
   */
  public String getPersonaDirectora () {
    return personaDirectora;
  }

  /**
   * Set the value of numerotelefonico_
   * @param newVar the new value of numerotelefonico_
   */


  /**
   * Set the value of direccion
   * @param newVar the new value of direccion
   */
  public void setDireccion (String newVar) {
    direccion = newVar;
    
  }

  /**
   * Get the value of direccion
   * @return the value of direccion
   */
  public String getDireccion () {
    return direccion;
  }

  /**
   * Set the value of areaDeAtraccion
   * @param newVar the new value of areaDeAtraccion
   */
  public void setAreaDeAtraccion (String newVar) {
    areaDeAtraccion = newVar;
  }

  /**
   * Get the value of areaDeAtraccion
   * @return the value of areaDeAtraccion
   */
  public String getAreaDeAtraccion () {
    return areaDeAtraccion;
  }

  /**
   * Set the value of pacientes
   * @param newVar the new value of pacientes
   */
 public void setPacientes(Vector<Personas> pacientes) {
        this.pacientes = pacientes;
 }

  /**
   * Get the value of pacientes
   * @return the value of pacientes
   */
public Vector<Personas> getPacientes() {
       return pacientes;
}
public ArrayList<String> getNumeroTelefonico() {
 
  return getNumeroTelefonico();
}


  //
  // Other methods
  //

  /**
   * @return       String
   */
  public String calcularEstadistica(){
    
    return "";
  }
  	/**
	 * Add a Personas object to the personasVector List
	 */
	public void addPersonas (Personas new_object) {
		pacientes.add(new_object);
	}
//Registra los pacientes positivos
	public void registrarPacientePositivo (String nombre, String cedula,int edad,String correoElectronico,String lugarDeResidencia,String fechaAparicionSintomas,String modoDeContacto,ArrayList<String> numeroTelefonico)
	{
	    PacientePositivo nuevoPaciente = new PacientePositivo(nombre, cedula,edad,correoElectronico,lugarDeResidencia, fechaAparicionSintomas,modoDeContacto, numeroTelefonico);
      nuevoPaciente.setAreaSalud(this);
      this.addPersonas(nuevoPaciente);
	}
//registra las personas que se realizaron la prueba salga o no positivo
public void registrarPaciente (String nombre, String cedula,int edad,String correoElectronico,String lugarDeResidencia,String horaDeaplicacion)
{
    Paciente nuevoPaciente = new Paciente(nombre, cedula,edad,correoElectronico,lugarDeResidencia,horaDeaplicacion);
    nuevoPaciente.setAreaSalud(this);
    this.addPersonas(nuevoPaciente);
}

//cuenta la cantidad de personas positivas en un centro en especfico
	public Integer cantidadPositivos()
	{
		int cont=0;
		for (int x=0;x<this.pacientes.size();x++)
		{
			if (this.pacientes.get(x).obtenerEstado().equals("PacientePositivo"))
			{
				cont++;
			}
		}

		return cont;
	}

  public String toString()
	{
		return(String.format("Nombre: %s\nDirector: %s\nDirección: %s\nÁrea de Atracción: %s\nNumeros telefonicos: %s", 
			this.nombre,this.personaDirectora,this.direccion,this.areaDeAtraccion, this.numeroTelefonico));

	}
}
