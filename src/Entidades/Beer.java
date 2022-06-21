package Entidades;

import uy.um.edu.prog2.adt.ListaEnlazada.MyList;
import uy.um.edu.prog2.adt.ListaEnlazada.MyListImpl;

public class Beer {
    private long id;
    private String name;
    private double abv;
    private Style style;
    private MyList<Review> listaReviewsCerveza = new MyListImpl<>();

    public Beer(long id, String name, double abv, Style style){
        this.id=id;
        this.name=name;
        this.abv=abv;
        this.style=style;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAbv() {
        return abv;
    }

    public void setAbv(double abv) {
        this.abv = abv;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    public MyList<Review> getListaReviews() {
        return listaReviewsCerveza;
    }

    public void setListaReviews(MyList<Review> listaReviews) {
        this.listaReviewsCerveza = listaReviews;
    }
}

