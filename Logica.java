import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;
import java.io.Console;
/**
 * Class Logica
 * @author Olman Acuña Quesada
 * @OlmanAQ
 * @author Deyanira
 * @author Kevelin
 */
public class Logica {
  public Vector<AreaDeSalud> listadoAreas = new Vector<AreaDeSalud>();
  public Vector<PacientePositivo> ListaPacientePositivo = new Vector<PacientePositivo>();

  String input = "";
  Console console = System.console();
    
  public Logica() {
    registrosIniciales();
  }

  private void registrosIniciales() {

    AreaDeSalud nuevaAreaSalud;
    ArrayList<String> telefonos = new ArrayList<String>(); // Create an ArrayList object
    telefonos.add("2475-7575");
    nuevaAreaSalud = new AreaDeSalud("Ciudad Quesada", "Amaya Durán", "Ciudad Quesada centro",
        "San MArtín, Barrio Lourdes, El carmen, El campo, ...", telefonos);

    ArrayList<String> padecimientosPP1A1 = new ArrayList<String>(); // Create an ArrayList object
    ArrayList<String> telefonosPP1A1 = new ArrayList<String>(); // Create an ArrayList object
    telefonosPP1A1.add("8895-3002");
    padecimientosPP1A1.add("nada");
    nuevaAreaSalud.registrarPacientePositivo("José Leonardo Víquez Acuña", "2-0562-0727", 40, "leoviquez@gmail.com",
        "Barrio el Carmen", "08-10-2021", "Ninguno", telefonosPP1A1, padecimientosPP1A1);

    ArrayList<String> padecimientosPP2A1 = new ArrayList<String>(); // Create an ArrayList object
    ArrayList<String> telefonosPP2A1 = new ArrayList<String>(); // Create an ArrayList object
    telefonosPP2A1.add("8895-3002");
    padecimientosPP2A1.add("nada");
    nuevaAreaSalud.registrarPacientePositivo("Andrea Vizcaino", "2-0000-0001", 30, "Andrea@gmail.com", "San MArtín",
        "08-08-2021", "Ninguno", telefonosPP2A1, padecimientosPP2A1);
    ArrayList<String> padecimientosPP3A1 = new ArrayList<String>(); // Create an ArrayList object
    ArrayList<String> telefonosPP3A1 = new ArrayList<String>(); // Create an ArrayList object
    telefonosPP3A1.add("2461-0000");
    padecimientosPP3A1.add("Ninguno");
    nuevaAreaSalud.registrarPacientePositivo("Ricardo Avendaño", "2-0000-0002", 27, "Ricardo@gmail.com",
        "Centro Ciudad Quesada", "01-07-2021", "Ninguno", telefonosPP3A1, padecimientosPP3A1);
    // nuevaAreaSalud.registrarPaciente();
    this.listadoAreas.add(nuevaAreaSalud);

    /* Borrar */
    AreaDeSalud nuevaAreaSalud2;
    ArrayList<String> telefonos2 = new ArrayList<String>(); // Create an ArrayList object
    telefonos.add("2475-7575");
    telefonos.add("2475-7523");
    nuevaAreaSalud2 = new AreaDeSalud("Florencia", "Diego Durán", "Florencia centro",
        "San carlos, Barrio Lourdes, El carmen, El campo, ...", telefonos2);

    ArrayList<String> padecimientosPP1A1_2 = new ArrayList<String>(); // Create an ArrayList object
    ArrayList<String> telefonosPP1A1_1 = new ArrayList<String>(); // Create an ArrayList object
    telefonosPP1A1_1.add("8895-3002");
    padecimientosPP1A1_2.add("nada");
    nuevaAreaSalud2.registrarPacientePositivo("José Leonardo Víquez Acuña", "2-0562-0727", 40, "leoviquez@gmail.com",
        "Barrio el Carmen", "08-10-2021", "Ninguno", telefonosPP1A1, padecimientosPP1A1);

    ArrayList<String> padecimientosPP2A1_2 = new ArrayList<String>(); // Create an ArrayList object
    ArrayList<String> telefonosPP2A1_2 = new ArrayList<String>(); // Create an ArrayList object
    telefonosPP2A1_2.add("8895-3002");
    telefonosPP2A1_2.add("8895-3232");
    padecimientosPP2A1_2.add("algo");
    padecimientosPP2A1_2.add("algo2");

    nuevaAreaSalud2.registrarPacientePositivo("Ronald Vizcaino", "2-0020-3001", 30, "Ronald@gmail.com", "San MArtín",
        "08-08-2021", "Ninguno", telefonosPP2A1_2, padecimientosPP2A1_2);
    nuevaAreaSalud2.registrarPacientePositivo("Maria Vizcaino", "2-0020-0012", 30, "Maria@gmail.com", "San MArtín",
        "08-08-2021", "Ninguno", telefonosPP2A1_2, padecimientosPP2A1_2);

    ArrayList<String> padecimientosPP3A1_2 = new ArrayList<String>(); // Create an ArrayList object
    ArrayList<String> telefonosPP3A1_2 = new ArrayList<String>(); // Create an ArrayList object
    telefonosPP3A1_2.add("2461-0000");
    padecimientosPP3A1_2.add("Ningunoxxs");
    nuevaAreaSalud2.registrarPacientePositivo("Ricardo Avendaño", "2-0000-0002", 27, "Ricardo@gmail.com",
        "Centro Ciudad Quesada", "01-07-2021", "Ninguno", telefonosPP3A1_2, padecimientosPP3A1_2);

    this.listadoAreas.add(nuevaAreaSalud2);
    /*
     * nuevaAreaSalud = new AreaDeSalud("Florencia", "Carlo Méndez",
     * "Florencia centro", "Centro florencia Florencia, caimitos, cementerio, ...",
     * telefonosA1 ); nuevaAreaSalud = new AreaDeSalud("", "", "",
     * "areaSaludFlorencia@ccss.go.cr", "", ""); nuevaAreaSalud.addPersonas(new
     * PacientesPositivos("2-0000-0003", "María Méndez", (short)55, "Ninguno",
     * "Florencia", "2475-0000", "leoviquez@gmail.com", "01-01-2021"));
     * nuevaAreaSalud.addPersonas(new PacientesPositivos("2-0000-0004",
     * "Andrea Vizcaino", (short)20, "Ninguno", "Caimitos", "2475-0001",
     * "Andrea@gmail.com", "31-12-2020")); nuevaAreaSalud.addPersonas(new
     * PacientesPositivos("2-0000-0006", "Pedro Montaner", (short)12, "Ninguno",
     * "Cuestillas", "2475-0002", "pedro@gmail.com", "25-12-2020"));
     * this.listadoAreas.add(nuevaAreaSalud);
     */
  }

  public void menuPrincipal() {

    while (true) {
      System.out.print("\033[H\033[2J");
      System.out.println("Sistema de soporte estadístico para Covid19");

      System.out.println("1) Crear una nueva área de salud");
      System.out.println("2) Registrar un nuevo paciente positivo");
      System.out.println("3) Registrar un nuevo paciente prueba");
      System.out.println("4) Cantidad de pacientes positivos por área de salud");
      System.out.println("5) Cantidad de pacientes que se realizaron la prueba por área de salud");
      System.out.println("6) Imprimir centros de salud");
      System.out.println("7) Agregar sintoma a persona");
      System.out.println("8) Reporte 1");
      System.out.println("9) Imprimir datos de personas");
      System.out.println("10) reporte 3: Calcular total de ordenes sanitarias");
      System.out.println("11) Salir ");
      input = console.readLine("%s", "Que acción desea realizar: ");
      if (input.equals("1")) {
        menuRegistroAreasSalud();
      } else if (input.equals("2")) {
        menuRegistroPacientePositivo();
      } else if (input.equals("3")) {
        menuRegistroPacientePrueba();
      }

      else if (input.equals("4")) {
        System.out
            .println(String.format("Cantidad Actual de pacientes positivos: %s", menuCantidadPacientesPositivos()));
        System.out.println("\nPresione enter para regresar al menú principal...");
        input = console.readLine("");

      }

      else if (input.equals("5")) {
        System.out.println(String.format("Cantidad Actual de pacientes que se realizaron la prueba: %s",
            menuCantidadPacientesPrueba()));
        System.out.println("\nPresione enter para regresar al menú principal...");
        input = console.readLine("");

      }

      else if (input.equals("6")) {
        imprimir();
      }

      else if (input.equals("7")) {

        while (true) {
          System.out.print("\nIngrese la cedula de la persona a agregar sintoma: \n");
          // Pedir la cedula de la persona
          String cedula = console.readLine("%s", "> ");
          // Recorrer todos los centros de salud para buscar la persona por cédula
          Personas buscada = buscarPersona(cedula);

          if (buscada != null) 
          {
            System.out.print("\tnombre: " + buscada.nombre + "\n");

            // Se pide el sintoma de la persona
            //String sintoma = console.readLine("%s", "Simtoma que presenta: ");
            //SintomasCovid s = new SintomasCovid();
            //s.setSintoma(sintoma);

              while(true){
                System.out.print("\033[H\033[2J"); 
                System.out.println("---Sintomas Covid----");
                System.out.println("1)Fiebre o escalofríos ");
                System.out.println("2) Tos");
                System.out.println("3) Dificultad para respirar");
                System.out.println("4) Fatiga");
                System.out.println("5) Dolores musculares y corporales");
                System.out.println("6) Dolor de cabeza");
                System.out.println("7) Pérdida reciente del olfato o el gusto");
                System.out.println("8) Dolor de garganta");
                System.out.println("9) Todos los anteriores");
                System.out.println("10) Otro");
                System.out.println("11) No insertar mas sintomas");
                input=console.readLine("%s","Ingrese los sintomas que presente: ");
                if (input.equals("1"))
                { 
                    SintomasCovid s = new SintomasCovid("Fiebre o escalofríos");
                    buscada.agregar(s);
                    System.out.print("\nSintoma agregado a paciente.\n");
      
                }
                else if (input.equals("2"))
                {    
                  SintomasCovid s = new SintomasCovid("Tos");
                  buscada.agregar(s);
                  System.out.print("\nSintoma agregado a paciente.\n");
                }
                else if (input.equals("3"))
                {  
                  SintomasCovid s = new SintomasCovid("Dificultad para respirar");
                  buscada.agregar(s);
                  System.out.print("\nSintoma agregado a paciente.\n");
                  
                }
                else if (input.equals("4"))
                {    
                  SintomasCovid s = new SintomasCovid("Fatiga");
                  buscada.agregar(s);
                  System.out.print("\nSintoma agregado a paciente.\n");
                }
                else if (input.equals("5"))
                {    
                    SintomasCovid s = new SintomasCovid("Dolores musculares y corporales");
                    buscada.agregar(s);
                    System.out.print("\nSintoma agregado a paciente.\n");
                }
                else if (input.equals("6"))
                {    
                    SintomasCovid s= new SintomasCovid("Dolor de cabeza");
                    buscada.agregar(s);
                    System.out.print("\nSintoma agregado a paciente.\n"); 
                }
                else if (input.equals("7"))
                {   
                    SintomasCovid s= new SintomasCovid("Pérdida reciente del olfato o el gusto");
                    buscada.agregar(s);
                    System.out.print("\nSintoma agregado a paciente.\n");
                }
                else if (input.equals("8"))
                {   
                    SintomasCovid s= new SintomasCovid("Dolor de garganta");
                    buscada.agregar(s);
                    System.out.print("\nSintoma agregado a paciente.\n");
                }
                else if (input.equals("9"))
                {    
                    SintomasCovid s= new SintomasCovid("Fiebre o escalofríos, Tos, Dificultad para respirar, Fatiga, Dolores musculares y corporales, Dolor de cabeza,Pérdida reciente del olfato o el gusto,Dolor de garganta");
                    buscada.agregar(s);
                    System.out.print("\nSintoma agregado a paciente.\n");
                
                }
                else if (input.equals("10"))
                {    
                  
                    String sin=console.readLine("%s","Sintoma: ");
                    SintomasCovid sintoma= new SintomasCovid(sin);
                    buscada.agregar(sintoma);
                    System.out.print("\nSintoma agregado a paciente.\n");
                
                }
                
                
                else if (input.equals("11"))
                {
                  break;
                }
                
              }
            
            // Infeccion
            System.out.print("\n Datos de la infección: \n");
            String f_contagio = console.readLine("%s", "\tfecha de contagio: ");
            String f_alta = console.readLine("%s", "\tfecha de alta: ");
            String descripcion = console.readLine("%s", "\tDescripcion: ");

            // OrdenSanitaria
            System.out.print("\nDatos de la orden sanitaria: \n");
            String fechaDeEmision = console.readLine("%s", "\tfecha de emisión: ");
            String fechaDeFinalizacion = console.readLine("%s", "\tfecha de finalizacion: ");
            String motivo = console.readLine("%s", "\tmotivo: ");
            String nombreDelFuncionario = console.readLine("%s", "\tnombre del funcionario: ");

            // Contacto
            System.out.print("\n Datos del contacto: \n");
            String nom = console.readLine("%s", "\tnombre: ");
            String ced = console.readLine("%s", "\tcedula: ");
            int edad = Integer.parseInt(console.readLine("%s", "\tedad: "));
            String correoElectronico = console.readLine("%s", "\tcorreo: ");
            String lugarDeResidencia = console.readLine("%s", "\tlugar residencia: ");
            String gradodeContacto = console.readLine("%s", "\tgrado de contacto: ");
            Contactos contacto = new Contactos(nom, ced, edad, correoElectronico, lugarDeResidencia, gradodeContacto);

            // Paciente positivo
            System.out.print("\n Datos del paciente positivo: \n");
            String fechaAparicionSintomas = console.readLine("%s", "\tfecha de aparicion de sintomas: ");
            String modoDeContacto = console.readLine("%s", "\tmodo de contacto: ");
            PacientePositivo pp = new PacientePositivo("", "", 0, "", "", "", "", new ArrayList<String>(),
                new ArrayList<String>());
            pp.setFechaAparicionSintomas(fechaAparicionSintomas);
            pp.setModoDeContacto(modoDeContacto);

            OrdenSanitaria o = new OrdenSanitaria(fechaDeEmision, fechaDeFinalizacion, motivo, nombreDelFuncionario,
                contacto, pp);
            Infecciones i = new Infecciones(f_contagio, f_alta, descripcion, o);

            // Agregar infeccion a sintomas covid
           // s.setInfeccion(i);




            // agrega sintoma a la perona
           // buscada.setSintoma(s);
            //System.out.print("\nSintoma agregado a paciente. Precione una tecla para volver.\n");






          break;
        } 
          else {
            System.out.print("\nNo existe una persona con esa cedula. Vuelva a intentar.\n");
          }
        }
        input = console.readLine("");
      }

      else if (input.equals("8")) {

      }

      else if (input.equals("9")) {
          String cedula = console.readLine("Digite la cedula: ");
          imprimirPersona(cedula);
      }

      else if (input.equals("10")) {
        // reporte 3
        //reporte3();
        input = console.readLine("");
      }

      else if (input.equals("11")) {
        break;
      }
    }
  }

  private int menuCantidadPacientesPositivos() {
    System.out.print("\033[H\033[2J");
    System.out.println("Seleccione el área de salud a consultar:");

    for (int i = 0; i < listadoAreas.size(); i++) {
      System.out.println(String.format("%d) %s", i, listadoAreas.get(i).getNombre()));
    }
    int nas = -1;
    AreaDeSalud as;
    while (true) {
      try {
        nas = Integer.parseInt(console.readLine("%s", "Número de área de salud: "));
        as = listadoAreas.get(nas);
        break;
      } catch (Exception e) {
        System.out.println("Seleccione un número de área de salud válido...");
      }
    }

    System.out.print("\033[H\033[2J");

    return as.cantidadDePositivos();
  }

  // Cantidad de personas que se realizaron la prueba en un centro en especifico
  private int menuCantidadPacientesPrueba() {
    System.out.print("\033[H\033[2J");
    System.out.println("Seleccione el área de salud a consultar:");

    for (int i = 0; i < listadoAreas.size(); i++) {
      System.out.println(String.format("%d) %s", i, listadoAreas.get(i).getNombre()));
    }
    int nas = -1;
    AreaDeSalud as;
    while (true) {
      try {
        nas = Integer.parseInt(console.readLine("%s", "Número de área de salud: "));
        as = listadoAreas.get(nas);
        break;
      } catch (Exception e) {
        System.out.println("Seleccione un número de área de salud válido...");
      }
    }

    System.out.print("\033[H\033[2J");

    return as.cantidadDePersonasPrueba();
  }

  private void menuRegistroAreasSalud() {
    System.out.print("\033[H\033[2J");
    String nombreAS = console.readLine("%s", "Nombre del Área de salud: ");
    String director = console.readLine("%s", "Nombre del director: ");
    String direccion = console.readLine("%s", "Dirección física: ");
    String areaDeAtraccion = console.readLine("%s", "Nombre del área de atracción: ");
    ArrayList<String> numeroTelefonico = new ArrayList<>(Arrays.asList());
    while (true) {
      System.out.print("\033[H\033[2J");
      System.out.println("1)Ingresar numero telefonico ");
      System.out.println("2)No ingresar mas numeros ");
      input = console.readLine("%s", "Que acción desea realizar: ");
      if (input.equals("1")) {

        String numero = console.readLine("%s", "Numero telefonico: ");
        numeroTelefonico.add(numero);

      } else if (input.equals("2")) {
        break;
      }

    }

    System.out.print("\033[H\033[2J");
    AreaDeSalud nAS = new AreaDeSalud(nombreAS, director, direccion, areaDeAtraccion, numeroTelefonico);
    System.out.println("1) Esta seguro que quiere registrar el área de salud:");
    System.out.println(nAS.toString());
    System.out.println("2) No realizar el registro y regresar al menu principal");
    input = console.readLine("%s", "Que acción desea realizar: ");
    if (input.equals("1")) {
      listadoAreas.add(nAS);
    } else if (input.equals("2")) {

    }

  }

  private void menuRegistroPacientePositivo() {
    if (listadoAreas.size() == 0) {
      System.out.print("\033[H\033[2J");
      System.out.println("Primero registre una primer área de salud\n");
      System.out.println("Presione enter para regresar al menú principal...");
      input = console.readLine("");
    } else {
      System.out.print("\033[H\033[2J");
      System.out.println("Seleccione el área de salud donde está registrado el paciente:");

      for (int i = 0; i < listadoAreas.size(); i++) {
        System.out.println(String.format("%d) %s", i, listadoAreas.get(i).getNombre()));
      }
      int nas = -1;
      AreaDeSalud as;
      while (true) {
        try {
          nas = Integer.parseInt(console.readLine("%s", "Número de área de salud: "));
          as = listadoAreas.get(nas);
          break;
        } catch (Exception e) {
          System.out.println("Seleccione un número de área de salud válido...");
        }
      }

      System.out.print("\033[H\033[2J");
      System.out.println(String.format("Área de salud seleccionado: %s", as.getNombre()));

      String cedula = console.readLine("%s", "Cédula del paciente: ");
      String nombre = console.readLine("%s", "Nombre del paciente: ");
      int edad = 0;
      try {
        edad = Short.parseShort(console.readLine("%s", "Edad del paciente: "));
      } catch (Exception e) {
        System.out.println(String.format("Error de conversión de la edad, se asume 0. %s", e.getMessage()));
      }

      String lugarResidencia = console.readLine("%s", "Lugar de residencia: ");

      String correo = console.readLine("%s", "E-mail del paciente: ");
      String fechaSintomas = console.readLine("%s", "Fecha en que iniciaron los síntomas: ");
      String modoDeContacto = console.readLine("%s", "modo de contacto: ");
      ArrayList<String> numeroTelefonico = new ArrayList<>(Arrays.asList());
      while (true) {
        System.out.print("\033[H\033[2J");
        System.out.println("1)Ingresar numero telefonico ");
        System.out.println("2)No ingresar mas numeros ");
        input = console.readLine("%s", "Que acción desea realizar: ");
        if (input.equals("1")) {

          String numero = console.readLine("%s", "Numero telefonico: ");
          numeroTelefonico.add(numero);

        } else if (input.equals("2")) {
          break;
        }

      }

      ArrayList<String> padecimientosCronicos = new ArrayList<>(Arrays.asList());
      while (true) {
        System.out.print("\033[H\033[2J");
        System.out.println("1)Ingresar padecimiento cronico");
        System.out.println("2)No ingresar padecimiento cronico ");
        input = console.readLine("%s", "Que acción desea realizar: ");
        if (input.equals("1")) {

          String numero = console.readLine("%s", "Padecimiento cronico: ");
          padecimientosCronicos.add(numero);

        } else if (input.equals("2")) {
          break;
        }

      }
      // imprime datos del paciente positivo
      as.registrarPacientePositivo(nombre, cedula, edad, correo, lugarResidencia, fechaSintomas, modoDeContacto,
          numeroTelefonico, padecimientosCronicos);
      PacientePositivo nPP = new PacientePositivo(nombre, cedula, edad, correo, lugarResidencia, fechaSintomas,
          modoDeContacto, numeroTelefonico, padecimientosCronicos);
      ListaPacientePositivo.add(nPP);

      System.out.print("\033[H\033[2J");
      System.out.println(
          String.format("Se ha registrado al paciente %s %s al centro de Salud %s", cedula, nombre, as.getNombre()));

      System.out.println("\nPresione enter para regresar al menú principal...");
      input = console.readLine("");
    }
  }

  // registra un nuevo paciente prueba

  private void menuRegistroPacientePrueba() {
    if (listadoAreas.size() == 0) {
      System.out.print("\033[H\033[2J");
      System.out.println("Primero registre una primer área de salud\n");
      System.out.println("Presione enter para regresar al menú principal...");
      input = console.readLine("");
    } else {
      System.out.print("\033[H\033[2J");
      System.out.println("Seleccione el área de salud donde está registrado el paciente:");

      for (int i = 0; i < listadoAreas.size(); i++) {
        System.out.println(String.format("%d) %s", i, listadoAreas.get(i).getNombre()));
      }
      int nas = -1;
      AreaDeSalud as;
      while (true) {
        try {
          nas = Integer.parseInt(console.readLine("%s", "Número de área de salud: "));
          as = listadoAreas.get(nas);
          break;
        } catch (Exception e) {
          System.out.println("Seleccione un número de área de salud válido...");
        }
      }

      System.out.print("\033[H\033[2J");
      System.out.println(String.format("Área de salud seleccionado: %s", as.getNombre()));

      String cedula = console.readLine("%s", "Cédula del paciente: ");
      String nombre = console.readLine("%s", "Nombre del paciente: ");
      int edad = 0;
      try {
        edad = Short.parseShort(console.readLine("%s", "Edad del paciente: "));
      } catch (Exception e) {
        System.out.println(String.format("Error de conversión de la edad, se asume 0. %s", e.getMessage()));
      }
      // String padecimientos=console.readLine("%s","Padecimiento: ");
      String lugarResidencia = console.readLine("%s", "Lugar de residencia: ");

      String correo = console.readLine("%s", "E-mail del paciente: ");
      String horaDeaplicacion = console.readLine("%s", "Hora de aplicacion de la prueba: ");
      ArrayList<String> numeroTelefonico = new ArrayList<>(Arrays.asList());
      while (true) {
        System.out.print("\033[H\033[2J");
        System.out.println("1)Ingresar numero telefonico ");
        System.out.println("2)No ingresar mas numeros ");
        input = console.readLine("%s", "Que acción desea realizar: ");
        if (input.equals("1")) {

          String numero = console.readLine("%s", "Numero telefonico: ");
          numeroTelefonico.add(numero);

        } else if (input.equals("2")) {
          break;
        }

      }
      ArrayList<String> padecimientosCronicos = new ArrayList<>(Arrays.asList());
      while (true) {
        System.out.print("\033[H\033[2J");
        System.out.println("1)Ingresar padecimiento cronico");
        System.out.println("2)No ingresar padecimiento cronico ");
        input = console.readLine("%s", "Que acción desea realizar: ");
        if (input.equals("1")) {

          String numero = console.readLine("%s", "Padecimiento cronico: ");
          padecimientosCronicos.add(numero);

        } else if (input.equals("2")) {
          break;
        }

      }
      // imprime datos del paciente prueba
      as.registrarPaciente(nombre, cedula, edad, correo, lugarResidencia, horaDeaplicacion, numeroTelefonico,
          padecimientosCronicos);
      Paciente nPP = new Paciente(nombre, cedula, edad, correo, lugarResidencia, horaDeaplicacion, numeroTelefonico,
          padecimientosCronicos);

      System.out.print("\033[H\033[2J");
      System.out.println(nPP.toString());
      System.out.println(
          String.format("Se ha registrado al paciente %s %s al centro de Salud %s", cedula, nombre, as.getNombre()));

      System.out.println("\nPresione enter para regresar al menú principal...");
      input = console.readLine("");
    }
  }

  public void imprimir() {
    System.out.println("--------------Areas de salud-------------");
    for (int i = 0; i < listadoAreas.size(); i++) {
      System.out.println(String.format("%d) %s", i, listadoAreas.get(i).getNombre()));
    }
    int nas = -1;
    AreaDeSalud a;
    while (true) {
      try {
        nas = Integer.parseInt(console.readLine("%s", "Número de área de salud: "));
        a = listadoAreas.get(nas);
        break;
      } catch (Exception e) {
        System.out.println("Seleccione un número de área de salud válido...");
      }
    }
    System.out.println(a.toString());
    if (listadoAreas.size() == 0) {
      System.out.println("No hay datos en la lista de areas de salud");
      System.out.println("*******************************************************");
    }

    
    input = console.readLine("");
  }

  public Personas buscarPersona(String cedula) {

    // recorre los centros de salud para buscar a la persona.
    for (AreaDeSalud a : listadoAreas) {

      // Busca la persona en los centros de salud.
      for (Personas persona : a.pacientes) {
        if (persona.cedula.equals(cedula)) {
          return persona;
        }
      }
    }
    return null;
  }

 /* public void reporte3() {

    System.out.print("\nReporte 3: Cantidad de ordenes sanitarias por Area de salud\n\n");
    // recorre los centros de salud para buscar a la persona.
    for (AreaDeSalud a : listadoAreas) {
      System.out.print("\tnombre: " + a.getNombre());

      int contador = 0;
      // Recorre todas las personas en los centros de salud.
      for (Personas persona : a.pacientes) {
        // por cada una verifica que tenga orden sanitaria
        if (persona.sintoma != null) {
          if (persona.sintoma.getInfeccion()!= null) {
            if (persona.sintoma.getInfeccion().getOrden() != null) {
              contador++; 
            }
          }
        }
      }
      System.out.print("\ttotal: " + contador + "\n");
    }
  }*/

  public void imprimirPersona(String cedula){
    Personas buscada = buscarPersona(cedula);
          if (buscada != null) {
            System.out.print("\tNombre: " + buscada.nombre + "\n");
            System.out.print("\tCedula: " + buscada.cedula + "\n");
            System.out.print("\tCorreo Electronico: " + buscada.correoElectronico + "\n");
            System.out.print("\tEdad " + String.valueOf(buscada.edad) + "\n");
            System.out.print("\t:Lugar de residencia:" + buscada.lugarDeResidencia + "\n");
            System.out.print("\t:Sintomas: " + buscada.sintoma + "\n");
            System.out.print("\t:Padecimientos Cronicos: " + buscada.padecimientosCronicos+"\n");
            System.out.print("\t:Telefonos: " + buscada.numeroTelefonico+"\n");
            
  }
  

}
}
