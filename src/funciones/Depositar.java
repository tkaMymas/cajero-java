package funciones;
import java.util.*;

public class Depositar {
    public static void MetodoDepositar(){
        Scanner scInput = new Scanner(System.in);
        System.out.println("\n¡Depositar!");
        System.out.print("Ingreso: ");
        int dineroDep = scInput.nextInt();
        Menu.dineroBanco += dineroDep;
        System.out.println("Se ingreso la cantidad de " + dineroDep + "$\n");
        Menu.MetodoMenu();
    }
}
