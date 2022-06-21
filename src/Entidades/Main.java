package Entidades;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
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
                        Control b = new Control();
                        b.cargaDatos();
                        break;
                    case 2:
                        Scanner in2 = new Scanner(System.in);
                        Main sistema2 = new Main();
                        int opcion2 = 0;
                        while (opcion != 6) {
                            try {
                                System.out.println("\nIngrese una opcion entre 1-6: ");
                                System.out.println("1 - Cervezas con mas reseñas");
                                System.out.println("2 - Catadores con mas reseñas");
                                System.out.println("3 - Cantidad de reseñas");
                                System.out.println("4 - Cervezas con mejor aroma");
                                System.out.println("5 - Cervezas con mas reseñas");
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

                                        Control a = new Control();
                                        System.out.println("Ingrese la fecha de inicio:");
                                        Scanner in3 = new Scanner(System.in);
                                        String fechaIni = in3.nextLine();
                                        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                                        Date fecha = null;
                                        try {
                                            fecha = sdf.parse(fechaIni);
                                        } catch (ParseException e) {

                                        }

                                        System.out.println("Ingrese la fecha de finalizacion:");
                                        Scanner in4 = new Scanner(System.in);
                                        String fechaF = in4.nextLine();
                                        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
                                        Date fecha2 = null;
                                        try {
                                            fecha2 = sdf2.parse(fechaF);
                                        } catch (ParseException e) {

                                        }

                                        int cantReviews = a.cantidadDeReviews(fecha, fecha2);
                                        System.out.println("La cantidad de reviews entre "+fecha+"y "+fecha2+"es "+cantReviews);

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

