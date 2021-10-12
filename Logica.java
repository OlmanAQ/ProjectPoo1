import java.util.Vector;
import java.io.Console;

public class Logica 
{
    public Vector<AreaDeSalud> listadoAreas= new Vector<AreaDeSalud>();
    String input="";
    Console console = System.console();

    public void menuPrincipal()
    {

        while (true)
        {
            System.out.print("\033[H\033[2J");
            System.out.println("Sistema de soporte estadístico para Covid19");

            System.out.println("1) Crear una nueva área de salud");
            System.out.println("2) Registrar un nuevo paciente positivo");
            System.out.println("3) Cantidad de pacientes positivos por área de salud");
            System.out.println("4) Salir ");
            input=console.readLine("%s","Que acción desea realizar: ");
            if (input.equals("1"))
            {
                menuRegistroAreasSalud();
            }
            else if (input.equals("2"))
            {
                menuRegistroPacientePositivo();
            }
            else if (input.equals("3"))
            {
                System.out.println(String.format("Cantidad Actual de pacientes positivos: %s",menuCantidadPacientesPositivos()));
                System.out.println("\nPresione enter para regresar al menú principal...");
                input=console.readLine("");
    
            }
            else if (input.equals("4"))
            {
                break;
            }
        }
    }

    private int menuCantidadPacientesPositivos()
    {
        System.out.print("\033[H\033[2J");
        System.out.println("Seleccione el área de salud a consultar:");

        for (int i=0; i<listadoAreas.size(); i++) 
        { 
            System.out.println(String.format("%d) %s",i,listadoAreas.get(i).getNombre()));
        }
        int nas=-1;
        AreaDeSalud as;
        while (true)
        {
            try
            {
                nas=Integer.parseInt(console.readLine("%s","Número de área de salud: "));
                as=listadoAreas.get(nas);
                break;
            }
            catch (Exception e)
            {
                System.out.println("Seleccione un número de área de salud válido...");
            }
        }

        System.out.print("\033[H\033[2J");

        return as.cantidadPositivos();
    }

    private void menuRegistroAreasSalud()
    {
        System.out.print("\033[H\033[2J");
        String nombreAS=console.readLine("%s","Nombre del Área de salud: ");
        String director=console.readLine("%s","Nombre del director: ");
        String direccion=console.readLine("%s","Dirección física: ");
        String areaDeAtraccion=console.readLine("%s","Nombre del área de atracción: ");
 
        
        System.out.print("\033[H\033[2J");
        AreaDeSalud nAS = new AreaDeSalud(nombreAS,director, direccion, areaDeAtraccion);
        System.out.println("1) Esta seguro que quiere registrar el área de salud:");
        System.out.println(nAS.toString());
        System.out.println("2) No realizar el registro y regresar al menu principal");
        input=console.readLine("%s","Que acción desea realizar: ");
        if (input.equals("1"))
        {
            listadoAreas.add(nAS);
        }
        else if (input.equals("2"))
        {

        }

    }

    private void menuRegistroPacientePositivo()
    {
        if (listadoAreas.size()==0)
        {
            System.out.print("\033[H\033[2J");
            System.out.println("Primero registre una primer área de salud\n");
            System.out.println("Presione enter para regresar al menú principal...");
            input=console.readLine("");
        }
        else
        {
            System.out.print("\033[H\033[2J");
            System.out.println("Seleccione el área de salud donde está registrado el paciente:");
    
            for (int i=0; i<listadoAreas.size(); i++) 
            { 
                System.out.println(String.format("%d) %s",i,listadoAreas.get(i).getNombre()));
            }
            int nas=-1;
            AreaDeSalud as;
            while (true)
            {
                try
                {
                    nas=Integer.parseInt(console.readLine("%s","Número de área de salud: "));
                    as=listadoAreas.get(nas);
                    break;
                }
                catch (Exception e)
                {
                    System.out.println("Seleccione un número de área de salud válido...");
                }
            }
    
            System.out.print("\033[H\033[2J");
            System.out.println(String.format("Área de salud seleccionado: %s",as.getNombre()));
    
            String cedula=console.readLine("%s","Cédula del paciente: ");
            String nombre=console.readLine("%s","Nombre del paciente: ");
            short edad=0;
            try
            {
                edad=Short.parseShort(console.readLine("%s","Edad del paciente: "));
            }
            catch (Exception e)
            {
                System.out.println(String.format("Error de conversión de la edad, se asume 0. %s",e.getMessage()));
            }
            String padecimientos=console.readLine("%s","Padecimiento: ");
            String lugarResidencia=console.readLine("%s","Lugar de residencia: ");
            String telefonos=console.readLine("%s","Números de teléfono: ");
            String correo=console.readLine("%s","E-mail del paciente: ");
            String fechaSintomas=console.readLine("%s","Fecha en que iniciaron los síntomas: ");
            String modoDeContacto=console.readLine("%s","modo de contacto: ");
            as.registrarPacientePositivo(nombre, cedula,edad,correo,lugarResidencia, fechaSintomas,modoDeContacto);
    
            System.out.print("\033[H\033[2J");
            System.out.println(String.format("Se ha registrado al paciente %s %s al centro de Salud %s", cedula,nombre,as.getNombre()));
    
            System.out.println("\nPresione enter para regresar al menú principal...");
            input=console.readLine("");
        }
    }

}
