
import java.util.*;
/**
 * Class AreaDeSalud
 * @author Olman Acuña Quesada
 * @OlmanAQ
 * @author Deyanira
 * @author Kevelin
 */
public class AreaDeSalud {

  //
  // Fields
  //

  /**
   * nombre del area de salud
   */
  private String nombre;
  /**
   * Nombre del director del area
   */
  private String personaDirectora;
  /**Direccion de area */
  private String direccion;
  /**
   * lista de numeros telefonicos
   */
  private ArrayList<String> numeroTelefonico;
  /**Las areas de atraccion */
  private String areaDeAtraccion;
  /**La realacion de para la lista de pacientes */
  public Vector<Personas> pacientes = new Vector<Personas>();
  
  //
  // Constructors
  //
  /**
   * Contructor de la clase AreadeSalud
   * @param nombre
   * @param personaDirectora
   * @param direccion
   * @param areaDeAtraccion
   * @param numeroTelefonico
   */
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
   * @return (String) Nombre de personaDirectora
   */
  public String getPersonaDirectora () {
    return personaDirectora;
  }

  /**
   * Set asigna lista de numerotelefonico_
   * @param ArrayList<String> the new value of numerotelefonico_
   */
  public void setNumeroTelefonico(ArrayList<String> numeroTelefonico) {
      this.numeroTelefonico = numeroTelefonico;
  }


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
   * Get nombre de areaDeAtraccion
   * @return the value of areaDeAtraccion
   */
  public String getAreaDeAtraccion () {
    return areaDeAtraccion;
  }

  /**
   * Set the value of pacientes
   * @param pacientes (Vector<Personas> vector de lista de pacientes
   */
 public void setPacientes(Vector<Personas> pacientes) {
        this.pacientes = pacientes;
 }

  /**
   * Get Lista de Pacientes pacientes
   * @return el vector de pacientes
   */
public Vector<Personas> getPacientes() {
       return pacientes;
}
/**
 * Get Numero de numero telefono
 * @return (ArrayList<String>) Numero telefonicp
 */
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

/**
 * Registra los pacientes positivos
 * @param nombre
 * @param cedula
 * @param edad
 * @param correoElectronico
 * @param lugarDeResidencia
 * @param fechaAparicionSintomas
 * @param modoDeContacto
 * @param numeroTelefonico
 * @param padecimientosCronicos
 */
	public void registrarPacientePositivo (String nombre, String cedula,int edad,String correoElectronico,String lugarDeResidencia,String fechaAparicionSintomas,String modoDeContacto,ArrayList<String> numeroTelefonico,ArrayList<String> padecimientosCronicos)
	{
	    PacientePositivo nuevoPaciente = new PacientePositivo(nombre, cedula,edad,correoElectronico,lugarDeResidencia, fechaAparicionSintomas,modoDeContacto, numeroTelefonico,padecimientosCronicos);
      nuevoPaciente.setAreaSalud(this);
      this.addPersonas(nuevoPaciente);
	}
/**
 * registra las personas que se realizaron la prueba salga o no positivo
 * @param nombre
 * @param cedula
 * @param edad
 * @param correoElectronico
 * @param lugarDeResidencia
 * @param horaDeaplicacion
 * @param numeroTelefonico
 * @param padecimientosCronicos
 */
public void registrarPaciente (String nombre, String cedula,int edad,String correoElectronico,String lugarDeResidencia,String horaDeaplicacion,ArrayList<String> numeroTelefonico,ArrayList<String> padecimientosCronicos)
{
    Paciente nuevoPaciente = new Paciente(nombre, cedula,edad,correoElectronico,lugarDeResidencia,horaDeaplicacion,numeroTelefonico, padecimientosCronicos);
    nuevoPaciente.setAreaSalud(this);
    this.addPersonas(nuevoPaciente);
}


/**
 * Cuenta la cantidad de personas positivas en un centro en especfico
 * @return (Integer)
 */
	public Integer cantidadDePositivos()
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

  

/**
 * cuenta la cantidad de personas que se hicieron la prueba 
 * @return (Integer)
 */
public Integer cantidadDePersonasPrueba()
{
  int cont=0;
  for (int x=0;x<this.pacientes.size();x++)
  {
    if (this.pacientes.get(x).obtenerEstado().equals("Paciente"))
    {
      cont++;
    } 
    if (this.pacientes.get(x).obtenerEstado().equals("PacientePositivo"))
    {
      cont++;
    } 
  }

  return cont;
}

/**
 * Return String Clase
 */
  public String toString()
	{
		return(String.format("Nombre: %s\nDirector: %s\nDirección: %s\nÁrea de Atracción: %s\nNumeros telefonicos: %s", 
			this.nombre,this.personaDirectora,this.direccion,this.areaDeAtraccion, this.numeroTelefonico));

	}
}
