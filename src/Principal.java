import java.util.Scanner;

public class Principal {

    public static void main (String[] args){
        // crar objeto de la clase Scanner
        Scanner myObj = new Scanner(System.in);

        //crear objeto de clase Paciente
        Paciente paciente1 = new Paciente();

        //asignar valores del usaurio al objeto
        System.out.println("Ingresa tu nombre: ");
        paciente1.nombre = myObj.nextLine();

        System.out.println("Ingresa tu edad: ");
        paciente1.edad = Integer.parseInt(myObj.nextLine());


        System.out.println("Ingresa tu número de expediente: ");
        paciente1.numExpediente = Integer.parseInt(myObj.nextLine());

        paciente1.mostrarInformacion();

    }
}
