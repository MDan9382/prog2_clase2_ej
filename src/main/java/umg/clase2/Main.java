package umg.clase2;

import umg.clase2.PKG_grupo1.area_circulo;
import umg.clase2.PKG_grupo2.area_triangulo;
import umg.clase2.PKG_grupo3.area_paralelo;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Scanner scan = new Scanner(System.in);
        area_circulo area_cir = new area_circulo();
        area_triangulo area_tri = new area_triangulo();
        area_paralelo area_par = new area_paralelo();
        int opc = 0;
        do {
            int  x = 0, y = 0, r = 0;
            System.out.println("¿Que ejercicio desea Revisar?");
            System.out.printf("1.Area de un circulo %n");
            opc = scan.nextInt();
            switch (opc) {
                case 1:
                    System.out.printf("Ingrese el radio%n");
                    x = scan.nextInt();
                    area_cir.area_circulo(x);
                    break;

                case 2:
                    System.out.printf("Ingrese la base %n");
                    x = scan.nextInt();
                    System.out.printf("Ingrese la altura %n");
                    y = scan.nextInt();
                    area_tri.area_triangulo(x, y);
                    break;
                case 3:
                    System.out.printf("Ingrese la base %n");
                    x = scan.nextInt();
                    System.out.printf("Ingrese la altura %n");
                    y = scan.nextInt();
                    area_par.area_paralelo(x, y);
                    break;
                case 4:
                    System.out.println("Cerrando el Programa");
                    break;
                default:
                    System.out.println("Opcion Invalida");
                    break;
            }
        }while (opc!=4);
    }
}