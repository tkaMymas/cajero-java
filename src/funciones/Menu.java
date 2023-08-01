package funciones;
import java.util.*;

public class Menu {
    static int dineroBanco = 0;
    public static void MetodoMenu(){
        Scanner scInput = new Scanner(System.in);
        System.out.println("¡Banco JavaCoffe!");
        System.out.println("(1)Depositar\n(2)Retirar\n(3)Consultar\n(4)Salir\n");
        System.out.print("Acción: ");
        String accionMenu = scInput.nextLine();
        switch (accionMenu){
            case "1":
                Depositar.MetodoDepositar();
                break;
            case "2":
                Retirar.MetodoRetirar();
                break;
            case "3":
                Consultar.MetodoConsultar();
                break;
            case "4":
                System.out.println("¡Saliste de Banco JavaCoffe!");
                break;
            default:
                System.out.println("Ingrese alguna opción de las indicadas.\n");
                Menu.MetodoMenu();
        }
    }
}
