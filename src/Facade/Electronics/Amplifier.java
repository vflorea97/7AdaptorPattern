package Facade.Electronics;

public class Amplifier {

    public static final int off = 0;
    public static final String output = "5 speakers, 1 subwoofer";
    private String dvd;
    private int speed;
    private int volume;

    public void on(){
        System.out.println("Amp is on");
    }
    public void off(){
        speed = off;
        System.out.println("Amp is off");
    }
    public void setVolume(int volume){
        this.volume = volume;
    }
    public int getVolume(){
        return this.volume;
    }
    public void setSurroundSound(){
        System.out.println("The mode of DVD is " + output);
    }
    public int getSpeed() {
        return speed;
    }

    public String getDvd(){
        return this.dvd;
    }
    public void setDvd(String dvd){
        this.dvd = dvd;
        System.out.println("The DVD is " + dvd);
    }
}
