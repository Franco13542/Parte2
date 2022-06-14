package Entidades;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Main sistema = new Main();
        int opcion = 0;
        while (opcion != 3) {
            try {
                System.out.println("\nIngrese una opcion entre 1-3: ");
                System.out.println("1 - Cargar datos");
                System.out.println("2 - Realizar consultas");
                System.out.println("3 - Salir");
                opcion = in.nextInt();
                in.nextLine();
                switch (opcion) {
                    case 1:
                        //cargarDatos(sistema);
                        break;
                    case 2:
                        Scanner in2 = new Scanner(System.in);
                        Main sistema2 = new Main();
                        int opcion2 = 0;
                        while (opcion != 6) {
                            try {
                                System.out.println("\nIngrese una opcion entre 1-3: ");
                                System.out.println("1 - Cervezas con mas reseñas");
                                System.out.println("2 - Catadores con mas reseñas");
                                System.out.println("3 - Cantidad de reviews");
                                System.out.println("4 - Cervezas con mejor aroma");
                                System.out.println("5 - Cervezas con mas reviews");
                                System.out.println("6 - Salir");
                                opcion = in.nextInt();
                                in.nextLine();
                                switch (opcion) {
                                    case 1:
                                        //masReseñasBreweries(sistema2);
                                        break;
                                    case 2:
                                        //masReseñasCatadores(sistema2);
                                        break;
                                    case 3:
                                        //cantidadDeReviews(sistema2);
                                        break;
                                    case 4:
                                        //mejorAroma(sistema2);
                                        break;
                                    case 5:
                                        //masReviewsCervezas(sistema2);
                                        break;
                                    case 6:
                                        break;
                                    default:
                                        System.out.println("La opcion es de 1 a 6");
                                }
                            } catch (InputMismatchException e) { // Para que no ingresen letras
                                System.out.println("Ingrese solo numeros entre el 1 y el 5");
                                in.nextLine();
                            }
                        }
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("La opcion es de 1 a 3");
                }

            } catch (InputMismatchException e) { // Para que no ingresen letras
                System.out.println("Ingrese solo numeros entre el 1 y el 5");
                in.nextLine();

            }

        }

    }

}

