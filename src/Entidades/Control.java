package Entidades;

import uy.um.edu.prog2.adt.ListaEnlazada.MyList;
import uy.um.edu.prog2.adt.ListaEnlazada.MyListImpl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class Control {

    private MyList<Review> listaReview = new MyListImpl<>();

    public MyList<Review> getListaReview() {
        return listaReview;
    }

    public void setListaReview(MyList<Review> listaReview) {
        this.listaReview = listaReview;
    }

    //Carga de Datos
    public void cargaDatos() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("beer_dataset_test.csv"));

        String lineaActual;

        while ((lineaActual = br.readLine()) != null) {
            String[] linea = lineaActual.split(",");
            if (linea[0].equals("\"\"")) {
                continue;
            }
            long breweryId = Long.parseLong(linea[1]);
            String breweryName = linea[2];
            //Corregir date
            //Date reviewDate = linea[3];
            double reviewOverall = Double.parseDouble(linea[4]);
            double reviewAroma = Double.parseDouble(linea[5]);
            double reviewAppearance = Double.parseDouble(linea[6]);
            String reviewUsername = linea[7];
            String styleBeer = linea[8];
            double reviewTaste = Double.parseDouble(linea[10]);
            String beerName = linea[11];
            double beerAbv = Double.parseDouble(linea[12]);
            long beerId = Long.parseLong(linea[13]);


            // Ver donde los vamos a guardar
        }
    }


    //Funcion3

    public int cantidadDeReviews(Date fechaInicio, Date fechaFin){
        int cantidad=0;
        for (int i = 0; i < listaReview.size(); i++) {
            if (listaReview.get(i).getDate().compareTo(fechaInicio) >= 0  && listaReview.get(i).getDate().compareTo(fechaFin) <= 0) {
                cantidad++;
            }
        }
        return cantidad;
    }

    //Funcion2

    public User[] masReseñasCatadores(){
        User[] top = new User[15];

        //Hay que corroborar que no los usuarios sean todos distintos

        int i = 0;
        while (i < 15) {
            if (!Pertenece(listaReview.get(i).getUser(), top)) {
                top[i] = listaReview.get(i).getUser();
                i++;
            }
        }

        int Menor = MasChico(top);
        for (int j = 15; j < listaReview.size(); j++) {
            if (listaReview.get(j).getUser().getCantReviews() > top[Menor].getCantReviews()){
                if (!Pertenece(listaReview.get(j).getUser(), top)) {
                   top[Menor] = listaReview.get(j).getUser();
                   Menor = MasChico(top);
                }
            }
        }

        //ordenar array
        return top;
    }

    //Aux
    private boolean Pertenece(User usuario, User[] usuarios) {
        int i = 0;
        boolean Pertenece = false;
        while (!Pertenece && i < usuarios.length) {
            if (usuario.getUsername().equals(usuarios[i].getUsername())) {
                Pertenece = true;
            }
            i++;
        }
        return Pertenece;
    }

    //Aux

    private int MasChico(User[] usuarios){
        int Menor=usuarios[0].getCantReviews();
        int pos=0;
        for (int i = 1; i < usuarios.length; i++) {
            if (usuarios[i].getCantReviews()<=Menor){
                Menor=usuarios[i].getCantReviews();
                pos=i;
            }
        }
        return pos;
    }

    //


}
