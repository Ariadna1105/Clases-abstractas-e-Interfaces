import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        DelanteroEstrella delantero = new DelanteroEstrella();
        CentroCampistaCreativo centro = new CentroCampistaCreativo();
        DefensorSolido defensor = new DefensorSolido();
        PorteroGoleador portero = new PorteroGoleador();

        System.out.print("Ingresa el nombre del jugador: ");
        String nombre = leer.nextLine();
        System.out.print("Ingresa la posicion del jugador: ");
        String posicion = leer.nextLine();
        System.out.print("Ingresa el nombre del equipo: ");
        String equipo = leer.nextLine();
        System.out.print("Ingresa la edad del jugador: ");
        int edad = leer.nextInt();
        System.out.print("Ingresa el numero de camiseta: ");
        int numCamiseta = leer.nextInt();
        System.out.println("=====================================================");
        delantero.MostrarInformacion(nombre, posicion, equipo, edad, numCamiseta);
        System.out.println("=====================================================");
        switch(posicion){
            case "delantero":
                delantero.ElejirOpcion();
                break;
            case "defensor":
                defensor.ElejirOpcion();
                break;
            case "centro":
                centro.ElejirOpcion();
                break;
            case "portero":
                portero.ElejirOpcion();
                break;
            }
        }
    }
