import java.util.Scanner;

public class DelanteroEstrella extends Jugador implements InterDelantero{
    Scanner leer = new Scanner(System.in);

    public void ElejirOpcion() {
        int opcion;
        do {
            System.out.println("Elejir una opcion: \n1. Correr\n2. Pasar balón\n3. Hacer gol\n4. Rematar\n5. Hacer regate\n6. Definir gol");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    Correr();
                    break;
                case 2:
                    PasarBalon();
                    break;
                case 3:
                    HacerGol();
                    break;
                case 4:
                    Rematar();
                    break;
                case 5:
                    HacerRegate();
                    break;
                case 6:
                    DefinirGol();
                    break;
            }
        } while(opcion < 1 || opcion > 6);

    }
    public void MostrarInformacion(String nombre, String posicion, String equipo, int edad, int numCamiseta){
        System.out.println("Nombre del jugador: "+nombre);
        System.out.println("Posicion: "+posicion);
        System.out.println("Equipo: "+equipo);
        System.out.println("Edad: "+edad);
        System.out.println("Numero de camiseta: "+numCamiseta);
    }
    @Override
    public void Correr() {
        System.out.println("El delantero está corriendo");
    }

    @Override
    public void HacerGol() {
        System.out.println("El delantero hizo un gol");
    }

    @Override
    public void Rematar() {
        System.out.println("El delantero hizo un remate");
    }

    @Override
    public void HacerRegate() {
        System.out.println("El delantero hizo un regate");
    }

    @Override
    public void DefinirGol() {
        System.out.println("El delantero definio un gol");
    }

    @Override
    public void PasarBalon() {
        System.out.println("El delantero pasó el balón");
    }
}
