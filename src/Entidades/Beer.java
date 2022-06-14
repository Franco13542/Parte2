package Entidades;

public class Beer {
    private long id;
    private String name;
    private double abv;
    private Style style;

    public Beer(long id, String name, double abv, Style style){
        this.id=id;
        this.name=name;
        this.abv=abv;
        this.style=style;
        // Hay que agregar la lista de Reviews (elgir TAD)

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
}
