/*
Programa Nespresso. Desarrolle una clase Cafetera en el paquete
Entidades con los atributos capacidadMáxima (la cantidad máxima de
café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Agregar constructor vacío y con
parámetros así como setters y getters. Crear clase CafeteraServicio en
el paquete Servicios con los siguiente:
a) Método llenarCafetera(): hace que la cantidad actual sea igual a la
capacidad máxima.
b) Método servirTaza(int): se pide el tamaño de una taza vacía, el
método recibe el tamaño de la taza y simula la acción de servir la
taza con la capacidad indicada. Si la cantidad actual de café “no
alcanza” para llenar la taza, se sirve lo que quede. El método le
informará al usuario si se llenó o no la taza, y de no haberse llenado
en cuanto quedó la taza.
c) Método vaciarCafetera(): pone la cantidad de café actual en cero.
d) Método agregarCafe(int): se le pide al usuario una cantidad de café,
el método lo recibe y se añade a la cafetera la cantidad de café
indicada.
 */
package guia8ej2;

import Entidades.Cafetera;
import Serivcios.CafeteraServicios;
import java.util.Scanner;

/**
 *
 * @author CASA
 */
public class Guia8Ej2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CafeteraServicios sc1 = new CafeteraServicios();
        Cafetera c1 = new Cafetera(0,0);
        
        System.out.println("Ingrese la capacidad de la cafetera");
        sc1.setearCafetera(c1, leer.nextInt());
        int opcion = 0;

        do {
            System.out.println("MENU");
            System.out.println("Opcion1: Llenar cafetera.");
            System.out.println("Opcion2: Servir taza.");
            System.out.println("Opcion3: Vaciar cafetera.");
            System.out.println("Opcion4: Agregar cafe.");
            System.out.println("Opcion5: Salir");
            System.out.println("-----------------------");
            sc1.verCantidad(c1);
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    sc1.llenarCafetera(c1);
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad de cafe a llenar en la taza");
                    sc1.servirTaza(c1, leer.nextInt());
                    break;
                case 3:
                    sc1.vaciarCafetera(c1);
                    break;
                case 4:
                    System.out.println("Ingrese la cantidad de cafe:");
                    sc1.agregarCafe(c1, leer.nextInt());
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Ingrese una opcion valida.");
                    break;
            }
        } while (opcion != 5);

    }

}
