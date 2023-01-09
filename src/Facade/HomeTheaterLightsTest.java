package Facade;

import Facade.Electronics.*;

public class HomeTheaterLightsTest {

    public static void main(String[] args) {
        Amplifier amp= new Amplifier();
        DvdPlayer dvd = new DvdPlayer();
        Projector projector = new Projector();
        TheaterLights lights = new TheaterLights();
        Screen screen = new Screen();
        PopcornPopper popper = new PopcornPopper();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, dvd, projector, screen, lights, popper);
        homeTheater.watchMovie("Sinister 2");
        System.out.println();
        homeTheater.endMovie();
    }
}
