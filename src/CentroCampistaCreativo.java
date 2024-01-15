import java.util.Scanner;

public class CentroCampistaCreativo extends Jugador implements InterCentroCam {
    Scanner leer = new Scanner(System.in);
    public void ElejirOpcion() {
        int opcion;
        do {
            System.out.println("Elejir una opcion: \n1. Correr\n2. Pasar balón\n3. Hacer gol\n4. Recuperar balón\n5. Crear juego\n6. Dar asistencia");
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
                    RecuperarBalon();
                    break;
                case 5:
                    CrearJuego();
                    break;
                case 6:
                    DarAsistencia();
                    break;
            }
        } while(opcion < 1 || opcion > 6);
    }

    @Override
    public void Correr() {
        System.out.println("El Centro Campista está corriendo");
    }

    @Override
    public void HacerGol() {
        System.out.println("El Centro Campista hizo un gol");
    }

    @Override
    public void RecuperarBalon() {
        System.out.println("El centro Campista recuperó el balón");
    }

    @Override
    public void CrearJuego() {
        System.out.println("El Centro Campista creó una jugada");
    }

    @Override
    public void DarAsistencia() {
        System.out.println("El Centro Campista dio una asistencia");
    }

    @Override
    public void PasarBalon() {
        System.out.println("El Centro Campista está pasando el balón");
    }
}
