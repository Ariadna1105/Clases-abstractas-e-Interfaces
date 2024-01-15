import java.util.Scanner;

public class DefensorSolido extends Jugador implements InterDefensor{
    Scanner leer = new Scanner(System.in);
    public void ElejirOpcion() {
        int opcion;
        do {
            System.out.println("Elejir una opcion: \n1. Correr\n2. Pasar balón\n3. Hacer gol\n4. Cortar pase\n5. Despejar balon\n6. Marcar jugador");
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
                    CortarPase();
                    break;
                case 5:
                    DespejarBalon();
                    break;
                case 6:
                    MarcarJugador();
                    break;
            }
        } while(opcion < 1 || opcion > 6);
    }
    @Override
    public void Correr() {
        System.out.println("El defensa está corriendo");
    }

    @Override
    public void HacerGol() {
        System.out.println("El defensa hizo un gol");
    }

    @Override
    public void CortarPase() {
        System.out.println("El defensa cortó un pase");
    }

    @Override
    public void DespejarBalon() {
        System.out.println("El defensa despejó el balón");
    }

    @Override
    public void MarcarJugador() {
        System.out.println("El defensa está marcando a un jugador");
    }

    @Override
    public void PasarBalon() {
        System.out.println("El defensa está pasando el balon");
    }
}
