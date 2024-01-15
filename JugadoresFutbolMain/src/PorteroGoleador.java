import java.util.Scanner;

public class PorteroGoleador extends Jugador implements InterPortero{
    Scanner leer = new Scanner(System.in);
    public void ElejirOpcion() {
        int opcion;
        do {
            System.out.println("Elejir una opcion: \n1. Correr\n2. Pasar balón\n3. Hacer gol\n4. Atajar balon\n5. Despejar centro\n6. Sacar porteria");
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
                    AtajarBalon();
                    break;
                case 5:
                    DespejarCentro();
                    break;
                case 6:
                    SacarPorteria();
                    break;
            }
        } while(opcion < 1 || opcion > 6);
    }
    @Override
    public void Correr() {
        System.out.println("El portero está corriendo");
    }

    @Override
    public void PasarBalon() {
        System.out.println("El portero pasó el balón");
    }

    @Override
    public void HacerGol() {
        System.out.println("El portero hizo un gol");
    }

    @Override
    public void AtajarBalon() {
        System.out.println("El portero atajó el balón");
    }

    @Override
    public void DespejarCentro() {
        System.out.println("El portero despejó el centro");
    }

    @Override
    public void SacarPorteria() {System.out.println("El portero hizo un saque de porteria");}
}
