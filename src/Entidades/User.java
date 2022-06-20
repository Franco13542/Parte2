package Entidades;

public class User {
    private String username;
    private int cantReviews;

    public User(String username,int cantReviews){
        this.cantReviews=cantReviews;
        this.username=username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getCantReviews() {
        return cantReviews;
    }

    public void setCantReviews(int cantReviews) {
        this.cantReviews = cantReviews;
    }
}
