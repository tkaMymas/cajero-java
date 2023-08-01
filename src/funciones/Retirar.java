package funciones;
import java.util.*;

public class Retirar {
    public static void MetodoRetirar(){
        Scanner scInput = new Scanner(System.in);
        System.out.println("\n¡Retirar!");
        System.out.print("Ingreso: ");
        int dineroRet = scInput.nextInt();
        Menu.dineroBanco = Menu.dineroBanco - dineroRet;
        System.out.println("Se retiro la cantidad de " +  dineroRet + "$\n");
        Menu.MetodoMenu();
    }
}
