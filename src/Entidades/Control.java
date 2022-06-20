package Entidades;

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

    //Funcion3

    public int cantidadDeReviews(Date fechaInicio, Date fechaFin){
        int cantidad=0;
        for (int i = 0; i < listaReview.size(); i++) {
            if (listaReview.get(i).date>=fechaInicio && listaReview.get(i).date<=fechaFin){
                cantidad++;
            }
        }
        return cantidad;
    }

    //Funcion2

    public User[] masReseñasCatadores(){
        User[] top = new User[15];

        //Hay que corroborar que no los usuarios sean todos distintos

        for (int i = 0; i < 15; i++) {
            top[i]=listaReview.get(i).user;
        }
        int Menor = masChico(top);
        for (int i = 15; i < listaReview.size(); i++) {
            if (listaReview.get(i).user.cantReviews>top[Menor].getCantReviews()){
                //if () si no esta en el array{
                //   top[Menor]=listaReview.get(i).user;
                //   Menor=masChico(top);
                //}
            }
        }
        return top;
    }

    //Aux

    private int masChico(User[] usuarios){
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


}
