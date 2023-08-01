package funciones;
import java.util.*;

public class Retirar {
    public static void MetodoRetirar(){
        Scanner scInput = new Scanner(System.in);
        System.out.println("\n¡Retirar!");
        System.out.print("Ingreso: ");
        try {
            int dineroRet = scInput.nextInt();
            if (Menu.dineroBanco - dineroRet < 0) {
                System.out.println("No cuentas con suficiente dinero para realizar esta operación.\n");
            }
            else{
                Menu.dineroBanco = Menu.dineroBanco - dineroRet;
                System.out.println("Se retiro la cantidad de " +  dineroRet + "$\n");
            }
        }
        catch (Exception e){
            System.out.println("¡Error! Ingrese un valor numérico.\n");
        }
        Menu.MetodoMenu();
    }
}
