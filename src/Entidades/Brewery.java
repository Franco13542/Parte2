package Entidades;

public class Brewery {
    private long id;
    private String name;
    private MyList<Beer> listaBeers = new MyListImpl<>();

    public Brewery(long id, String name){
        this.id=id;
        this.name=name;
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

    public MyList<Beer> getListaBeers() {
        return listaBeers;
    }

    public void setListaBeers(MyList<Beer> listaBeers) {
        this.listaBeers = listaBeers;
    }
}
