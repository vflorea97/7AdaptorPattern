package Facade.Electronics;

public class DvdPlayer {

    private String movie;

    public void on(){
        System.out.println("DVDPlayer is on");
    }
    public void off(){
        System.out.println("DVDPlayer is off");
    }
    public void eject(){
        System.out.println("Eject the disc");
    }
    public void stop(){
        System.out.println("Stop the DVDPlayer");
    }
    public void setMovie(String movie){
        this.movie = movie;
        System.out.println("You see " + this.movie);
    }
    public void play(String movie){
        setMovie(movie);
    }
}
